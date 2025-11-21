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
    public int kthSmallest(TreeNode root, int k) {
        // inorder traversal is sorted
        ArrayList<Integer> list=new ArrayList<>();
        check(root,list);
        System.out.println(list);
        return list.get(k-1);
    }
    public static void check(TreeNode root,ArrayList<Integer> list){
        if(root==null) return;
        check(root.left,list);
        list.add(root.val);
        check(root.right,list);
    }

}