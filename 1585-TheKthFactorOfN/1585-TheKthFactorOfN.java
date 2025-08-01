// Last updated: 8/1/2025, 10:33:39 PM
class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> arr=new ArrayList<>();
        int i=1;
        while(i<=n){
            if(n%i==0){
                arr.add(i);
            }
            i++;
        }
        if(arr.size()<k){
            return -1;
        }
       int res= arr.get(k-1);
       
       return res;
    }
}