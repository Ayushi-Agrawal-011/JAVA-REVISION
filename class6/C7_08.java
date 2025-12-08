package revision;

import java.util.Scanner;

public class C7_08 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println(pow_tail(a,b,1));
	}
	public static int pow_tail(int a,int b,int ans) {
		if(b==0)
			return ans;
		return pow_tail(a,b-1,ans*a);
	}
}
