# Last updated: 8/1/2025, 10:42:21 PM
class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        count=0
        for i in nums:
            if val==i:
                count+=1
        for i in range(1,count+1):
            nums.remove(val)
        return len(nums)    