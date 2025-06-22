// Last updated: 6/22/2025, 11:04:10 AM
class Solution {
    public void moveZeroes(int[] nums) {
        int temp=0;
        int i;
        for(i=0;i<nums.length;i++){
            if(nums[i]!=0)
            {
                nums[temp]=nums[i];
                temp++;
            }
        }
        for(i=temp;i<nums.length;i++)
        {
            nums[i]=0;
        }
  
    }
}