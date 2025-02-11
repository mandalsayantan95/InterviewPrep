package org;

import org.entity.Lavels;
import org.entity.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private static ParkingLot instance;
    private final List<Lavels> lavels;


    public ParkingLot() {
        this.lavels = new ArrayList<Lavels>();
    }

    public static synchronized ParkingLot getInstance() {
        if (instance == null) {
            instance = new ParkingLot();
        }
        return instance;
    }

    public void addLavels(Lavels addLavel) {
        lavels.add(addLavel);
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for (Lavels level : lavels) {
            if (level.parkVehicle(vehicle)) {
                System.out.println("Vehicle parked successfully. Type: " + vehicle.getVehicleType());
                return true;
            }
        }
        System.out.println("Could not park vehicle.");
        return false;
    }

    public boolean unparkVehicle(Vehicle vehicle) {
        for (Lavels level : lavels) {
            if (level.unparkVehicle(vehicle)) {
                return true;
            }
        }
        return false;
    }

    public void displayAvailability() {
        for (Lavels level : lavels) {
            level.getAvailability();
        }
    }
}
