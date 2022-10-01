package com.company.thisvssuper;

public class Rectanglee extends Shape{
    private int width;
    private int height;

    public Rectanglee(int x,int y)
    {
        this(x,y,0,0);
    }
    public Rectanglee(int x,int y,int width,int height)
    {
//        super variable refers immediate parent class instance.
//        super variable can invoke immediate parent class method.
//        super() acts as immediate parent class constructor and should be the first line in child class constructor.
        //super is like th object of super class in base class.
        super(x, y);
        super.fun();
        super.z=10;
        this.height=height;
        this.width=width;
    }
}
