package Medium;

import java.util.Arrays;
import java.util.Scanner;

public class House_Robber198 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new  int[n];
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println(rob(arr));
		
	}
	 public static int rob(int[] nums) {
	        int dp[] = new int[nums.length+1];
	        Arrays.fill(dp,-1);
	        return rob(nums,nums.length,dp);
	    }
	 
	 public static int rob(int[] nums, int n,int[] dp) {
		 //Basecase
		 if(n<=0){
	        return 0;
	     }
	        
	     if(dp[n] != -1){
	        return dp[n];
	     }
	     int choice1 = nums[n-1]+rob(nums,n-2,dp); // looto
	     int choice2 = rob(nums,n-1,dp);   //notlooto
	     dp[n] = Math.max(choice1,choice2); // Experience stored
	     return dp[n];
	        
	 }

}
