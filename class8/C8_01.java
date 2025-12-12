package revision;
import java.util.*;
public class C8_01 {
	public static void main(String[] args) {
		int n=13; 
		System.out.println(lexicalOrder(n));
	}
	public  static List<Integer> lexicalOrder(int n) {
        List<Integer> ll=new ArrayList<>();
        l(n,0,ll);
        ll.remove(0);
        return ll;
    }
    public  static void l(int n,int curr,List<Integer> ll){
if(curr>n)
return;
ll.add(curr);
int i=0;
if(curr==0)
i=1;
while(i<=9){
    l(n,curr*10+i,ll);
    i++;
}
    }
}
