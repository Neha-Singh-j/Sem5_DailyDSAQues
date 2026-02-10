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
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root==null) return null;
        dfs(root.left, root.right,1);
        return root;
    }
    public void dfs(TreeNode left, TreeNode right,int level){
        if(left==null || right==null){ //bcz its perfect tree so having bpth child or none
            return;
        }
        if(level%2==1){ //odd level
            int temp=left.val;
            left.val=right.val;
            right.val=temp;
        }
        dfs(left.left,right.right,level+1); //reversing paris from lleft side and right side accordingly
        dfs(left.right,right.left,level+1);
        

    }
}