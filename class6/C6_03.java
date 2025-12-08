package revision;

import java.util.Scanner;

public class C6_03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
PI(n);
	}
	public static void PI(int n) {
		if(n==0)
			return ;
		PI(n-1);
		System.out.println(n);
	}
}
