package revision;

public class C21_01 {
class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
}
	public static void main(String[] args) {
}
	  public boolean isSymmetric(TreeNode root) {
	        return s(root.left,root.right);
	    }
	    public boolean s(TreeNode root1,TreeNode root2){
	       if(root1==null && root2==null)
	       return true;
	          if(root1==null || root2==null)
	       return false;
	       if(root1.val!=root2.val)
	       return false;
	       boolean left=s(root1.left,root2.right);
	       boolean right=s(root1.right,root2.left);
	       return left && right;
	    }
}
