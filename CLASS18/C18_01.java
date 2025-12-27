package revision;

import revision.C17_02.ListNode;

public class C18_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class ListNode{
		int val;
		ListNode next;
	}
	 public ListNode deleteDuplicates(ListNode head) {
	        if(head==null)
	        return null;
	        
	        ListNode slow=head;
	 
	        while(slow.next!=null){
	            if(slow.val==slow.next.val){
	                slow.next=slow.next.next;
	              
	            }
	            else{
	                slow=slow.next;
	                
	            }
	            
	        }
	        return head;
	    }

}
