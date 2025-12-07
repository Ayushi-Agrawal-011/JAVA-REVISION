package revision;

public class C5_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {2,3,1,1,5,7,8,3,4};
		int k=3;
		System.out.print(fn(arr,k));
	}
	 public  static int fn(int[]arr,int k){
	        int ans=0,sum=0;
	    for(int i=0;i<k;i++){
	        sum+=arr[i];
	    } 
	    ans=sum;
	   
	    for(int i=k;i<arr.length;i++){
	        sum+=(arr[i]-arr[i-k]);
	        //System.out.println(sum);
	       ans=Math.max(sum, ans);
	      
	    }
	    return ans;
	    }
}
