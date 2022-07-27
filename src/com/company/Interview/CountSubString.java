package com.company.Interview;

public class CountSubString {


    public static void main(String[] args) {
        System.out.println(countSubString("hello world hello java", "hello"));
    }






    // 返回每次这个Pattern 出现的第一个index
    public static int[] indexOf(String text, String pattern){
        int[] indexArray = new int[3];


        return indexArray;
    }

    public static int countSubString(String text, String pattern) {

        if (text == null || pattern == null || text.length() == 0 || pattern.length() == 0
                || text.length() < pattern.length()) return 0;

        int index = -1;
        int count = 0;

        while ((index = text.indexOf(pattern)) != -1) {
            count++;
            text = text.substring(index + 1);
        }

        return count;
    }


}
