class Solution {

    public String longestPalindrome(String s) {

        if (s.length() == 1)
            return s;

        String ans = "";

        for (int i = 0; i < s.length(); i++) {

            for (int j = s.length(); j > i; j--) {

                String sub = s.substring(i, j);

                if (pali(sub) && sub.length() > ans.length())
                    ans = sub;
            }
        }

        return ans;
    }

    public static boolean pali(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }
}