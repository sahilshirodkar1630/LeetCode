package Medium;

public class Perfect_Squares_279 {
/*
	Given an integer n, return the least number of perfect square numbers that sum to n.

		A perfect square is an integer that is the square of an integer; in other words, 
		it is the product of some integer with itself. For example, 1, 4, 9, and 16 are perfect squares while 3 and 11 are not.
 
		Example 1:
			Input: n = 12
			Output: 3
			Explanation: 12 = 4 + 4 + 4.
			
		Example 2:
			Input: n = 13
			Output: 2
			Explanation: 13 = 4 + 9.
			
*/
	  public int numSquares(int n) {
	        int[] storage = new int[n+1];
			storage[0]= 0;
			storage[1]= 1;
			for(int i=2;i<=n;i++){
				int minCount = Integer.MAX_VALUE;
				int j=1;
				while(j*j <= i) {
					int val = i - j*j;
					if(storage[val]<minCount) {
						minCount= storage[val];
					}
					j++;
				}
			storage[i] = minCount+1;	
			}
			return storage[n];
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
