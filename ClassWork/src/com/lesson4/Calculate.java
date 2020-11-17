package com.lesson4;

public class Calculate {

    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[2]);

        switch (args[1]) {
            case "+":
                System.out.println(plus(a, b));
                break;
            case "-":
                System.out.println(minus(a, b));
                break;
            case "*":
                System.out.println(mnoj(a, b));
                break;
            case "/":
                System.out.println(del(a, b));
                break;
        }


    }

    public static int plus(int a, int b) {

        int res = a + b;

        return res;
    }

    public static int minus(int a, int b) {

        int res = a - b;

        return res;
    }

    public static int mnoj(int a, int b) {

        int res = a * b;

        return res;
    }

    public static int del(int a, int b) {

        int res = a / b;

        return res;
    }
}
