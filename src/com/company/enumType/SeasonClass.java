package com.company.enumType;
public class SeasonClass {

    //这种方式保证外部不能自己创建对象
    private SeasonClass(){}

    public static final SeasonClass SPRING = new SeasonClass();
    public static final SeasonClass SUMMER = new SeasonClass();
    public static final SeasonClass FALL = new SeasonClass();
    public static final SeasonClass WINTER = new SeasonClass();

//    public Season(String name) {
//        this.name = name;
//    }
//
//
////这种写法的问题：外界用户可以随意改动
//    public static void main(String[] args) {
//        Season season1 = new Season("Spring");
//        Season season2 = new Season("Summer");
//        Season season3 = new Season("Fall");
//        Season season4 = new Season("Winter");
//    }

//
//    private Season(String name) {
//        this.name = name;
//    }


    //这种写法的问题：外界用户可以随意改动

}

