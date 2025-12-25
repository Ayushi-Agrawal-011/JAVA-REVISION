package revision;
import java.util.*;
public class C13_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<Integer> st=new Stack<>();
st.push(10);
st.push(20);
st.push(30);
st.push(40);
st.push(50);
System.out.println(st);
rev(st);
System.out.println(st);

	}
	public  static void rev(Stack<Integer> st) {
		if(st.isEmpty())
			return;
		int x=st.pop();
		rev(st);
		add_last(st,x);
	}
	public static void add_last(Stack<Integer> st,int x) {
		if(st.isEmpty()) {
			st.push(x);
			return;
		}
		int b=st.pop();
		add_last(st,x);
		st.push(b);
	}

}
