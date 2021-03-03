package Medium;

import java.util.Scanner;

public class Delete_Operation_for_Two_Strings_583 {

	/*
	 * Given two words word1 and word2, find the minimum number of steps
	 *  required to make word1 and word2 the same, where in each step you can 
	 *  delete one character in either string.

		Example 1:
			Input: "sea", "eat"
			Output: 2
			Explanation: You need one step to make "sea" to "ea" and another step to make "eat" to "ea".
		
		Note:
			The length of given words won't exceed 500.
			Characters in given words can only be lower-case letters.
	 */
	
	 public static int minDistance(String a, String b) {
		 // Getting length of a and b in m and n
	        int m = a.length();
		    int n = b.length();
		    int dp[][] = new int[m+1][n+1];
		    // Place all elements of first column as length of m
		    for(int i=0;i<m+1;i++){
		         dp[i][0] =i;
		    }
		 // Place all elements of first row as length of n
		    for(int j=0;j<n+1;j++){
		         dp[0][j] = j;
		    }
		    
	         for(int i=1;i<m+1;i++){
		        for(int j=1;j<n+1;j++){
		        	// if first char of both string is equal just 
		        	//Just pass the rest string 
		            if(a.charAt(m-i)==b.charAt(n-j)){
		                dp[i][j] = dp[i-1][j-1];    
		            }else{
		            	//if its not equal then delete one char froom each string 
		            	// and return the min from both
		                dp[i][j]= 1+Math.min(dp[i][j-1],dp[i-1][j]);
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
		System.out.println(minDistance(a, b));
	}

}
