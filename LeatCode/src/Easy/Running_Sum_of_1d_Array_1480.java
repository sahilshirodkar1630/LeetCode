package Easy;

import java.util.Scanner;

public class Running_Sum_of_1d_Array_1480 {
	/*
	Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
			Return the running sum of nums.

			Example 1:
			Input: nums = [1,2,3,4]
			Output: [1,3,6,10]
			Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
			
			Example 2:
			Input: nums = [1,1,1,1,1]
			Output: [1,2,3,4,5]
			Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
			
			Example 3:
			Input: nums = [3,1,2,10,1]
			Output: [3,4,6,16,17]
	*/

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
