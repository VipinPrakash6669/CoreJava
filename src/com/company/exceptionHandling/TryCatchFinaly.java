package com.company.exceptionHandling;

public class TryCatchFinaly {

    //finally
    //The "finally" block is used to execute the necessary code of the program.
    // It is executed whether an exception is handled or not.
    public int divide(int a,int b){
        try {
            return a/b;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Cant divide by zero"+e);
            return 0;
        }
        //whether the exception is caught or not finally statement will always be executed
        finally {
            System.out.println("Finally block will always be executed");
        }
    }

    //Predefined exception like numberformate exception
    public void numberFormate(){
        try {
            int num=Integer.parseInt("Vipin");
            System.out.println(num);
        }
        catch (NumberFormatException e) {
            System.out.println("Cant Parse the name"+e);
        }
    }

    //throw keyword The "throw" keyword is used to throw an exception.
    //Using throw keyword, we can only propagate unchecked exception
    public void throwExample(int x) {
        try {
            if(x>10){
                throw new ArithmeticException("Number is greater than 10");
            }
            else {
                System.out.println("Number is less than 11");
            }

        }
        catch (ArithmeticException e){
            System.out.println("exception caught"+ e);
        }
    }

    //throws
    //The "throws" keyword is used to declare exceptions. It specifies that there may occur an exception in the method.
    // It doesn't throw an exception. It is always used with method signature.
    //Using throws keyword, we can declare both checked and unchecked exceptions.
    //However, the throws keyword can be used to propagate checked exceptions only.
    public void throwsExample() throws ArithmeticException{
        throw new ArithmeticException("demo"); //checked exception
    }

    public void fun(){
        try {
            throwsExample();
        }
        catch (ArithmeticException e){
            System.out.println("Exception handled");
        }
    }
}
