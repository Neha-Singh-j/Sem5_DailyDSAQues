# Last updated: 8/1/2025, 10:41:07 PM
class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
    #    digits[-1]+=1
    #    x= digits[-1]
    #    if x>=9:
    #     m=x%10
    #     n=(x//10)%10
    #     digits.pop()
    #     digits.extend([n,m])
    #     return digits
    #    else: 
    #     return digits
      n=0
      for i in digits:
        n=n*10+i
      n=n+1    
      n=str(n)
      l=[]
      for i in n:
        l.append(int(i))
      return l    