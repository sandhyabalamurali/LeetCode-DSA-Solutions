// Last updated: 6/22/2025, 11:04:11 AM
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        // int arr[]=new int[n];
        // int Arrays.fill(arr,-1);
        // for(int i=0;i<n;i++)
        // {
        //     arr[nums[i]]=nums[i];
        // }
        int total=n*(n+1)/2;
        int sum=0;
        for(int num:nums)
        {
            sum=sum+num;
        }
        return total-sum;

        
    }
}