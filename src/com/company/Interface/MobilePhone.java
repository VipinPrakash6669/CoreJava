package com.company.Interface;

public class MobilePhone implements ITelephone{

    private int myNumber;
    private boolean isRinging;
    private boolean isOn=false;

    public MobilePhone(int myNumber) {
        this.myNumber=myNumber;
    }

    @Override
    public void powerOn() {
        isOn=true;
        System.out.println("Mobile phone powered up");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn)
            System.out.println("Now Ringing"+phoneNumber+"On Mobile Phone");
        else System.out.println("mobile Phone powered off");
    }

    @Override
    public void answer() {
        if (isRinging)
        {
            System.out.println("Answer the Mobile Phone");
            isRinging=false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber==myNumber&& isOn) {
            isRinging=true;
            System.out.println("Mobile phone ringing");
        }
        else{
            isRinging=false;
            System.out.println("Mobile phone wrong or number different or poweres off");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
