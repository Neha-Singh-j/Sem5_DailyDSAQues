// Last updated: 8/1/2025, 10:38:27 PM
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

ArrayList<Integer> res=new ArrayList<>();

    public int kthSmallest(TreeNode root, int k) {
        InOrder(root);
        Collections.sort(res);
        return res.get(k-1);

    }
		private void InOrder(TreeNode nn) {
			if(nn==null) {
				return;
			}
			InOrder(nn.left);
			res.add(nn.val);
			InOrder(nn.right);
		}

}