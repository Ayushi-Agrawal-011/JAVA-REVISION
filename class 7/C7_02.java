package revision;

public class C7_02 {
	public static void main(String[] args) {
		String s="abc"; // 0 1 2 3 5 8
		System.out.println(subsequence(s," "));
	}
	public  static int subsequence(String ques,String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return 1;
		}
		char ch=ques.charAt(0);
		int a=subsequence(ques.substring(1),ans);
		int b=subsequence(ques.substring(1),ans+ch);
		return a+b;
	}
}
