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
    int depth=-1;
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ll=new ArrayList<>();
        if(root==null) return ll;
        check(root,ll,0);
        return ll;
    }
    public void check(TreeNode root, List<Integer> ll, int level){
        if(root==null) return ;
        if(depth<level){
            ll.add(root.val);
            depth=level;
        }
        check(root.right,ll,level+1);
        check(root.left,ll,level+1);
    }
}