package com.xiao.basics;

/**
 * description 位移测试
 *
 * @author xiao
 * @version 1.0.0
 * date 2023/9/13 16:09:10
 * @since jdk 8
 */
public class DisplacementTest {


    /**
     * 左移测试
     * 左移运算符号 << 表示把二进制位先左移动后面补 0
     *
     * @param number         数字
     * @param moveLeftNumber 左移数
     */
    private static void moveLeftTest(int number, int moveLeftNumber) {
        int moveLeft = number << moveLeftNumber;
        System.out.println(number + "的二进制为：" + Integer.toBinaryString(number));
        System.out.println(number + "位移" + moveLeftNumber + "的二进制为：" + Integer.toBinaryString(moveLeft));
    }

    /**
     *  1 左移 4 位，二进制位像左移动 4 位，表示 1 的二进制位后面补 4 个 0
     *  1 的二进制为：0000 0001
     *  1 << 4 的二进制为：0001 0000
     */
    private static void moveLeft4() {
        moveLeftTest(1, 4);
    }

    /**
     *  1 左移 32 位，二进制位像左移动 32 位
     *  当int类型进行左移操作时，左移位数大于等于32位操作时，会先求余（%）后再进行左移操作。
     *  也就是说左移32位相当于不进行移位操作
     *  1 的二进制为：0000 0001
     *  1 << 32 的二进制为：0000 0001
     */
    private static void moveLeft32() {
        moveLeftTest(1, 32);
    }

    /**
     *  1 左移 36 位，二进制位像左移动 36 位
     *  当int类型进行左移操作时，左移位数大于等于32位操作时，会先求余（%）后再进行左移操作。
     *  1 左移 36 位 = 36%32 = 4 也就是位移 4 位
     *  1 的二进制为：0000 0001
     *  1 << 32 的二进制为：0000 0001
     */
    private static void moveLeft36() {
        moveLeftTest(1, 36);
    }

    public static void main(String[] args) {
        moveLeft32();
        moveLeft32();
        moveLeft36();
    }
}
