# Last updated: 8/1/2025, 10:39:49 PM
class Solution:
    def isPalindrome(self, s: str) -> bool:
        s=s.lower()
        s="".join(c.lower() for c in s if c.isalnum())
        if s==s[::-1]:
            return True
        else:
            return False    
