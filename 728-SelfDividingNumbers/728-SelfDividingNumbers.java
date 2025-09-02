// Last updated: 9/3/2025, 12:05:23 AM
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> li=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(selfDiv(i)){
                li.add(i);
            }
        }
        return li;
    }

    public static boolean selfDiv(int n){
        int num=n;
        while(n>0){
            int rem=n%10;
            if(rem==0) return false;
            if(num %rem!=0) return false;
            n=n/10;
        }
        return true;
    }
}