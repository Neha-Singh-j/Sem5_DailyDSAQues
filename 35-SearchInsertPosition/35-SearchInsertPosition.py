# Last updated: 8/1/2025, 10:42:02 PM
class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:

        for i, ns in enumerate(nums):
             if ns>=target:
                return i
        return len(nums)     