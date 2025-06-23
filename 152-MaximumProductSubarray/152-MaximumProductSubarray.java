// Last updated: 6/23/2025, 9:38:36 PM
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