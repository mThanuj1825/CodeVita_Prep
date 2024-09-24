package Day_15_16_LinkedList.Implementation;

public class LinkedList {
	Node head;
	int size;

	public LinkedList() {
		this.head = null;
		this.size = 0;
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
