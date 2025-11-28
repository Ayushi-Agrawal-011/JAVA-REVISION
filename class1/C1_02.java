package revision;

public class C1_02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr= {1,2,3,4};

int []ans=productExceptSelf(arr);

for(int i=0;i<arr.length;i++){
   System.out.println(ans[i]);
}
	}
	public  static int[] productExceptSelf(int[] arr) {
       	int []left=new int[arr.length];
        int []right=new int[arr.length];
        int[]ans=new int[arr.length];
        int n=arr.length;
        left[0]=1;
        right[n-1]=1;
        for(int i=1;i<n;i++){
  left[i]=left[i-1]*arr[i-1];
        }
        for(int i=n-2;i>=0;i--){
            right[i]=right[i+1]*arr[i+1];
        }
       
        for(int i=0;i<n;i++){
            ans[i]=left[i]*right[i];
        }
        return ans;
    }
}
