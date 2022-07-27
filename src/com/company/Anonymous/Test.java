package com.company.Anonymous;

public class Test {
    public static void main(String[] args) {
//        Animal animal = new Dog();


        //匿名类的写法
        Animal animal = new Animal(){
            public void run(){
                System.out.println("Animal Run");
            }
        };

        animal.run();

        // 甚至可以
        new Animal(){
            public void run(){
                System.out.println("Animal Run");
            }
        }.run();



    }
}
