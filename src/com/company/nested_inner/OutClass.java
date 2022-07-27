package com.company.nested_inner;

public class OutClass {


    private int a = 1;
    private static int b = 2;

    public void test1(){
        int c = 3;
        class LocalClass{
//            int f = 10;

            //          private  final int b = 2;
            private static final int d = 2;

            public void test2(){
                System.out.println(a + b + c + d) ; // 不自动生效；
                test3();
            }

        }

        new LocalClass().test2(); // 少了这个，不会自动生效。类必须先创造对象，才能调用。

        }

        public void test3(){
            System.out.println("Outclass test3");
        }

    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        outClass.test1();
    }



}
