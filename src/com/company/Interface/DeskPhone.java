package com.company.Interface;

public class DeskPhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber=myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No Power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now Ringing"+phoneNumber+"On deskphone");
    }

    @Override
    public void answer() {
        if (isRinging)
        {
            System.out.println("Answer the cellphone");
            isRinging=false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber==myNumber)
            isRinging=true;
        else isRinging=false;
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
