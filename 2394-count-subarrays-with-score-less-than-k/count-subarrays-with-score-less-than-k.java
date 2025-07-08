class Solution {
    public long countSubarrays(int[] nums, long k) {
        int left=0;
        long sum=0;
        long count=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int len;
            while((sum*(len=i-left+1)>=k)){
                sum-=nums[left];
                left++;
            }
            count+=len;
        }
        return count;
    }
}