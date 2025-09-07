// Last updated: 9/7/2025, 6:06:17 PM

class Solution {
    		int max_depth=0;
    public List<Integer> rightSideView(TreeNode root) {
    List<Integer> ll =new ArrayList<>();
			rightView(root,1,ll);
			return ll;
		}
		public void rightView(TreeNode root,int curr,List<Integer> ll) {
			if(root==null) {
				return ;
			}
			if(max_depth<curr) {
				ll.add(root.val);
				max_depth=curr;
			}
			rightView(root.right,curr+1,ll);
			rightView(root.left,curr+1,ll);

		}
}