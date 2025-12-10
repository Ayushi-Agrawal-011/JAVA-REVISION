package revision;

public class C7_03 {
	public static void main(String[] args) {
		int n=3; // 0 1 2 3 5 8
		System.out.println(fib(n," "));
	}
	public  static int fib(int n,String ans) {
		if(n==0) {
			System.out.println(ans);
			return 1;
		}
		
		int a=fib(n-1,ans+"H");
		int b=fib(n-1,ans+"T");
		return a+b;
		
	}
}
