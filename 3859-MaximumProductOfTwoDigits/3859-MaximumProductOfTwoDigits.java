// Last updated: 8/1/2025, 10:30:48 PM
class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> arr=new ArrayList<>();
        while(n>0){
            arr.add(n%10);
            n/=10;
        }
        Collections.sort(arr, Collections.reverseOrder());
        int n1=arr.get(0);
        int n2=arr.get(1);
        return n1*n2;
    }
}