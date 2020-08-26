package leetcode;

/**
 * Created by zhaorunqian on 2020/8/24.
 */
public class Leetcode_43 {

    /**
     * https://leetcode-cn.com/problems/multiply-strings/submissions/
     * @param num1
     * @param num2
     * @return
     */
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")){
            return "0";
        }

        String result = "0";
        for(int i = num2.length() - 1; i >= 0; i--) {
            String tempStr = mutiplySingle(num1, num2.charAt(i));
            for (int j = 0; j< num2.length() -1 -i; j++) {
                tempStr = tempStr + "0";
            }
            result = add(result, tempStr);
        }
        return result;
    }

    private String add(String num1, String num2) {
        String result = "";
        if(num1.length() > num2.length()) {
            int gap = num1.length() - num2.length();
            for(int i = 0; i < gap; i++) {
                num2 = "0" + num2;
            }
        } else if(num1.length() < num2.length()) {
            int gap = num2.length() - num1.length();
            for(int i = 0; i < gap; i++) {
                num1 = "0" + num1;
            }
        }
        boolean overflow = false;
        for(int i = num1.length() - 1; i >= 0 ; i--) {
            int num1Char = num1.charAt(i) - '0';
            int num2Char = num2.charAt(i) - '0';

            int temp = num1Char + num2Char;
            if(overflow) {
                temp += 1;
            }
            if(temp >= 10) {
                temp = temp%10;
                overflow = true;
            } else {
                overflow = false;
            }

            result = temp + result;
        }
        if(overflow) {
            result = "1" +result;
        }
        return result;
    }

    private String mutiplySingle(String num1, char num2) {
        if(num2 == '0') {
            return "0";
        }
        int num2Int = num2- '0';
        boolean overflow = false;
        String result = "0";
        for(int i = num1.length()-1; i >=0 ; i--) {
            String temp = (num1.charAt(i) - '0') * num2Int + "";
            for (int j = 0; j < num1.length()- 1 -i; j++) {
                temp = temp + "0";
            }

            result = add(result, temp);
        }
        return result;
    }
}
