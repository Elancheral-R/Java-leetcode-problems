class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch :s.toCharArray())
        {
            if(Character.isDigit(ch) || Character.isLetter(ch))
                sb.append(ch);
        }
        s=sb.toString();
        sb.reverse();
        if(s.equalsIgnoreCase(sb.toString()))
            return true;
        return false;
        
    }
}