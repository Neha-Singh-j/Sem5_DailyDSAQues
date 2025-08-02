// Last updated: 8/2/2025, 3:27:52 PM
class Solution {
    private int tilt = 0; 

    public int findTilt(TreeNode root) {
        sum(root);
        return tilt;
    }

    private int sum(TreeNode root) {
        if (root == null) return 0;
        int left = sum(root.left);
        int right = sum(root.right);
        tilt += Math.abs(left - right);
        return left + right + root.val;
    }
}
