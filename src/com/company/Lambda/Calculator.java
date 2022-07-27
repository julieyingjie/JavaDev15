package com.company.Lambda;

public interface Calculator {

    int calculate(int v1, int v2);

    static void execute(int v1, int v2, Calculator c){
        System.out.println(c.calculate(v1, v2));
    }
}
