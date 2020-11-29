package com.lesson6.constr;

public class A {

    public A() {
        System.out.println("A");
    }
}

class B extends A{

    public B() {
        System.out.println("B");
    }
}

class C extends B{

    public C() {
        System.out.println("C");
    }
}

class D extends C{

    public D() {
        System.out.println("D");
    }
}
