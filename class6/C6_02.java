package revision;

import java.util.Scanner;

public class C6_02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println(pow(a,b));
	}
	public static int pow(int a,int b) {
		if(b==0)
			return 1;
		return pow(a,b-1)*a;
	}

}
