package revision;

public class C11_03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println( countNumbersWithUniqueDigits(2));
	}
	 public static int countNumbersWithUniqueDigits(int n) {
		  
	     return fn(n);
	    }
	 public  static int fn(int n){
	    if(n==0)
	    return 1;
	    if(n==1)
	    return 10;
	    int x=9;
	    for(int i=9;i>9-n+1;i--){
	        x*=i;
	    }
	    return x+fn(n-1);
	 }
}
