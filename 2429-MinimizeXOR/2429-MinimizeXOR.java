// Last updated: 1/22/2026, 11:51:45 PM
1class Solution {
2    public int minimizeXor(int num1, int num2) {
3        
4        return x_find(num1,num2);
5    }
6    public static int x_find(int nums1 , int nums2){
7        int set_bit=0;
8        while(nums2>0){
9            nums2=(nums2&(nums2-1));
10            set_bit++;
11        }
12        int x=0;
13        for(int i=30;i>=0;i--){
14            int  mask=(1<<i);
15            if((nums1 & mask)!=0){
16                x|=mask; //x=x|mask;
17                set_bit--;
18            if(set_bit==0) return x;
19            }
20        }
21        for(int i=0;i<=30;i++){
22             int  mask=(1<<i);
23            if((nums1 & mask)==0){
24                x|=mask; //x=x|mask;
25                set_bit--;
26            if(set_bit==0) return x;
27            }
28        }
29        return x;
30    }
31}