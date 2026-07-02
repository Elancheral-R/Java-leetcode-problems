class Solution {
    public int firstUniqChar(String s) {
        int arr[] = new int[26];
        for(char ch:s.toCharArray())
        {
            arr[ch-'a']++;
        }
        int a=-1;
        for(char ch:s.toCharArray())
        {
            a++;
            if(arr[ch-'a']==1)
                return a;
        }
        return -1;
    }
}