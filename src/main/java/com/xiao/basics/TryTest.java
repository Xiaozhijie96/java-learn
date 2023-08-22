package com.xiao.basics;

/**
 * description try 测试
 *
 * @author xiao
 * @version 1.0.0
 * date 2023/8/17 16:09:00
 * @since jdk 8
 */
public class TryTest {

    /**
     * 函数返回值实在 finally 执行之前就确定了，也就是说 finally 中的代码会在 a+1 计算之后
     * return 执行之前执行,如果 finally 中也有返回值那返回值就是 finally 的返回值
     * @param args a
     */
    public static void main(String[] args) {
//        System.out.println(tryTest1());
        System.out.println(tryTest1());
    }

    private static int tryTest1() {
        int a = 1;
        try {
            return a + 1;
        } finally {
            a = 3;
        }
    }

    private static int tryTest2(){
        int a = 1;
        try {
            return a;
        } finally {
            a = 2;
            return a;
        }
    }
}
