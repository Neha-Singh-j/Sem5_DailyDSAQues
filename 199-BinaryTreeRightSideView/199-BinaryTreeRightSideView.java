// Last updated: 8/1/2025, 10:38:53 PM
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
    		int max_depth=0;
    public List<Integer> rightSideView(TreeNode root) {
    List<Integer> ll =new ArrayList<>();
			rightView(root,1,ll);
			return ll;
		}
		public void rightView(TreeNode root,int curr,List<Integer> ll) {
			if(root==null) {
				return ;
			}
			if(max_depth<curr) {
				ll.add(root.val);
				max_depth=curr;
			}
			rightView(root.right,curr+1,ll);
			rightView(root.left,curr+1,ll);
		}
}