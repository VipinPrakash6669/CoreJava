package com.company.lld.parkinglot;



import java.util.ArrayList;
import java.util.Scanner;

public class ParkingLot {

    private String id;
    private ArrayList<Floor> floors = new ArrayList<>();
    private Scanner sc= new Scanner(System.in);
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void addFloor(int floor){
        while(floor>0){
            floors.add(new Floor());
            floor--;
        }

    }

    public void addSlotToEachFloor(int slots) {
        for(int i=0;i<floors.size();i++){
            floors.get(i).addSlot(slots);
        }
    }

    public void display() {
        String s=sc.next();
        String type=sc.next();
        if(s.equals("free_count")){
            for(int j=0;j<floors.size();j++){
                floors.get(j).displayFreeCount(j+1,type);
            }
        }
        else if(s.equals("free_slots")){
            for(int j=0;j<floors.size();j++){
                floors.get(j).displayFreeSlots(j+1,type);
            }
        }
        else if(s.equals("occupied_slots")){
            for(int j=0;j<floors.size();j++) {
                floors.get(j).displayOccupiedSlots(j+1,type);
            }
        }
    }

    public void parkVehicle(String id) {
        String type=sc.next();
        String regNum=sc.next();
        String colour=sc.next();
        int p=0;
        for(int i=0;i<floors.size();i++){
            if(floors.get(i).searchVacancy(i,type,regNum,colour,id)){
                p=1;
                break;
            }
        }
        if(p==0){
            System.out.println("Parking Lot full");
        }
    }

    public void unPark() {
        String s=sc.next();
        int n=s.length();
        int slotNum=s.charAt(n-1)-1;
        int floorNum=s.charAt(n-3)-1;
        for(int i=0;i<floors.size();i++){
            if(i==floorNum){
                floors.get(i).unParkVehicle(slotNum);
                break;
            }
        }
    }
}
