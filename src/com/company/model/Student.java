package com.company.model;

import com.company.oop.Person;

public class Student extends Person {
    public int no;
    public double grade;


    // 没必要写，系统会自动提供给我们。
    public Student(){
        super(10);
    }

    public Student(int no, double grade){
        super(10); // 父类的这个必须放在第一行；
        this.no = no;
        this.grade = grade;
    }

//    public Student(int age) {
//        super(age);
//    }

    public void walk(){
        super.run();
        this.func();
    }

    public void func(){

    }

    public static void main(String[] args) {
        Student student = new Student();


    }


}
