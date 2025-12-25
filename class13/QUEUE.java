package revision;

public class QUEUE {
	private int[]arr;
	private int front=0;
	private int size=0;
	public QUEUE(){
		 arr=new int[5];
	}
	public QUEUE(int n){
	 arr=new int[100];
	}
	public boolean isEmpty() {
		return size ==0;
	}
	public void Equeue (int item)throws Exception {
		if(isfull()) {
			throw new Exception("FULL QUEUE");
		}
		arr[(front+size)%arr.length]=item;
		size++;
	
		
	}
	public int Dequeue () throws Exception{
		if(isEmpty()) {
			throw new Exception("EMPTY QUEUE");
		}
		int rv=arr[front%arr.length];
		front=(front+1)%arr.length;
		size--;
	    return rv;
	
		
	}
	public int size() {
		return size;
	}
	public int getfront ()throws Exception{
		if(isEmpty()) {
			throw new Exception("EMPTY QUEUE");
		}
		return arr[front];
	}
	public boolean isfull() {
		return size==arr.length -1;
	}
	public void Display() {
		for(int i=0;i<size;i++) {
			System.out.print(arr[(front+i)%arr.length]+" ");
		}
		System.out.println();
	}
}
