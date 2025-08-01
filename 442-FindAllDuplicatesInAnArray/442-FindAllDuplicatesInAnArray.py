# Last updated: 8/1/2025, 10:36:59 PM
class Solution:
    def findDuplicates(self, nums: List[int]) -> List[int]:
         dup={}
         l1=list()
         for i in nums:
            if i in dup:
                dup[i]+=1
            else:
                dup[i]=1 
         for key, value in dup.items():
                  if value > 1:
                    l1.append(key)   
         return l1        