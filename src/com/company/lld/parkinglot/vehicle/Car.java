package com.company.lld.parkinglot.vehicle;

import com.company.lld.parkinglot.Vehicle;

public class Car implements Vehicle {

    private String type;
    private String registrationNumber;
    private String colour;

    public Car(String type) {
        this.type = type;
    }

    @Override
    public String getVehicleType() {
        return type;
    }

    @Override
    public void setRegistrationNumber(String num) {
        this.registrationNumber=num;
    }

    @Override
    public void setColour(String colour) {
        this.colour=colour;
    }

    @Override
    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    @Override
    public String getColour() {
        return this.colour;
    }

}


