// Last updated: 6/22/2025, 11:04:23 AM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){ 
            if (nums[i]==nums[i-1]){ 
                return true;
            }
            
        }
        return false;
    }
}