// Last updated: 8/1/2025, 10:33:27 PM
class Solution {
    ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

    public boolean isEvenOddTree(TreeNode root) {
        LevelOrder(root);

        for (int i = 0; i < arr.size(); i++) {
            ArrayList<Integer> level = arr.get(i);

            for (int j = 0; j < level.size(); j++) {
                int val = level.get(j);
                // Even level: values must be odd and strictly increasing
                if (i % 2 == 0) {
                    if (val % 2 == 0) return false;
                    if (j > 0 && val <= level.get(j - 1)) return false;
                }
                // Odd level: values must be even and strictly decreasing
                else {
                    if (val % 2 != 0) return false;
                    if (j > 0 && val >= level.get(j - 1)) return false;
                }
            }
        }
        return true;
    }

    public void LevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            ArrayList<Integer> curr = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                curr.add(node.val);

                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }

            arr.add(curr);
        }
    }
}
