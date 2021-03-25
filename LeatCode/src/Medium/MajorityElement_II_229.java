package Medium;

import java.util.ArrayList;

public class MajorityElement_II_229 {
	
	/*
	Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
	Follow-up: Could you solve the problem in linear time and in O(1) space?
	
	Example 1:
	Input: nums = [3,2,3]
	Output: [3]
	
	Example 2:
	Input: nums = [1]
	Output: [1]
	
	Example 3:
	Input: nums = [1,2]
	Output: [1,2]
 
	 */
	
	// Best Approach with Time Complexity O(N) and Space Complexity O(1)
	 public ArrayList<Integer> majorityElement(int[] nums) {   
	        ArrayList<Integer> Output = new  ArrayList<Integer>();
	  
	        int element1 = nums[0];
	        int element2 = 0;
	        int elem1Count = 1;
	        int elem2Count = 0;
	        
	        for(int i=1;i<nums.length;i++){
	            if(nums[i]==element1){
	                elem1Count++;
	            }else if(nums[i]== element2){
	                elem2Count++;
	            }else if(elem1Count == 0){
	                element1= nums[i];
	                elem1Count=1;
	            }else if(elem2Count == 0){
	                element2=nums[i];
	                elem2Count=1;
	            }else{
	                elem1Count--;
	                elem2Count--;
	            }
	        }
	        
	 
	        elem1Count = 0;
	        elem2Count = 0;
	        
	        for(int i:nums){
	            if(i == element1){
	                elem1Count++;
	            }else if(i == element2){
	                elem2Count++;
	            }
	        }
	        
	        if(elem1Count>(nums.length/3)){
	            Output.add(element1);
	        }
	        if(elem2Count>(nums.length/3)){
	            Output.add(element2);
	        }
	        
	        return Output;
	        
	    }
}
