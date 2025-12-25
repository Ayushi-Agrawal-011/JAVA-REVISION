package revision;

import java.util.*;

public class C13_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> st=new ArrayDeque<>();
		st.add(10);
		st.add(20);
		st.add(30);
		st.add(40);
		st.add(50);
		System.out.println(st);
		rev(st);
		System.out.println(st);
	}
	public  static void rev(Queue<Integer> st) {
		if(st.isEmpty())
			return;
		int x=st.poll();
		rev(st);
		st.add(x);
	
	}

}
