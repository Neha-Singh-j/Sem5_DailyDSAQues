// Last updated: 8/31/2025, 4:14:46 PM
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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        HashSet<Integer> set = new HashSet<>();
        for (int val : to_delete) {
            set.add(val);
        }
        List<TreeNode> li=new ArrayList<>();
        root =del(root,li,set);
        if(root!=null){
            li.add(root);
        }
        return li;
    }

    public static TreeNode del(TreeNode root,List<TreeNode> li , HashSet<Integer> set){
        if(root==null){
            return null;
        }
            root.left=del(root.left,li,set);
            root.right= del(root.right,li,set);
        if(set.contains(root.val)){
            if (root.left != null) li.add(root.left);
            if (root.right != null) li.add(root.right);
            return null;
        }
    return root;
    }
}