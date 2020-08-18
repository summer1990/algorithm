package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhaorunqian on 2020/8/17.
 */
public class Leetcode_3 {

    /**
     * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        Map<Character, Integer> characterMap = new HashMap<Character, Integer>();
        int maxLength = 0;
        for (int i = 0, begin = -1; i < s.length(); i++) {
            if (characterMap.get(s.charAt(i)) != null) {
                begin = begin > characterMap.get(s.charAt(i)) ? begin : characterMap.get(s.charAt(i));
            }
            characterMap.put(s.charAt(i), i);
            maxLength = maxLength > i - begin ? maxLength : i - begin;
        }
        return maxLength;
    }
}
