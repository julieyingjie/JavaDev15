package com.company.Abstract;

public class Test {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
//        System.out.println(circle.getArea());
//        System.out.println(circle.getGrith());
        circle.show();
        System.out.println(circle.getArea());
        System.out.println(circle.getGrith());
    }
}
