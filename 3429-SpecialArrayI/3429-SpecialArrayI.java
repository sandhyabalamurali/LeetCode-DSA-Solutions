// Last updated: 6/22/2025, 11:02:33 AM
class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length<=1){
            return true;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]%2==nums[i-1]%2){
                return false;
            }
            
            // else{
            //     return false;
            // }
        }
        return true;
    }
}