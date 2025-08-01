// Last updated: 8/1/2025, 10:40:02 PM
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
import java.util.*;

class Solution {

    public void flatten(TreeNode root) {
        ArrayList<TreeNode> list = new ArrayList<>();
        PreOrder(root, list);

        for (int i = 0; i < list.size() - 1; i++) {
            TreeNode curr = list.get(i);
            curr.left = null;
            curr.right = list.get(i + 1);
        }
    }

    private void PreOrder(TreeNode node, ArrayList<TreeNode> list) {
        if (node == null) {
            return;
        }

        list.add(node);
        PreOrder(node.left, list);
        PreOrder(node.right, list);
    }
}
