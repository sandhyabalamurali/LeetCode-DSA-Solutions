import java.util.*;

class Solution {
    public int[] findErrorNums(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int dup = -1, missing = -1;
        int n = nums.length;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) == 2) {
                dup = num;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (!map.containsKey(i)) {
                missing = i; 
                break;
            }
        }

        return new int[]{dup, missing};
    }
}
