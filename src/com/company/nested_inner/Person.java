package com.company.nested_inner;

public class Person{
    private static int age = 10;

    public static class Hand{
//        private static final int weight = 8;

        private int weight = 8;

        private void func(){

//            System.out.println(age);
////            age
//            outFunc();

            System.out.println(age);
        }


    }

    public void outFunc(){
        new Hand().func();
        System.out.println(new Hand().weight);
        System.out.println(Person.this.age);
    }

    public static void main(String[] args) {
        Person person = new Person();
//       Wrong:  Hand hand = new Hand();

//        Hand hand = person.new Hand();
//       Wrong: System.out.println(hand.age);


    }

}
