// Last updated: 11/21/2025, 11:50:12 AM
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int level=q.size();
            List<Integer> curr=new ArrayList<>();
            for(int i=0;i<level;i++){
                TreeNode x=q.poll();
                if(x.left!=null ){
                    q.add(x.left);
                }
                if( x.right!=null){
                    q.add(x.right);
                }
                curr.add(x.val);
            }
            res.add(curr);

        }
        return res;
    }
}