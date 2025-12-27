package revision;
import java.util.*;

public class C17_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class ListNode{
		int val;
		ListNode next;
	}
	 public ListNode reverseList(ListNode head) {
	        ListNode curr=head;
	        ListNode prev=null;
	        while(curr!=null){
	            ListNode ahead=curr.next;
	            curr.next=prev;
	            prev=curr;
	            curr=ahead;
	        }
	        return prev;
	    }

}
