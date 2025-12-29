package revision;


public class C19_06 {
	private class Node {
		int val;
		Node next;

	}
	private Node head;
	public void Floyed_CycleRemoval() {
		Node Meet=hasCycle();
		 if(Meet==null)
			 return;
		 Node slow=head;
		 Node fast=Meet;
		 while(slow.next!=fast.next) {
			 slow=slow.next;
			 fast=fast.next;
		 }
		 fast.next=null;
		
	}
	 public Node hasCycle() {
	        Node slow=head;
	        Node fast=head;
	        while(fast!=null && fast.next!=null){
	            slow=slow.next;
	            fast=fast.next.next;
	            
	            if(slow==fast)
	            return slow;
	        }
	        return null;
	    }
}
