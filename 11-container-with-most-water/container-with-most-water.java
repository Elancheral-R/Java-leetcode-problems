class Solution {
    public int maxArea(int[] height) 
    {
        int max=0,curr=0;
        int left=0,right=height.length-1;
        while(left<right)
        {
            curr=(right-left)*Math.min(height[right],height[left]);
            max=Math.max(max,curr);
            if(height[left] < height[right])left++;
            else right--;
        }
        return max;
    }
}