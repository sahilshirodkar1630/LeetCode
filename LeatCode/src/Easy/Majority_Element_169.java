package Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Majority_Element_169 {
///*
//	Given an array nums of size n, return the majority element.
//
//			The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
//			
//			Example 1:
//			Input: nums = [3,2,3]
//			Output: 3
//			
//			Example 2:
//			Input: nums = [2,2,1,1,1,2,2]
//			Output: 2
//			
//*/ 
	
	
	//By Using Boyer- Moore Majority Vote Algorithm 
	// This will Take O(N) Time Complexity and O(1) Space Complexity
	//Best Approach
	 public int majorityElement(int[] nums) {
	        int element =0;
	        int count=0;
	        for(int i=0;i<nums.length;i++){
	            if(count == 0){
	                element = nums[i];
	            }
	            if(nums[i] == element){
	                count++;
	            }else{
	                count--;
	            }
	        }

	        count =  0;
	        for(int i:nums){
	            if(i == element){
	                count++;
	            }
	        }
	        
	        int output =0;
	        if(count>nums.length/2){
	            output= element;
	        }
	        
	        return output;
	    }
	 
	
	
	
/*	
 * This approach will Take O(N) Time Complexity and O(N) Space Complexity
	public int majorityElement(int[] array) {
        Map<Integer,Integer> maps = new HashMap<Integer,Integer>();
        for(int i: array){
            if(maps.containsKey(i)){
                maps.put(i,maps.get(i)+1);
            }else{
            	maps.put(i,1);
            }
        }
        int output =array[0];
        for(int i:array){
            int val = maps.get(i);
            if(val>maps.get(output)){
                output = i;
            }
        }
        return output;
 }
	
*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
	}
}

