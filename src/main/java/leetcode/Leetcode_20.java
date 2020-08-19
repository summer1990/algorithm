package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by zhaorunqian on 2020/8/19.
 */
public class Leetcode_20 {

    /**
     * https://leetcode-cn.com/problems/valid-parentheses/
     * @param s
     * @return
     */
    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }

        Map<Character, Character> characterMap = new HashMap<Character, Character>();
        characterMap.put(')', '(');
        characterMap.put(']', '[');
        characterMap.put('}', '{');

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (characterMap.get(s.charAt(i)) == null) {
                stack.push(s.charAt(i));
            } else if (!stack.isEmpty() && characterMap.get(s.charAt(i)).equals(stack.peek())){
                stack.pop();
            } else {
                return false;
            }
        }
        if (stack.size() > 0) {
            return false;
        }
        return true;
    }
}