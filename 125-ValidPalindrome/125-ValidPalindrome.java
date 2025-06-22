// Last updated: 6/22/2025, 11:04:51 AM
class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder rev = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            rev.append(s.charAt(i));
        }
        
        return s.equals(rev.toString());
    }
}
