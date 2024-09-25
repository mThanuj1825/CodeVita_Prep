package Topic_15_16_LinkedList.Implementation.SingleLinkedList;

/**
 * LinkedList class representing a singly linked list implementation.
 * *
 * Problem statement:
 * A linked list is a linear data structure where elements, called nodes, are
 * stored in a dynamic manner, allowing for efficient insertion and deletion of nodes.
 * *
 * Intuition:
 * The LinkedList class manages a sequence of nodes, providing methods to
 * add, delete, and manipulate the list. It maintains a reference to the head
 * of the list and keeps track of the size for efficient operations.
 * *
 * Approach:
 * * The LinkedList class has:
 * - A Node head pointing to the first node in the list.
 * - An integer size representing the number of elements in the list.
 * * Key operations include:
 * - `addFirst(int data)`: Adds a new node with given data at the beginning of the list.
 * - `addLast(int data)`: Appends a new node with given data at the end of the list.
 * - `add(int data, int index)`: Inserts a new node at the specified index.
 * - `deleteFirst()`: Removes the first node and returns its data.
 * - `deleteLast()`: Removes the last node and returns its data.
 * - `delete(int index)`: Removes a node at the specified index and returns its data.
 * - `buildList(int[] arr)`: Constructs the linked list from an array of integers.
 * - `toString()`: Provides a string representation of the linked list.
 * *
 * Topics / Data Structures used:
 * * Linked lists
 * *
 * Time Complexity:
 * * O(1) for adding or deleting from the front.
 * * O(n) for adding or deleting from the end or a specified index in the worst case.
 * *
 * Space Complexity:
 * * O(1) for storing pointers.
 * * O(n) for storing the elements in the list.
 */

public class LinkedList {
	public Node head; // Reference to the first node in the list
	public int size;  // Number of elements in the list

	public LinkedList() {
		this.head = null; // Initialize head to null
		this.size = 0;    // Initialize size to 0
	}

	public void addFirst(int data) {
		this.head = new Node(data, this.head);
		this.size++;
	}

	public void addLast(int data) {
		if (this.head == null) {
			this.addFirst(data);
			return;
		}

		Node temp = new Node(data);
		Node t = this.head;

		while (t.next != null) {
			t = t.next;
		}

		t.next = temp;
		this.size++;
	}

	public void add(
			int data,
			int index
	) {
		if (index < 0 || index > this.size) {
			return;
		}

		if (index == 0) {
			this.addFirst(data);
			return;
		}

		if (index == this.size) {
			this.addLast(data);
			return;
		}

		Node t = this.head;
		for (int i = 0; i < index - 1; i++) {
			t = t.next;
		}

		t.next = new Node(data, t.next);
		this.size++;
	}

	public Integer deleteFirst() {
		if (this.head == null) {
			return null;
		}

		int data = this.head.data;
		this.head = this.head.next;
		this.size--;

		return data;
	}

	public Integer deleteLast() {
		if (this.head == null) {
			return null;
		}

		if (this.size == 1) {
			return this.deleteFirst();
		}

		Node t = this.head;
		for (int i = 0; i < this.size - 2; i++) {
			t = t.next;
		}

		int data = t.next.data;
		t.next = null;
		this.size--;

		return data;
	}

	public Integer delete(int index) {
		if (this.head == null || index < 0 || index >= this.size) {
			return null;
		}

		if (index == 0) {
			return this.deleteFirst();
		}

		if (index == this.size - 1) {
			return this.deleteLast();
		}

		Node t = this.head;
		for (int i = 0; i < index - 1; i++) {
			t = t.next;
		}

		int data = t.next.data;
		t.next = t.next.next;
		this.size--;

		return data;
	}

	public void buildList(int[] arr) {
		this.head = null;

		for (int i : arr) {
			this.addLast(i);
		}
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		Node t = this.head;

		while (t != null) {
			str.append(t.data).append(" -> ");
			t = t.next;
		}

		return str.append("null").toString();
	}
}
