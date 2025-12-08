package revision;

import java.util.Scanner;

public class C6_04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
PD(n);
	}
	public static void PD(int n) {
		if(n==0)
			return ;
		System.out.println(n);
		PD(n-1);
		
	}
}
