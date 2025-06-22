# Last updated: 6/22/2025, 11:04:15 AM
class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        nz=0
        for i in range(len(nums)):
            if nums[i]!=0:
                nums[nz],nums[i]=nums[i],nums[nz]
                nz+=1
        
        