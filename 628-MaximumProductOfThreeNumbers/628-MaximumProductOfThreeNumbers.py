# Last updated: 8/1/2025, 10:36:04 PM
class Solution:
    def maximumProduct(self, nums: List[int]) -> int:
       n=sorted(nums,reverse=True)
       if len(n)>=3:
               
          return max(n[0]*n[1]*n[2],n[0]*n[-1]*n[-2])
       elif len(n)==2:
        p=n[0]*n[1]
        return p
       elif len(n)==1:
        p=n[0]
        return p 
       else:
        return 0  
    
        # n = sorted(nums, reverse=True)
        # return max(n[0] * n[1] * n[2], n[0] * n[-1] * n[-2])
