// Last updated: 6/22/2025, 11:03:25 AM
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }
    private int atMost(int[] nums, int goal) {
        if (goal < 0) return 0;
        int l = 0, r = 0, sum = 0, count = 0;
        for (r = 0; r < nums.length; r++) {
            sum += nums[r];
            while (sum > goal) {
                sum -= nums[l];
                l++;
            }
            count += r - l + 1;
        }
        return count;
    }
}
