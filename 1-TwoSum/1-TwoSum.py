# Last updated: 8/1/2025, 10:43:12 PM
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
       # m=[]
        # for i in range(len(nums)):
        #     for j in range(len(nums)):
        #         if nums[i]+nums[j]==target:
        #           x.append(i)
        #           x.append(j)  
        #           return x
        # s=[[x,y] for x in range(len(nums)) for y in range(1,len(nums)) if nums[x]+nums[y]==target]

        # return s[0]
        
        # Create a dictionary to store the indices of elements
        num_indices = {}
        
        # Iterate through the list of numbers
        for i, num in enumerate(nums):
            # Calculate the complement
            complement = target - num
            
            # Check if the complement exists in the dictionary
            if complement in num_indices:
                # Return the indices of the current number and its complement
                return [num_indices[complement], i]
            
            # Store the index of the current number in the dictionary
            num_indices[num] = i
        
        # If no such pair is found, return an empty list
        return []
