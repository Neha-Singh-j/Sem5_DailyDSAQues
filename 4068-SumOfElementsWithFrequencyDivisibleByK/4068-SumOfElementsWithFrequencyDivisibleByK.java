// Last updated: 10/26/2025, 10:04:52 PM
class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int ans=0;
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
            
        }
        for(int key:map.keySet()){
            if(map.get(key)%k==0){
                sum+=key*map.get(key);
            }
        }
        return sum;
    }
}