package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaorunqian on 2020/8/20.
 */
public class Leetcode_22 {

    /**
     * https://leetcode-cn.com/problems/generate-parentheses/
     * @param n
     * @return
     */
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        doGenerateParenthesis(result, "" , n, n);
        return result;
    }

    private void doGenerateParenthesis(List<String> result, String s, int left, int right) {
        System.out.println(left +"," +right);
        if (right == 0 && left == 0) {
            result.add(s);
            return;
        }

        if (left > 0) {
            doGenerateParenthesis(result, s + "(", left - 1, right);
        }

        if (right > left){
            doGenerateParenthesis(result, s + ")", left, right - 1);
        }
    }

    public static void main(String[] args) {
        List<String> result = new Leetcode_22().generateParenthesis(3);
        System.out.println(result.size());
    }
}