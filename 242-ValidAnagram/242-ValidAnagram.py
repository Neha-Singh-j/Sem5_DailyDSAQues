# Last updated: 8/1/2025, 10:38:15 PM
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
      
       if len(s)!=len(t):
         return False
       k=sorted(s)
       m=sorted(t)
       
       k = sorted(s.replace(" ", ""))
       m = sorted(t.replace(" ", ""))

       return k==m
          