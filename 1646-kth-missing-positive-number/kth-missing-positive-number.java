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