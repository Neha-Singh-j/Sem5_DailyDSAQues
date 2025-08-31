// Last updated: 8/31/2025, 4:15:29 PM
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
    List<Integer> arr=new ArrayList<>();
    int i=0;
    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {

       boolean res= flip(root,voyage);
       if(res){
        return arr;
       }
       return Arrays.asList(-1);

    }
    private boolean flip(TreeNode root,int[] v){
         if (root == null) return true;
        if(root.val!=v[i]){
            return false;
        }
            i++;
        if(root.left!=null && i < v.length && root.left.val!=v[i]){
            if(root.right!=null && root.right.val==v[i]){
                arr.add(root.val);
                TreeNode temp=root.left;
                root.left=root.right;
                root.right=temp;
            }else{
                 return false;
            }
        }
        boolean l=flip(root.left,v);
        boolean r =flip(root.right,v);
        return l&&r;
  }

}