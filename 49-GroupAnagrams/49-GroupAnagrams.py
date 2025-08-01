# Last updated: 8/1/2025, 10:41:41 PM
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagram={} # for storing all possible cobination
        for i in strs:
            sort="".join(sorted(i))
            if sort in anagram:
                anagram[sort].append(i)
            else:
                anagram[sort]=[i]
        return anagram.values()           
