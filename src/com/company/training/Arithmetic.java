package com.company.training;

// this is non executable program because there is no main method..
public class Arithmetic {
    private int a = 10;
    private int b = 20;
    private int c = 30;

    //private int a,b,c;


    public int biggest() {
        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }

    }

    public double mean() {
        return (a + b + c) / 3;
    }

    void show() {
        System.out.println(" a value :" + a);
        System.out.println(" b value :" + b);
        System.out.println(" c value :" + c);
    }
}

/*
if( condition) 
{
		true part
}
else  {
	false part
}

switch(condition)
{
    case const1 :
					statements,...
					break;
    case  const2:
					statements,....
				    break;

     default:     
     		statements,....
		
}

*/



