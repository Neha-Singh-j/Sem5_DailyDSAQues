# Last updated: 8/1/2025, 10:40:37 PM
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        nums1[m:m+n]=nums2
        # nums2[:n+1]
        # for i in range(n):
        #   nums1.append(nums2[i])
        nums1.sort()
        return nums1  