// Last updated: 8/1/2025, 10:38:32 PM
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
    public int countNodes(TreeNode root) {
        return find(root);
    }
    private int find(TreeNode nn) {
			if(nn==null){
                return 0;
            }
           
			int a=find(nn.left);
			int b= find(nn.right);
			return a+b+1;
		}
}