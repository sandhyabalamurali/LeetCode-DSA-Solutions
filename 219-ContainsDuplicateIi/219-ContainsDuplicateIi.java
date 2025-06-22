// Last updated: 6/22/2025, 11:04:20 AM
import java.util.*;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> value=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            if(value.containsKey(temp) && i-value.get(temp)<=k){
                return true;
            }
            value.put(temp,i);
        }
        return false;
    }
}