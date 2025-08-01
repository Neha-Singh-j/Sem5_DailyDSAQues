// Last updated: 8/1/2025, 10:42:56 PM
int maxArea(int* height, int heightSize) {
    int left=0;
    int right=heightSize-1;
    int maxarea=0;
    while(left<right){
        int h=height[left]<height[right]?height[left]:height[right];
        int w=right-left;
        int area=h*w;
        if(area>maxarea){
            maxarea=area;

        }
        if(height[left]<height[right]){
            left++;
        }
        else{
            right--;
        }
    }
    return maxarea;
}