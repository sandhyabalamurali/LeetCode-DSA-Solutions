// Last updated: 6/22/2025, 11:05:17 AM
class Solution {
    public boolean canJump(int[] nums) {
        
        int goal=nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(i+nums[i]>=goal){
                goal=i;
            }
        }
        return goal==0;
    }
}