// Last updated: 6/22/2025, 11:03:42 AM
class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target>nums[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;

    }
}