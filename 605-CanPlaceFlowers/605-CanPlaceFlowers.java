// Last updated: 8/1/2025, 10:36:11 PM
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int c=0;
        for(int i=0;i<flowerbed.length;i++){
                if (flowerbed[i] == 0 &&
                (i == 0 || flowerbed[i - 1] == 0) &&
                (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                c++;
                flowerbed[i] = 1;
                i++; 
            }
        }
       return c>=n;
    }
}