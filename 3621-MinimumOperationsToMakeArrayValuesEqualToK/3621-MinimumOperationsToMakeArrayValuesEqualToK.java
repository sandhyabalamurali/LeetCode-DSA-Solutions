// Last updated: 6/22/2025, 11:02:31 AM
class Solution {

    public int minOperations(int[] nums, int k) {
        Set<Integer> res=new HashSet<>();
        for(int num: nums){
            if(num<k){
                return -1;
            }
            else if(num>k){
                res.add(num);
            }
        }
        return res.size();
    }
}