package com.lesson10;

public class StringBufAndBuild {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Test SB");
        System.out.println(sb);

        sb.append(" str");
        System.out.println(sb.reverse());
        System.out.println(sb.charAt(0));
        sb.setCharAt(0, 'R');
    }
}
