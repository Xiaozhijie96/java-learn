package com.xiao.basics;

/**
 * Description String相关 <br>
 *
 * @author xiao <br>
 * date  2023/2/23 11:46:15
 * @version 1.0.0
 * @since jdk 17
 */
public class StringTest {


    public static void main(String[] args) {
        test1();
        test2();
        replaceTest();
    }

    /**
     * description replaceFirst、replaceAll、replace区别
     * replace 替换所有
     * replaceFirst 替换第一个,可以使用正则表达式
     * replaceAll 替换所有,可以使用正则表达式
     *
     * @author xiao
     * date  17:02:55
     */
    private static void replaceTest() {
        String str = "ab1ad3ede";
        System.out.println(str.replace("a", "A"));
        System.out.println(str.replaceAll("\\d", "A"));
        System.out.println(str.replaceFirst("\\d", "H"));

    }

    /**
     * description 创建字符串的几种常见方法
     *
     * @author xiao
     * date  14:47:51
     */
    private static void test1() {
        String str1 = "Hello";
        String str2 = new String("Hello");
        char[] str3 = {'H', 'e', 'l', 'l', 'o'};
        String str4 = new String(str3);
        String str5 = "Hello";
        String str6 = new String("Hello");
        // jdk17新特性 文本块语法
        String json = """
                {
                    "name": "张三",
                    "sex": 1
                }
                """;
        
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str1 == str2);
        System.out.println(str1 == str4);
        System.out.println(str2 == str4);
        System.out.println(str1 == str5);
        System.out.println(str2 == str6);
        System.out.println(json);
    }

    /***
     * description 字符串累加耗时
     * 用时从短到长的对比是
     * StringBuilder < StringBuffer < concat < +
     *
     * @author xiao
     * date  14:37:32
     */
    private static void test2() {
        String string = "Hello Word";
        String string1 = "";
        StringBuffer stringBuffer = new StringBuffer(string1);
        StringBuilder stringBuilder = new StringBuilder(string);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            string1 += string;
        }
        System.out.println("String累加用时:" + (System.currentTimeMillis() - start) + "ms");
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stringBuffer.append(string);
        }
        System.out.println("StringBuffer累加用时:" + (System.currentTimeMillis() - start2) + "ms");
        long start3 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stringBuilder.append(string);
        }
        System.out.println("StringBuilder累加用时:" + (System.currentTimeMillis() - start3) + "ms");
        long start4 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            string1 = string1.concat(string);
        }
        System.out.println("concat累加用时:" + (System.currentTimeMillis() - start4) + "ms");
    }

}
