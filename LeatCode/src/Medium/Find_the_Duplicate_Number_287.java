package Medium;

import java.util.HashMap;
import java.util.Scanner;

public class Find_the_Duplicate_Number_287 {
/*
	Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
	There is only one repeated number in nums, return this repeated number.

	Example 1:
	Input: nums = [1,3,4,2,2]
	Output: 2
	
	Example 2:
	Input: nums = [3,1,3,4,2]
	Output: 3
	
	Example 3:
	Input: nums = [1,1]
	Output: 1
	
	Example 4:
	Input: nums = [1,1,2]
	Output: 1
	
*/

	public  static int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> maps = new HashMap<Integer,Integer>();
        int duplicate =0;
        for(int i:nums){
          if(maps.containsKey(i)){
              duplicate = i;
              break;
          }else{
              maps.put(i,1);
          }
        }
        return duplicate;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]=  new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}

		System.out.println(findDuplicate(arr));
	}

}
