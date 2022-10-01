package com.company.lld.parkinglot;

import com.company.lld.parkinglot.vehicle.Bike;
import com.company.lld.parkinglot.vehicle.Car;
import com.company.lld.parkinglot.vehicle.Truck;

import java.util.ArrayList;
import java.util.List;

public class ParkingSlot {

    List<Slot> slots = new ArrayList<>();

    private Slot getSlot(int ind,boolean free, String s){
        Slot slot= new Slot();
        slot.setSlotNumber(ind);
        slot.setFree(true);
        Vehicle vehicle = null;
        if(s.equals("car")){
            vehicle = new Car("car");
        }else if(s.equals("bike")){
            vehicle = new Bike("bike");
        }else if(s.equals("truck")){
            vehicle = new Truck("truck");
        }
        slot.setVehicle(vehicle);
        return slot;
    }

    public void setSlot(int j) {
        slots.add(getSlot(1,true,"truck"));
        slots.add(getSlot(2,true,"bike"));
        slots.add(getSlot(3,true,"bike"));
        for(int i=4;i<=j;i++){
            slots.add(getSlot(i,true,"car"));
        }
    }

    public int displayFreeCount(String s) {
        int c=0;
        for(int i=0;i<slots.size();i++){
            if(slots.get(i).getVehicle().getVehicleType().equals(s)&&slots.get(i).getFree()==true){
                c++;
            }
        }
        return c;
    }

    public List<Integer> displayFreeSlots(String s) {
        List<Integer>list= new ArrayList<>();
        for(int i=0;i<slots.size();i++){
            if(slots.get(i).getVehicle().getVehicleType().equals(s)&&slots.get(i).getFree()){
                list.add(i+1);
            }
        }
        return list;
    }

    public List<Integer> displayOccSlots(String s) {
        List<Integer>list= new ArrayList<>();
        for(int i=0;i<slots.size();i++){
            if(slots.get(i).getVehicle().getVehicleType().equals(s)&&slots.get(i).getFree()==false){
                list.add(i+1);
            }
        }
        return list;
    }

    public String getVacancy(int f,String s, String regNum, String colour,String id) {
        int pos=0;
        String str="no space";
        for(int i=0;i<slots.size();i++){
            if(slots.get(i).getVehicle().getVehicleType().equals(s)&& slots.get(i).getFree()){
                slots.get(i).setFree(false);
                slots.get(i).getVehicle().setColour(colour);
                slots.get(i).getVehicle().setRegistrationNumber(regNum);
                pos=i+1;
                str=id+"_"+f+"_"+pos;
                slots.get(i).setTicket(str);
                break;
            }
        }
        return str;
    }

    public Vehicle unPark(int slotNum) {
        slots.get(slotNum).setFree(true);
        return slots.get(slotNum).getVehicle();
    }
}
