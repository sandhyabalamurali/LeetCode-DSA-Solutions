// Last updated: 6/22/2025, 11:03:21 AM
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int bal = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (bal > 0) {
                    result.append(c);
                }
                bal++;
            } else if (c == ')') {
                bal--;
                if (bal > 0) {
                    result.append(c);
                }
            }
        }
        return result.toString();
    }
}
