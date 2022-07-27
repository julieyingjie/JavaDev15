package com.company.array;

import java.util.Random;

public class arrayCreation {
    public static void main(String[] args) {
//        int[] arr = new int[]{10,20,30,90};

//        // for loop 当中，尽量不写等号。
//        for(int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }

//        for (int i = arr.length - 1; i != -1; i--) {
//            System.out.println(arr[i] + " ");
//        }


        // 超级循环
        // 这个写法的问题在于； 不能倒序，不能有间隔。只能正序挨个排列
//        for (int ele : arr) {
//            System.out.println(ele+ " ");
//        }

        int[] arr1 = new int[10];
        arr1[1] = 10; // 一种添加操作；

        // 长度为10的随机数组
        Random random = new Random();

        for (int i = 0; i < arr1.length; i++) {
            int randNum = random.nextInt(100);// 不包含100。 [0-100)。
            arr1[i] = randNum;
            System.out.print(arr1[i] + " ");
        }

        int[] arr2 = new int[5];
//        System.out.println(arr2);
        for (int i = 0; i < arr2.length; i++) {

            arr2[i] = arr1[i];
        }

        arr1 = arr2;
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
//        System.out.println("after" + arr);


        //删除方式：
        //int 0
        // double 0.0
        // char  0*0000
        // boolean : false

//        arr[1] = 0;
//        String[] strings = new String[10];
//        strings[1] = "bytetube";
//        strings[1] = null;

        //缩容操作
        //java当中，一个数组直接内存删掉？不可以。内存已经建好了

        // shift+ command + F: reformat code

        int[][] gids = new int[3][4];


    }


}
