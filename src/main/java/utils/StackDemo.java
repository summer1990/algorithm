package utils;

import java.util.Stack;

/**
 *
 * Created by zhaorunqian on 2020/8/19.
 */
public class StackDemo {

    public static void main(String[] args) {
        /**
         * 栈是线程安全的，主要方法有4个
         */
        Stack<String> stack = new Stack<String>();

        // 弹出，栈为空时报错
        stack.pop();

        // 取栈顶元素，不弹出，栈为空时报错
        stack.peek();

        //入栈
        stack.push("123");

        //判断是否为空
        stack.isEmpty();
    }
}
