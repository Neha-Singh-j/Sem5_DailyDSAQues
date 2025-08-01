# Last updated: 8/1/2025, 10:37:18 PM
class Solution:
    def thirdMax(self, nums: List[int]) -> int:
      
     m=sorted(nums, reverse=True)
     
     new = sorted(set(nums))
     if len(new)<3:
        return max(new)
     return new[-3]