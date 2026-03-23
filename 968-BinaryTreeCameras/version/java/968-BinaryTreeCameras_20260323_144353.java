// Last updated: 3/23/2026, 2:43:53 PM
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
17        // has camera->1
18        // need camera->-1
19        // covered->0
20        // if child require camera then we setup camera to parent node
21        int camera=0;
22    public int minCameraCover(TreeNode root) {
23        
24       int c=minCamera(root);
25       if(c==-1){
26            camera++;
27       }
28       return camera;
29    }
30    public int minCamera(TreeNode root) {
31        if(root==null){
32            return 0;
33        }
34         int left=minCamera(root.left);
35        int right=minCamera(root.right);
36        if(left==-1 || right==-1){
37            camera++;
38            return 1; // camera setup at this node
39        }
40        if(left==0 && right ==0){ // both child coverd but i need camera
41            return -1;
42        }else{
43            return 0; // one of them have camera or both have
44        }
45    }
46}