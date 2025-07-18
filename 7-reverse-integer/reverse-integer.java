class Solution {
    public int reverse(int x) {
        int dig = 0;
        while (x != 0) {
            int rem = x % 10;
            if (dig > Integer.MAX_VALUE / 10 || (dig == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0;
            }
            if (dig < Integer.MIN_VALUE / 10 || (dig == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0;
            }
            dig = dig * 10 + rem;
            x /= 10;
        }

        return dig;
    }
}
