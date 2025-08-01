// Last updated: 8/1/2025, 10:31:50 PM
class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        
        int i=0;
        int n=nums.length;
        int j=0;
        int c=0;
        while(j<n){
            map.put(nums[j],map.getOrDefault(nums[j], 0) + 1);
            while(i<j && map.get(nums[j])>k){
                map.put(nums[i],map.get(nums[i]) - 1);
                if(map.get(nums[i])==0){
                    map.remove(nums[i]);
                }
                i++;
            }
            c=Math.max(c,j-i+1);
            j++;
        }
        return c;
    }
}