package Easy;

import java.util.ArrayList;
import java.util.Scanner;

public class Create_Target_Array_in_the_Given_Order_1389 {

	/*
	Given two arrays of integers nums and index. Your task is to create target array under the following rules:

		Initially target array is empty.
		From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
		Repeat the previous step until there are no elements to read in nums and index.
		Return the target array.

		It is guaranteed that the insertion operations will be valid.
		Example 1:
		Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
		Output: [0,4,1,3,2]
		Explanation:
		nums       index     target
		0            0        [0]
		1            1        [0,1]
		2            2        [0,1,2]
		3            2        [0,1,3,2]
		4            1        [0,4,1,3,2]
				
		Example 2
		Input: nums = [1,2,3,4,0], index = [0,1,2,3,0]
		Output: [0,1,2,3,4]
		Explanation:
		nums       index     target
		1            0        [1]
		2            1        [1,2]
		3            2        [1,2,3]
		4            3        [1,2,3,4]
		0            0        [0,1,2,3,4]
				
		Example 3:
		Input: nums = [1], index = [0]
		Output: [1]
		
		*/
	
	 public static int[] createTargetArray(int[] nums, int[] index) {
	        ArrayList<Integer> array = new ArrayList<Integer>();
	        
	        for(int i=0;i<nums.length;i++){
	            array.add(index[i],nums[i]);
	        }
	        for(int i=0;i<nums.length;i++){
	            nums[i]=array.get(i);
	        }
	        return nums;
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size1 = sc.nextInt();
		int[] nums = new int[size1];
		for(int i=0;i<size1;i++){
			nums[i]= sc.nextInt();
		}
		int size2 = sc.nextInt();
		int[] index = new int[size2];
		for(int i=0;i<size2;i++){
			index[i]= sc.nextInt();
		}
		
		int output[] = createTargetArray(nums, index);
		
		for(int i: output) {
			System.out.print(i+" ");
		}
		
		

	}

}
