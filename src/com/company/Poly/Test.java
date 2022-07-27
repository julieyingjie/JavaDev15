package com.company.Poly;

public class Test {
    public static void main(String[] args) {
//        test1();

        test2();
    }

    public static void test2(){
        Animal animal = new Dog(2,4);
        System.out.println(animal.leg);
        animal.speak();
    }


    //静态方法之间可以互相调用
    public static void test1(){
//        int i = 10;
//        double d = i;

        // 等号的右边，类型范围小于左边，是没问题的，不需要什么强制转换；
//        Animal animal = new Dog();
//        animal.speak(); //实现的是dog的方法
    }
}
