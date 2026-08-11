class Solution {
    public boolean isPowerOfFour(int n) {

        // n must be positive
        if (n <= 0) {
            return false;
        }

        // Power of 4 must have only one bit set
        if ((n & (n - 1)) != 0) {
            return false;
        }

        // The single 1-bit must be at an even position
        return (n & 0x55555555) != 0;
    }
}