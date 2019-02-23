package leetcode;

public class AddTwoNumbers {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(0), p = head;
		int s = 0;
		while (l1 != null || l2 != null) {
			if (l1 != null) {
				s += l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				s += l2.val;
				l2 = l2.next;
			}
			p = p.next = new ListNode(s % 10);
			s /= 10;
		}
		p.next = s > 0 ? new ListNode(s) : null;
		return head.next;
	}

}
