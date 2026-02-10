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
    public TreeNode reverseOddLevels(TreeNode root) {
        LevelOrder(root);
        return root;
    }
    public void LevelOrder(TreeNode root) {
			Queue<TreeNode> q=new LinkedList<>();
			q.add(root); //addlast
            int level=0;
			while(!q.isEmpty()) {
                int size=q.size();
				ArrayList<TreeNode> al=new ArrayList<>();
                for (int i = 0; i < size; i++) {
				    TreeNode n=q.poll();
                    al.add(n);
                    if(n.left!=null) {
                        q.add(n.left);
                    }
                    if(n.right!=null) {
                        q.add(n.right);
                    }
                }
                if(level%2==1){
                    int a=0;
                    int b=size-1;
                    while(a<b){
                        int temp=al.get(a).val;
                        al.get(a).val=al.get(b).val;
                        al.get(b).val=temp;
                        a++;
                        b--;
                    }
                }
                level++;
			}
		}
}

