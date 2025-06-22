// Last updated: 6/22/2025, 11:03:09 AM
class Solution {
    public int findKthPositive(int[] arr, int k) {
        for (int i=0;i<arr.length;i++){
            if(arr[i]<=k){
                k++;
            }
            else break;
        }
        return k;
    }
}