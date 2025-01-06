package LinkedList;

public class LinkedList {

	static class Node {

		private int data;
		private Node next;

		public Node() {

			this.data = 0;
			this.next = null;
		}

		public Node(int val) {

			this.data = val;
			this.next = null;
		}

	}

	private Node head;

	public LinkedList() {

		this.head = null;
	}

	public void display() {

		Node trav = head;
		System.out.println("List :");
		while (trav != null) {
			System.out.println(trav.data);
			trav = trav.next;
		}
		System.out.println(" ");
	}
	
	public void addFirst(int val) {
		Node newNode = new Node(val);
		newNode.next=head;
		head= newNode;
		
	}

	public void addLast(int val) {

		// create new Node
		Node newNode = new Node(val);

		if (head == null) {
			head = newNode;
		} else {
			Node trav = head;
			// Travese upto last node which is null
			while (trav.next != null) {
				trav = trav.next;
			}
			trav.next = newNode;
		}
	}

}
