// Last updated: 8/1/2025, 10:36:34 PM
class Solution {
    ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        LevelOrder(root);

        for (int i = 0; i < arr.size(); i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < arr.get(i).size(); j++) {
                max = Math.max(arr.get(i).get(j), max);
            }
            res.add(max);
        }
        return res;
    }

    public void LevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            ArrayList<Integer> curr = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode n = q.poll();
                curr.add(n.val);
                if (n.left != null) q.add(n.left);
                if (n.right != null) q.add(n.right);
            }

            arr.add(curr); // Now you're correctly storing each level
        }
    }
}
