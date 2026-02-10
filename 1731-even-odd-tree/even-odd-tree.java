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
    public boolean isEvenOddTree(TreeNode root) {
        if(root==null) return true;
        if(root.val%2==0) return false;
        return check(root);
    }
    public boolean check(TreeNode root) {
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
                if(level%2==1){ //even number sin dec oreder
                    int prev=al.get(0).val;
                     if(prev%2!=0) return false;
                    for(int i=1;i<size;i++){
                        if(al.get(i).val%2==0 && al.get(i).val<prev){
                            prev=al.get(i).val;
                        }else{
                            return false;
                        }
                    }
                }else{
                    int prev=al.get(0).val;
                    if(prev%2==0) return false;
                    for(int i=1;i<size;i++){
                        if(al.get(i).val%2!=0 && al.get(i).val>prev){
                            prev=al.get(i).val;
                        }else{
                            return false;
                        }
                    }
                }
                level++;
			}
            return true;
		}
}