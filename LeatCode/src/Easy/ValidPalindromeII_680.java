package Easy;

import java.util.Scanner;

public class ValidPalindromeII_680 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(validPalindrome(s));
	}

	 public static boolean validPalindrome(String s) {
	        int i = 0;
	        int j = s.length()-1;
	        boolean isPalindrome = false;
	        int oneOccur = 0;
	        while(i<=j){
	            if(s.charAt(i)!=s.charAt(j)) {
	            	boolean op1=true;
	            	boolean op2 = true;
	            	int left = i+1;
	            	int right = j;
	            	while(left<right) {
	            		if(s.charAt(left)!=s.charAt(right)) {
	            			op1= false;
	            		}
	            		left++;
	            		right--;
	            	}
	            	
	            	left = i;
	            	right = j-1;
	            	while(left<right) {
	            		if(s.charAt(left)!=s.charAt(right)) {
	            			op2= false;
	            		}
	            		left++;
	            		right--;
	            	}
	            	return op1|| op2;
	            	
	            }
	            i++;
	            j--;
	            
	        }
	        return true;
	    }
}
