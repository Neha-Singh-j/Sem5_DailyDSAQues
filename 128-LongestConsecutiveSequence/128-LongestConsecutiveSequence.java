// Last updated: 8/27/2025, 12:41:25 PM
class Solution {
    public int longestConsecutive(int[] nums) {
        int ans=0;
       
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }

        for(int i=0;i<nums.length;i++){
             int key=nums[i],c=0;
            if(!set.contains(nums[i]-1)){
            while(set.contains(key)){
                set.remove(key);
                c++;
                key++;
            }
            ans=Math.max(c,ans);
            }
        }
        return ans;
    }
}