package revision;



public class C22_04 {
	class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	        if(root==null)
	        return root;

	        if(root==p || root==q)
	        return root;
	TreeNode left=lowestCommonAncestor(root.left,p,q);
	TreeNode right=lowestCommonAncestor(root.right,p,q);
	if(left!=null && right!=null)
	return root;
	if(left==null)
	return right;
	return left;
	    }

}
