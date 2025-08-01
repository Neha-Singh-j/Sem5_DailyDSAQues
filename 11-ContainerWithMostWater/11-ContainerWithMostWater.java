// Last updated: 8/1/2025, 10:42:49 PM
class Solution {
    public int maxArea(int[] height) {
       int n=height.length;
       int i=0;
       int j=n-1;
       int maxWater=Integer.MIN_VALUE;
        while(i<j){
            int h=Math.min(height[i],height[j]);
            int w=j-i;
            maxWater=Math.max(maxWater,h*w);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxWater;
    }
}