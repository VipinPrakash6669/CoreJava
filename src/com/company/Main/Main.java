package com.company.Main;

import com.company.AutoboxingAndInboxing.AutoboxingAndInboxing;
import com.company.Interface.DeskPhone;
import com.company.Interface.ITelephone;
import com.company.Interface.MobilePhone;
import com.company.LinkedList.LinkedListExample;
import com.company.staticMethodAndVariable.Calculator;
import com.company.thisvssuper.Rectangle;
import com.company.thisvssuper.Rectanglee;
import com.company.thisvssuper.Shape;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        //this and super
        Rectanglee rectanglee= new Rectanglee(1,2);
        rectanglee.fun();
//------------------------------------------------------------------------------------
        //static method and variable\
        //Static in the different class call directly by class name no need of instantiation
        Calculator.printSum(10,20);
        //for non-static create instance
        Calculator calculator= new Calculator();
        calculator.printdiff(20,10);

        //static of the same class call func directly no need of instantiation
        fun();
//------------------------------------------------------------------------------------
        //AutoboxingAndInboxing
        AutoboxingAndInboxing autoboxingAndInboxing = new AutoboxingAndInboxing();
        autoboxingAndInboxing.fun();
//------------------------------------------------------------------------------------
        //LinkedList
        System.out.println("In Linked List");
        LinkedListExample linkedListExample= new LinkedListExample();
        LinkedList<String> list=linkedListExample.generateSortedList();
        linkedListExample.printList(list);
//------------------------------------------------------------------------------------


    }


    public static void fun()
    {
        System.out.println("Example of static method");
    }
}
