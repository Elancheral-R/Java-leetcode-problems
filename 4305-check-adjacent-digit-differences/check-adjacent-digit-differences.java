class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        for(int i=0;i<s.length()-1;i++)
        {
            int num1=(int)s.charAt(i);
            int num2=(int)s.charAt(i+1);
            if(Math.abs(num1-num2)>2)
                return false;
        }
        return true;
    }
}