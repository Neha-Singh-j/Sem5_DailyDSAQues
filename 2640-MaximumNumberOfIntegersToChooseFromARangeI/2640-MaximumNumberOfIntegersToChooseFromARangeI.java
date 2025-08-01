// Last updated: 8/1/2025, 10:32:14 PM
class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:banned){
            set.add(i);
        }
        int sum=0;
        int c=0;
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                if(sum+i<=maxSum){
                    sum+=i;
                c++;
                }
            }
        }
        return c;
    }
}