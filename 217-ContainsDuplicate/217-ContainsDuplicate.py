# Last updated: 6/22/2025, 11:04:27 AM
class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        # nums.sort()
        # n=len(nums)
        # for i in range(1,n):
        #     if nums[i]==nums[i-1]:
        #         return True
        # return False
        # if len(nums)!=len(set(nums)):
        #     return True
        # return False
        seen = set()
        for num in nums:
            if num in seen:
                return True
            seen.add(num)
        return False


        