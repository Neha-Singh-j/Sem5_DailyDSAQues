// Last updated: 8/1/2025, 10:30:55 PM
class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==1) continue;
            if(prime(map.get(nums[i]))) return true;
        }
        return false;
    }
    public static boolean prime(int n){
        int i=2;
        int c=0;
        while(i<n){
            if(n%i==0){
                c++;
            }
            i++;
        }
        return c==0;
    }
}