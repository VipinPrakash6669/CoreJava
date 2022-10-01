package com.company.lld.parkinglot;

import com.company.lld.parkinglot.vehicle.Bike;
import com.company.lld.parkinglot.vehicle.Car;
import com.company.lld.parkinglot.vehicle.Truck;
import jdk.nashorn.internal.ir.IdentNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Floor {

    Scanner sc = new Scanner(System.in);
    ParkingSlot parkingSlot = new ParkingSlot();
    public void addSlot(int slots){
        parkingSlot.setSlot(slots);
    }

    public void displayFreeCount(int j, String s) {
        int c=0;
        c=parkingSlot.displayFreeCount(s);
        System.out.println("On floor "+j+" there are "+c+" free slots for "+s);
    }

    public void displayFreeSlots(int j, String s) {
        List<Integer> list = new ArrayList<>();
        list= parkingSlot.displayFreeSlots(s);
        System.out.println("On floor "+j+" there are "+list+" occupied slots for "+s);
    }

    public void displayOccupiedSlots(int j, String s) {
        List<Integer> list = new ArrayList<>();
        list= parkingSlot.displayOccSlots(s);
        System.out.println("On floor "+j+" there are "+list+" occupied slots for "+s);
    }


    public boolean searchVacancy(int i, String type, String regNum, String colour,String id) {
        String str=parkingSlot.getVacancy(i+1,type,regNum,colour,id);
        if(str.equals("no space")){
            return false;
        }
        System.out.println("Parked_vehicle. Ticket ID:"+str);
        return true;
    }

    public void unParkVehicle(int slotNum) {
        Vehicle vehicle=parkingSlot.unPark(slotNum);
        System.out.println("Unparked vehicle with registration number :"+vehicle.getRegistrationNumber()+" and color :"+vehicle.getColour());
    }
}
