// Last updated: 9/24/2025, 10:28:46 PM
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
    public int rob(TreeNode root) {
        HashMap<TreeNode, Integer>map=new HashMap<>();
        return robber(root,map);
    }
    public static int robber(TreeNode root,HashMap<TreeNode, Integer> map){
        if(root==null){
            return 0;
        }
        if(map.containsKey(root)) return map.get(root);
        int select=root.val;
        if(root.left!=null){
            select+=robber(root.left.left,map)+robber(root.left.right,map);
       
        }
         if(root.right!=null){
            select+=robber(root.right.left,map)+robber(root.right.right,map);
       
        }
         int not_select=robber(root.left,map)+robber(root.right,map);
         int res=Math.max(select,not_select);
         map.put(root,res);
        return res;
    }
}