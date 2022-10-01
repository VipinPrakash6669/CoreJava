package com.company.AbstractClass;
/*
So the important thing here is that not all methods have to be abstract like getname.
This is one of the differences between an abstract class and an interface,
you can actually mix these up.
 */


//Difference between Abstract class and interface
/*
An abstract class can have member variables that are inherited,
something that can't be done in interface.

Now interfaces can have variables, but they're all public static final variables,
which essentially are gonna be constant values that should never change,
with a static scope. see int canfly interface

They have to be static, because non static variables require an instance, and
of course, you can't instantiate an interface.

Interfaces also cannot have constructors, but abstract classes can, as you've
actually seen in this example, and you can see it in the example on the screen now.
We've got a constructor there.

Now, all methods over the interface are automatically public.
Whereas the methods of an abstract class can have any visibility.
Private, protected, etcetera.

Abstract classes can have defined methods, ie methods with an implementation.
And you can see that on the screen there with the get name.
Whereas all methods in an interface are abstract.
And as a result, that code does not have to be reproduced in all
classes that inherit from this abstract class.
 */

//main difference is constructor
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
    public abstract void breath();

    public String getName() {
        return name;
    }
}
