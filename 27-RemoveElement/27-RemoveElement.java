// Last updated: 8/1/2025, 10:42:12 PM
class Solution {
    public int removeElement(int[] nums, int val) {
     ArrayList<Integer> arr=new ArrayList<>();
     int c=0;
     for(int i=0;i<nums.length;i++){
        if( nums[i]!=val){
        arr.add(nums[i]);
        c++;
     }
     }
      for(int i=0;i<arr.size();i++){
        nums[i]=arr.get(i);
      }
return c;
    }
}