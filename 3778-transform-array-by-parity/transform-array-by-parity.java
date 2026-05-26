class Solution {
    public int[] transformArray(int[] nums) 
    {
        int counter=0;
        for(int num:nums)
            if(num%2==0)
                counter++;
        for(int i=0;i<nums.length;i++)
        {
            if(counter>0)
                {
                    nums[i]=0;
                    counter--;
                }
            else
                nums[i]=1;
        }    
        return nums;
    }
}