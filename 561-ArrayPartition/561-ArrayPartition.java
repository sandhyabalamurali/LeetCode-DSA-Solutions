// Last updated: 6/22/2025, 11:03:47 AM
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=1;i<nums.length;i+=2){
            sum+=Math.min(nums[i],nums[i-1]);
        }
        return sum;
    }
}