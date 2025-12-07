package revision;

public class C5_03 {
	public static void main(String[] args) {
		int []arr= {10,5,2,6};
		   int k=100;
		   System.out.println(numSubarrayProductLessThanK(arr,k));
	}
		public static int numSubarrayProductLessThanK(int[] nums, int k) {
		    int si=0,ei=0,p=1,ans=0;
		    while(ei<nums.length){
		        p*=nums[ei];
		        while(p>=k && si<=ei){
		            p/=nums[si];
		            si++;
		        }
		        ans+=ei-si+1;
		        ei++;
		    }
		    return ans;
		    }
	
}
