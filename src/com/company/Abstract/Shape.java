package com.company.Abstract;

public class Shape {

    protected double area;
    protected double grith;

    public double getArea(){
        return area;
    }

    public double getGrith(){
        return grith;
    }

    public void calculate(){}

    public void show(){
        this.calculate();
        System.out.println("area: " + area + " grith: " + grith);
    }




}
