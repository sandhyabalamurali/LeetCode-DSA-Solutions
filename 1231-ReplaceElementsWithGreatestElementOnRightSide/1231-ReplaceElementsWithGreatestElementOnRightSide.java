// Last updated: 6/22/2025, 11:03:16 AM
class Solution {
    public int[] replaceElements(int[] arr) {
        int max=-1;
        int i;
        for(i=arr.length-1;i>=0;i--){
            int temp=arr[i];
            arr[i]=max;
            max=Math.max(max,temp);
        }
        return arr;
    }
}