// Last updated: 6/22/2025, 11:05:30 AM
class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int pivot=-1;
        // Find the pivot and immediately break
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot=i;
                break;
            }
        }
        // if no pivot found (i.e->that permutation would be the largest) so just reverse and get the smallest permutation as the answer
        if(pivot==-1){
            reverse(nums,0,n-1);
            return;
        }
        // if pivot found that is a break point now just find the closest element to the pivot and just swap
        for(int i=n-1;i>=0;i--){
            if(nums[i]>nums[pivot]){
            int temp=nums[pivot];
            nums[pivot]=nums[i];
            nums[i]=temp;
            break;
            }
        }
        // After swapping we need to sort or rev the remaining elements
        reverse(nums,pivot+1,n-1);
    }
    // this is the reverse function
    public void reverse(int[] nums,int st,int end){
        while(st<end){
            int temp=nums[st];
            nums[st]=nums[end];
            nums[end]=temp;
            st++;
            end--;
        }
    }
}