package com.company.staticMethodAndVariable;

public class Calculator {
    private int a;
    private int b;
    //static variable c will be same for all objs of calculator class
    //only one instance of that static member is created which is shared across all instances of the class
    private static int c;

    public static void printSum(int a ,int b) {
        //we cant use this here because we cant instantiate the printsum method of the calculator class
        //this.b=b;
        System.out.println(a+b);
    }
    public void printdiff(int a ,int b) {
        this.b=b;
        System.out.println(a-b);
    }
}
