class Solution {
    public int maxFreqSum(String s) 
    {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray())
        {
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }
            else
                map.put(ch,1);
        }    
        int max1=0;
        int max2=0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) 
        {
            if(entry.getKey()== 'a')
                max1=Math.max(max1,entry.getValue());
            else if(entry.getKey()== 'e')
                max1=Math.max(max1,entry.getValue());
            else if(entry.getKey()== 'i')
                max1=Math.max(max1,entry.getValue());
            else if(entry.getKey()== 'o')
                max1=Math.max(max1,entry.getValue());
            else if(entry.getKey()== 'u')
                max1=Math.max(max1,entry.getValue());
            else
                max2=Math.max(max2,entry.getValue());            
        }
        return (max1+max2);

    }
}