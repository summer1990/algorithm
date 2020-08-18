package leetcode;

/**
 * Created by zhaorunqian on 2020/8/18.
 */
public class Leetcode_13 {

    /**
     * https://leetcode-cn.com/problems/roman-to-integer/
     * @param s
     * @return
     */
    public int romanToInt(String s) {
        int result = 0;
        int[] tenNums = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanNums =  new String[]{"M", "CM","D","CD", "C", "XC", "L", "XL", "X","IX","V", "IV", "I"};

        int index = 0;
        while (index < tenNums.length) {
            if (s.startsWith(romanNums[index])){
                result += tenNums[index];
                s = s.substring(romanNums[index].length());
            }else {
                index++;
            }
        }
        return result;
    }
}
