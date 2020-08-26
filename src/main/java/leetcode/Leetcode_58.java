package leetcode;

/**
 * Created by zhaorunqian on 2020/8/26.
 */
public class Leetcode_58 {

    public int lengthOfLastWord(String s) {
        if(s == null || s.length() == 0 ){
            return 0;
        }

        int end = s.length() - 1;
        for(;end >=0; end--) {
            if(s.charAt(end) != ' ') {
                break;
            }
        }

        int start = end;
        for(;start >=0; start--) {
            if(s.charAt(start) == ' ') {
                break;
            }
        }

        return end - start;
    }
}
