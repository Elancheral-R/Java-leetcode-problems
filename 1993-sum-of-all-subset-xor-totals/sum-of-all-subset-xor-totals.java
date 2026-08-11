class Solution {
    public int subsetXORSum(int[] nums) {
        return findXOR(nums, 0, 0);
    }

    private int findXOR(int[] nums, int index, int xor) {

        // All elements have been considered
        if (index == nums.length) {
            return xor;
        }

        // Don't take nums[index]
        int exclude = findXOR(nums, index + 1, xor);

        // Take nums[index]
        int include = findXOR(nums, index + 1, xor ^ nums[index]);

        return exclude + include;
    }
}