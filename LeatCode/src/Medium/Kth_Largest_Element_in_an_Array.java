package Medium;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Kth_Largest_Element_in_an_Array {
/*
	Find the kth largest element in an unsorted array. 
	Note that it is the kth largest element in the sorted order, not the kth distinct element.

	Example 1:
	Input: [3,2,1,5,6,4] and k = 2
	Output: 5
	
	Example 2:
	Input: [3,2,3,1,2,4,5,5,6] and k = 4
	Output: 4
	*/
	
	
	 public static int findKthLargest(int[] input, int k) {
	        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
			int i=0;
			for(;i<k;i++) {
				pq.add(input[i]);
			}
			while(i<input.length) {
				int temp= pq.peek();
				if(input[i]>temp) {
					pq.remove();
					pq.add(input[i]);
				}
				i++;
			}
			return pq.remove();
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in) ;
		int n = sc.nextInt();
		int array[] = new int[n];
		for(int i=0;i<n;i++) {
		array[i]= sc.nextInt();	
		}
		int k = sc.nextInt();
		
		findKthLargest(array, k);
	}

}
