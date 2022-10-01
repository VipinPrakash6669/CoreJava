package com.company.Main;

import com.company.referencing.constructorreferencing.ReferecingIFForConst;
import com.company.referencing.constructorreferencing.ReferencedClassForconst;
import com.company.referencing.methodreferencing.ReferencedMethodClass;
import com.company.referencing.methodreferencing.ReferencingIF;
import com.company.referencing.methodreferencing.ReferencingIFWithParam;

/*
there are three type of method references
Static method
instance method
constructor references
 */
public class MainReferencing {

    public static void main(String[] args) {
        //Type-1
        //Method ko reference kiya
        ReferencingIF referencingIF= ReferencedMethodClass::doStuff;
        referencingIF.task();
        //Creating the thread using referencing we reuse the code for creating thread
        Runnable runnable= ReferencedMethodClass::printTableOfTwo;
        Thread thread = new Thread(runnable);
        thread.start();

        //Type-2
        //non static
        ReferencedMethodClass referencedMethodClass = new ReferencedMethodClass();
        Runnable runnable1 = referencedMethodClass::printNumber;
        Thread thread1 = new Thread(runnable1);
        thread1.start();

        ReferencingIFWithParam referencingIFWithParam = referencedMethodClass::printTableOfK;
        referencingIFWithParam.task(3);

        //Type-3
        //constructor referencing
        ReferecingIFForConst referecingIFForConst = ReferencedClassForconst::new;
        referecingIFForConst.fun();


    }

}
