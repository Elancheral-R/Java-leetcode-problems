class Solution {
    public int maxArea(int[] height) 
    {
        int len=height.length;
        int right=len-1;
        int volume=0;
        int maxi=0;
        for(int left=0;left<right;left++)
        {
            int mini = Math.min(height[left],height[right]);
            volume=mini*(right-left);
            maxi=Math.max(volume,maxi);
            if(height[left] > height[right])
            {
                left--;
                right--;
            }
        }
        return maxi;
    }
}