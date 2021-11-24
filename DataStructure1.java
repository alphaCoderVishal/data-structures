package data_structure_implementation;

/**
 * @author vishal567795
 *
 */
class Node{
	int data;
	Node next;
}
class LinkedList{
	Node head;//simply a reference

	public void insert(int idata) {
		Node temp=head;//whatever head refer now refered by temp
		Node NewNode=new Node();
		NewNode.data=idata;
		NewNode.next=null;
		if(head==null) {
			head=NewNode;//now head is the newNode
		}
		else {
			while(temp.next!=null) {	
				temp=temp.next;
			}
				temp=NewNode;	
				  }
	}
	
	
	public void show() {
		Node temp=head;
		if(head==null) {
			System.out.println("The linked list is empty");
		}
		else {
			//visiting each node
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;

				
			}
		}
	}
}
public class DataStructure1 {
	public static void main(String[]args) {
		LinkedList list1=new LinkedList();
				list1.show();
				list1.insert(6);
				list1.show();
				
	}
                   
}
