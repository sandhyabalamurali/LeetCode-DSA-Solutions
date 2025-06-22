// Last updated: 6/22/2025, 11:05:25 AM
class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int lmax=0;int rmax=0;
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