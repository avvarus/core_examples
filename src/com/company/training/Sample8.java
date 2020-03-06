package com.company.training;

public class Sample8 {
    public static void main(String args[]) {

	/*	System.out.println("args[0] : " + args[0]);
		System.out.println("args[1] : " + args[1]);
		System.out.println("args[2] : " + args[2]);
	*/

        System.out.println("number of command line arguments :" + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[ " + i + " ] :" + args[i]);
        }


    }

}
