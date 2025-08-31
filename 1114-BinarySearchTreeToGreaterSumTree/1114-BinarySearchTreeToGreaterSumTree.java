// Last updated: 8/31/2025, 4:14:49 PM

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
