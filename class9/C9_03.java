package revision;
import java.util.*;
public class C9_03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 3, k = 9;
System.out.println(combinationSum3(n,k));

	}
	public static   List<List<Integer>> combinationSum3(int k, int n) {
		  List<List<Integer>> res=new ArrayList<>();
		     List<Integer> ll=new ArrayList<>();
		 fn(k,n,1,res,ll);
		 return res;
		      
		    }
		    public static void fn(int k,int target,int idx,List<List<Integer>> res, List<Integer> ll){
		         if(target==0 && ll.size()==k){
		            res.add(new ArrayList<>(ll));
		            return;
		        }
		     
		        for(int i=idx;i<=9;i++){
		             
		            if(target>=i){
		            ll.add(i);
		            fn(k,target-i,i+1,res,ll);
		            ll.remove(ll.size()-1);
		            }
		        
		    }}
}
