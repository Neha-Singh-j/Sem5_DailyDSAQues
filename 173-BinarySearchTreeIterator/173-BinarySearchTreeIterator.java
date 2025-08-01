// Last updated: 8/1/2025, 10:39:01 PM
class BSTIterator {
    ArrayList<Integer> res = new ArrayList<>();
    int i = 0;
// store all treenode vlaues in arraylist 
    private void inorder(TreeNode root, ArrayList<Integer> res) {
        if(root == null) return;
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }
    // call inorder then give root to that 
    public BSTIterator(TreeNode root) {
        inorder(root, res);
    }
    // simply get by index
    public int next() {
        return res.get(i++);
        
    }
    // till i is valid hasnext exist else not
    public boolean hasNext() {
        return i < res.size();
    }
}