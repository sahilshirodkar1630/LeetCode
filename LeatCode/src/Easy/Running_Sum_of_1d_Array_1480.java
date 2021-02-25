package Easy;

import java.util.Scanner;

public class Running_Sum_of_1d_Array_1480 {

	public static int[] runningSum(int[] array) {
        
		int count =0;
		for(int i=0;i<array.length;i++) {
			count+=array[i];
			array[i]= count;
		}
		return array;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++){
			arr[i]= sc.nextInt();
		}
		
		int[] output = runningSum(arr);
		for(int i: output) {
			System.out.print(i+" ");
		}

	}
	
	

}
