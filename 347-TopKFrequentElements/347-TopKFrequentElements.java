// Last updated: 8/1/2025, 10:37:42 PM
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans=new int[k];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
             map.put(i, map.getOrDefault(i, 0) + 1);
        }
        k-=1;
        while(k>=0){
            int maxf=0;
            int ele=-1;
        for(int i=0;i<nums.length;i++){
            if (map.containsKey(nums[i])) {
           int f = map.get(nums[i]);

            if(f>maxf){
                maxf=f;
                ele=nums[i];
            }
            }
        }
        ans[k]=ele;
        map.remove(ele);
        
        k--;
        }
        return ans;
    }
}