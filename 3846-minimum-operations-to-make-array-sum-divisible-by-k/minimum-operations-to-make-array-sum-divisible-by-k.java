class Solution {
    public int minOperations(int[] nums, int k) 
    {
        int sum=0;
        for(int number:nums)
            sum+=number;
        return sum%k;
    }
}