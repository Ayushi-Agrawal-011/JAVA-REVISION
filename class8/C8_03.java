package revision;
import java.util.*;
public class C8_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String	digits = "23";
	List<String> ll=letterCombinations(digits);
	System.out.println(ll);
	}
	
	     static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
	    public  static List<String> letterCombinations(String s) {
	      List<String> ll=new ArrayList<>();
	fn(s,ll,"");
	return ll;
	    }
	    public  static void fn(String s,List<String> ll,String ans){
	if(s.length()==0){
	    ll.add(ans);
	    return;
	}
	       char p=s.charAt(0);
	String q=key[p-'0'];
	        for(int i=0;i<q.length();i++){
	            fn(s.substring(1),ll,ans+q.charAt(i));
	        }
	    }

	

}
