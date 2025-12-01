package revision;
import java.util.*;
public class C4_01 {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next(); //tle on cf
	int m=sc.nextInt();
	StringBuilder out=new StringBuilder();
	StringBuilder sb=new StringBuilder(s);
	while(m-->0) {
		int n=sc.nextInt();
String p=sb.substring(0, n-1);
String q=sb.substring(n-1,sb.length()-n+1);
String r=sb.substring(sb.length()-n+1,sb.length());
 sb=new StringBuilder();
 sb.append(p);
 sb.append(new StringBuilder(q).reverse());
		sb.append(r);
		
		
		if(m==0)
			System.out.println(sb);
	}
		
	
}
}
