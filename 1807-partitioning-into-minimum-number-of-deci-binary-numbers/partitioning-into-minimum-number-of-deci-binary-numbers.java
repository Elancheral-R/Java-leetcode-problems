class Solution {
    public int minPartitions(String n) 
    {
        int ab=0;
        for(char ch :n.toCharArray())
        {
            if((ch-'0') > ab)
                ab=ch-'0';
        }    
        return ab;
    }
}