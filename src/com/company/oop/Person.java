package com.company.oop;

public class Person {

//    public int age;
    private int age;
    private String name;




//    public Person(){
//
//    }

    public Person(int age){
        this.age = age;
    }


    protected void run() {
        System.out.println("Person run");
    }

    //提供相应getter setter来提供修改或获取的可能性
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "name: " + name + "  age: " + age ;
    }
}
