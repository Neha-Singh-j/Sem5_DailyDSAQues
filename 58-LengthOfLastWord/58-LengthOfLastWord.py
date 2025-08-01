# Last updated: 8/1/2025, 10:41:23 PM
class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        se=s.split()
        m=len(se[-1])
        return m