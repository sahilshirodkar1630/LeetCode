package Easy;

import java.util.Scanner;

public class FindNUniqueIntegersSumUptoZero_1304 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		int[] Output =  targetZero(n);
		for(int i: Output) {
			System.out.print(i+" ");
		}
	}

	private static int[] targetZero(int n) {
		// TODO Auto-generated method stub
		int arr[] = new int[n];
		int mid = n/2;
		boolean isEven = false;
		if(n%2==0) {
			isEven = true;
			
		}
		int k=0;
		for(int i= -mid;i<=mid;i++) {
			if(i==0&& isEven) {
				continue;
			}
			arr[k]=i;
			k++;
		}
		return arr;
	}
	
	/*
	 
	   public int[] sumZero(int n) {
	   
        int Output[] = new int[n];
		int mid = n/2;  // getting mid value
		boolean isEven = false;
		if(n%2==0) isEven = true;	
        
		int k=0;
		for(int i= -mid;i<=mid;i++) { // Put values from - mid to mid int Output array
			if(i==0&& isEven) {
			// if N is Even ignore the 0 else put the zero
				continue;
			}
			Output[k]=i;
			k++;
		}
		return Output;
    }
	 
	 
	 */
	 
}
