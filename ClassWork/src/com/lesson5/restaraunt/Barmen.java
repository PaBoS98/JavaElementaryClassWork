package com.lesson5.restaraunt;

import java.math.BigDecimal;

public class Barmen extends Staff{

    private BigDecimal tips;
    private boolean healthBook;
    private String code;

    public BigDecimal getTips() {
        return tips;
    }

    public void setTips(BigDecimal tips) {
        this.tips = tips;
    }

    public boolean isHealthBook() {
        return healthBook;
    }

    public void setHealthBook(boolean healthBook) {
        this.healthBook = healthBook;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
