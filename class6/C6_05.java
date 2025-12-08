package revision;

import java.util.Scanner;

public class C6_05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr= {1,2,3,2,4,2,6};
System.out.println(First(arr,2,0));
	}
	public static int First(int []arr,int item,int i) {
		if(i>=arr.length)
			return -1;
		if(arr[i]==item)
			return i;
		return First(arr,item,i+1);
		
	
		
	}
}
