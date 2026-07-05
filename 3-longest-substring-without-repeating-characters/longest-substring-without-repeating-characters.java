class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        List<Character> li = new ArrayList<>();
        int max=0;
        int counter=0;
        if(s.length() == 0)
            return 0;
            
        for(int i=0;i<s.length();i++)
        {
            if(!li.contains(s.charAt(i)))
            {
                li.add(s.charAt(i));
                max=Math.max(max,li.size());
            }
            else
            {
                max=Math.max(max,li.size());
                li.clear();
                i=counter++;
            }
        }    
        return max;
    }
}