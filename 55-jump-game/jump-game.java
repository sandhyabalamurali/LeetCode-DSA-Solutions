class Solution {
    public boolean canJump(int[] nums) {
        int next=0;
        for(int i=0;i<nums.length;i++){
            if(i>next){
                return false;
            }
            next=Math.max(next,i+nums[i]);
            if(next>=nums.length-1){
                return true;
            }
        }
        return true;
    }
}