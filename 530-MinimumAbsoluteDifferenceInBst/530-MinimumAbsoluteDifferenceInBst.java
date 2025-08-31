// Last updated: 8/31/2025, 4:16:19 PM
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
    static int min = Integer.MAX_VALUE;
    static TreeNode prev = null;
    public int getMinimumDifference(TreeNode root) {

        min = Integer.MAX_VALUE; 
        prev = null;             
        minDist(root);
        return min;
    }

    public static void minDist(TreeNode root) {
        if (root == null) return;

        minDist(root.left);

       if (prev != null) {
            min = Math.min(min, root.val - prev.val);
        }
        prev = root; 
        minDist(root.right);
    }
}
