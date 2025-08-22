class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for (int count : map.values()) {
            if (count > 1) {
                return true;
            }
        }
        
        return false;
    }
}