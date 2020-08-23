package leetcode;

import java.util.Stack;

/**
 * Created by zhaorunqian on 2020/8/23.
 */
public class Leetcode_32 {

    /**
     * https://leetcode-cn.com/problems/longest-valid-parentheses/
     * @param s
     * @return
     */
    public int longestValidParentheses(String s) {
        int maxans = 0;
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.empty()) {
                    stack.push(i);
                } else {
                    maxans = Math.max(maxans, i - stack.peek());
                }
            }
        }
        return maxans;
    }

}
