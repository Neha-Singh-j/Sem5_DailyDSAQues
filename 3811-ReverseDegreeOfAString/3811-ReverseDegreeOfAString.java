// Last updated: 8/1/2025, 10:30:59 PM
class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            sum+=(26-(ch-'a'))*(i+1);
        }
        return sum;
    }
}