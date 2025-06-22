// Last updated: 6/22/2025, 11:02:48 AM
class Solution {
    public int maximumCount(int[] nums) {
        int nc=0;
        int pc=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                nc+=1;
            }
            else if(nums[i]>0){
                pc+=1;
            }
        }
        if(nc>pc){
            return nc;
        }
        return pc;
    }
}