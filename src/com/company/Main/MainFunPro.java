package com.company.Main;

import com.company.functionalProgramming.lambda.ExampleLambda;
import com.company.functionalProgramming.lambda.FIIMplementation;
import com.company.functionalProgramming.lambda.FunInterface;
import com.company.functionalProgramming.lambda.SecondFI;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;

public class MainFunPro {
    public static void main(String[] args) {
//===================================================================================================
        ExampleLambda exampleLambda = new ExampleLambda();
        exampleLambda.generateList();
        exampleLambda.print();
        exampleLambda.sortList();
        System.out.println();
        exampleLambda.print();
//===================================================================================================
        //We can define the dunction of interface using three type

        //Type-1
        // by giving the implementation of the FI class
        FunInterface funInterface = new FIIMplementation();
        funInterface.show();

        //We can declare and define default method in interface it just like abstract class
        // and it will still remain functional interface
        funInterface.show2();
        //We can define the static method in interface and it will still remain functional interface
        FunInterface.show3();


        //Type-2
        // by not giving the implementation of FI class implementing it by anonymous class(class with no name)
        SecondFI secondFI = new SecondFI()
        {
            public void printHello() {
                System.out.println("hello second FI");
            }
        };
        secondFI.printHello();

        //Type-3
        /*
        new SecondFI()
        {
            public void printHello
        }
        This is boiler plate code because it is obvious for any functional interface implementation
        but () these braces are not boiler plate these are very much required hence we can write above
        code in new form using -> arrow
         */
        SecondFI secondFI1=()->{
            System.out.println("Hello lambda expression");
        };
        /*
        here () is the method declaration
        ********Imp
        lambda expressions are a way to implement interfaces without making a new class.
         */

    }
}
