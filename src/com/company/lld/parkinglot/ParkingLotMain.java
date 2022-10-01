package com.company.lld.parkinglot;

import java.util.Scanner;

public class ParkingLotMain {

    private static ParkingLot parkingLot = new ParkingLot();
    public static void main(String[] args) {
        String str;
        int f=1;
        Scanner sc = new Scanner(System.in);
        while(f==1){
            str=sc.next();
            if(str.equals("exit")){
                break;
            }else if(str.equals("create_parking_lot")==true){
                String id;
                int floor,slots;
                id=sc.next();
                floor=sc.nextInt();
                slots=sc.nextInt();
                parkingLot.setId(id);
                parkingLot.addFloor(floor);
                parkingLot.addSlotToEachFloor(slots);
            } else if(str.equals("display")){
                parkingLot.display();
            }else if(str.equals("park_vehicle")){
                parkingLot.parkVehicle(parkingLot.getId());
            }else if(str.equals("un_park_vehicle")){
                parkingLot.unPark();
            }
        }
    }
}
