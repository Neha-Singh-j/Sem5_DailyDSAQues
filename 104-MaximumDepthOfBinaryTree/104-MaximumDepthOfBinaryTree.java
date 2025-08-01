// Last updated: 8/1/2025, 10:40:16 PM
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
    public int maxDepth(TreeNode root) {
       if(root==null) {
				return 0;
			}
			
			int lh=maxDepth(root.left); // left height
			int rh=maxDepth(root.right);
			return Math.max(lh, rh)+1;
		}
}