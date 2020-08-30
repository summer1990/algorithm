package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaorunqian on 2020/8/30.
 */
public class Leetcode_89 {


    /**
     * https://leetcode-cn.com/problems/gray-code/submissions/
     * @param n
     * @return
     */
    public List<Integer> grayCode(int n) {

        List<Integer> result = new ArrayList<Integer>();
        result.add(0);
        int head = 1;
        for(int i = 0 ; i < n; i++) {
            for(int j = result.size() - 1; j >= 0; j--) {
                result.add(head + result.get(j));
            }
            head <<= 1;
        }

        return result;
    }
}
