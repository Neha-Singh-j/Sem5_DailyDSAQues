// Last updated: 9/26/2025, 2:06:56 PM
class Solution {
    public int firstMissingPositive(int[] nums) {
      HashSet<Integer> set=new HashSet<>();
      for(int i=0;i<nums.length;i++){
        if(nums[i]>0){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
        }
      }
      int i=1;
      while(true){
        if(!set.contains(i)) return i;
        i++;
      }
    }
}