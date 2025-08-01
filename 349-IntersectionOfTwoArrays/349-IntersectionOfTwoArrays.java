// Last updated: 8/1/2025, 10:37:39 PM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
         HashSet<Integer> set1=new HashSet<>();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i:nums1){
            set1.add(i);
        }
       
        for(int val:nums2){
            if(!arr.contains(val) && set1.contains(val) ) arr.add(val);
        }
      
       int[] res=new int[arr.size()];
       for(int i=0;i<arr.size();i++){
        res[i]=arr.get(i);
       }
        return res;
    }
}