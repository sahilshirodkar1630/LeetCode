package Easy;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Maximum_Product_of_Two_Elements_in_an_Array_1464 {

	/*
	Given the array of integers nums, you will choose two different indices i and j of that array. 
	Return the maximum value of (nums[i]-1)*(nums[j]-1).
	 
	Example 1:
	Input: nums = [3,4,5,2]
	Output: 12 
	Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12. 
	
	Example 2:
	Input: nums = [1,5,4,5]
	Output: 16
	Explanation: Choosing the indices i=1 and j=3 (indexed from 0), you will get the maximum value of (5-1)*(5-1) = 16.
	
	Example 3:
	Input: nums = [3,7]
	Output: 12
	
	*/
	
	public static int maxProduct(int[] array) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i: array) {
        	pq.add(i-1);
        }
        int a= pq.remove();
        int b = pq.remove();
        return a*b;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr= new int[size];
		for(int i=0;i<size;i++){
			arr[i]= sc.nextInt();
		}
		System.out.println(maxProduct(arr));
	}

}
