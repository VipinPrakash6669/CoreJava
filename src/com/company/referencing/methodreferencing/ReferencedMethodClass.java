package com.company.referencing.methodreferencing;


//Method references are special type of lambda expressions
//The biggest advantage of referencing is code re-usability
/*
there are three type of method references
Static method
instance method
constructor references
 */
public class ReferencedMethodClass {
    public static void doStuff()
    {
        System.out.println("I am doing some stuff");
    }

    public static void printTableOfTwo()
    {
        System.out.println("Table of two");
        for (int i = 1; i <=10 ; i++) {
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println(2*i);
        }
    }
    public void printNumber()
    {
        System.out.println("Printing number");
        for (int i = 1; i <=10 ; i++) {
            System.out.println(" "+i);
        }
    }

    public void printTableOfK(int k)
    {
        System.out.println("Printing the table of "+k);
        for (int i = 1; i <=10 ; i++) {
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println(k*i);
        }
    }
}
