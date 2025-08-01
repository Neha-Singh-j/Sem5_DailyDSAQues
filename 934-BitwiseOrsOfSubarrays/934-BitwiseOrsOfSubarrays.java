// Last updated: 8/1/2025, 10:35:08 PM
class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
           HashSet<Integer> prev=new HashSet<>();
        for(int i=0;i<arr.length;i++){
               HashSet<Integer> curr=new HashSet<>();
               curr.add(arr[i]);
            for(int j : prev){
                curr.add(j | arr[i]);
            }
            prev=curr;
            set.addAll(curr);
            
        }
        return set.size();
    }
}