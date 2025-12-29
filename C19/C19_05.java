package revision;

import java.util.*;

public class C19_05 {
	class ListNode{
		int val;
		ListNode next;
	}
	 public int numComponents(ListNode head, int[] nums) {
	      Set<Integer> set=new HashSet<>();
	        for(int i=0;i<nums.length;i++){
	            set.add(nums[i]);

	        }

	        int c=0;
	        while(head!=null){
	        if(set.contains(head.val)&& 
	    (head.next==null || !set.contains(head.next.val)))
	        c++;  
	        head=head.next;  
	        }

	        //System.out.println(head.val);
	       return c; 
	    }
}
