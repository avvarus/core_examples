package com.company.training;

public class Arithmetic1 {
    private int a, b;

    public Arithmetic1() {
        a = 10;
        b = 9;
    }

    public Arithmetic1(int x, int y) {
        a = x;
        b = y;
    }

    public Arithmetic1(int m) {
        //a=10;
        this(m, m + 10);
    }

    void show() {
        System.out.println(" a value :" + a);
        System.out.println(" b value :" + b);
    }
}


