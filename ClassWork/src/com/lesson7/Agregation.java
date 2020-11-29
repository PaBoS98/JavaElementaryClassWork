package com.lesson7;

public class Agregation {
    public static void main(String[] args) {

        Radio1 radio = new Radio1("102.2 - Feel");

        Car1 car1 = new Car1(radio);
        Car1 car2 = new Car1(radio);

        System.out.println(car1.getRadio1().getName());
        System.out.println(car2.getRadio1().getName());

        radio.setName("102.2 - Fell");

        System.out.println(car1.getRadio1().getName());
        System.out.println(car2.getRadio1().getName());

        car1.getRadio1().setName("My radio");
        System.out.println(car1.getRadio1().getName());
        System.out.println(car2.getRadio1().getName());


    }
}

class Car1 {
    private Radio1 radio1;

    public Car1 (Radio1 radio1) {
        this.radio1 = radio1;
    }

    public Radio1 getRadio1() {
        return radio1;
    }
}

class Radio1 {
    private String name;
    public Radio1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
