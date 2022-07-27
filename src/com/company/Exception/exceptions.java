package com.company.Exception;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;

public class exceptions {

    public static void main(String[] args) {

    }

    public static void test1(){
//        FileOutputStream fos = new FileOutputStream("/Users/juliejia/Desktop/finally.txt")

//        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-mm-dd");

        //java.text.ParseException
//        fmt.parse("2022/07/26");

        //java.lang.InterruptedException
//        Thread.sleep(1000);

        Class aClass = null;

        try {
            aClass = Class.forName("com.company.Exception.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
