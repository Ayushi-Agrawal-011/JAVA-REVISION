package revision;


public class C18_04 {
	class ListNode{
		int val;
		ListNode next;
	}
	   public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        ListNode pcr=headA;
	        ListNode vgf=headB;
	        while(pcr!=vgf){
	           
	            if(pcr==null)
	            pcr=headB;
	            else 
	            pcr=pcr.next;
	            if(vgf==null)
	            vgf=headA;
	            else 
	            vgf=vgf.next;
	           
	        }
	        return pcr;
	    }
}
