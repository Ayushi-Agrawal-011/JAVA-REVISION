package revision;
import java.util.*;
public class C8_02 {

	
	 public static void main(String args[]) {
		 Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
		  System.out.println(fn(n,1,2,3));
		    }
		    public static int fn(int n,int src,int des,int aux){
		        
		if(n==0){
		    
		    return 0;
		}


		   int a=     fn(n-1,src,aux,des);
		System.out.println("Move "+n+"th disc from T"+src+" to T"+des);
		    int b=    fn(n-1,aux,des,src);
		    
		 
		    return a+b+1;
		    }

}
