package Topic_15_16_LinkedList.Implementation.SingleLinkedList;

/**
 * Node class representing an individual node in a singly linked list.
 * *
 * Problem statement:
 * A node contains data and a reference to the next node in the list.
 * *
 * Intuition:
 * The Node class is fundamental to the structure of a linked list,
 * where each node contains a piece of data and a pointer to the next node.
 * This allows for dynamic memory allocation and efficient insertion and deletion
 * of elements from the list.
 * *
 * Approach:
 * * Each Node object holds:
 * - An integer `data` representing the value stored in the node.
 * - A reference `next` pointing to the next node in the linked list.
 * * Two constructors are provided:
 * - The first constructor initializes a node with given data and sets `next` to null.
 * - The second constructor allows the creation of a node with both data and a reference to the next node.
 * *
 * Topics / Data Structures used:
 * * Linked lists
 * *
 * Time Complexity:
 * * O(1) for node creation since it involves simple assignments.
 * *
 * Space Complexity:
 * * O(1) for storing a single node.
 */

public class Node {
    public int data; // Data stored in the node
	public Node next; // Reference to the next node

	public Node(int data) {
		this.data = data; // Initialize the node with data
		this.next = null; // Set next to null
	}

	public Node(
			int data,
			Node next
	) {
		this.data = data; // Initialize the node with data
		this.next = next; // Set next to the provided node
	}
}
