package com.company.functionalProgramming.lambda;

//functional interface is the interface with only one abstract method(not one method one abstract)
@FunctionalInterface
public interface FunInterface {
    public void show();
    //We can define default method in functional interface just like the abstract class
    default void show2()
    {
        System.out.println("In default function of functional interface");
    }

    //We can define the static method in interface ,and it will still remain functional interface
    static void show3()
    {
        System.out.println("In static function of functional interface");
    }

    // It can contain any number of Object class methods.
    int hashCode();
    String toString();
    boolean equals(Object obj);
}
