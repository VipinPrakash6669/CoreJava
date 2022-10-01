package com.company.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;

/*Notes
Collection is a root interface and Collections is a class
We cant instantiate Collections because its constructor is private
Methods are thread safe(methods are synchronized in vector) in vector but not in arraylist

There are three cursors in java to retrieve data from collection object one by one
Enumeration ---------> Interface
Iterator
ListIterator
 */
public class ExampleList {
    //Constructs an empty list with an initial capacity of ten.
    private ArrayList<Integer> list = new ArrayList<>();

    public void add(int x)
    {
        list.add(x);
    }
    public int lenghtArrayList()
    {

        return list.size();
    }
    public void printList()
    {
        Collections.sort(list);
        System.out.println(list);
    }
}
