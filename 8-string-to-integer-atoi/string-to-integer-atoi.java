class Solution {
    public int myAtoi(String s) {
        boolean isNegative=false;;
        int i=0;
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }
        if(i<s.length() && s.charAt(i)=='+') {
            i++;
        }    
        else if(i<s.length() && s.charAt(i)=='-'){
            isNegative=true;
            i++;
        }
        int res = 0;
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            if (res > (Integer.MAX_VALUE - digit) / 10) {
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            res = res * 10 + digit;
            i++;
        }
        return isNegative ? -res : res;
    }
        
    }