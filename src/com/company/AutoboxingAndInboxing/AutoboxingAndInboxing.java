package com.company.AutoboxingAndInboxing;


import java.util.ArrayList;

public class AutoboxingAndInboxing {
    public void fun()
    {
        ArrayList<Integer> integers=new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            //Autoboxing converting an int into an Integer Class
            integers.add(Integer.valueOf(i));
        }
        for (int i = 0; i < integers.size(); i++) {
            //Inboxing converting and Integer Class into int(Primitive type) value
            System.out.print(integers.get(i).intValue());
        }

    }


}
