package com.company.staticandfinalstatement;

public class FinalTest extends SomeClass{

    public FinalTest(String name) {
        super(name);
    }
    private final int a=10000;
    public int fun()
    {
        return a+super.instanceNumber;
    }
    //We can not override the final function of base class because its final
//    @Override
//    public int fun1()
//    {
//
//    }



}
