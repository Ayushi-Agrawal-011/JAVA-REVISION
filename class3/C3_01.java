package revision;
import java.util.*;
public class C3_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums1 = {1,3};
		int[] nums2 = {2};
		System.out.println( findMedianSortedArrays(nums1,nums2));
	}
	 public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        int []x=new int[nums1.length+nums2.length];
	        int c=0;
	        for(int i=0;i<nums1.length;i++){
	            x[c]=nums1[i];
	            c++;
	        }
	        for(int i=0;i<nums2.length;i++){
	            x[c]=nums2[i];
	            c++;
	        }
	        Arrays.sort(x);
	        if(x.length%2!=0){
	          int s=x.length/2;
	          return x[s];
	        }
	        else {
	             int s=(x.length-1)/2;
	              int m=s+1;
	              System.out.println(x[s]+" "+x[m]);
	             
	               return (x[s] + x[s+1]) / 2.0;
	        }
	    }
}
