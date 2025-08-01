// Last updated: 8/1/2025, 10:39:44 PM

class Solution {
    public int sumNumbers(TreeNode root) {
        List<String> l=new ArrayList<>();
        check(root,l,"");
        int sum=0;
        System.out.println(l);
        for(int i=0;i<l.size();i++){
            sum+=Integer.parseInt(l.get(i));
        }
        return sum;
    }
     private static void check(TreeNode root,List<String> l,String s){
        if(root==null){
            return;
        }
       
        if(root.left==null && root.right==null){
            s+=root.val;
            l.add(s);
        }
       check(root.left,l,s+root.val);
        check(root.right,l,s+root.val);

        
    }
}