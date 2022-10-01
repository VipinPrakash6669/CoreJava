package com.company.lld.parkinglot;

public class Slot {
    private int slotNumber;
    private Boolean free;
    private Vehicle vehicle;
    private String ticket;

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getTicket() {
        return ticket;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public Boolean getFree() {
        return free;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public void setFree(Boolean free) {
        this.free = free;
    }
}
