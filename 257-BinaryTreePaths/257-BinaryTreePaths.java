// Last updated: 8/1/2025, 10:38:06 PM
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> arr=new ArrayList<>();
        path(root,"",arr);
        return arr;
    }
    public static void path(TreeNode root,String s,List<String> arr){
        if(root==null) return;
         if(s.length()==0){
        s=""+root.val;
       }else{
        s=s+"->"+root.val;
       }

        if(root.left==null && root.right==null){
            arr.add(s);
            return;
        }
      
        
        path(root.left,s,arr);
        path(root.right,s,arr);
    }
}