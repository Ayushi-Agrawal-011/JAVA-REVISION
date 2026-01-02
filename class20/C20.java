package revision;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class C20 {
	class Node{
		int val;
		Node left;
		Node right;
	}
	private Node root;
	Scanner sc=new Scanner(System.in);
	public BinaryTree() {
		root=CreateTree();
	}
	private Node CreateTree() {
		int item=sc.nextInt();
		Node nn=new Node();
		nn.val=item;
		boolean hlc=sc.nextBoolean();
		if(hlc) { //hlc =has left child or not
			nn.left=CreateTree();
		}
		boolean hrc=sc.nextBoolean();//hrc =has right child or not
		if(hrc) {
			nn.right=CreateTree();
		}
		return nn;
		}
	public void Display() {
		Display(root);
	}
	private void Display(Node nn) {
		if(nn==null)
			return;
		String str="<--"+nn.val+"-->";
	if(nn.left!=null) {
		str=nn.left.val+str;
	}
		else
			str="."+str;
	if(nn.right!=null) {
		str=str+nn.right.val;
	}
		else
			str=str+".";
		System.out.println(str);
		Display(nn.left);
		Display(nn.right);	
	}
	public boolean find(int item) {
		return find(root,item);
	}
	private boolean find(Node nn,int item) {
		if(nn==null)
			return false;
		if(nn.val==item)
			return true;
		boolean left=find(nn.left,item);
		boolean right=find(nn.right,item);
		return left|| right;
	}
	public int max() {
		
		return max(root);
	}
	private int max(Node nn) {
		if(nn==null) {
			return Integer.MIN_VALUE;
		}
		int  lmax=max(nn.left);
		int rmax=max(nn.right);
		return Math.max(nn.val,Math.max(lmax, rmax));
	}
	public int ht() {
		return ht(root);
	}
	private int ht(Node nn) {
		if(nn==null) {
			return -1;
		}
		int lh=ht(nn.left);
		int rh=ht(nn.right);
		return Math.max(lh, rh)+1;
	}
	public void Preorder() {
		PerOrder(root);
	}
	private void PerOrder(Node nn) {
		if(nn==null) {
			return;
		}
		System.out.print(nn.val+" ");
		PerOrder(nn.left);
		PerOrder(nn.right);
	}
	public void INorder() {
		INOrder(root);
	}
	private void INOrder(Node nn) {
		if(nn==null) {
			return;
		}
				INOrder(nn.left);
				System.out.print(nn.val+" ");	
		INOrder(nn.right);
	}
	public void Postorder() {
		PostOrder(root);
	}
	private void PostOrder(Node nn) {
		if(nn==null) {
			return;
		}
				PostOrder(nn.left);
				PostOrder(nn.right);
				System.out.print(nn.val+" ");	
		
	}
	public void LevelOrder() {
		Queue<Node> q=new LinkedList<>();//use linked list as queue
		q.add(root);//addLast
		while(!q.isEmpty()) {
			Node n=q.poll();//removeFirst
			System.out.print(n.val+" ");
			if(n.left!=null) {
				q.add(n.left);
			}
			if(n.right!=null) {
				q.add(n.right);
			}
		}
		System.out.println();
	}
}
