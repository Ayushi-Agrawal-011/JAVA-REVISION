package revision;
import java.util.*;
public class C11_01 {
	public static void main(String args[]) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int m = sc.nextInt();
			char[][] maze = new char[n][m];
			for (int i = 0; i < maze.length; i++) {// row
				String s = sc.next();
				for (int j = 0; j < maze[0].length; j++) {
					maze[i][j] = s.charAt(j);
				}
			}
			int[][] ans = new int[n][m];
			fn(maze, 0, 0, ans);
			if (val == false) {
				System.out.println("NO PATH FOUND");
			}
	    }
	    static boolean val=false;
	    public static void fn(char[][]arr,int cr,int cc,int[][]ans){
	if(cr<0 || cr>=arr.length || cc<0 || cc>=arr[0].length || arr[cr][cc]=='X')
	return;
	if(cr==arr.length-1 && cc==arr[0].length-1){
	    ans[cr][cc]=1;
	    val=true;
	    display(ans);
	}
	arr[cr][cc]='X';
	ans[cr][cc]=1;
	fn(arr,cr-1,cc,ans);
	fn(arr,cr+1,cc,ans);
	fn(arr,cr,cc-1,ans);
	fn(arr,cr,cc+1,ans);
	arr[cr][cc]='0';
	ans[cr][cc]=0;
	    }
	    public static void display(int[][]ans){

	        	for (int i = 0; i < ans.length; i++) {// row
			
				for (int j = 0; j < ans[0].length; j++) {
					System.out.print(ans[i][j]+" ");
				}
	            System.out.println();
			}
	    }
}
