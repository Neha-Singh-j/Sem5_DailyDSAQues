// Last updated: 8/11/2025, 8:35:22 PM

class Solution {
    int sum = 0;
    public TreeNode bstToGst(TreeNode root) {
        traverse(root);
        return root;
    }

    private void traverse(TreeNode node) {
        if (node == null) return;

         traverse(node.right);

         sum += node.val;
        node.val = sum;
        traverse(node.left);
    }
}
