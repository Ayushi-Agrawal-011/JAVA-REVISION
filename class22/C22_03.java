package revision;

import revision.C22_02.TreeNode;

public class C22_03 {
	class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public boolean hasPathSum(TreeNode root, int targetSum) {
		    if(root==null){
		        return false;
		    }
		    if(root.left==null && root.right==null){
		        return targetSum-root.val==0;
		    }
		   
		    boolean left= hasPathSum(root.left,targetSum-root.val);
		     boolean right= hasPathSum(root.right,targetSum-root.val);
		     return left || right;
		    }

}
