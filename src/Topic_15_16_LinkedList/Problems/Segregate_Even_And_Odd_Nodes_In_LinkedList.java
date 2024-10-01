package Topic_15_16_LinkedList.Problems;

import Topic_15_16_LinkedList.Implementation.SingleLinkedList.Node;

public class Segregate_Even_And_Odd_Nodes_In_LinkedList {
	public static void main(String[] args) {
		Node n6 = new Node(6);
		Node n5 = new Node(5, n6);
		Node n4 = new Node(4, n5);
		Node n3 = new Node(3, n4);
		Node n2 = new Node(2, n3);
		Node n1 = new Node(1, n2);

		solve(n1);

		Display_LInked_List.solve(n1);
	}

	public static void solve(Node head) {
		if (head == null || head.next == null) {
			return;
		}

		Node odd = head;
		Node even = head.next;
		Node oddHead = null;
		Node evenHead = even;

		while (odd != null) {
			odd.next = even.next;
			odd = odd.next;

			if (odd != null) {
				even.next = odd.next;
				even = even.next;
			}
		}
	}
}
