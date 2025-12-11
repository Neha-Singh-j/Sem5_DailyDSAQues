// Last updated: 12/11/2025, 9:34:23 PM
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
17   
18    public int pathSum(TreeNode root, int targetSum) {
19        if(root==null){
20            return 0;
21        }
22        
23    int a= check(root,0L,(long)targetSum); // not neccessarily starts from root so we also pass left and right as roots
24    int b=pathSum(root.left,targetSum);
25    int c=pathSum(root.right,targetSum);
26    return a+b+c;
27    
28    }
29    private static int check(TreeNode root, long sum,long t){
30        if(root==null){
31            return 0;
32        }
33        sum+=root.val;
34        int c=0;
35        if(sum==t) c++;
36      
37       c+=check(root.left,sum,t);
38       c+= check(root.right,sum,t);
39       
40    return c;
41       
42    }
43}