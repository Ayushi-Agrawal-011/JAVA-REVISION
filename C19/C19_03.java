package revision;

import revision.C19_02.ListNode;

public class C19_03 {
	class ListNode{
		int val;
		ListNode next;
	}
	public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
       return head;  // Return if list has 0 or 1 node (already sorted)
   }
   ListNode odd=head;
   ListNode even=head.next;
   ListNode evenhead=even;
while(even != null && even.next != null){
odd.next=even.next;
odd=odd.next;
even.next=odd.next;
even=even.next;

}
odd.next=evenhead;
return head;

}
}
