class Solution {
    public int reverseDegree(String s) 
    {
        HashMap<Character ,  Integer> map = new HashMap<>();
        int counter=0;
        for(int i=26;i>0;i--)
        {
            map.put((char)(97+counter++),i);
        }    
        counter=1;
        int sum=0;
        for(char ch:s.toCharArray())
        {
            sum+=(map.get(ch)*counter++);
        }
        return sum;
    }
}