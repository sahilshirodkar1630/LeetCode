package Medium;

public class Find_First_and_Last_Position_of_Element_in_SortedArray {
	/*
	Given an array of integers nums sorted in ascending order, 
	find the starting and ending position of a given target value.

	If target is not found in the array, return [-1, -1].
	
	Follow up: Could you write an algorithm with O(log n) runtime complexity?

	Example 1:
	Input: nums = [5,7,7,8,8,10], target = 8
	Output: [3,4]
	
	Example 2:
	Input: nums = [5,7,7,8,8,10], target = 6
	Output: [-1,-1]
	
	Example 3:
	Input: nums = [], target = 0
	Output: [-1,-1]
	
	*/

	 public int[] searchRange(int[] nums, int target) {
	        // This apporach is taking O(n) Time Complexity because we are using linear search
	       //But we can use Binary Search instead of Linear search by that it will takke O(log n) Time Complexity
	        
	        int val =0;
	        // Counting the numbers of targer in the array
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]==target){
	                val++;
	            }
	        }
	        int[] output = new int[2]; 
	        //If there are no values of target in the array then return -1 -1
	        if(val==0){
	            output[0] = -1;
	            output[1] = -1;
	            return output;
	        }
	        //Put the index in Output array when the index will be 0 and val;
	        int count=0;
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]==target){
	                count++;
	                if(count==1){
	                    output[0]= i;
	                }
	                if(count==val){
	                    output[1] = i;
	                }
	            }
	        }
	        return output;
	        
	    }
}
