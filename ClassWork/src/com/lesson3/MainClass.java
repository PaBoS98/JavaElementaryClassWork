package com.lesson3;

public class MainClass {

    public static void main(String[] args) {

        posOrNeg();
        reverse();
        deleteNumber();
        firstLastCount();



    }

    public static void posOrNeg () {

        int i = 123456789;
        int sumPos = 0;

        for (int j = 0; j < i; j++) {
            if (j % 2 == 0) sumPos += j;
        }
        System.out.println(sumPos);

        sumPos = 0;
        int sumNeg = 0;
        String numbers = String.valueOf(i);
        char[] number = numbers.toCharArray();
        for (char c : number) {
            int in = Integer.parseInt(String.valueOf(c));
            if (in % 2 == 0) sumPos += in;
            if (in % 2 != 0) sumNeg += in;
        }
        System.out.println(sumPos + " > Pos \n" + sumNeg + " > Neg");
    }

    public static void reverse() {

        int number = 1234;

        String string = String.valueOf(number);
        StringBuilder sb = new StringBuilder(string).reverse();
        System.out.println(sb);

    }

    public static void deleteNumber() {

        int rem = 2;
        int number = 121212;

        String str = String.valueOf(number).replace(String.valueOf(rem), "");

        System.out.println(str);

        String[] split = String.valueOf(number).split("");

        StringBuilder res = new StringBuilder();
        for (String s : split) {
            if (Integer.parseInt(s) != rem) res.append(s);
        }
        System.out.println(res);

    }

    public static void firstLastCount() {

        int number = 123456789;
        String n = String.valueOf(number);
        System.out.println();
        System.out.println(Integer.parseInt(n.substring(0,1)) + Integer.parseInt(n.substring(n.length()-1)));
    }
}
