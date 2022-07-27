package com.company;

public class Main {

    public static void main(String[] args) {

        testString();
        testStringBuilder();

        String s;


//        String s1 = "Jul";
//        String s2 = new String("Jul");
//        String s3 = new String(s1);
//        String s4 = new String(s2);
//        System.out.println(s1 == s2);//T
//        System.out.println(s1 == s3);//T
//        System.out.println(s1 == s4);//T

    }

    public static void test8(){
        String s1 = "123";
        s1 += "456";

        StringBuilder s = new StringBuilder();
        s.append("123");
        s.append("456");

        // == s.append("123").append("456");


    }





    public static void testStringBuilder(){
        StringBuilder sb = new StringBuilder();
        long begin = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++){
           sb.append(i);
        }

        long end = System.currentTimeMillis();
        System.out.println("StringBuilder: " + (end - begin));

    }

    public static void testString(){

        long begin = System.currentTimeMillis();

        String str = "";
        for (int i = 0; i < 1000; i++){
            str += i;
        }

        long end = System.currentTimeMillis();
        System.out.println("String: " + (end - begin));

    }
}
