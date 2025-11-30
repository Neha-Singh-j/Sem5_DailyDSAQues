// Last updated: 11/30/2025, 9:04:26 AM
1class Solution {
2    public int minMirrorPairDistance(int[] nums) {
3        int n=nums.length;
4        int min=Integer.MAX_VALUE;
5        HashMap<Integer,Integer> map=new HashMap<>();
6        for(int i=0;i<n;i++){
7            if(map.containsKey(nums[i])){
8                min=Math.min(min, i-map.get(nums[i]));
9            }
10            int rev=reverse(nums[i]);
11            map.put(rev,i);
12        }
13        if(min==Integer.MAX_VALUE){
14            return -1;
15        }else{
16            return min;
17        }
18    }
19    public static int reverse(int x){
20        int rev=0;
21        while(x>0){
22            rev=rev*10+(x%10);
23                x/=10;
24        }
25        return rev;
26    }
27}