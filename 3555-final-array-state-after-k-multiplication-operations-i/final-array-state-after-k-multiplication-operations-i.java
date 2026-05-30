class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) 
    {
        for(int i=0;i<k;i++)
        {
            mini(nums,multiplier);
        }
        return nums;
    }
    public void mini(int[] nums,int val)
    {
        int min=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[min] > nums[i])
                min=i;
        }
        nums[min] *= val ;
    }
}