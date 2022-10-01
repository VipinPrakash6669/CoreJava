package com.company.functionalProgramming.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;

public class ExampleLambda {
    ArrayList<Integer> list = new ArrayList<>();
    public void generateList()
    {
        for(int i=0;i<10;i++)
            list.add((int) ((Math.random()*1000)));
    }
    public void print()
    {
        list.forEach(integer -> System.out.print(integer+" "));
        //System.out.println(list);
    }

    public ArrayList<Integer> getList() {
        return list;
    }

    public void sortList()
    {
        /*
        In o1.compareTo(o2) we implement the same in the lambda function
        the value 0 if this Integer is equal to the argument Integer;
        a value less than 0 if this Integer is numerically less than the argument Integer;
        a value greater than 0 if this Integer is numerically greater than the argument Integer (signed comparison).
         */
        //work because comparable is interface eith only one abstract method other are default and static
        Collections.sort(list,(x,y)->(x<y)? -1:(x>y)?1:0);
        //work
        list.sort((x,y)->(x<y)? -1:(x>y)?1:0);
        //not work
        //Arrays.sort(list,(x,y)->(x<y)? -1:(x>y)?1:0);

//        Collections.sort(list, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1.compareTo(o2);
//            }
//        });
    }
}
