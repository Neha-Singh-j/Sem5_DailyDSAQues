// Last updated: 8/1/2025, 10:30:51 PM
class Solution {
    public int minOperations(int[] nums, int k) {
        int Tsum=0;
        for(int n:nums){
            Tsum+=n;
        }
        int res=Tsum%k;
        return res;
    }
}