// Last updated: 8/1/2025, 10:37:12 PM
class Solution {
    public int thirdMax(int[] nums) {
        int n=nums.length;
        // ArrayList<I(nteger> arr=new ArrayList<>();
        Arrays.sort(nums);
       
        int max=nums[n-1];
        int c=0;
        int distinct=1;
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]){
                distinct++;
            }
        }
         if(n<3||distinct<3){
            return max;
        }
        for(int i=n-1;i>=0;i--){
           if(c<2){
            if(max!=nums[i]){
                max=nums[i];
                c++;
            }
           }
        }
        return max;
    }
}