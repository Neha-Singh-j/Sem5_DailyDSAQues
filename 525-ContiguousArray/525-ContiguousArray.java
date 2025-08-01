// Last updated: 8/1/2025, 10:36:31 PM
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        //put -1 at place of 0 taht converts sum=0 when there is equal number of 1 and 0 in subarray.............my condition
        int len=0;
        int sum=0;
        map.put(0,-1);
        for(int i =0;i<nums.length;i++){
            if(nums[i]==0){
                sum+=-1;
            }else{
                sum+=1;
            }
            if(map.containsKey(sum)){
                len=Math.max(len,i-map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        return len;
    }
}