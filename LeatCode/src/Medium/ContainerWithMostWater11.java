package Medium;

import java.util.Scanner;

public class ContainerWithMostWater11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new  int[n];
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println(maxArea(arr));
	}

	 public static int maxArea(int[] height) {
	        
	    int area = 0;
	    int i=0;
	    int left = 0;
	    int right = height.length-1;
	    
	    while(i<height.length) {
	    	area = Math.max(area, Math.min(height[left], height[right]) * (right-left) );
	    	if(height[left]<height[right]) {
	    		left++;
	    	}else {
	    		right--;
	    	}
	    	i++;
	    }
	    return  area;
	 }
}
