class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
        }
        int val=1;
        for(int i=0;i<n;i++){
            if(set.contains(val)){
                val++;
            }
            else{
                return val;
            }
        }
        return val;
    }
}