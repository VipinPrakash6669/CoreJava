package com.company.Main;

import com.company.collection.ExampleList;

public class Maincollection {
    public static void main(String[] args) {

        ExampleList list = new ExampleList();
        System.out.println(list.lenghtArrayList());
        for (int i = 0; i <10 ; i++) {
            list.add(i);
        }
        System.out.println(list.lenghtArrayList());
        list.add(10);
        list.printList();
        System.out.println(list.lenghtArrayList());
    }
}
