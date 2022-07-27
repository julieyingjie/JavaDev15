package com.company.Static;

public class Person {

    private String name;
    private int age;
    public static int count; // 证明这个属性，属于这个类。所以需要用类名来调用。

    public Person(){
        count++;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
       Person p2 = new Person();
        System.out.println(Person.count);

    }
}
