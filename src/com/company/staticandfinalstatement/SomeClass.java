package com.company.staticandfinalstatement;

public class SomeClass {
    private static int classCounter=0;
    public static int getClassCounter() {
        return classCounter;
    }

    //Same for every object no different initialization for different object class level constant entity
    public static final int classCounter1=0;
    public static final int returnStaticFinal()
    {
        return classCounter1;
    }


    public final int instanceNumber;
    private final String name;



    public SomeClass(String name) {

        classCounter++;
        instanceNumber = classCounter;
        this.name = name;
        System.out.println(name+" created instance is "+ instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }

    public final int fun1()
    {
        return 2*instanceNumber;
    }

    public static String fun2()
    {
        return "Vipin";
    }
}
