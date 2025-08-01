// Last updated: 8/1/2025, 10:41:16 PM
class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
String[] arr=s.split(" +");
        return arr[arr.length-1].length();
    }
}