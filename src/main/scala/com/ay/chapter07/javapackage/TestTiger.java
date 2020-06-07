package com.ay.chapter07.javapackage;

public class TestTiger {
    public static void main(String[] args) {
        //使用xm的Tiger
        com.ay.chapter07.javapackage.xm.Tiger tiger01 = new com.ay.chapter07.javapackage.xm.Tiger();
        //使用xh的Tiger
        com.ay.chapter07.javapackage.xh.Tiger tiger02 = new com.ay.chapter07.javapackage.xh.Tiger();

        System.out.println("tiger01=" + tiger01 + "tiger02=" + tiger02);
    }
}
