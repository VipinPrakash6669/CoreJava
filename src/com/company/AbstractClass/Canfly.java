package com.company.AbstractClass;

public interface Canfly {
    void fly();
    int a =0;
    //we can define method in the interface using the public and default keyword
    //we use static because we cant instantiate the interface
    static void jump()
    {
        System.out.println("I can jump");
    }

}
