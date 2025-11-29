package revision;
import java.util.*;
public class C2_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0) {
int n=sc.nextInt();
int noc=sc.nextInt();
int[]stall=new int[n];
for(int i=0;i<n;i++) {
	stall[i]=sc.nextInt();
}

Arrays.sort(stall);
int low=1;
int ans=0;
int high=stall[stall.length-1]-stall[0];
while(low<=high) {
	int mid=low+(high-low)/2;
	if(isitpossible(stall,noc,mid)) {
		ans=mid;
		low=mid+1;
	}
	else
		high=mid-1;
		
}
System.out.println(ans);}
	}
	public static boolean isitpossible(int[]stall,int noc,int mid) {
		int c=1;
		int pos=stall[0];
		for(int i=1;i<stall.length;i++) {
			if(stall[i]-pos>=mid) {
				pos=stall[i];
				c++;
			}
			if(c==noc)
				return true;
		}
		return false;
	}

}
