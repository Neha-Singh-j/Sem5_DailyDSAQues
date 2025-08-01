# Last updated: 8/1/2025, 10:41:56 PM
class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        num_set = set(nums)
        i = 1
        while i in num_set:
            i += 1
        return i