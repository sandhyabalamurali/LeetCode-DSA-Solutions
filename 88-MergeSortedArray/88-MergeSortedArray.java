// Last updated: 6/22/2025, 11:05:03 AM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i,j;
        for(j=0,i=m;j<n;j++){
                nums1[i]=nums2[j];
                i++;

            }
        Arrays.sort(nums1);
    }
}