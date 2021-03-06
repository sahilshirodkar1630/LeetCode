package Medium;

import java.util.Scanner;

public class Search_in_Rotated_Sorted_Array_33 {

	/*
		There is an integer array nums sorted in ascending order (with distinct values).
		Prior to being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length)
		such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
		For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
		Given the array nums after the rotation and an integer target, return the index of target if it is in nums, 
		or -1 if it is not in nums.
		
		Example 1:
		Input: nums = [4,5,6,7,0,1,2], target = 0
		Output: 4
		
		Example 2:
		Input: nums = [4,5,6,7,0,1,2], target = 3
		Output: -1
		
		Example 3:
		Input: nums = [1], target = 0
		Output: -1
	
	
	*/
	public static int search(int[] nums, int target) {
        //Applying Simple Linear Search
        int output = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                output= i;
                break;
            }
        }
        return output;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		int target = sc.nextInt();
		System.out.println(search(arr, target));
	}

}
