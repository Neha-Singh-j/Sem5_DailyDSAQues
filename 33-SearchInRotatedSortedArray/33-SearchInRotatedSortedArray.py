# Last updated: 8/1/2025, 10:42:09 PM
class Solution:
    def search(self, nums: List[int], target: int) -> int:
       if target in nums:
        return nums.index(target)
       else:
        return -1 
    #  k=target
    #  l,u=0,len(nums)-1
    #  m=(l+u)//2
    #  while l<=u:
    #     if (nums[m]<k):
    #         l=m+1
    #     elif nums[m]>k:
    #         u=m-1
    #         m=(l+u)//2
    #     elif nums[m]==k:
    #         return m
    #  if l>u:
    #     return -1                
     