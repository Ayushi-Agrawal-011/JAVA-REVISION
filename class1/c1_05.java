package revision;
import java.util.*;
public class c1_05 {
	  public static void main(String args[]) {
	         Scanner scn=new Scanner(System.in);
	        int t = scn.nextInt(); 
	        while(t-->0){
	           int n = scn.nextInt(); 
	           int[] arr=new int[n];
	           for (int i = 0; i < n; i++) 
	            arr[i]=scn.nextInt();
	            System.out.println(subarraysDivByK(arr, n)); 
	        }
	    }
	    public static long subarraysDivByK(int[] nums, int k) {
	        // Write your code here
	       long[]freq=new long[k];
	       freq[0]=1;
	      long s=0;
	    for(int i=0;i<nums.length;i++){
	s+=nums[i];
	long rem=s%k;
	if(rem<0)
	rem+=k;
	freq[(int)rem]++;
	    }
	   long ans=0;
	    for(int i=0;i<k;i++){
	        if(freq[i]>=2){
	            long x=freq[i];
	ans+=(x*(x-1))/2;
	        }

	    }
	    return ans;
	    }
}
