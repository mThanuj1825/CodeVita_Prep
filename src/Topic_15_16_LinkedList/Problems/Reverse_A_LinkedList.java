package Topic_15_16_LinkedList.Problems;

import Topic_15_16_LinkedList.Implementation.SingleLinkedList.Node;

/**
 * Reverse_A_LinkedList class provides a method to reverse a singly linked list
 * iteratively.
 * *
 * Problem statement:
 * Given the head of a singly linked list, the task is to reverse the linked
 * list and return the new head of the reversed list.
 * *
 * Intuition:
 * The idea is to iteratively change the next pointer of each node to point
 * to the previous node, effectively reversing the direction of the list.
 * *
 * Approach:
 * * Initialize three pointers: prev (to keep track of the previous node),
 * cur (to traverse the list), and nxt (to temporarily store the next node).
 * * Iterate through the list until cur becomes null:
 * - Store the next node in nxt.
 * - Reverse the current node's next pointer to point to prev.
 * - Move prev and cur one step forward.
 * * After the loop, prev will point to the new head of the reversed list.
 * *
 * Topics / Data Structures used:
 * * Linked lists
 * * Pointer manipulation
 * *
 * Time Complexity:
 * * O(n), where n is the number of nodes in the linked list, as we traverse
 * the list once.
 * *
 * Space Complexity:
 * * O(1), since we are using a constant amount of space for the pointers.
 */

public class Reverse_A_LinkedList {
    public static void main(String[] args) {
		Node n5 = new Node(5);
		Node n4 = new Node(4, n5);
		Node n3 = new Node(3, n4);
		Node n2 = new Node(2, n3);
		Node n1 = new Node(1, n2);

		n1 = solve(n1);

		Node t = n1;
		while (t != null) {
			System.out.print(t.data + " -> ");
			t = t.next;
		}

		System.out.println("null");
	}

	public static Node solve(Node head) {
		if (head == null || head.next == null) {
			return head;
		}

		Node newHead = solve(head.next);

		Node front = head.next;
		front.next = head;
		head.next = null;

		return newHead;
	}
}
