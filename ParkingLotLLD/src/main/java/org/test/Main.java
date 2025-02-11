package org.test;

import org.ParkingLot;
import org.entity.*;

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = ParkingLot.getInstance();
        parkingLot.addLavels(new Lavels(1, 10));
        parkingLot.addLavels(new Lavels(2, 8));

        Vehicle car = new Car("ABC123");
        Vehicle truck = new Bus("XYZ789");
        Vehicle motorcycle = new Bike("M1234");

        // Park vehicles
        parkingLot.parkVehicle(car);
        parkingLot.parkVehicle(truck);
        parkingLot.parkVehicle(motorcycle);

        // Display availability
        parkingLot.displayAvailability();

        // Unpark vehicle
        parkingLot.unparkVehicle(motorcycle);

        // Display updated availability
        parkingLot.displayAvailability();
    }
}