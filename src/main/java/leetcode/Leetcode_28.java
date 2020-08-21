package leetcode;

/**
 * Created by zhaorunqian on 2020/8/21.
 */
public class Leetcode_28 {

    /**
     * https://leetcode-cn.com/problems/implement-strstr/
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0) {
            return 0;
        }

        if (haystack == null || haystack.length() == 0) {
            return -1;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;
            for (; j < needle.length(); j++) {
                if (haystack.charAt(i + j) == needle.charAt(j)) {
                    continue;
                }
                break;
            }
            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }
}
