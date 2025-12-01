package revision;

public class C4_02 {
	public static void main(String[]args) {
		System.out.println( countSubstrings("abc"));
	}
	  public static int countSubstrings(String s) {
	        int c=0;
	        for(int i=0;i<s.length();i++){
	            for(int j=i;j<s.length();j++){
	                if(ispal(s.substring(i,j+1)))
	                c++;
	            }
	        }
	        return c;
	    }
	    public static boolean ispal(String s){
	        int i=0,j=s.length()-1;
	        while(i<j){
	            if(s.charAt(i)!=s.charAt(j))
	            return false;
	            i++;
	            j--;
	        }
	        return true;
	    }
}
