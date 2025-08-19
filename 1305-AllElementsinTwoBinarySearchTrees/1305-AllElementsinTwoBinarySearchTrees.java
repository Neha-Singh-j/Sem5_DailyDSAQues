// Last updated: 8/19/2025, 10:13:24 PM
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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> l1=new ArrayList<>();
        traverse(root1,l1);
         List<Integer> l2=new ArrayList<>();
        traverse(root2,l2);
         for(int i=0;i<l2.size();i++){
            l1.add(l2.get(i));
         }
         Collections.sort(l1);
         return l1;
    }
    public static void traverse(TreeNode root, List<Integer> l){

        if(root==null){
            return ;
        }
        l.add(root.val);
        traverse(root.left,l);
        traverse(root.right,l);

    }
}
