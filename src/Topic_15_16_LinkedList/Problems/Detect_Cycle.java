package Topic_15_16_LinkedList.Problems;

import Topic_15_16_LinkedList.Implementation.SingleLinkedList.Node;

/**
 * Problem: Detect if a cycle exists in a linked list.
 * *
 * Intuition:
 * A cycle in a linked list can be detected by using two pointers moving at different speeds.
 * The slow pointer moves one step at a time, and the fast pointer moves two steps at a time.
 * If there is a cycle, the fast pointer will eventually meet the slow pointer.
 * *
 * Approach:
 * 1. Initialize two pointers, `slow` and `fast`, both starting at the root.
 * 2. Move `slow` by one node and `fast` by two nodes in each iteration.
 * 3. If the two pointers meet, a cycle exists. If `fast` reaches the end, there is no cycle.
 * *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class Detect_Cycle {
	public static void main(String[] args) {
		Node n5 = new Node(5);
		Node n4 = new Node(4, n5);
		Node n3 = new Node(3, n4);
		n5.next = n3; // Creates a cycle
		Node n2 = new Node(2, n3);
		Node n1 = new Node(1, n2);

		System.out.println(solve(n1));
	}

	public static boolean solve(Node root) {
		Node slow = root, fast = root;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				return true;
			}
		}

		return false;
	}
}
