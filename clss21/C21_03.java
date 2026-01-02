package revision;

import revision.C21_02.TreeNode;

public class C21_03 {
	class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int sumNumbers(TreeNode root) {
		return  hasPathSum(root,0);
		        
		    }
		    public static int hasPathSum(TreeNode root,int sum1){
		      if(root==null){
		        return 0;
		    }
		    if(root.left==null && root.right==null){
		        return sum1*10+root.val;
		    }
		   
		  int left= hasPathSum(root.left,root.val+sum1*10);
		     int right= hasPathSum(root.right,root.val+sum1*10);
		     return left+ right;
		    }

}
