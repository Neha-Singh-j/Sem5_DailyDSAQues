// Last updated: 8/18/2025, 9:04:43 PM
class Solution {
    public boolean isBalanced(TreeNode root) {
        return check(root) != -1;
    }

    public static int check(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int hleft = check(root.left);
        if (hleft == -1) return -1; 
        int hright = check(root.right);
        if (hright == -1) return -1; 
        if (Math.abs(hleft - hright) > 1) return -1; 
        return Math.max(hleft, hright) + 1; 
        
    }
}
