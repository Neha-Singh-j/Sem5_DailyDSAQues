// Last updated: 8/7/2025, 11:02:43 AM
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        root = insert(root, val); 
        return root;
    }

    public static TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val); 
        }

        if (root.val < val) {
            root.right = insert(root.right, val); 
        } else {
            root.left = insert(root.left, val); 
        }

        return root; 
    }
}
