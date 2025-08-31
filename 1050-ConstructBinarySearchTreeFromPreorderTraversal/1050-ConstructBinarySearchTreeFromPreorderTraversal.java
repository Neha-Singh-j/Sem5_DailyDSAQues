// Last updated: 8/31/2025, 4:14:53 PM
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
    private int idx = 0;

    public TreeNode bstFromPreorder(int[] preorder) {
        return construct(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private TreeNode construct(int[] preorder, int min, int max) {
        if (idx >= preorder.length) return null;

        int val = preorder[idx];
        if (val < min || val > max) return null;

        TreeNode root = new TreeNode(val);
        idx++;

        root.left = construct(preorder, min, val);
        root.right = construct(preorder, val, max);

        return root;
    }
}
