// Last updated: 8/1/2025, 10:38:39 PM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        int klar=-1;
        Arrays.sort(nums);
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])) arr.add(nums[i]);
        }
        for(int i=arr.size()-1;i>=0;i--){
            k--;
            if(k==0) klar=arr.get(i);
        }
        return klar;
    }
}