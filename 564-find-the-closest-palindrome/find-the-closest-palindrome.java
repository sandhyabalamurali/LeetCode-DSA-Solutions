public class Solution {
    public String nearestPalindromic(String n) {
        long num = Long.parseLong(n);
        int len = n.length();
        List<Long> candidates = new ArrayList<>();

        // Edge case palindromes
        candidates.add((long)Math.pow(10, len) + 1);        // 100...001
        candidates.add((long)Math.pow(10, len - 1) - 1);    // 999...999

        // Middle prefix - get the left half (including middle for odd length)
        long prefix = Long.parseLong(n.substring(0, (len + 1) / 2));

        // Generate 3 candidates by adjusting the prefix
        for (long i = prefix - 1; i <= prefix + 1; i++) {
            String pre = String.valueOf(i);
            StringBuilder sb = new StringBuilder();
            sb.append(pre);

            // Mirror the prefix to create palindrome
            // For mirroring, we need to exclude the middle character for odd lengths
            int mirrorStart = len % 2 == 0 ? pre.length() - 1 : pre.length() - 2;
            
            // Add safety check to prevent StringIndexOutOfBoundsException
            for (int j = mirrorStart; j >= 0; j--) {
                sb.append(pre.charAt(j));
            }
            
            // Only add if the resulting string has the correct length
            String palindrome = sb.toString();
            if (palindrome.length() == len) {
                candidates.add(Long.parseLong(palindrome));
            }
        }

        // Remove invalid candidates and find closest
        long closest = -1;
        for (long cand : candidates) {
            if (cand == num) continue; // Skip the original number
            if (closest == -1 ||
                Math.abs(cand - num) < Math.abs(closest - num) ||
                (Math.abs(cand - num) == Math.abs(closest - num) && cand < closest)) {
                closest = cand;
            }
        }

        return String.valueOf(closest);
    }
}
