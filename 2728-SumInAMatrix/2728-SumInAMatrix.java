// Last updated: 8/1/2025, 10:31:59 PM
class Solution {
    public int matrixSum(int[][] nums) {
        int score = 0;
        for(int i=0;i<nums.length;i++){
            Arrays.sort(nums[i]);
        }
        for (int i = 0; i < nums[0].length; i++) {
            int max = 0;
            for (int j = 0; j < nums.length; j++) {
                max = Math.max(nums[j][i], max);
            }
            score += max;
        }
        return score;
    }
}
