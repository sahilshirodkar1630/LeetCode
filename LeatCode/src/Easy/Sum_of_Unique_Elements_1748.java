package Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sum_of_Unique_Elements_1748 {
	/*
	You are given an integer array nums. 
	The unique elements of an array are the elements that appear exactly once in the array.
	Return the sum of all the unique elements of nums.
	
	Example 1:
	Input: nums = [1,2,3,2]
	Output: 4
	Explanation: The unique elements are [1,3], and the sum is 4.
	
	Example 2:
	Input: nums = [1,1,1,1,1]
	Output: 0
	Explanation: There are no unique elements, and the sum is 0.
	
	
	Example 3:
	Input: nums = [1,2,3,4,5]
	Output: 15
	Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.
	
	*/
	
	 public static int sumOfUnique(int[] array) {
	 
		 Map<Integer, Integer> maps = new HashMap<Integer, Integer>();
		 for(int i: array ) {
			 if(maps.containsKey(i)) {
				 maps.put(i, maps.get(i)+1);
			 }else {
				 maps.put(i, 1);
			 }
		 }
		 int count =0;
		 for(int i: array){
			int val = maps.get(i);
			if(val==1) {
				count+=i;
			}
		 }
		 return count;
		 
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++){
			arr[i]= sc.nextInt();
		}
		
		System.out.println(sumOfUnique(arr));
		
	}

}
