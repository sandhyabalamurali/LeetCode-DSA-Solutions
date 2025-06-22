// Last updated: 6/22/2025, 11:03:24 AM
class Solution {
    public int[] sortedSquares(int[] nums) {
        int i;
        for(i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}