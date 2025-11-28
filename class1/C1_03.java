package revision;

public class C1_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []gas= {1,2,3,4,5};
		int []cost= {3,4,5,1,2};
		System.out.println(canCompleteCircuit(gas,cost));
	}
	  public static int canCompleteCircuit(int[] gas, int[] cost) {
	      int total=0;
	      for(int i=0;i<gas.length;i++){
	        total+=(gas[i]-cost[i]);
	      }
	      if(total<0)
	      return -1;
	      int curr=0,idx=0;
	      for(int i=0;i<gas.length;i++){
	        curr+=(gas[i]-cost[i]);
	        if(curr<0){
	  curr=0;
	  idx=i+1;
	        }
	      }
	      return idx;
	    }
}
