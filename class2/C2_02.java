package revision;

import java.util.Arrays;
import java.util.Scanner;

public class C2_02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0) {
int n=sc.nextInt();
int M=sc.nextInt();
int[]book=new int[n];
int lo=0,high=0;
for(int i=0;i<n;i++) {
	book[i]=sc.nextInt();
	high+=book[i];
}

//Arrays.sort(book);
int ans=0;
while(lo<=high) {
	int mid=lo+(high-lo)/2;
	if(isitpossible(book,M,mid)) {
		ans=mid;
		high=mid-1;
	}
	else
		lo=mid+1;
		
		
}
System.out.println(ans);}
	}
	public static boolean isitpossible(int[]book,int m,int mid) {
		int c=1;
		int readpages=0;
		int i=0;
		while(i<book.length) {
			if(book[i]+readpages<=mid) {
				readpages+=book[i];
				i++;
			}
			else {
				c++;
				readpages=0;
			}
			if(c>m)
				return false;
		}
		return true;
	}
}
