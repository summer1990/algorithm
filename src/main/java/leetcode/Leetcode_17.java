package leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhaorunqian on 2020/8/19.
 */
public class Leetcode_17 {

    /**
     * https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/
     * @param digits
     * @return
     */
    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.length() ==0) {
            return new ArrayList<>();
        }
        Map<String,String> mapping = new HashMap<String, String>();
        mapping.put("2", "a,b,c");
        mapping.put("3", "d,e,f");
        mapping.put("4", "g,h,i");
        mapping.put("5", "j,k,l");
        mapping.put("6", "m,n,o");
        mapping.put("7", "p,q,r,s");
        mapping.put("8", "t,u,v");
        mapping.put("9", "w,x,y,z");

        List<String> result = new ArrayList<>();

        doLetterCombinations(digits, 0, mapping, result, "");
        return result;
    }

    private void doLetterCombinations(String digits, int index, Map<String,String> mapping, List<String> result, String sb) {
        if(index == digits.length()) {
            result.add(sb.toString());
            return;
        }

        String[] letters = mapping.get(digits.charAt(index) + "").split(",");
        for(String letter : letters) {
            doLetterCombinations(digits, index+1, mapping, result, sb+letter);
        }

    }
}