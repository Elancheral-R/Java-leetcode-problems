class Solution {
    public int divide(int dividend, int divisor) {

        // Overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine the sign
        boolean negative = (dividend < 0) ^ (divisor < 0);

        // Use long to safely handle MIN_VALUE
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        int quotient = 0;

        while (a >= b) {

            long temp = b;
            int multiple = 1;

            // Keep doubling the divisor
            while (a >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            a -= temp;
            quotient += multiple;
        }

        return negative ? -quotient : quotient;
    }
}