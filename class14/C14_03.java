package revision;

import java.util.Scanner;
import java.util.Stack;

public class C14_03 {
	public static void main(String args[])  {
		// Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
	Cal_Span(arr);

	}
public static void Cal_Span(int []arr) {
	int[]ans=new int[arr.length];
	Stack<Integer> st=new Stack<>();
	for(int i=0;i<arr.length;i++){
		while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
			st.pop();
		}
		if(st.isEmpty())
		ans[i]=-1;
		else
		ans[i]=arr[st.peek()];
		st.push(i);
	}
		
		
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
		System.out.print("END");
	}
}
