package Easy;

import java.util.HashMap;

public class Contains_Duplicate_217 {
	/*
	Given an array of integers, find if the array contains any duplicates.
	Your function should return true if any value appears at least twice in the array, 
	and it should return false if every element is distinct.

	Example 1:
	Input: [1,2,3,1]
	Output: true
	
	Example 2:
	Input: [1,2,3,4]
	Output: false
	
	Example 3:
	Input: [1,1,1,3,3,4,3,2,4,2]
	Output: true
	
	*/

	public boolean containsDuplicate(int[] nums) {
		//Create a HashMap to put all the elements with the number of frequency of them in the array
        HashMap<Integer,Integer> maps = new  HashMap<Integer,Integer>();
        boolean isDuplicate = false;
        for(int i:nums){
        	//If any element already exist in the hashmap that means it is repeating
        	//then break the loop and return true;
            if(maps.containsKey(i)){
                isDuplicate = true;
                break;
            }else{
                maps.put(i,1);
            }
        }

        return isDuplicate;
    }
	
}
