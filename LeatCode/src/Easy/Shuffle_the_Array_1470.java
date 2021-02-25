package Easy;

import java.util.Scanner;

public class Shuffle_the_Array_1470 {
	/*
	 * 
	Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
		
		Return the array in the form [x1,y1,x2,y2,...,xn,yn].
		
		 
		
		Example 1:
		
		Input: nums = [2,5,1,3,4,7], n = 3
		Output: [2,3,5,4,1,7] 
		Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
		Example 2:
		
		Input: nums = [1,2,3,4,4,3,2,1], n = 4
		Output: [1,4,2,3,3,2,4,1]
		Example 3:
		
		Input: nums = [1,1,2,2], n = 2
		Output: [1,2,1,2]
		
	*/
	
	public static int[] shuffle(int[] array, int n) {
		
		int[] temp1 = new int[n];
		int[] temp2 = new int[n];
		int i=0;
		for(;i<n;i++) {
			temp1[i]= array[i];
		}
		for(;i<array.length;i++) {
			temp2[i-n] = array[i];
		}
		i=0;
		int k=0;
		while(k<array.length) {
			array[k]= temp1[i];
			k++;
			array[k]= temp2[i];
			k++;
			i++;
		}
		
		return array;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr= new int[size];
		for(int i=0;i<size;i++){
			arr[i]= sc.nextInt();
		}
		
		int n = sc.nextInt();
		int[] output = shuffle(arr,n);
		for(int i : output ) {
			System.out.print(i+" ");
		}
	}

}
