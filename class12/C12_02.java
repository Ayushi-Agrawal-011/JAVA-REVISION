package revision;
import java.util.*;
public class C12_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []nums = {1,17,8};
System.out.println(numSquarefulPerms(nums));
	}
	static List<List<Integer>> res=new ArrayList<>();
	    public  static int numSquarefulPerms(int[] nums) {
	        Arrays.sort(nums);
	        boolean[]visited=new boolean[nums.length];
	        fn(nums,visited,0,new ArrayList<>());
	        return res.size();

	    }
	    public   static void fn(int[]nums,boolean[]visited,int i,List<Integer>ll){
	        if(i>=nums.length){
	            res.add(new ArrayList<>(ll));
	            return;
	        }
	        for(int j=0;j<nums.length;j++){
	             if (visited[j]) continue;
	            if(j>0 && nums[j]==nums[j-1] && !visited[j-1])
	            continue;
	               if (!ll.isEmpty() && !isSquare(ll.get(ll.size() - 1) + nums[j])) continue;
	       
	            visited[j]=true;
	            ll.add(nums[j]);
	            fn(nums,visited,i+1,ll);
	            ll.remove(ll.size()-1);
	            visited[j]=false;
	        }

	    }
	    public static boolean isSquare(int a){

	        int sqrt=(int)Math.sqrt(a);
	        return sqrt*sqrt==a;
	    }

}
