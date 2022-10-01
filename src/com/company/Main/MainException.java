package com.company.Main;

import com.company.exceptionHandling.TryCatchFinaly;

public class MainException {
    public static void main(String[] args) {
        TryCatchFinaly tryCatchFinaly= new TryCatchFinaly();
        //System.out.println(tryCatchFinaly.divide(10,0));

        //tryCatchFinaly.numberFormate();

        //tryCatchFinaly.throwExample(11);

        tryCatchFinaly.fun();
        System.out.println("Normal flow");
    }

}
