package Topic_15_16_LinkedList.Problems;

import Topic_15_16_LinkedList.Implementation.SingleLinkedList.Node;

public class Palindrome_Or_Not {
	public static void main(String[] args) {
		Node n6 = new Node(1);
		Node n5 = new Node(2, n6);
		Node n4 = new Node(1, n5);
		Node n3 = new Node(3, n4);
		Node n2 = new Node(2, n3);
		Node n1 = new Node(1, n2);

		System.out.println(solve(n1));
	}

	public static boolean solve(Node root) {
		if (root == null || root.next == null) {
			return true;
		}

		Node slow = root, fast = root;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		if (slow == null) {
			return false;
		}

		Node left = root;
		Node right = Reverse_A_LinkedList.solve(slow.next);

		while (right != null) {
			if (left.data != right.data) {
				return false;
			}

			left = left.next;
			right = right.next;
		}

		return true;
	}
}
