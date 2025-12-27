package revision;

import revision.C18_05.ListNode;

public class C18_06 {
	class ListNode{
		int val;
		ListNode next;
	}
	 public ListNode swapPairs(ListNode head) {
	        if(head==null || head.next==null)
	        return head;
	        ListNode curr=head;
	        while(curr!=null && curr.next!=null){
	            int temp=curr.next.val;
	            curr.next.val=curr.val;
	            curr.val=temp;
	            curr=curr.next.next;
	        }
	        return head;
	    }
}
