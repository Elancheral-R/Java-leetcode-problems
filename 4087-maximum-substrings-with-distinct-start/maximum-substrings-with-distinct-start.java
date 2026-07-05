class Solution {
    public int maxDistinct(String s) 
    {
        List<Character> li = new ArrayList<>();
        int counter=0;
        for(char ch:s.toCharArray())
        {
            if(!li.contains(ch))
            {
                li.add(ch);
                counter++;
            }
        }
        return counter;
    }
}