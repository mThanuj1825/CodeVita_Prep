package Day_15_16_LinkedList.Problems;

import Day_15_16_LinkedList.Implementation.SingleLinkedList.LinkedList;

public class LinkedList_Operations {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		int[] arr = {1, 2, 3, 4, 5};

		ll.buildList(arr);

		System.out.println(ll);
	}
}
