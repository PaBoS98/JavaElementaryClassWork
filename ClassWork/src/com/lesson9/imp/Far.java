package com.lesson9.imp;

import com.lesson9.Convector;

public class Far implements Convector {
    @Override
    public int convert(int value) {
        return (int) (value * 1.8 + 32);
    }
}
