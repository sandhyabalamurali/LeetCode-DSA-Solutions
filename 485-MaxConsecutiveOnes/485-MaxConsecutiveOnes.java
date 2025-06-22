// Last updated: 6/22/2025, 11:03:51 AM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count+=1;
                if(max<count){
                    max=count;
                }
            }
            else{
                count=0;
            }
        }
        return max;
    }
}