package leetcode;

import java.util.*;

/**
 * Created by zhaorunqian on 2020/8/24.
 */
public class Leetcode_49 {

    /**
     * https://leetcode-cn.com/problems/group-anagrams/
     * @param strs
     * @return
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> strMap = new HashMap<>();
        for(String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            if(strMap.get(sortedStr) != null) {
                strMap.get(sortedStr).add(str);
            } else {
                List<String> newList = new ArrayList<>();
                newList.add(str);
                strMap.put(sortedStr, newList);
            }
        }
        return new ArrayList<>(strMap.values());
    }
}
