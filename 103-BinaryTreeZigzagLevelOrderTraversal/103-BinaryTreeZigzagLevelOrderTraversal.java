// Last updated: 8/1/2025, 10:40:17 PM
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       List<List<Integer>> ans=new ArrayList<>();
       if(root==null) return ans;
        LevelOrder(root,ans);
        return ans;
    }
    public void LevelOrder(TreeNode root,List<List<Integer>> ans) {
			Queue<TreeNode> q=new LinkedList<>();
			q.add(root); 
            boolean rev=false;
			while(!q.isEmpty()) {
                int s=q.size();
                 List<Integer> al=new ArrayList<>();
                 for(int i=0;i<s;i++){
				    TreeNode n=q.poll(); 
                
				    al.add(n.val);
                
                    if(n.left!=null) {
                        q.add(n.left);
                    }
                    if(n.right!=null) {
                        q.add(n.right);
				    }
                 }
                    if(rev){
                        Collections.reverse(al);
                    }
                 
                 ans.add(al);
                 rev=!rev;
			}
		
		}
}