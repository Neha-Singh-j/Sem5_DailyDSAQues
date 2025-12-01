// Last updated: 12/1/2025, 10:36:00 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public int rob(TreeNode root) {
18        HashMap<TreeNode, Integer>map=new HashMap<>();
19        return robber(root,map);
20    }
21    public static int robber(TreeNode root,HashMap<TreeNode, Integer> map){
22        if(root==null){
23            return 0;
24        }
25        if(map.containsKey(root)) return map.get(root);
26        int select=root.val;
27        if(root.left!=null){
28            select+=robber(root.left.left,map)+robber(root.left.right,map);
29       
30        }
31         if(root.right!=null){
32            select+=robber(root.right.left,map)+robber(root.right.right,map);
33       
34        }
35         int not_select=robber(root.left,map)+robber(root.right,map);
36         int res=Math.max(select,not_select);
37         map.put(root,res);
38        return res;
39    }
40}