package revision;

import java.util.Scanner;

public class C2_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub //brute force used optimisaation needed
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
long[]x=new long[n];
long[]t=new long[n];
for(int i=0;i<n;i++) {
	x[i]=sc.nextLong();
}
for(int i=0;i<n;i++) {
	t[i]=sc.nextLong();
}
long s=0;
for(int i=0;i<n;i++) {
	long a=x[i];
	long b=t[i];
	for(int j=i+1;j<n;j++) {
		long dx=a-x[j];
		long dt=b-t[j];
		long c=dx*dt;
		if(c<0)
			s+=0;
		else
			s+=Math.abs(dx);
	}
	
}
System.out.println(s);

	}

}
