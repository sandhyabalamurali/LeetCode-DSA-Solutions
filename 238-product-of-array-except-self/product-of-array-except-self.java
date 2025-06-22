class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        ans[0]=1;
        int l_product=1;
        for(int i=1;i<n;i++){
            l_product*=nums[i-1];
            ans[i]=l_product;
        }
        int r_product=1;
        for(int i=n-1;i>=0;i--){
            ans[i]*=r_product;
            r_product*=nums[i];
        }
        return ans;
    }
}