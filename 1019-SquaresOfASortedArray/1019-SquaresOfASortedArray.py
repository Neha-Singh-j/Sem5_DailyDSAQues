# Last updated: 8/1/2025, 10:34:34 PM
class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        for index,i in enumerate(nums):
            nums[index]=i*i
        nums.sort()    
        return nums