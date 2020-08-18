package leetcode;

/**
 * Created by zhaorunqian on 2020/8/18.
 */
public class Leetcode_14 {

    /**
     * https://leetcode-cn.com/problems/longest-common-prefix/
     * @param strs
     * @return
     */
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) {
            return "";
        }
        int i = 0;
        boolean end = false;
        for(; i < strs[0].length() && !end;) {
            for(int j = 1; j < strs.length; j++) {
                if(i >= strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i)) {
                    end = true;
                    break;
                }
            }
            if(!end) {
                i++;
            }
        }

        return strs[0].substring(0,i);
    }
}
