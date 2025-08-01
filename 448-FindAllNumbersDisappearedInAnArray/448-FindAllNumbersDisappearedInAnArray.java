// Last updated: 8/1/2025, 10:36:53 PM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] arr=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
           arr[nums[i]]++;
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=1;i<arr.length;i++){
           if(arr[i]==0){
            res.add(i);
           }
        }
       
        return res;
    }
}