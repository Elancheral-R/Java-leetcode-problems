class Solution {
    public int scoreOfString(String s)
    {
        int sum=0;
        int j;
        for(int i=0;i<s.length()-1;i++)
        {
            j=i+1;
            sum+=Math.abs((int)s.charAt(i)-(int)s.charAt(j));
        }    
        return sum;
    }
}