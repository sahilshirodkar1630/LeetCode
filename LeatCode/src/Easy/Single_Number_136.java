package Easy;

import java.util.HashMap;

public class Single_Number_136 {

	/*
	
	136. Single Number
		Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
		Follow up: Could you implement a solution with a linear runtime complexity and without using extra memory?
		
		Example 1:
		
		Input: nums = [2,2,1]
		Output: 1
		Example 2:
		
		Input: nums = [4,1,2,1,2]
		Output: 4
		Example 3:
		
		Input: nums = [1]
		Output: 1
	
	 */
	  public int singleNumber(int[] nums) {
	        HashMap<Integer,Integer> maps = new HashMap<Integer,Integer>();
	        for(int i:nums){
	            if(maps.containsKey(i)){
	                maps.put(i,maps.get(i)+1);
	            }else{
	                maps.put(i,1);
	            }
	        }
	        
	        int output=0;
	        for(int i:nums){
	            if(maps.get(i)==1){
	                output= i;
	            }
	        }
	        return output;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
