package Medium;

import java.util.ArrayList;
import java.util.HashMap;

public class Find_All_Duplicates_in_an_Array_442 {

	/*
	Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

	Find all the elements that appear twice in this array.
	Could you do it without extra space and in O(n) runtime?
	
	Example:
		Input:
		[4,3,2,7,8,2,3,1]
		
		Output:
		[2,3]
	
	
	*/
	 public ArrayList<Integer> findDuplicates(int[] nums) {
	        ArrayList<Integer> output = new ArrayList<Integer>();
	        HashMap<Integer,Integer> maps = new HashMap<Integer,Integer>();
	        for(int i: nums){
	         if(maps.containsKey(i)){
	             output.add(i);
	         }else{
	            maps.put(i,1);
	        }
	        }
	        return output;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
