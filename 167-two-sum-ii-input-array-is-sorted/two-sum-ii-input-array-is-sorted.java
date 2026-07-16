import java.util.*;

class Solution {
    public int[] twoSum(int[] n, int t) 
    {
        int right=n.length-1,left=0;
        while(left<right)
        {
            if((n[left]+n[right]) == t)
               break;
            else if ((n[left]+n[right]) >t)
                right--;
            else
                left++;
        }
         return new int[]{left+1,right+1};
    
    }
}
