// Last updated: 8/1/2025, 10:38:28 PM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> al=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        int threshold=(int)Math.floor((int)(n/3));
        int freq=1;
        for(int i=1;i<n;i++){
            
            if(nums[i]==nums[i-1]){
                freq++;
            }else{
                if(freq>threshold){
                    al.add(nums[i-1]);
                    
                }
                freq=1;
            }
        }
            if(freq>threshold){
                al.add(nums[n-1]);
            }

        
        return al;
    }
}