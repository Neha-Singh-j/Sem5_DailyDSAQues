// Last updated: 8/1/2025, 10:41:49 PM
class Solution {
    public int firstMissingPositive(int[] nums) {
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int i=0;i<nums.length;i++){
        if(nums[i]>0){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
        }
      }
     
      int i=1;
      while(true){
        if(!map.containsKey(i)) return i;
        i++;
      }
    

    }
}