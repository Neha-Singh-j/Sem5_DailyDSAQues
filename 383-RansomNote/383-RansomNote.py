# Last updated: 8/1/2025, 10:37:35 PM
class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        flag=0
        k=list(ransomNote)
        l=list(magazine)
        for i in ransomNote:
            if i in l:
                flag+=1
                l.remove(i)           

        if flag==len(ransomNote):    
                return True
        else:
                return False    
      
