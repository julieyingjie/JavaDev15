package com.company.enumType;

public class Test {
    public static void main(String[] args) {

        Season s = Season.SPRING;

        switch (s){
            case SPRING:
                break;
            case SUMMER:
                break;
            case FALL:
                break;
            case WINTER:
                break;
        }
    }


//        SeasonClass season = getSeason();
//        String date = "Moon";
//        switch (season){
//            case Season.SPRING:
//                break;
//            case Season.SUMMER:
//                break;
//            case Season.FALL:
//                break;
//            case Season.WINTER:
//                break;
//        }


//        //类名.常量的方式
//        if (season == SeasonClass.SPRING){
//            System.out.println("spr.");
//        }else if (season == SeasonClass.SUMMER){
//            System.out.println("Sum.");
//        }else if (season == SeasonClass.FALL){
//            System.out.println("Aut.");
//        }else {
//            System.out.println("Win.");
//        }
//
//    }
//
//
//    public static SeasonClass getSeason(){
//        return null;
//    }

}
