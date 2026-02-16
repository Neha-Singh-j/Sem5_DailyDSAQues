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
    int ans=0;
    public int sumNumbers(TreeNode root) {
        
        find(root,"");
        return ans;
    }
    public void find(TreeNode root, String s){
        if(root==null){
        return;
        }
        if(root.left==null && root.right==null){
            
            ans+=Integer.parseInt(s+root.val);
        }
       // int c=Integer.parseInt(s)+root.val;
        find(root.left,s+root.val);
        find(root.right,s+root.val);

    }
}