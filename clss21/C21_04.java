package revision;

import revision.C21_03.TreeNode;

public class C21_04 {
	class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
	}
	class DiaPair{
	    int ht=-1;
	    int dt=0;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int diameterOfBinaryTree(TreeNode root) {
		return diameter(root).dt;
	}

	public DiaPair diameter(TreeNode root) {
	if(root==null){
    return new DiaPair();}
    DiaPair ldp=diameter(root.left);
    DiaPair rdp=diameter(root.right);
    DiaPair sdp=new DiaPair();
    sdp.ht=Math.max(ldp.ht,rdp.ht)+1;
    int sd=ldp.ht+rdp.ht+2;
    sdp.dt=Math.max(sd,Math.max(ldp.dt,rdp.dt));
    return sdp;
    
		
	}
}
