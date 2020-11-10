package com.lesson2;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("Hello world...");

        String str1 = "String1";
        String str2 = new String("String2");
        String str3 = new String(new char[]{'s', 't', 'r', 'i', 'n', 'g', '3'});
        String str4 = new String(new char[]{'s', 't', 'r', 'i', 'n', 'g', '4'}, 3, 2);

        System.out.println(str1 + " " + str1.length());
        System.out.println(str2 + " " + str2.length());
        System.out.println(str3 + " " + str3.length());
        System.out.println(str4 + " " + str4.length());
    }


}
