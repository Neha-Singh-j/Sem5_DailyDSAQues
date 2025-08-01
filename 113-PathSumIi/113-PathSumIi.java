// Last updated: 8/1/2025, 10:40:03 PM

class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> al=new ArrayList<>();
        List<Integer> curr =new ArrayList<>();
       check(root,0,targetSum,al,curr);
       return al;
    }
    private static void check(TreeNode root, int sum,int t,List<List<Integer>> al,List<Integer> curr){
        if(root==null){
            return;
        }
       
        sum+=root.val;
        curr.add(root.val);
        if(root.left==null && root.right==null){
           if(sum==t){
            al.add(new ArrayList<>(curr));
           }
        }else{
       check(root.left,sum,t,al,curr) ;
       check(root.right,sum,t,al,curr);
        }
       curr.remove(curr.size()-1); //backtrack;

    }
}