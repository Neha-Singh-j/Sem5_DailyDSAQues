// Last updated: 8/1/2025, 10:33:53 PM
class Solution {
    public boolean isGoodArray(int[] nums) {
        if(nums.length==1 &&nums[0]==1){
            return true;
        }
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
           ans=gcd(ans,nums[i]);
            if(ans==1){
                return true;
            }
        }
        return false;
    }
    public static  int gcd(int divisor,int dividend ){
        
		while (dividend % divisor != 0) {
			int rem = dividend % divisor;
			dividend = divisor;
			divisor = rem;
		}
        return divisor;
    }
}