// Last updated: 8/1/2025, 10:35:57 PM
class Solution {
    public int maximumSwap(int num) {
        
        String s = String.valueOf(num);
        StringBuilder str = new StringBuilder(s);
        boolean swap = false;
        for (int i = 0; i < str.length(); i++) {
           int indx = max(str, i);
            char ch=str.charAt(indx);
            if (str.charAt(i) - '0' < ch - '0' && !swap) {
               
                char temp = str.charAt(indx);
                str.setCharAt(indx, str.charAt(i));
                str.setCharAt(i, temp);
                swap = true;
            }
        }
        String st = str.toString();
        return Integer.parseInt(st);
    }

    public static int max(StringBuilder s, int j) {
        char max = s.charAt(s.length()-1);
        int indx=s.length()-1;
        for (int i = s.length()-1;i>=j; i--) {
            if (s.charAt(i) - '0' > max - '0') {
                max = s.charAt(i);
                indx=i;
            }
        }
        return indx;
    }
}
