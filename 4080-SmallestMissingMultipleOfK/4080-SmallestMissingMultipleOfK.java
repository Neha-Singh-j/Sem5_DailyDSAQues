// Last updated: 10/26/2025, 10:04:50 PM
class Solution {
    public int missingMultiple(int[] nums, int k) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int num:nums){
            arr.add(num);
        }
        int i=k;
         while (i <= 100) {       
            if (!arr.contains(i)) { 
                return i;
            }
            i += k; 
        }
        return i;
    }
}