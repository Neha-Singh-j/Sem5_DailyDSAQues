// Last updated: 8/31/2025, 4:15:31 PM
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
        // has camera->1
        // need camera->-1
        // covered->0
        // if child require camera then we setup camera to parent node
        int camera=0;
    public int minCameraCover(TreeNode root) {
        
       int c=minCamera(root);
       if(c==-1){
        camera++;
       }
       return camera;
    }
    public int minCamera(TreeNode root) {
        if(root==null){
            return 0;
        }
         int left=minCamera(root.left);
        int right=minCamera(root.right);
        if(left==-1 || right==-1){
            camera++;
            return 1; // camera setup at this node
        }
        if(left==0 && right ==0){ // both child coverd but i need camera
            return -1;
        }else{
            return 0; // one of them have camra or both have
        }
    }
}