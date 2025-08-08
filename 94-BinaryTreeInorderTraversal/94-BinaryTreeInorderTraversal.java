// Last updated: 8/8/2025, 12:26:34 PM
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ll=new ArrayList<>();
        iot(root,ll);
        return ll;
    }
    public void iot(TreeNode root,List<Integer> ll){
        if(root==null){
            return;
        }
        iot(root.left,ll);
        ll.add(root.val);
        iot(root.right,ll);

    }
}