package Day_15_16_LinkedList.Problems;

import Day_15_16_LinkedList.Implementation.SingleLinkedList.Node;

public class ReverseALinkedList {
	public static void main(String[] args) {
		Node n5 = new Node(5);
		Node n4 = new Node(4, n5);
		Node n3 = new Node(3, n4);
		Node n2 = new Node(2, n3);
		Node n1 = new Node(1, n2);

		n1 = reverse(n1);

		Node t = n1;
		while (t != null) {
			System.out.print(t.data + " -> ");
			t = t.next;
		}

		System.out.println("null");
	}

	public static Node reverse(Node head) {
		Node prev = null;
		Node cur = head;

		while (cur != null) {
			Node nxt = cur.next;
			cur.next = prev;
			prev = cur;
			cur = nxt;
		}

		return prev;
	}
}
