package org.entity;

import java.util.ArrayList;
import java.util.List;

public class Lavels {

    int floor;
    List<ParkingSpot> parkingSpotList;

    public Lavels(int floor, int numOfSpot ) {
        this.floor = floor;
        this.parkingSpotList = new ArrayList<ParkingSpot>(numOfSpot);
        // assign stretagy for available spot 50:40:10 for bikes, cars and bus
        double spotsForBikes = 0.50;
        double spotsForCars = 0.40;
        int numBikes = (int) (numOfSpot * spotsForBikes);
        int numCars = (int) (numOfSpot * spotsForCars);
        for (int i = 1; i <= numBikes; i++) {
            parkingSpotList.add(new ParkingSpot(i,VehicleType.BIKE));
        }
        for (int i = numBikes + 1; i <= numBikes + numCars; i++) {
            parkingSpotList.add(new ParkingSpot(i,VehicleType.CAR));
        }
        for (int i = numBikes + numCars + 1; i <= numOfSpot; i++) {
            parkingSpotList.add(new ParkingSpot(i,VehicleType.BUS));
        }
    }

    public synchronized boolean parkVehicle(Vehicle vehicle){
        //
        for(ParkingSpot spot : parkingSpotList){
            if(spot.isAvailable() && spot.getVehicleType() == vehicle.getVehicleType() ){
                spot.parkVehicle(vehicle);
                return true;
            }
        }
        return false;
    }

    public synchronized boolean unparkVehicle(Vehicle vehicle){
        for (ParkingSpot spot : parkingSpotList) {
            if (!spot.isAvailable() && spot.getParkedVehicle().equals(vehicle)) {
                spot.unparkVehicle(vehicle);
                return true;
            }
        }
        return false;
    }

    public void getAvailability(){
        System.out.println("Level " + floor + " Availability:");
        for (ParkingSpot spot : parkingSpotList) {
            System.out.println("Spot " + spot.getSpotNumber() + ": " + (spot.isAvailable() ? "Available For"  : "Occupied By ")+" "+spot.getVehicleType());
        }
    }


}
