// Last updated: 8/1/2025, 10:40:14 PM
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
   private  int stIndx;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
     stIndx=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        
       return makeTree(map,preorder,stIndx,preorder.length-1);
    }
    private TreeNode makeTree(HashMap<Integer,Integer> map,int[] preorder,int st,int end){
        if(st>end){
            return null;
        }
      
        int val=preorder[stIndx++];
        TreeNode root=new TreeNode(val);
        int split=map.get(val);
        root.left=makeTree(map,preorder,st,split-1);
        root.right=makeTree(map,preorder,split+1,end);
        return root;
    }
}