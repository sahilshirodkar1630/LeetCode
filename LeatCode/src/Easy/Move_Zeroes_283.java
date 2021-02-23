package Easy;

import java.util.Scanner;

public class Move_Zeroes_283 {

//	Given an array nums, write a function to move all 0's to the end of it 
//	while maintaining the relative order of the non-zero elements.

//	Example:
//	Input: [0,1,0,3,12]
//	Output: [1,3,12,0,0]

//	Note:
//	You must do this in-place without making a copy of the array.
//	Minimize the total number of operations.
	
	 public static void moveZeroes(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[k];
                nums[k]= nums[i];
                nums[i] = temp;
                k++;
            }
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in) ;
		int n = sc.nextInt();
		int array[] = new int[n];	
		for(int i=0;i<n;i++) {
		array[i]= sc.nextInt();	
		}
		
		moveZeroes(array);
		
		for(int i:array) {
			System.out.print(i+" ");
		}
		
	}

}
