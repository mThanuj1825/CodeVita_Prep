package Topic_15_16_LinkedList.Problems;

import Topic_15_16_LinkedList.Implementation.SingleLinkedList.Node;

/**
 * Problem: Find the starting point of the loop in a linked list.
 * *
 * Intuition:
 * Once a cycle is detected in a linked list, the starting point of the cycle can be found by resetting the slow
 * pointer to the head of the list.
 * Moving both slow and fast pointers one step at a time from their respective positions will eventually cause them
 * to meet at the start of the cycle.
 * *
 * Approach:
 * 1. Detect the cycle using two pointers, `slow` and `fast`.
 * 2. Once they meet, reset the slow pointer to the head and move both pointers one step at a time.
 * 3. When the slow and fast pointers meet again, the node is the start of the cycle.
 * *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class Starting_Point_Of_Loop {
	public static void main(String[] args) {
		Node n7 = new Node(7);
		Node n6 = new Node(6, n7);
		Node n5 = new Node(5, n6);
		Node n4 = new Node(4, n5);
		Node n3 = new Node(3, n4);
		Node n2 = new Node(2, n3);
		Node n1 = new Node(1, n2);
		n7.next = n3; // Creates a loop with starting point at node 3

		System.out.println(solve(n1));
	}

	public static int solve(Node head) {
		Node slow = head, fast = head;

		// Detect the cycle
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				// Move slow pointer to the start of the list
				slow = head;

				// Find the starting point of the loop
				while (slow != fast) {
					slow = slow.next;
					fast = fast.next;
				}

				return slow.data;
			}
		}

		return Integer.MIN_VALUE; // No loop
	}
}
