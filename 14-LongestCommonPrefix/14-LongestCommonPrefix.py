# Last updated: 8/1/2025, 10:42:47 PM
class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        
            
        if not strs:
         return ""
    
        prefix = strs[0]
        for string in strs[1:]:
          while prefix != string[:len(prefix)]:
            prefix = prefix[:-1]
            if not prefix:
                return ""
        return prefix