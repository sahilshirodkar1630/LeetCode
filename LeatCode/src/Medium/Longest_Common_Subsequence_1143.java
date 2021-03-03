package Medium;

import java.util.Scanner;

public class Longest_Common_Subsequence_1143 {

	/*
	  Given two strings text1 and text2, return the length of their longest common subsequence.

		A subsequence of a string is a new string generated from the original string with
		 some characters(can be none) deleted without changing the relative order of the remaining characters
		 (eg, "ace" is a subsequence of "abcde" while "aec" is not). 
		 A common subsequence of two strings is a subsequence that is common to both strings.

		If there is no common subsequence, return 0.
		
		Example 1:
			Input: text1 = "abcde", text2 = "ace" 
			Output: 3  
			Explanation: The longest common subsequence is "ace" and its length is 3.
		
		Example 2:
			Input: text1 = "abc", text2 = "abc"
			Output: 3
			Explanation: The longest common subsequence is "abc" and its length is 3.
		
		Example 3:
			Input: text1 = "abc", text2 = "def"
			Output: 0
			Explanation: There is no such common subsequence, so the result is 0.
 
	 */
	
	 public static int longestCommonSubsequence(String a, String b) {
	        int m = a.length();
	        int n = b.length();
	        int dp[][] = new int[m+1][n+1];
	        for(int i=0;i<m+1;i++){
	            dp[i][0] = 0;
	        }
	        for(int j=0;j<n+1;j++){
	            dp[0][j] = 0;
	        }
	        
	        for(int i=1;i<m+1;i++){
	            for(int j=1;j<n+1;j++){
	                if(a.charAt(m-i)==b.charAt(n-j)){
	                    dp[i][j] = 1+dp[i-1][j-1];    
	                }else{
	                    dp[i][j]= Math.max(dp[i][j-1],dp[i-1][j]);
	                }
	            }
	        }
	        return dp[m][n];
	        
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a =  sc.nextLine();
		String b =  sc.nextLine();
		System.out.println(longestCommonSubsequence(a, b));
	}

}
