package com.company.oop;

public class Dog {

    public int age;
    public double weight;
    public int legs = 4;

    // Spring ioc proxy 代理模式来做，其中必须提供无参构造方法

    public Dog(){
        System.out.println("Dog no-argument constructor");
    };

    public Dog(int a){
        age = a;
    }

    public Dog(int a, double b){
        age = a;
        weight = b;
    }



    //方法会存在方法区, method area
    // 方法区，只保存方法的一份内存
    public void run(){
        System.out.println(age + "_" + weight + " run ");
    }

    public void eat(String food){
        System.out.println(age + "_ " + weight + " eat " + food);
    }



}
