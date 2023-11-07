package com.xiao.basics;

/**
 * description 异或测试
 *
 * @author xiao
 * @version 1.0.0
 * date 2023/10/13 14:48:39
 * @since jdk 8
 */
public class XorTest {

    /**
     * 在不引入第三个变量的情况下，交换两个变量的值（整数）
     */
    private static void replaceNumber() {
        int a = 3, b = 5;
        System.out.println("交换前 a=" + a);
        System.out.println("交换前 b=" + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("交换后 a=" + a);
        System.out.println("交换后 b=" + b);
    }

    public static void main(String[] args) {
        replaceNumber();
    }
}
