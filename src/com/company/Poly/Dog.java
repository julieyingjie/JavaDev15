package com.company.Poly;

public class Dog extends Animal{

    int leg;

    public Dog(int leg, int dogLeg) {
        super(leg);
        this.leg = dogLeg;
    }

    @Override
    public void speak() {
        System.out.println("Wangwang");
    }
}
