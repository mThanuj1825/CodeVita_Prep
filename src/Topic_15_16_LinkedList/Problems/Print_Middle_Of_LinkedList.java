package Topic_15_16_LinkedList.Problems;

import Topic_15_16_LinkedList.Implementation.SingleLinkedList.Node;

/**
 * Print_Middle_Of_LinkedList class contains a method to find and print the
 * middle element of a singly linked list using the two-pointer technique.
 * *
 * Problem statement:
 * Given a linked list, the task is to find and print the middle element of
 * the list. If the list has an even number of nodes, the second middle node
 * should be returned.
 * *
 * Intuition:
 * The two-pointer technique is used, where one pointer (fast) moves at
 * twice the speed of the other pointer (slow). When the fast pointer reaches
 * the end of the list, the slow pointer will be at the middle.
 * *
 * Approach:
 * * Initialize two pointers, slow and fast, both pointing to the head of the
 * linked list.
 * * Iterate through the list while moving the slow pointer one step at a time
 * and the fast pointer two steps at a time.
 * * When the fast pointer's next reaches the end (null), the slow pointer will be at
 * the middle node. Print the value of the slow pointer.
 * *
 * Topics / Data Structures used:
 * * Linked lists
 * * Two-pointer technique
 * *
 * Time Complexity:
 * * O(n), where n is the number of nodes in the linked list, as we traverse
 * the list once.
 * *
 * Space Complexity:
 * * O(1), since we are using a constant amount of space for the two pointers.
 */

public class Print_Middle_Of_LinkedList {
	public static void main(String[] args) {
		Node n6 = new Node(6);
		Node n5 = new Node(5, n6);
		Node n4 = new Node(4, n5);
		Node n3 = new Node(3, n4);
		Node n2 = new Node(2, n3);
		Node n1 = new Node(1, n2);

		Node slow = n1, fast = n1;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		System.out.println(slow.data); // Print the middle element
	}
}
