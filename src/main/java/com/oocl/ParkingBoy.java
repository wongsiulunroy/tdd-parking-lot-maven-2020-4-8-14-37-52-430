package com.oocl;

public class ParkingBoy {
    ParkingLot parkingLot = new ParkingLot(10);

    public ParkingTicket park(Car car) {
        return this.parkingLot.park(car);
    }

}
