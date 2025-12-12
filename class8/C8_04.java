package revision;
import java.util.*;
import java.util.Scanner;

public class C8_04 {
	public static void main(String args[]) {
		 Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
		  System.out.println(fn(n));
		    }
	public static List<String> fn(int n) {
        List<String> ll=new ArrayList<>();
        fn2(n,0,0,ll,"");
        return ll;
    }
    public  static void fn2(int n,int open,int closed, List<String> ll,String ans){
        if(n==open && n==closed){
            ll.add(ans);
            return;
        }
    
        if(  n<open ||open<closed )
        return;
        fn2(n,open+1,closed,ll,ans+"(");
         fn2(n,open,closed+1,ll,ans+")");
    }
    
}
