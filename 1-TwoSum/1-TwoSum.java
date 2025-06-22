// Last updated: 6/22/2025, 11:05:53 AM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> res=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int sub=target-nums[i];
            if(res.containsKey(sub)){
                return new int[]{res.get(sub),i};
            }
            res.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}