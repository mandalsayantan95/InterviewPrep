package org.entity;

public class ParkingSpot {

    int spotNumber;

    VehicleType vehicleType;

    Vehicle parkedVehicle;

    public ParkingSpot(int spotNumber, VehicleType vehicleType) {
        this.spotNumber = spotNumber;
        this.vehicleType = vehicleType;
    }

    public synchronized boolean isAvailable() {
        return parkedVehicle == null;
    }
    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public synchronized void parkVehicle(Vehicle vehicle) {
        if(isAvailable() && vehicle.getVehicleType()== vehicleType){
            parkedVehicle = vehicle;
        } else {
            throw new IllegalArgumentException("Invalid vehicle type or spot already occupied.");
        }
    }

    public synchronized void unparkVehicle(Vehicle vehicle) {
        parkedVehicle = null;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }
    public int getSpotNumber() {
        return spotNumber;
    }
}
