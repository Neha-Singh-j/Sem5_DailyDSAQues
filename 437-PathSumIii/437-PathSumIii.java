// Last updated: 8/1/2025, 10:37:05 PM
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
   
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null){
            return 0;
        }
    int a= check(root,0L,(long)targetSum); // not neccessarily starts from root so we also pass left and right as roots
    int b=pathSum(root.left,targetSum);
    int c=pathSum(root.right,targetSum);
    return a+b+c;
    
    }
    private static int check(TreeNode root, long sum,long t){
        if(root==null){
            return 0;
        }
        sum+=root.val;
        int c=0;
        if(sum==t) c++;
      
       c+=check(root.left,sum,t);
       c+= check(root.right,sum,t);
       
    return c;
       
    }
}