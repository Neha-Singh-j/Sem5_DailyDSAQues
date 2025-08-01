# Last updated: 8/1/2025, 10:38:51 PM
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        mapping = {}  # Mapping from characters in s to characters in t
        
        for char_s, char_t in zip(s, t):
            # If char_s is not in the mapping, add it with char_t
            if char_s not in mapping:
                # Check if char_t is already mapped to another char in s
                if char_t in mapping.values():
                    return False
                mapping[char_s] = char_t
            else:
                # Check if the mapping is consistent
                if mapping[char_s] != char_t:
                    return False
        
        return True

        # st={}
        # ts={}
        # for chars,chart in zip(s,t):
        #      if chars not in st:
        #         st[chars]=chart
        #      elif st[chars]!=chart:
        #         return False
        #      if chart not in ts:
        #         st[chart]=chars
        #      elif st[chart]!=chars:
        #         return False   
        