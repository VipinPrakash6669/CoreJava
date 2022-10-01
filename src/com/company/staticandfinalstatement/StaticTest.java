package com.company.staticandfinalstatement;

//a static field which is also known as a class variable
//is associated with the class rather than with any particular instance of it, so
//it's only ever one copy of the variable in memory.
//All instances of the class share that one class variable.
public class StaticTest {
    private static int numInstances=0;
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numInstances++;
    }

    public static int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }
}
