package revision;

public class C2_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []nums= {4,5,6,7,0,1,2};
int target=0;
System.out.println(search(nums,target));
	}
	 public static int search(int[] nums, int target) {
	      return binary_search(nums,target);
	       
	    }
	    	public static int binary_search(int [] arr,int item) {
	    int lo=0;
	    int hi=arr.length-1;
	    while(lo<=hi){
	        int mid=lo+(hi-lo)/2;
	        if(arr[mid]==item)
	        return mid;
	        if(arr[lo]<=arr[mid]){
	            if(item>=arr[lo] && item<=arr[mid]){
	                hi=mid-1;
	            }
	            else
	            lo=mid+1;
	        }
	        else{
	 if(item>=arr[mid] && item<=arr[hi]){
	              lo=mid+1;
	            }
	            else
	            hi=mid-1;
	        }
	    }     
			return -1; 
		}
}
