package com.lesson6;

public class CloneTest implements Cloneable {

    public Integer getI() {
        return i;
    }

    private Integer i = 0;

    public CloneTest(Integer i) {
        this.i = i;
    }

    public void setI(Integer i) {
        this.i = i;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("run clone method");
        return super.clone();
    }
}
