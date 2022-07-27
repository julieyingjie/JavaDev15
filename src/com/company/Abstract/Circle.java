package com.company.Abstract;

public class Circle extends Shape{
    private double radius;


    public Circle(double radius){
        this.radius = radius;
    }

    public void calculate(){
        area = Math.PI * radius * radius;
        grith = 2 * Math.PI * radius;
    }


}
