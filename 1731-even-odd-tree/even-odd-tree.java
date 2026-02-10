/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        if(root==null) return true;
        if(root.val%2==0) return false;
        return check(root);
    }
    public boolean check(TreeNode root) {
			Queue<TreeNode> q=new LinkedList<>();
			q.add(root); //addlast
            int level=0;
            int prev=0;
			while(!q.isEmpty()) {
                int size=q.size();
                if(level%2==0){
                    prev=-1;
                }else{
                    prev=Integer.MAX_VALUE;;
                }
                for (int i = 0; i < size; i++) {
				    TreeNode n=q.poll();
                    if(level%2==0){
                        if(n.val%2==0 || n.val<=prev) //
                            return false;
                    }else{
                        if(n.val%2!=0 || n.val>=prev) //
                            return false;
                    }
                    if(n.left!=null) q.add(n.left);
                    if(n.right!=null) q.add(n.right);
                    prev=n.val;
                }
                level++;
			}
            return true;
		}
}