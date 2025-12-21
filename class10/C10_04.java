package revision;
import java.util.*;
public class C10_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[]	nums = {1,2,3};
	System.out.println(permute(nums));
	}
	  public  static List<List<Integer>> permute(int[] nums) {
	       List<List<Integer>> res=new ArrayList<>();
	       List<Integer> curr=new ArrayList<>();
	       p(nums,res,curr);
	       return res;
	        

	    }
	    public static  void p(int []nums,List<List<Integer>> res,List<Integer> curr){
	      if(curr.size()==nums.length){
	        res.add(new ArrayList<>(curr));
	        return;
	      }
	      for(int i=0;i<nums.length;i++){
	    if(!curr.contains(nums[i])){
	        curr.add(nums[i]);
	        p(nums,res,curr);
	        curr.remove(curr.size()-1);
	    }
	      }




	    }
}
