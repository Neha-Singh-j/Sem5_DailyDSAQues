// Last updated: 9/9/2025, 9:56:24 PM
class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;// to store result within one bracesc
        int sign = 1;// for negative or psotive correctly calucaltion
        int num = 0;// this is stroing a number -->can be of multiple digits 123 or can be single digit 3

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0'); // build number
            } else if (c == '+') {
                result += sign * num;
                num = 0;
                sign = 1;
            } else if (c == '-') {
                result += sign * num;
                num = 0;
                sign = -1;
            } else if (c == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if (c == ')') {
                result += sign * num;
                num = 0;
                result *= stack.pop(); // sign
                result += stack.pop(); // previous result
            }
        }

        // add the last number
        if (num != 0) result += sign * num;

        return result;
    }
}
