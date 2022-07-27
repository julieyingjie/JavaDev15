package com.company.Sort;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] randArray = getRandArray(10, 1000);
        printArray(randArray);
        //默认是个升序排列
        Arrays.sort(randArray);
        printArray(randArray);
    }


    public static int[] getRandArray(int size, int bound){
        int[] arr = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++){
            int randNum = random.nextInt(bound) - random.nextInt(bound); // 这个区间的取值范围是：[1, bound)
            // 注意：左闭右开

            arr[i] = randNum;
        }

        return arr;


    }

    public static void printArray(int[] arr){
        for (int element:arr) {
            System.out.print(" " + element + " ");
        }

        System.out.println();
    }
}
