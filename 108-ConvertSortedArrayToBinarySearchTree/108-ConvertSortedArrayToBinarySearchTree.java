// Last updated: 8/1/2025, 10:40:09 PM
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
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
     }
  }
class Solution {
 
    public TreeNode sortedArrayToBST(int[] nums) {
       
       return BST(nums,0,nums.length-1);

    }
    public static TreeNode BST(int[] nums,int l,int r ){
            if(l>r) return null;
            int mid=(l+r)/2;
            TreeNode root=new TreeNode(nums[mid]);

           root.left= BST(nums,l,mid-1);
           root.right= BST(nums,mid+1,r);
        return root;
    }
}