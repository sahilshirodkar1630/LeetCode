package Medium;

import java.util.Scanner;

public class MaximumLengthofaConcatenatedStringwithUniqueCharacters_1239 {

	
	
	/*
	LeetCode Problem
	 public int maxLength(List<String> arr) {
        return uniqueCharactersStringHelper(arr,0,"");
    }
    private static int uniqueCharactersStringHelper(List<String> arr, int start, String s) {
		// TODO Auto-generated method stub
		if(start == arr.size()) {
			int[] freq = new int[26];
			for(int i=0;i<s.length();i++) {
				int c = s.charAt(i) -'a';
				freq[c]++;
			}
			
			boolean isDuplicate=false;
			for(int i=0;i<freq.length;i++) {
				if(freq[i]>=2) {
					isDuplicate=true;
					break;
				}
			}
			
			if(isDuplicate) {
				return 0;
			}
			return s.length();
		}
		
		int op1 = uniqueCharactersStringHelper(arr, start+1, s+arr.get(start));
		int op2 = uniqueCharactersStringHelper(arr, start+1, s);
		return  Math.max(op1, op2);
	}
	
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int n= sc.nextInt();
		String arr[]=  new String[n];
		for(int i=0;i<n;i++) {
			arr[i]= sc.next();
		}
		System.out.println(uniqueCharactersString(arr));
	}

	private static int uniqueCharactersString(String[] arr) {
		// TODO Auto-generated method stub
		return uniqueCharactersStringHelper(arr,0,"");
		
	}

	private static int uniqueCharactersStringHelper(String[] arr, int start, String s) {
		// TODO Auto-generated method stub
		if(start == arr.length) {
			int[] freq = new int[26];
			for(int i=0;i<s.length();i++) {
				int c = s.charAt(i) -'a';
				freq[c]++;
			}
			
			boolean isDuplicate=false;
			for(int i=0;i<freq.length;i++) {
				if(freq[i]>=2) {
					isDuplicate=true;
					break;
				}
			}
			
			if(isDuplicate) {
				return 0;
			}
			return s.length();
		}
			
	
		
		int op1 = uniqueCharactersStringHelper(arr, start+1, s+arr[start]);
		int op2 = uniqueCharactersStringHelper(arr, start+1, s);
		return  Math.max(op1, op2);
	}
	
	

}
