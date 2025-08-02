// Last updated: 8/2/2025, 7:06:31 PM
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
    public List<Integer> postorderTraversal(TreeNode root) {
    
        List<Integer> arr = new ArrayList<>();
        post(root, arr);
        return arr;
    }

    private void post(TreeNode node, List<Integer> arr) {
        if (node == null) return;
        post(node.left, arr);
        post(node.right, arr);
        arr.add(node.val);
    }
}
