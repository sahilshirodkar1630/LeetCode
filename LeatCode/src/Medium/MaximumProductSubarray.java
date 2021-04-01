package Medium;

import java.util.Scanner;

public class MaximumProductSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0;i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(maximumProductSubarray(arr));
		
	}

	// Brutw force 
//	private static int maximumProductSubarray(int[] arr) {
//
//		int n = arr.length;
//		int max = arr[0];
//		for(int i = 0; i < n; i++) {
//			int curr = arr[i];
//			for(int j = i +1 ;j < n ; j++) {
//				 
//				max = Math.max(max, curr);
//				curr*= arr[j];
//				
//			}
//			max = Math.max(max, curr);
//			
//		}
//
//		return max;
//	}
	
	private static int maximumProductSubarray(int[] arr ) {
		
		int n = arr.length;
		
		int min = arr[0];
		int max = arr[0];
		int result = arr[0];
		
		for(int i = 1; i < n; i++) {
			
			if(arr[i]<0) {
				int temp = max ;
				max= min;
				min = temp;
			}
			
			max = Math.max(arr[i], max*= arr[i]);
			min = Math.min(arr[i], min*= arr[i]);
			
			if(max>result) {
				result = max;
			}
			
		}
		return result;
		
		
	}

}
