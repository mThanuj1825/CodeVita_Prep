package Topic_15_16_LinkedList.Problems;

import Topic_15_16_LinkedList.Implementation.SingleLinkedList.Node;

public class Palindrome_Or_Not {
	public static void main(String[] args) {
		Node n5 = new Node(1);
		Node n4 = new Node(2, n5);
		Node n3 = new Node(3, n4);
		Node n2 = new Node(2, n3);
		Node n1 = new Node(1, n2);

		System.out.println(solve(n1));
	}

	public static boolean solve(Node root) {
		Node slow = root, fast = root;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		Node prev = slow;
	}
}
