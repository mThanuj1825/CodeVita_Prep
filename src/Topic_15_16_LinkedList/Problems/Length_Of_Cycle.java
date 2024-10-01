package Topic_15_16_LinkedList.Problems;

import Topic_15_16_LinkedList.Implementation.SingleLinkedList.Node;

/**
 * Problem: Find the length of a cycle in a linked list.
 * *
 * Intuition:
 * Once a cycle is detected in a linked list, the length of the cycle can be determined by counting the number of
 * nodes it contains.
 * After the fast and slow pointers meet inside the cycle, reset the slow pointer and count the number of steps it
 * takes for the slow pointer to meet the fast pointer again.
 * *
 * Approach:
 * 1. Detect the cycle using two pointers, `slow` and `fast`, where `slow` moves one step and `fast` moves two steps.
 * 2. Once they meet, move the slow pointer again within the cycle to count the number of nodes in the cycle.
 * 3. Return the count as the length of the cycle.
 * *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class Length_Of_Cycle {
	public static void main(String[] args) {
		Node n5 = new Node(5);
		Node n4 = new Node(4, n5);
		Node n3 = new Node(3, n4);
		n5.next = n3; // Creates a cycle
		Node n2 = new Node(2, n3);
		Node n1 = new Node(1, n2);

		System.out.println(solve(n1));
	}

	public static int solve(Node head) {
		Node slow = head, fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				slow = slow.next;
				int count = 1;

				while (slow != fast) {
					slow = slow.next;
					count++;
				}

				return count;
			}
		}

		return 0;
	}
}
