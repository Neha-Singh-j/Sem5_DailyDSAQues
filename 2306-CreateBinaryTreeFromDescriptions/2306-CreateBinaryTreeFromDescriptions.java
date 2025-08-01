// Last updated: 8/1/2025, 10:32:47 PM
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
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashSet<Integer> set=new HashSet<>();
        HashMap<Integer,TreeNode> map=new HashMap<>();
        for(int i=0;i<descriptions.length;i++){
             int parentVal = descriptions[i][0];
            int childVal = descriptions[i][1];
            int isLeft = descriptions[i][2];

             if (!map.containsKey(parentVal)) {
                map.put(parentVal, new TreeNode(parentVal));
            }

            // Create child node if not present
            if (!map.containsKey(childVal)) {
                map.put(childVal, new TreeNode(childVal));
            }

            TreeNode parent = map.get(parentVal);
            TreeNode child = map.get(childVal);

            if(descriptions[i][2]==1){
                parent.left=child;
            }else{
                parent.right=child;
            }

            set.add(child.val);
        }
        for(int i : map.keySet()){
            if(!set.contains(i)){
                return map.get(i);
                
            }
        }
        return null;

    }
}