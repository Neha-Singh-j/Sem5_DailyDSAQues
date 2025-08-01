// Last updated: 8/1/2025, 10:42:46 PM
class Solution {
    public String intToRoman(int num) {
        int[] val = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] smbls = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String res="";
        for(int i=0;i<val.length;i++){
            while(num>=val[i]){
                res=res+smbls[i];
                
                num-=val[i];
            }
        }
        return res;
        
    }
}