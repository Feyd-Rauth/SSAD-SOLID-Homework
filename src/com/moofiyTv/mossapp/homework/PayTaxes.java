package com.moofiyTv.mossapp.homework;

public abstract class PayTaxes {
    private int salary;

    protected PayTaxes( int salary) {
        this.salary = salary;
    }

    void calculateTax(int percentage) {
        salary = salary * percentage;
    }
}
