# Last updated: 8/1/2025, 10:37:25 PM
class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        find=0
        for i in s:
            if i in t:
                find+=1
                indx=t.index(i)
                t=t[indx+1::]
        if find==len(s):
            return True
        else:
            return False            