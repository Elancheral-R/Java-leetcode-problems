class Solution {
    public int findContentChildren(int[] g, int[] s) 
    {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0;
        int counter=0;
        while(i<g.length && j<s.length) 
        {
            if(g[i]<=s[j])
            {
                counter++;
                i++;j++;
            }
            else
                j++;
        }   
        return counter;
    }
}