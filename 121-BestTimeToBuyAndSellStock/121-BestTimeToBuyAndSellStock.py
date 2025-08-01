# Last updated: 8/1/2025, 10:39:58 PM
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if not prices:
            return 0
        mini=prices[0]
        maxp=0
        for i in prices:
            mini=min(i,mini)
            maxp=max(maxp,i-mini)
        return maxp   
