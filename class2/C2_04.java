package revision;

import java.util.Scanner;

public class C2_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[]x=new int[n];
int[]t=new int[n];
for(int i=0;i<n;i++) {
	x[i]=sc.nextInt();
}
for(int i=0;i<n;i++) {
	t[i]=sc.nextInt();
}
int s=0;
for(int i=0;i<n;i++) {
	int a=x[i];
	int b=t[i];
	for(int j=i+1;j<n;j++) {
		int dx=a-x[j];
		int dt=b-t[j];
		int c=dx*dt;
		if(c<0)
			s+=0;
		else
			s+=Math.abs(dx);
	}
	
}
System.out.println(s);

	}

}
