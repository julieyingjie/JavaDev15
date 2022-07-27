package com.company.oop;

public class Car {


    //一般情况下，属性私有化，方法公有化
    private String color;
    private double price;
    private String band;
    private Engine engine;


    //Nested Classes: 内部类
    // static 都会当成工具类来使用，不定义，也可以。
    private class Engine{

        private int count;// (缸数)
        private int year;

    }

    public static void main(String[] args) {

        // impossible to write : private Car car = new Car();
        Car car = new Car();
    }
}
