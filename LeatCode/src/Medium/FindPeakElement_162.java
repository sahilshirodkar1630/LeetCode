package Medium;

import java.util.Scanner;

public class FindPeakElement_162 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0;i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(findPeakElement(arr));

	}

	public static int findPeakElement(int arr[]) {
		return findPeakElement(arr, 0, arr.length-1);
	}
	private static int findPeakElement(int arr[],int start, int end) {
		// TODO Auto-generated method stub
		if(start==end) {
			return start;
		}
		int mid = (end + start) / 2;
//		int mid = n/2;
	
		
		if(arr[mid]<arr[mid+1]) {
			return findPeakElement(arr, mid + 1, end);
		}else {
			return findPeakElement(arr, start, mid);
		}
	}

}
