// Last updated: 6/22/2025, 11:05:44 AM
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int i;
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        for(i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int tot=nums[i]+nums[j]+nums[k];
                if(tot>0){
                    k--;
                }
                else if(tot<0){
                    j++;

                }
                else{
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                
                while(nums[j]==nums[j-1]&&j<k){
                    j++;
                }
                }
            }

        }
        return res;
        

    }
}