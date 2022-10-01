package com.company.AbstractClass;

public class Penguin extends Bird{

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly()
    {
        super.fly();
        System.out.println("but not able to fly");
    }
}
