package revision;

import java.util.Scanner;

public class C7_07 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println(fact_Tail(n,1));
	}
	public static int fact_Tail(int n,int ans) {
		if(n==0)
			return ans;
	return	fact_Tail(n-1,ans*n);
	
	}
}
