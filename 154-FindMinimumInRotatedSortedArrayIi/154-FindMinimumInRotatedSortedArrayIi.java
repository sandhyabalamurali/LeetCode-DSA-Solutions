// Last updated: 6/22/2025, 11:04:33 AM
class Solution {
    public int findMin(int[] nums) {
        int l = 0, h = nums.length - 1;

        while (l < h) {  
            int mid = l + (h - l) / 2;

            if (nums[mid] > nums[h]) { 
                l = mid + 1;
            } else if (nums[mid] < nums[h]) { 
                h = mid;
            } else { 
                h--; 
            }
        }
        
        return nums[l];  
    }
}
