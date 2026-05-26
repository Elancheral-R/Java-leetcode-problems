class Solution {
    public String convertDateToBinary(String date) 
    {
        String p1=Integer.toBinaryString(Integer.parseInt(date.substring(0,4)));
        String p2=Integer.toBinaryString(Integer.parseInt(date.substring(5,7)));
        String p3=Integer.toBinaryString(Integer.parseInt(date.substring(8,10)));
        return p1+"-"+p2+"-"+p3;
        
    }
}