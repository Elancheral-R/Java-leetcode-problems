class Solution {
    public int alternatingSum(int[] nums) 
    {
        boolean toggle=true;
        int sum=0;
        for(int number:nums)
        {
            if(toggle)
                sum+=number;
            else
                sum-=number;
            toggle=(!toggle);
        }
        return sum;
    }
}