// Last updated: 8/1/2025, 10:40:12 PM
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
   private  int endIndx;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
      endIndx=postorder.length-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        
       return makeTree(map,postorder,0,endIndx);
    }
    private TreeNode makeTree(HashMap<Integer,Integer> map,int[] postorder,int st,int end){
        if(st>end){
            return null;
        }
        int val=postorder[endIndx];
      endIndx--;
        TreeNode root=new TreeNode(val);
        int split=map.get(val);
        root.right=makeTree(map,postorder,split+1,end);
        root.left=makeTree(map,postorder,st,split-1);
        return root;
    }
}