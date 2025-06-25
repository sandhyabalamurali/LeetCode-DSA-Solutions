public class Solution {
    public String nearestPalindromic(String n) {
        long num = Long.parseLong(n);  // \U0001f538"123" → num = 123
        int len = n.length();          // \U0001f538len = 3
        List<Long> candidates = new ArrayList<>();  // \U0001f538To store all palindrome options

        // \U0001f538Edge case 1: 10^len + 1 → 1000 + 1 = 1001
        candidates.add((long)Math.pow(10, len) + 1);  // candidates = [1001]

        // \U0001f538Edge case 2: 10^(len - 1) - 1 → 100 - 1 = 99
        candidates.add((long)Math.pow(10, len - 1) - 1); // candidates = [1001, 99]

        // \U0001f538Prefix of the number (first half, include middle if odd)
        long prefix = Long.parseLong(n.substring(0, (len + 1) / 2));
        // n = "123", len = 3 → (3+1)/2 = 2 → prefix = "12" → long = 12

        // \U0001f538Try 3 versions: prefix -1, prefix, prefix +1 → [11, 12, 13]
        for (long i = prefix - 1; i <= prefix + 1; i++) {
            String pre = String.valueOf(i);   // \U0001f539i = 11 → pre = "11"
            StringBuilder sb = new StringBuilder();
            sb.append(pre);                   // sb = "11"

            // \U0001f538Mirror: If odd length, skip middle char when reversing
            int mirrorStart = len % 2 == 0 ? pre.length() - 1 : pre.length() - 2;
            // len = 3 (odd) → mirrorStart = 2 - 2 = 0

            // \U0001f538Add reverse of left part
            for (int j = mirrorStart; j >= 0; j--) {
                sb.append(pre.charAt(j));
                // j = 0 → pre.charAt(0) = '1' → sb = "111"
            }

            candidates.add(Long.parseLong(sb.toString()));  // add 111
            // Repeat for i = 12 → "121", i = 13 → "131"
        }

        // \U0001f538Now candidates = [1001, 99, 111, 121, 131]
        long closest = -1;
        for (long cand : candidates) {
            if (cand == num) continue; // skip 123 itself

            // \U0001f538Choose closest one: minimum absolute difference
            if (closest == -1 || 
                Math.abs(cand - num) < Math.abs(closest - num) ||
                (Math.abs(cand - num) == Math.abs(closest - num) && cand < closest)) {
                closest = cand;  // \U0001f4cc Here, 121 will become the closest
            }
        }

        return String.valueOf(closest);  // \U0001f538Final answer = "121"
    }
}
