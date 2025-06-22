// Last updated: 6/22/2025, 11:03:59 AM
class Solution {
    public int firstUniqChar(String s) {
        int count; 
        for (int i = 0; i < s.length(); i++) {
            count = 0; 
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                    if (count == 2)
                        break;
                }
            }
            if (count == 1) {
                return i; 
            }
        }
        return -1;
    }
}
