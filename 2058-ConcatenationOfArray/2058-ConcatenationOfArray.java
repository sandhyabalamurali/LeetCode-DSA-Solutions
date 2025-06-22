// Last updated: 6/22/2025, 11:02:59 AM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] r=new int[2*n];
        System.arraycopy(nums,0,r,0,n);
        System.arraycopy(nums,0,r,n,n);
        return r;
    }
}