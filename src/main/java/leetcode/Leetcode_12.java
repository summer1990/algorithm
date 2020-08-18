package leetcode;

/**
 * Created by zhaorunqian on 2020/8/18.
 */
public class Leetcode_12 {

    /**
     * https://leetcode-cn.com/problems/integer-to-roman/
     * @param num
     * @return
     */
    public String intToRoman(int num) {

        int[] tenNums = new int[]{1, 4, 5, 9, 10, 40, 50, 90, 100, 400 ,500, 900, 1000};
        String[] romanNums = new String[]{"I", "IV", "V", "IX", "X", "XL","L","XC","C", "CD","D","CM", "M"};

        StringBuilder sb = new StringBuilder();

        int index = tenNums.length - 1;
        while (index >= 0) {
            if(num >= tenNums[index]){
                sb.append(romanNums[index]);
                num -= tenNums[index];
            } else {
                index--;
            }
        }
        return sb.toString();
    }
}