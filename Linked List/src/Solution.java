
class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Solution {

	public static Node insert(Node head, int data) {
		Node node = new Node(data);
		Node pointer = head;
		if (pointer == null)
			return node;
		while (pointer.next != null)
			pointer = pointer.next;
		pointer.next = node;
		return head;

	}
	
	public static void display(Node head) {
		Node start = head;
		while(start != null) {
			System.out.println(start.data);
			start = start.next;
		}
	}

	public static void main(String[] args) {
		Node head = null;
		for (int i = 0; i < 3; i++){
			head = insert(head, i);
		}
		
		display(head);
	}

}
