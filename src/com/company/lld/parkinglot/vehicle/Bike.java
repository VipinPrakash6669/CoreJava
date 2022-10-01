package com.company.lld.parkinglot.vehicle;

import com.company.lld.parkinglot.Vehicle;

public class Bike implements Vehicle {

    private String type;
    private String registrationNumber;
    private String colour;

    public Bike(String bike) {
        this.type=bike;
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
