// Last updated: 6/22/2025, 11:02:38 AM
class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }

        int l = 0;
        long maxc = 0;
        long res = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max) {
                maxc++;
            }

            while (maxc >= k) {
                if (nums[l] == max) {
                    maxc--;
                }
                l++;
            }

            res += l;
        }

        return res;
    }
}
