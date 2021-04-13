package Medium;

import java.util.*;
import java.util.ArrayList;
import java.util.Queue;




 class BinaryTreeNode<T> {
	
	public T data;
	public BinaryTreeNode<T> left;
	public BinaryTreeNode<T> right;
	
	public BinaryTreeNode(T data) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}
	

}
public class BinaryTreeLevelOrderTraversalII_107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public List<List<Integer>> levelOrderBottom(BinaryTreeNode<Integer> root) {
         ArrayList<List<Integer>> finalOutput = new ArrayList<List<Integer>>();
        if(root==null){
            return finalOutput;
        }
     
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<BinaryTreeNode<Integer>>();
        queue.add(root);
        queue.add(null);
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        while(!queue.isEmpty()) {
        	try {
        		BinaryTreeNode<Integer> frontNode = queue.remove();
				
				if(frontNode==null) {
					if(queue.isEmpty()) {
                         finalOutput.add(0,ans);
						break;
					}
                    finalOutput.add(0,ans);
                    ans = new ArrayList<Integer>();
					
					queue.add(null);
				}else {
					// System.out.print(frontNode.data+" ");
                    ans.add(frontNode.data);
					if(frontNode.left!=null) {
						queue.add(frontNode.left);
					}
					if(frontNode.right!=null) {
						queue.add(frontNode.right);
						
					}
					
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
        }
        return finalOutput;
    }

}
