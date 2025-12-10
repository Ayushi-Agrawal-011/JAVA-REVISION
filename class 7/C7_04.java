package revision;

public class C7_04 {
	public static void main(String[] args) {
		int n=4; 
		System.out.println(fib(n," ",0));
	}
	public  static int fib(int n,String ans,int curr) {
		if(curr>n)
			return 0;
		if(curr==n) {
			System.out.println(ans);
			return 1;
		}
		int res=0;
	 for(int i=1;i<=n-1;i++) {
		 res+=fib(n,ans+i,curr+i);
	 }
	 return res;
		
	}
}
