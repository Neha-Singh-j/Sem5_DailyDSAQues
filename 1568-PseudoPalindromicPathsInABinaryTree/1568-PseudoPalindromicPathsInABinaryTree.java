// Last updated: 8/31/2025, 4:14:29 PM
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
    public int pseudoPalindromicPaths (TreeNode root) {
        int[] fr =new int[10];
       return count(root,fr);
    }
    public static int count(TreeNode root, int[] fr ){
        if(root==null){
            return 0;
        }

        int c=0;
        fr[root.val]++;
        if(root.left==null && root.right==null){
            if(palindrome(fr)){
                c=1;
            }
        }else{
            c+=count(root.left,fr);
            c+=count(root.right,fr);
         }
        fr[root.val]--;
        return c;

    }
    public static boolean palindrome(int[] fr){
        int odd=0;
        for(int i=1;i<10;i++){
            if(fr[i]%2!=0){
                odd++;
            }
            if(odd>1) return false;
        }
        return true;
    }
}