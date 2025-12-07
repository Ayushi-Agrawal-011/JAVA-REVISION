package revision;
import java.util.*;
public class C5_04 {
	public static void main (String args[]) {
		//5
		//2 1 4 3 5
		//10
		Scanner sc = new Scanner(System.in);
		        int n = sc.nextInt();              
		        int[] arr = new int[n];
		        for (int i = 0; i < n; i++) {      
		            arr[i] = sc.nextInt();
		        }
		        long k = sc.nextLong();              
		        System.out.println(subarraySum(arr, k));
		    }
		    public static long subarraySum(int[]arr, long k) {
				    long ans=0,sum=0;
				    long r=k;
				for(int  i=1;i<=arr.length;i++){
				long l=fn(arr,i, r);
				ans+=l;	
				}
				return ans;
				    }
				    public  static int fn(int[]arr,int k,long r){
				        long ans=0,sum=0;
				    for(int i=0;i<k;i++){
				        sum+=arr[i];
				    } 
				    ans=sum;
				    int c=0;
				    if(sum*k<r)
				    c=1;
				    for(int i=k;i<arr.length;i++){
				        sum+=(arr[i]-arr[i-k]);
		                if(sum*k<r)
		                c++;
				    }
				    return c;
				    }
}
