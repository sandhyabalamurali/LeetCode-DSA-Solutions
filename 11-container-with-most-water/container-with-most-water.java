class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int max = 0;
        while(l<r){
            int w=r-l;
            int min=Math.min(height[l],height[r]);
            int water_width=w*min;
            max=Math.max(max,water_width);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return max;
    }
}
