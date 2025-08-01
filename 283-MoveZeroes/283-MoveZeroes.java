// Last updated: 8/1/2025, 10:37:57 PM
class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                arr.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=0;
        }
        for(int i=0;i<arr.size();i++){
            nums[i]=arr.get(i);
        }
    }
}