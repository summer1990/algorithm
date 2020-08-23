package leetcode;

/**
 * Created by zhaorunqian on 2020/8/23.
 */
public class Leetcode_38 {

    public String countAndSay(int n) {
        String str = 1 + "";

        for(int i = 0; i < n-1; i++) {
            char pre = str.charAt(0);
            int count = 0;
            String newStr = "";
            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == pre) {
                    count++;
                } else {
                    newStr = newStr + count + pre;
                    pre = str.charAt(j);
                    count = 1;
                }
            }
            newStr = newStr + count + pre;
            str = newStr;
        }
        return str;
    }
}
