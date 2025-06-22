// Last updated: 6/22/2025, 11:04:37 AM
class Solution {
    public int maxProduct(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums.length==1){
                return nums[i];
            }
            int product=1;
            for(int j=i;j<nums.length;j++){
                product*=nums[j];
                if(product>max){
                    max=product;
                }
            }
        }
        return max;
    }
}