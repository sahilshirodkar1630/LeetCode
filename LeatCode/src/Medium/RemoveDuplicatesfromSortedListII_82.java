package Medium;

import java.util.Scanner;

public class RemoveDuplicatesfromSortedListII_82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		head = deleteDuplicates(head);
		display(head);
	}

	 public static Node<Integer> deleteDuplicates(Node<Integer> head) {
	        if(head == null|| head.next == null) {
				 return head;
			 }
			 
			 int prevSame = Integer.MIN_VALUE;
			 Node<Integer> prev = null;
			 Node<Integer> current = head;
			 Node<Integer> next = head.next;
			 
			 while(current.next!=null) {
				 if(current.data == next.data) {
					 prevSame = current.data;
					 current  = current.next;
					 next = next.next;
				 }else {
					 if(current.data != prevSame) {
						 if(prev == null) {
							 prev = current;
							 head = prev;
							 
						 }else {
						 prev.next = current;
						 prev = prev.next;
						
						 }
	                     prevSame = Integer.MIN_VALUE ;
					 }
					 current  = current.next;
					 next = next.next;
					 
				 }
				 
			 }
			 if(current.data==prevSame) {
				 if(prev== null) {
					 head = null;
				 }else {
					 prev.next = null;
				 }
			 }else {
				 if(prev == null) {
					 prev = current;
					 head = prev;
				 }else {
					 prev.next = current;
				 }
			 }
		        return head;
	        
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
