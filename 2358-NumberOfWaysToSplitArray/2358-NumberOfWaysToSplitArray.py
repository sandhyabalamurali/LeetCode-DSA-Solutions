# Last updated: 6/22/2025, 11:02:51 AM
class Solution:
    def waysToSplitArray(self, nums: List[int]) -> int:
        # count=0
        # left_sum=0
        # total=sum(nums)
        # for i in range(len(nums)-1):
        #     left_sum+=nums[i]
        #     if left_sum >= (total-left_sum):
        #         count+=1
        # return count

        left = 0
        right = (sum(nums)+1)//2
        res = 0
        for i in range(len(nums)-1):
            left += nums[i]
            if left >= right:
                res += 1
        return res