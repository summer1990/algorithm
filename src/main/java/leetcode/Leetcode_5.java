package leetcode;

/**
 * Created by zhaorunqian on 2020/8/17.
 */
public class Leetcode_5 {

    /**
     * https://leetcode-cn.com/problems/longest-palindromic-substring/
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        String result = "";
        for (int i = 0; i < s.length(); i++) {
            String palindrome1 = findLongestPalindrome(s, i, i);
            String palindrome2 = findLongestPalindrome(s, i, i+1);

            result = palindrome1.length() > palindrome2.length()
                    ? (palindrome1.length() > result.length() ? palindrome1 : result)
                    : (palindrome2.length() > result.length() ? palindrome2 : result);
        }
        return result;
    }

    private String findLongestPalindrome(String s, int begin, int end) {
        for (;begin >= 0 && end < s.length();begin--, end++) {
            if (s.charAt(begin) != s.charAt(end)) {
                break;
            }
        }
        return s.substring(begin + 1, end);
    }
}
