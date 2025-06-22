// Last updated: 6/22/2025, 11:04:52 AM
class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if (nums.length==0){
            return 0;
        }
        int count=1;
        int max=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            else if(nums[i]==nums[i-1]+1){
                count++;
            }
            else{
                count=1;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}