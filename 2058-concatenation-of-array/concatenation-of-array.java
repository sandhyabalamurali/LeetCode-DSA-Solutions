class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n+n];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
            arr[i+n]=nums[i];
        }
        return arr;
    }
}