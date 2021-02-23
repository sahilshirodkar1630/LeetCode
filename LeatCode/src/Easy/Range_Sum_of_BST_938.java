package Easy;

public class Range_Sum_of_BST_938 {

	
//	Given the root node of a binary search tree,
//	return the sum of values of all nodes with a value in the range [low, high].
//			Example 1:
//			Input: root = [10,5,15,3,7,null,18], low = 7, high = 15
//			Output: 32
//			
//			Example 2:
//			Input: root = [10,5,15,3,7,13,18,1,null,6], low = 6, high = 10
//			Output: 23
//	
//	 Definition for a binary tree node.
	 public class TreeNode {
	      int val;
	     TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	         this.left = left;
	          this.right = right;
	      }
	  }
	 
	  public int rangeSumBST(TreeNode root, int low, int high) {
		     if(root == null){
		         return 0;
		     }  
		        int sum = 0;
		        if(root.val>=low && root.val<=high){
		            sum += root.val;
		        }
		        
		        if(root.val>high){
		            sum += rangeSumBST(root.left,low,high);
		        }else if(root.val<low){
		            sum += rangeSumBST(root.right,low ,high);
		        }else{
		            sum += rangeSumBST(root.left,low,high);
		        sum += rangeSumBST(root.right,low ,high);
		    
		        }
		        return sum;
		    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
