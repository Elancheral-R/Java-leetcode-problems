class Solution {
    public int firstUniqChar(String s) {
        int arr[] = new int[26];
        for(char ch:s.toCharArray())
        {
            arr[ch-'a']++;
        }
        for(char ch:s.toCharArray())
        {
            // a++;
            if(arr[ch-'a']==1)
                return s.indexOf(ch);
        }
        return -1;
    }
}