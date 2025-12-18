class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        rec(candidates,target,0,ans,curr);
        return ans;
    }
    public static void rec(int[] arr, int target, int idx,List<List<Integer>> ans, List<Integer> curr){

        // base case
        if(target==0){
            ans.add(new ArrayList<>(curr)); 
            return;
        }

        for(int i=idx;i<arr.length;i++){
            if(arr[i]<=target){
                curr.add(arr[i]);
                rec(arr,target-arr[i],i,ans,curr);
                curr.remove(curr.size()-1);
            }
        }
    }
}