// Last updated: 8/1/2025, 10:34:05 PM
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int mad=arr[1]-arr[0];
        int diff=Integer.MAX_VALUE;
        List<List<Integer>> res=new ArrayList<>();
            for(int i=1;i<arr.length;i++){
                diff=Math.min(diff,Math.abs(arr[i]-arr[i-1]));
        }
        for(int i=1;i<arr.length;i++){
            List<Integer> curr=new ArrayList<>();
            if(Math.abs(arr[i-1]-arr[i])==diff){
                curr.add(arr[i-1]);
                curr.add(arr[i]);
                res.add(curr);
            }

        }
        return res;
    }
}