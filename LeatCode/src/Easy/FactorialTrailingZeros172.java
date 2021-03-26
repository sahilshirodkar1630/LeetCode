package Easy;

import java.util.Scanner;

public class FactorialTrailingZeros172 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc .nextInt();
		System.out.println(factTrailingZeros(n));
	}

	public static int factTrailingZeros(int n ) {
		  int count =0;
	        while(n>0){
	            n = n/5;
	            count += n;
	            
	        }
			return count;
		
	}
	
}
