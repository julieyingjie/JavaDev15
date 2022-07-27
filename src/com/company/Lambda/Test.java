package com.company.Lambda;

import java.util.concurrent.Callable;

public class Test {

    public static void main(String[] args) {

        //jdk 8
        /*
        * Lambda 的语法：
        * 参数列表 -> {
        *
        *    方法体
        * }
        *
        * 将一个匿名类，简化
        */

        Calculator.execute(10, 20, new Calculator() {
            @Override
            public int calculate(int v1, int v2) {
                return v1 + v2;
            }
        });


       Calculator.execute(10,20,(int v1, int v2) -> {
           return v1 + v2;
        });

       //最精简的函数式编程
       Calculator.execute(11,22,((v1, v2) -> v1 + v2));
    }
}
