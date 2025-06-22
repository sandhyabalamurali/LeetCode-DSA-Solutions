// Last updated: 6/22/2025, 11:05:26 AM
class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int i;
        for(i=0;i<n;i++){
            if (nums[i]==target){
                return i;
            }
            if(nums[i]>target){
                return i;
            }
        }
        return i;
        
    }
}