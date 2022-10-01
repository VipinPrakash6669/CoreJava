package com.company.Main;

import com.company.AbstractClass.*;
import com.company.Interface.DeskPhone;
import com.company.Interface.ITelephone;
import com.company.Interface.MobilePhone;
import com.company.staticandfinalstatement.FinalTest;
import com.company.staticandfinalstatement.SomeClass;
import com.company.staticandfinalstatement.StaticTest;

public class Main2 {
    public static int multiplier=7;
    public static void main(String[] args) {
        //interfaces
        System.out.println("In the interface");
        ITelephone iTelephone;
        DeskPhone deskPhone= new DeskPhone(1234);
        iTelephone=deskPhone;
        iTelephone.powerOn();
        iTelephone.callPhone(1234);
        iTelephone.answer();

        iTelephone =new MobilePhone(12345);
        iTelephone.powerOn();
        iTelephone.callPhone(12345);
        iTelephone.answer();
        iTelephone.dial(12345);
//====================================================================================
        //abstract classes
        System.out.println();
        System.out.println("in abstract area");
        Dog dog = new Dog("pug ");
        dog.eat();
        dog.breath();

        Parrot parrot= new Parrot("Parrot");
        parrot.eat();
        parrot.breath();
        parrot.fly();

        Penguin penguin =new Penguin("My Penguin");
        penguin.fly();
        Canfly.jump();
//=========================================================================================
        //static and final statement
        /*
        non static field multiplier can't be referenced from a static Context.
So if multiply is public, then why can't we access it from our main method?
Well as we've seen, normal class fields require an instance of the class
that don't actually exist until an instance has been created.
Now the main method Is static as we can see.
And it can be called with the class instance.
So as a result, Java can't allow a static method to access non-static fields or
methods because frankly they don't exist when the static Methods called.
         */

        //class ka instance banaye to us object se static function nhi access hoga to us static function k andr
        // se non static nhi call kr skte agr hme stattic k andr se koi function call krna hi to non static hogna chahiye
        // vo function
        StaticTest staticTest= new StaticTest(" first Instance");
        System.out.println(staticTest.getName()+" "+staticTest.getNumInstances());
        StaticTest staticTest1= new StaticTest(" Second Instance");
        System.out.println(staticTest1.getName()+" "+staticTest1.getNumInstances());
        System.out.println(StaticTest.getNumInstances());

        System.out.println(multiply(6));

        //final
        SomeClass someClass =new SomeClass("one");
        SomeClass someClass1 = new SomeClass("Two");
        SomeClass someClass2 = new SomeClass("Three");
        //there will be variable with final keyword for each instance with a constant value at initialization
        //Static will have the common variable with each object
        //final is object level and static is class level
        // static final krne ka mtlb sare object ko ek constant value dikhegi
        System.out.println(someClass2.getInstanceNumber());
        System.out.println(someClass1.getInstanceNumber());
        System.out.println(someClass.getInstanceNumber());
        System.out.println(SomeClass.getClassCounter());


        FinalTest finalTest = new FinalTest("one");


        //We can call static member of base class by the inherited class name
        System.out.println(FinalTest.getClassCounter());
        System.out.println(finalTest.getInstanceNumber());

        System.out.println(finalTest.fun());
    }

    public static int multiply(int number)
    {
        return number*multiplier;
    }
}
