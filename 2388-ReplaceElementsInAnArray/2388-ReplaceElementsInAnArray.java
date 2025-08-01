// Last updated: 8/1/2025, 10:32:40 PM
class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for(int i=0;i<operations.length;i++){
            int a=operations[i][0];
            int b=operations[i][1];
           int indx=map.get(a);
           nums[indx]=b;
           map.remove(a);
            map.put(b, indx);
        }
        return nums;
    }
}