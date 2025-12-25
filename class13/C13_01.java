package revision;

public class C13_01 {

	private int[]arr;
	private int idx=-1;
	public C13_01(){
		 arr=new int[5];
	}
	public C13_01(int n){
	 arr=new int[100];
	}
	public boolean isEmpty() {
		return idx ==-1;
	}
	public void push(int item)throws Exception {
		if(isfull()) {
			throw new Exception("FULL STACK");
		}
		idx++;
		arr[idx]=item;
		
	}
	public int size() {
		return idx+1;
	}
	public boolean isfull() {
		return idx==arr.length -1;
	}
	public int pop(int idx) throws Exception {
		if(isEmpty()) {
			throw new Exception("EMPTY STACK");
		}
		int rv=arr[idx];
		idx--;
	    return rv;
		
	}
	public int peek() throws Exception{
		if(isEmpty()) {
			throw new Exception("EMPTY STACK");
		}
		int rv=arr[idx];
		
	    return rv;
	}
	public void Display() {
		for(int i=0;i<=idx;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
