// Last updated: 6/22/2025, 11:05:31 AM
class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        boolean neg = (dividend < 0) ^ (divisor < 0);
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        int ans = 0;
        while (a >= b) {
            int count = 0;
            while (a >= (b << (count + 1))) {
                count++;
            }
            ans += 1 << count;
            a -= b << count;
        }
        
        return neg ? -ans : ans;
    }
}
