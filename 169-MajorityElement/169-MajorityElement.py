# Last updated: 8/1/2025, 10:39:15 PM
class Solution:
    def majorityElement(self, nums: List[int]) -> int:
       n=len(nums)
       d={}
       for i in nums:
         if i in d:
          d[i]+=1
         else:
           d[i]=1
       for i, ns in d.items():
               if ns > n/2:
                 return i
  