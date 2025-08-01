// Last updated: 8/1/2025, 10:41:46 PM
class Solution {
    public int trap(int[] height) {
        int n=height.length;
        if(n==0) return 0;
        int[] l=new int[n];
        int[] r=new int[n];
        int mleft=height[0];
        for(int i=0;i<n;i++){
            mleft=Math.max(height[i],mleft);
            l[i]=mleft;
        }
        int mright=height[n-1];
         for(int i=n-1;i>=0;i--){
            mright=Math.max(height[i],mright);
            r[i]=mright;
        }
int sum=0;
        for(int i=0;i<n;i++){
            int h=Math.min(r[i],l[i])-height[i];
            sum+=h;
        }
        return sum;
        
    }
}