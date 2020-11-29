package com.lesson6;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        A a = new A();
        a.getAndPrintClassName();

        B b = new B();
        System.out.println(b.compare2Values(5,2));

    }
}

class A {
    String getAndPrintClassName(){
        class Prtn implements PrintInfo {

            @Override
            public void print(String massage) {
                System.out.println("print massage : " + massage);
            }
        }

        new Prtn().print("SHO");
        return "";
    }
}

class B {
    int compare2Values(Integer o1, Integer o2) {
        class Comp implements Comparator<Integer> {

            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) return -1;
                if (o1.equals(o2)) return 0;
                return 1;
            }
        }

        return new Comp().compare(o1, o2);
    }
}
