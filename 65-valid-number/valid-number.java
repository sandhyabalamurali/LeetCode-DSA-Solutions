public class Solution {
    public boolean isNumber(String s) {
        s = s.trim();
        if (s.isEmpty()) return false;

        boolean seenNum = false;
        boolean seenDot = false;
        boolean seenE = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '.') {
                if (seenDot || seenE) return false;
                seenDot = true;
            } else if (c == 'e' || c == 'E') {
                if (seenE || !seenNum) return false;
                seenE = true;
                seenNum = false; // need number after E
            } else if (c == '+' || c == '-') {
                if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
                seenNum = false; // sign isn't a number
            } else if (Character.isDigit(c)) {
                seenNum = true;
            } else {
                return false;
            }
        }

        return seenNum;
    }
}