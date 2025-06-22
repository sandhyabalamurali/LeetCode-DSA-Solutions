// Last updated: 6/22/2025, 11:03:50 AM
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l=0,h=nums.length-1,mid=0;
        while(l<h){
            mid=(l+h)/2;
            if(mid%2==1){
                mid--;
            }
            if(nums[mid]==nums[mid+1]){
                l=mid+2;
            }
            else {
                h=mid;
            }
        }
        return nums[l];
    }

}