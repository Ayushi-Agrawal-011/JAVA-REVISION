package revision;

import revision.C18_01.ListNode;

public class C19_01 {
	class ListNode{
		int val;
		ListNode next;
	}
	 public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		 ListNode dummy=new ListNode();
		 ListNode temp=dummy;
		 while(list1!=null && list2!=null){
		     if(list1.val<list2.val){
		        
		         dummy.next=list1;
		          dummy=dummy.next;
		         list1=list1.next;
		     }
		     else{
		            dummy.next=list2;
		          dummy=dummy.next;
		         list2=list2.next;
		     }

		 }
		 if(list1!=null)
		 dummy.next=list1;
		 if(list2!=null)
		 dummy.next=list2;
		 return temp.next;
	 }
}
