package leetcode;

/**
 * Created by zhaorunqian on 2020/8/28.
 */
public class Leetcode_67 {


    public String addBinary(String a, String b) {
        if(a.length() > b.length()) {
            String t = a;
            a = b;
            b = t;
        }

        while(b.length() > a.length()) {
            a = "0" + a;
        }

        String result = "";
        boolean levelUp = false;
        for(int i = a.length() - 1 ; i >= 0; i--) {
            char aChar = a.charAt(i);
            char bChar = b.charAt(i);

            int sum = aChar - '0' + bChar - '0';
            if(levelUp) {
                sum += 1;
                levelUp = false;
            }

            if(sum >= 2){
                sum -= 2;
                levelUp = true;
            }
            result = sum + result;
        }

        if(levelUp) {
            result = "1" + result;
        }

        return result;
    }

    public static void main(String[] args) {
        new Leetcode_67().addBinary("1", "111");
    }
}
