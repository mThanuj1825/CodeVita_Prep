package Day_15_16_LinkedList.Problems;

import Day_15_16_LinkedList.Implementation.LinkedList;

public class LinkedListOperations {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		//		ll.addFirst(5);
		//		ll.addFirst(4);
		//		ll.addFirst(3);
		//		ll.addFirst(2);
		//		ll.addFirst(1);

		ll.addLast(0);
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);

		System.out.println(ll);
	}
}
