# Last updated: 8/1/2025, 10:42:16 PM
class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        if not needle:
            return 0  
        for i in range(len(haystack) - len(needle) + 1):
            
            if haystack[i:i+len(needle)] == needle:
                return i
        
        return -1  
