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
    List<List<Integer>> ans;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        path(root,targetSum,curr);
        return ans;
    }
    public void path(TreeNode root, int target,List<Integer> curr){
        if(root==null) return;
        curr.add(root.val);
        if(root.left==null && root.right==null && target-root.val==0){
            ans.add(new ArrayList<>(curr));
           // return;
        }
        
        path(root.left,target-root.val,curr);
        path(root.right,target-root.val,curr);
        curr.remove(curr.size()-1);
    }
}