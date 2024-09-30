package Topic_15_16_LinkedList.Problems;

import Topic_15_16_LinkedList.Implementation.SingleLinkedList.Node;

public class Starting_Point_Of_Loop {
	public static void main(String[] args) {
		Node n7 = new Node(7);
		Node n6 = new Node(6, n7);
		Node n5 = new Node(5, n6);
		Node n4 = new Node(4, n5);
		Node n3 = new Node(3, n4);
		Node n2 = new Node(2, n3);
		Node n1 = new Node(1, n2);
		n7.next = n3;

		System.out.println(solve(n1));
	}

	public static int solve(Node root) {
		Node slow = root, fast = root;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				slow = root;

				while (slow != fast) {
					slow = slow.next;
					fast = fast.next;
				}

				return slow.data;
			}
		}

		return Integer.MIN_VALUE;
	}
}
