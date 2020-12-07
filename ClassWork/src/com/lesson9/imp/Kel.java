package com.lesson9.imp;

import com.lesson9.Convector;

public class Kel implements Convector {
    @Override
    public int convert(int value) {
        return value + 273;
    }
}
