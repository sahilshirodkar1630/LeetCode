package Medium;

import java.util.Scanner;

public class RemoveNthNodefromEnd_19 {

/*
	Given the head of a linked list, remove the nth node from the end of the list and return its head.
	Follow up: Could you do this in one pass?
	
	Example 1:
	Input: head = [1,2,3,4,5], n = 2
	Output: [1,2,3,5]
	Example 2:
	
	Input: head = [1], n = 1
	Output: []
	Example 3:
	
	Input: head = [1,2], n = 1
	Output: [1]
	
*/	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Node<Integer> head = takeInput();
		int n = sc.nextInt();
		head = removeNthFromEnd(head, n);
		display(head);

	}
	
	 public static Node<Integer> removeNthFromEnd(Node<Integer> head, int n) {
	        if(head == null || head.next==null && n == 1){
	            return null;
	        }
	        // Applying same Logic as AppendLastNtoFirst
	        Node<Integer> fast = head;
	        Node<Integer> slow = head;
	        
	        int i = 0;
	        while(fast.next !=null){
	            if(i<n){
	                fast = fast.next;
	            }else{
	                fast = fast.next;
	                slow= slow.next;
	            }
	            i++;
	        }
	        
	        if(n == i+1){
	        	
	            return head.next;
	            
	        }else{
	        slow.next =  slow.next.next;
	        return head;
	        }
	    }
	 
	 private static void display(Node<Integer> head) {
			// TODO Auto-generated method stub
			while(head!=null) {
				System.out.print(head.data+" ");
				head = head.next;
			}
		}
		
		public static Node<Integer> takeInput() // O(n)
		{
			Node<Integer> head = null,tail = null; 
			Scanner sc = new Scanner(System.in);
			int data = sc.nextInt();
			
			while(data != -1) {
				Node<Integer> newNode = new Node<Integer>(data);
				if(head == null) {
					head = newNode;
					tail = newNode;
				}else {
					tail.next = newNode;
					tail = tail.next; // OR tail= newNode;
					
				}
				data =sc.nextInt();
				
			}
			return head;
		}

}
