package com.company.AbstractClass;

public abstract class Bird extends Animal implements Canfly{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating");
    }

    @Override
    public void breath() {
        System.out.println(getName()+" is breathing");
    }

    @Override
    public void fly() {
        System.out.println(getName()+" Can flap wings");
    }
}
