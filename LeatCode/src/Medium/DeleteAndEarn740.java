package Medium;

import java.util.Arrays;

public class DeleteAndEarn740 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int deleteAndEarn(int[] nums) {
	        int n = nums.length;
	        int maxElement = Integer.MIN_VALUE;
	        
	        for(int i : nums){
	            maxElement = Math.max(i,maxElement);
	        }
	        
	        int count[] = new int[maxElement+1];
	        for(int i: nums){
	            count[i] += i;
	        }
	         int dp[] = new int[count.length+1];
		        Arrays.fill(dp,-1);
	        return  rob(count,count.length,dp);
	    }
	    
	    
	     public static int rob(int[] nums, int n,int[] dp) {
			 //Basecase
			 if(n<=0){
		        return 0;
		     }
		        
		     if(dp[n] != -1){
		        return dp[n];
		     }
	         
		     int choice1 = nums[n-1]+rob(nums,n-2,dp); // loot
		     int choice2 = rob(nums,n-1,dp);   //notlooto
	         
		     dp[n] = Math.max(choice1,choice2); // Experience stored
	         
		     return dp[n];
		        
		 }

}
