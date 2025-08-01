# Last updated: 8/1/2025, 10:39:02 PM
class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        k %= n         # to encounter the conditon when k>n
        nums[:] = nums[-k:] + nums[:-k]