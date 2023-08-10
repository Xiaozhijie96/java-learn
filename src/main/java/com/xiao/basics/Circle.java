package com.xiao.basics;

/**
 * description 内部类
 *
 * @author xiao
 * @version 1.0.0
 * date 2023/8/9 18:06:15
 * @since jdk 8
 */
public class Circle {

    double radius = 0;

    public Circle() {

    }

    /**
     * 成员内部类
     * 成员内部类可以无条件访问外部类的所有成员属性和成员方法（包括private成员和静态成员）
     */
    class Draw {
        /**
         * 当成员内部类拥有和外部类同名的成员变量或者方法时，会发生隐藏现象，即默认情况下访问的是成员内部类的成员。
         * 如果要访问外部类的同名成员，需要以下面的形式进行访问
         */
        double radius = 1;

        public void drawSahpe() {
            System.out.println("Circle" + Circle.this.radius);
            System.out.println("Draw" + Draw.this.radius);
        }
    }



    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle.Bean1 bean1 = circle.new Bean1();
        bean1.I++;
        Circle.Bean2 bean2 = new Circle.Bean2();
        bean2.J++;
    }

    class Bean1{
        public int I = 0;
    }

    static class Bean2{
        public int J = 0;
    }
}
