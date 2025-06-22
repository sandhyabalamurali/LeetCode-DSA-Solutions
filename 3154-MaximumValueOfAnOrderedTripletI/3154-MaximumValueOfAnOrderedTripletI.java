// Last updated: 6/22/2025, 11:02:37 AM
class Solution {
    public long maximumTripletValue(int[] nums) {
        long max = 0;
        // long diff=0;
        // long trip=0;
        // for (int num:nums){
        //     trip=Math.max()
        // }
        for(int i = 0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    long diff = nums[i]-nums[j];
                    max = Math.max((diff*nums[k]),max);
                }
            }
        }
        if(max<0) return 0;
        return max;
    }
}