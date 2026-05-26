class Solution {
    public String reversePrefix(String s, int k) 
    {
        if (k==1)
            return s;
        // String rep = s.substring(0,k);
        // String res="";
        // for(int i=rep.length()-1;i>=0;i--)
        //     res+=rep.charAt(i);
        // res+=s.substring(k,s.length());
        // return res;
        String res="";
        for(int i=k-1;i>=0;i--)
            res+=s.charAt(i);
        res+=s.substring(k,s.length());
        return res;
    }
}