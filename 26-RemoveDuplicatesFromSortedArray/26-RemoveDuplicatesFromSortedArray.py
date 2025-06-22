# Last updated: 6/22/2025, 11:05:43 AM
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        j=0
        for i in range(len(nums)):
            if nums[j]!=nums[i]:
                j+=1
                nums[j]=nums[i]
        return j+1
