package com.company.Interface;
//So, interface is, as you saw, are purely abstract,
//        and they don't specify any actual aspect of the implementation.
//        The actual implementation, of course,
//        was left to the classes that implement the interface, and
//        that's why we use the word implements when we're using an interface.

//Interface is actually specifying the details that what needs to be done rather than how to done
//So abstraction is when you define the required functionality for
//something without actually implementing the details.
public interface ITelephone {
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
