# Last updated: 8/1/2025, 10:38:49 PM


    
class Solution:
    def isHappy(self, n: int) -> bool:
        if n<=0:
            return False
        k=list(str(n))
        sum=0
        for i in k:
            sum+=int(i)**2
        if sum==1:
            return True
        elif sum==4:
            return False
        else:
            return self.isHappy(sum)