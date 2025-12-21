package revision;
import java.util.*;
public class C9_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates = {2,3,6,7};
		int target = 7;
		System.out.println( combinationSum(candidates,target));
	}
	 public static List<List<Integer>> combinationSum(int[] nums, int target) {
		 List<List<Integer>> res=new ArrayList<>();
		      List<Integer> ll=new ArrayList<>();
		      fn(nums,target,0,res,ll);
		      return res;

		     }
		     public static  void fn(int[]nums,int target,int idx,List<List<Integer>> res, List<Integer> ll){
		          if(target==0){
		             res.add(new ArrayList<>(ll));
		             return;
		         }
		         for(int i=idx;i<nums.length;i++){
		             if(target>=nums[i]){
		             ll.add(nums[i]);
		             fn(nums,target-nums[i],i,res,ll);
		             ll.remove(ll.size()-1);}
		         
		     }}

}
