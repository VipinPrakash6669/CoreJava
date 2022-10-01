package com.company.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

//program to arranging String in lexicographically order
public class LinkedListExample {
    public LinkedList<String> generateSortedList()
    {
        LinkedList<String> list= new LinkedList<String>();
        for (int i = 0; i <6 ; i++) {
            //Generating Random String and Adding it in sorted order
            addINLexicographicallyOrder(list,String.valueOf((int) (((Math.random() * 1000)%1000))));
        }
        return list;
    }
    public void printList(LinkedList<String> list)
    {
        Iterator<String> i= list.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }
    }
    public boolean addINLexicographicallyOrder(LinkedList<String> list,String s)
    {
        ListIterator<String> i = list.listIterator();
        while (i.hasNext())
        {
            int c=i.next().compareTo(s);
            if(c==0)
            {
                System.out.println("String Already Exist");
                return false;
            }
            else if( c>0)
            {
                //String s is smaller
                i.previous();
                i.add(s);
                return true;
            }
            else
            {
                //String s is greater
            }
        }
        i.add(s);
        return true;
    }
}
