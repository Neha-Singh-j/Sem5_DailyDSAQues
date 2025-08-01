// Last updated: 8/1/2025, 10:40:49 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if( arr.isEmpty() || arr.get(arr.size()-1)!=nums[i]){
            if(map.get(nums[i])>=2){
                arr.add(nums[i]);
                arr.add(nums[i]);
            }else{
                arr.add(nums[i]);
            }
            }
        }
        for(int i=0;i<arr.size();i++){
            nums[i]=arr.get(i);
        }
        return arr.size();
    }
}