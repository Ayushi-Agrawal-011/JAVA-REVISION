package revision;

public class C6_06 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr= {1,2,3,2,4,2,6};
System.out.println(Last(arr,2,arr.length-1));
	}
	public static int Last(int []arr,int item,int i) {
		if(i<0)
			return -1;
		if(arr[i]==item)
			return i;
		return Last(arr,item,i-1);
		
	
		
	}
}
