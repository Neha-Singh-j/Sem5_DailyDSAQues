// Last updated: 8/1/2025, 10:39:06 PM
class Solution {
    public int titleToNumber(String columnTitle) {
        int res=0,j=0;
        for(int i=columnTitle.length()-1;i>=0;i--){
            int value = columnTitle.charAt(i) - 'A' + 1;
res += value * Math.pow(26, j);
j++;
  }
        return res;
    }
}