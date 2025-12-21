package revision;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class C10_03 {


	public static void main(String[] args) {
	
		int[]s= {1,2,2};
		Arrays.sort(s);
		System.out.println(subsets(s));
	}
	   public static  List<List<Integer>> subsets(int[] nums) {
	       List<List<Integer>> res=new ArrayList<>();
	       List <Integer> cur=new ArrayList<>();
	       Combination(nums,cur,0,res);
	       return res;
	    }
	    
		public static void Combination(int[] nums,List<Integer> cur, int idx, List<List<Integer>> res){
	        res.add(new ArrayList<>(cur));
	    for(int i=idx;i<nums.length;i++){
	    	 if(i>idx && nums[i]==nums[i-1])
	    	        continue;
	    cur.add(nums[i]);
	    Combination(nums,cur,i+1,res);
	        cur.remove(cur.size()-1);
			}}
}
