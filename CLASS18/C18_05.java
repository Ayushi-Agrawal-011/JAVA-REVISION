package revision;


public class C18_05 {
	class ListNode{
		int val;
		ListNode next;
	}
	public ListNode removeNthFromEnd(ListNode head, int n) {
	    ListNode temp=head;
	    ListNode dummy=head;
	    int c=0;
	   while(temp!=null){
	    temp=temp.next;
	    c++;
	   }
	     n=c-n;
	      if(n==0)
	          return head.next;
	     while(n-->1){
	        dummy=dummy.next;
	     }

	     ListNode k=dummy.next;
	     dummy.next=k.next;
	     k.next=null;
	     return head;


	    }
}
