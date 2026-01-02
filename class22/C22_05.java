package revision;
import java.util.*;

public class C22_05 {
	class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	int maxd=0;
    public List<Integer> rightSideView(TreeNode root) {
         List<Integer> ll=new ArrayList<>();
rs(root,1,ll);
    return ll;
    }
    public void rs(TreeNode root,int cl,List<Integer> ll){
        if(root==null)
        return;
        if(cl>maxd){
          ll.add(root.val);
          maxd=cl;
        }
        rs(root.right,cl+1,ll);
          rs(root.left,cl+1,ll);
    }

}
