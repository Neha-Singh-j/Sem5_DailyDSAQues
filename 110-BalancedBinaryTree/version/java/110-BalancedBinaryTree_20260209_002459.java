// Last updated: 2/9/2026, 12:24:59 AM
1class Solution {
2    public boolean isBalanced(TreeNode root) {
3        return check(root) != -1;
4    }
5
6    public static int check(TreeNode root) {
7        if (root == null) {
8            return 0;
9        }
10
11        int hleft = check(root.left);
12        if (hleft == -1) return -1; 
13        int hright = check(root.right);
14        if (hright == -1) return -1; 
15        if (Math.abs(hleft - hright) > 1) return -1; 
16        return Math.max(hleft, hright) + 1; 
17        
18    }
19}
20