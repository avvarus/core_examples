package com.company.training;

public class Sample4 {
    int a = 10;
    int b = 20;

    public static void main(String args[]) {

        System.out.println("Starting main method...");
        Sample4 s = new Sample4();
        s.demo();
        s.add();
        System.out.println("main process is over...");
    }

    public void demo() {

        System.out.println("execution of demo method...");
    }

    public void add() {

        System.out.println(" addition value :" + (a + b));  //(this.a + this.b)
    }
}



