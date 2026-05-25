class Solution {
    public boolean isPalindrome(int x) {
        int temp1=x;
        int rev=0;
        while(temp1>0)
        {
            rev=(rev*10)+(temp1%10);
            temp1/=10;
        }
        if(x == rev)
            return true;
        return false;
    }
}