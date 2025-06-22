// Last updated: 6/22/2025, 11:03:33 AM
class Solution {
    public int longestMountain(int[] arr) {
        int n=arr.length;
        int max=0;
        // int left,right;
        if(n<3){
            return 0;
        }
        // peak
        for(int i=1;i<n-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                int left=i,
                right=i;
            // left
            while(left>0 && arr[left]>arr[left-1]){
                left--;
            }
            // right
            while(right<n-1 && arr[right]>arr[right+1]){
                right++;
            }
            int mou_len=right-left+1;
            max=Math.max(max,mou_len);
            }
        }
        return max;
    }
}