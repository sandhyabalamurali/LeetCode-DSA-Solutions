class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int rmax=Integer.MIN_VALUE;
        int lmax=Integer.MIN_VALUE;
        int ans=0;
        while(l<r){
            lmax=Math.max(lmax,height[l]);
            rmax=Math.max(rmax,height[r]);
            if(lmax<rmax){
                ans+=lmax-height[l];
                l++;
            }
            else{
                ans+=rmax-height[r];
                r--;
            }

        }
        return ans;
    }
}