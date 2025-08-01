# Last updated: 8/1/2025, 10:42:07 PM
class Solution:
    def longestValidParentheses(self, s: str) -> int:
        st = []
        max_len = 0
        st.append(-1)  # Acts as a base index

        for i in range(len(s)):
            if s[i] == '(':
                st.append(i)
            else:
                st.pop()
                if not st:
                    st.append(i)
                else:
                    max_len = max(max_len, i - st[-1])
        
        return max_len
