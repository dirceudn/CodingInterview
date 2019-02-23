package leetcode;

import leetcode.DeleteNthLinkedListEnd.ListNode;

public class MergeTwoSortedLinkedList {
	
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode dummyNode = new ListNode(0);

		/*
		 * tail points to the last result node
		 */
		ListNode tail = dummyNode;
		while (true) {

			/*
			 * if either list runs out, use the other list
			 */
			if (l1 == null) {
				tail.next = l2;
				break;
			}
			if (l2 == null) {
				tail.next = l1;
				break;
			}

			/*
			 * Compare the data of the two lists whichever lists' data is smaller, append it
			 * into tail and advance the head to the next Node
			 */
			if (l1.val <= l2.val) {
				tail.next = l1;
				l1 = l1.next;
			} else {
				tail.next = l2;
				l2 = l2.next;
			}

			/* Advance the tail */
			tail = tail.next;
		}
		return dummyNode.next;

	}
}
