package Hard;

import java.util.Scanner;

public class Edit_Distance_72 {
	/*
	 * Given two strings word1 and word2, return the minimum number of operations
	 *  required to convert word1 to word2.
		You have the following three operations permitted on a word:
		Insert a character
		Delete a character
		Replace a character
		 
		Example 1:
			Input: word1 = "horse", word2 = "ros"
			Output: 3
			Explanation: 
				horse -> rorse (replace 'h' with 'r')
				rorse -> rose (remove 'r')
				rose -> ros (remove 'e')
	
		Example 2:
			Input: word1 = "intention", word2 = "execution"
			Output: 5
			Explanation: 
				intention -> inention (remove 't')
				inention -> enention (replace 'i' with 'e')
				enention -> exention (replace 'n' with 'x')
				exention -> exection (replace 'n' with 'c')
				exection -> execution (insert 'u')
				
	 */
	public static int minDistance(String a, String b) {
        int m = a.length();
        int n = b.length();
        int dp[][]= new int[m+1][n+1] ;
        // Place all elements of first column as length of m at that position
        for(int i=0;i<m+1;i++){
            dp[i][0] = i;    
        }
        // Place all elements of first row as length of n  at that position
         for(int j=0;j<n+1;j++){
		    dp[0][j] = j;
		}
         for(int i=1;i<m+1;i++){
		        for(int j=1;j<n+1;j++){
		        	// if first char of both string is equal Then 
		            if(a.charAt(m-i)==b.charAt(n-j)){
                        //Just pass the rest string 
		                dp[i][j] = dp[i-1][j-1];    
		            }else{
		            	//insert
                        int option1 = dp[i][j-1];
                        //delete
                        int option2 = dp[i-1][j];
                        //Replace
                        int option3 = dp[i-1][j-1]; 
                        //Return 1+minimum from  three
		                dp[i][j]= 1+Math.min(option1,Math.min(option2,option3));
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
