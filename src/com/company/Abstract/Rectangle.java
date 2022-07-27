package com.company.Abstract;

public class Rectangle extends Shape{

    private double width;
    private double length;

    @Override
    public void calculate() {
       area = width * length;
       grith = 2 * (width + length);
    }
}
