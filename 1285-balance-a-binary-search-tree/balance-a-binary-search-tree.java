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
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<TreeNode> nodes=new ArrayList<>();
        Inorder(root,nodes);
        return Balance(nodes,0,nodes.size()-1);
    }
    public static void Inorder(TreeNode root, ArrayList<TreeNode> nodes){

        if(root==null) return;
        Inorder(root.left,nodes);
        nodes.add(root);
        Inorder(root.right,nodes);
    }
    public static TreeNode Balance( ArrayList<TreeNode> nodes,int l ,int r){
        //base case
            if(l>r) return null;

            int mid=(l+r)/2;
            TreeNode node=nodes.get(mid);
            node.left=Balance(nodes,l,mid-1);
            node.right=Balance(nodes,mid+1,r);
            return node;
    }
}