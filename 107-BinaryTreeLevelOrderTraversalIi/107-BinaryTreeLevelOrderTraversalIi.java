// Last updated: 8/1/2025, 10:40:11 PM
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
         if (root == null) return res;
			Queue<TreeNode> q=new LinkedList<>();
			q.add(root); //addlast
			while(!q.isEmpty()) {
                int size=q.size();
                List<Integer> curr=new ArrayList<>();
                for(int i=0;i<size;i++){
				TreeNode n=q.poll(); //q.remove() --> removeFirst
				curr.add(n.val);
				if(n.left!=null) {
					q.add(n.left);
				}
				if(n.right!=null) {
					q.add(n.right);
				}
                }
			res.add(curr);
			}
            Collections.reverse(res);

            return res;
		}
}