package com.xiao.basics;

/**
 * description 测试类
 *
 * @author xiao
 * @version 1.0.0
 * date 2023/8/9 15:20:24
 * @since jdk 8
 */
public class Test {

    static class A{
        public void show(){
            show2();
        }
        public void show2(){
            System.out.println("A");
        }

    }

    static class B extends A{

        public void show2(){
            System.out.println("B");
        }
    }

    public static void main(String[] args) {
        A a=new A();
        a.show();
        B b=new B();
        b.show();

    }
}
