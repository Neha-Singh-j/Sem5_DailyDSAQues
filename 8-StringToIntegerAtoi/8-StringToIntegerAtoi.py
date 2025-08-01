# Last updated: 8/1/2025, 10:42:54 PM
class Solution:
    def myAtoi(self, s: str) -> int:
        x = []
        sign = 1
        s = s.strip()  # Remove leading and trailing whitespaces

        if not s:
            return 0

        if s[0] in ("-","+"):
            if s[0] == "-":
                sign = -1
            s = s[1:]

        for i in s:
            if i in '0123456789':
                x.append(i)
            else:
                break  # Stop parsing if a non-digit character is encountered

        result = 0
        if x:  # Check if x is not empty
            result = int(''.join(x)) 
            result *= sign

        if result > 2**31 - 1:
            return 2**31 - 1
        elif result < -2**31:
            return -2**31
        else:
            return result
