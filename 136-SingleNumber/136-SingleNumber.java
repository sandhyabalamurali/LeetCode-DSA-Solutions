// Last updated: 6/22/2025, 11:04:49 AM
class Solution {
    public int singleNumber(int[] nums) {
        int i,count=0;
        for(i=0;i<nums.length;i++){
            count^=nums[i];
        }
        return count;
    }
}
