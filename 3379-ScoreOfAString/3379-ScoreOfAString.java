// Last updated: 8/1/2025, 10:31:44 PM
class Solution {
    public int scoreOfString(String s) {
        int score=0;
        for(int i=0;i<s.length()-1;i++){
            int val1=(int) s.charAt(i);

            int val2=(int) s.charAt(i+1);
            
score+=Math.abs(val1-val2);
        }
        return score;
    }
}