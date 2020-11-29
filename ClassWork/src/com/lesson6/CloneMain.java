package com.lesson6;

public class CloneMain {
    public static void main(String[] args) throws CloneNotSupportedException {

        CloneTest ct = new CloneTest(12);


        CloneTest ct1 = (CloneTest) ct.clone();
        ct1.setI(54);

        System.out.println(ct.getI());
        System.out.println(ct1.getI());

    }
}
