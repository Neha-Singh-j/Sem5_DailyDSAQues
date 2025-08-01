# Last updated: 8/1/2025, 10:36:51 PM
class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
       count=0
       max_count=0
       for i in nums:
         if i==1:
            count+=1
            if max_count<count:
              max_count=count
         else:
            count=0   
       return max_count