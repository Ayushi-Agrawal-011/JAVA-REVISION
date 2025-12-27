package revision;

import revision.C18_01.ListNode;

public class C18_02 {
	class ListNode{
		int val;
		ListNode next;
	}
	   public ListNode middleNode(ListNode head) {
	        ListNode slow=head;
	        ListNode fast=head;
	        while(fast!=null && fast.next!=null){
	            slow=slow.next;
	            fast=fast.next.next;
	        }
	        return slow;
	    }
}
