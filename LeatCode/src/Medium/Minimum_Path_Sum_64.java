package Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Minimum_Path_Sum_64 {
/*
	Given a m x n grid filled with non-negative numbers,
	find a path from top left to bottom right, which minimizes the sum of all numbers along its path.
	Note: You can only move either down or right at any point in time.
	Example 1:
		Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
		Output: 7
		Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.
	
	Example 2:
		Input: grid = [[1,2,3],[4,5,6]]
		Output: 12
		
*/
	public static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] storage = new int[m][n];
        
        storage[m-1][n-1] = grid[m-1][n-1];
       
        for(int j=n-2;j>=0;j--){
            storage[m-1][j]= storage[m-1][j+1]+grid[m-1][j]; 
        }
        for(int i=m-2;i>=0;i--){
            storage[i][n-1]= storage[i+1][n-1]+grid[i][n-1]; 
        }
        
        for(int i= m-2;i>=0;i--){
            for(int j= n-2;j>=0;j--){
                int option1 = storage[i][j+1];
                int option2 = storage[i+1][j];
                storage[i][j]= grid[i][j]+Math.min(option1,option2);
            }
        }
        return storage[0][0];
    }
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static int[][] take2DInput() throws IOException {
        String[] strRowsCols = br.readLine().trim().split("\\s");
        int mRows = Integer.parseInt(strRowsCols[0]);
        int nCols = Integer.parseInt(strRowsCols[1]);

        if (mRows == 0) {
            return new int[0][0];
        }

        int[][] mat = new int[mRows][nCols];

        for (int row = 0; row < mRows; row++) {
            String[] strNums; 
            strNums = br.readLine().trim().split("\\s");
            
            for (int col = 0; col < nCols; col++) {
                mat[row][col] = Integer.parseInt(strNums[col]);
            }
        }

        return mat;
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        int[][] mat = take2DInput();
        System.out.println(minPathSum(mat));
     
    }

}
