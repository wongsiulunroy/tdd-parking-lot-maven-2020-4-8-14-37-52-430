package com.oocl;

public class ParkingBoy {
    ParkingLot parkingLot;

    public ParkingBoy(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public ParkingTicket park(Car car) {
        return this.parkingLot.park(car);
    }

    public Car fetch(ParkingTicket parkingTicket)  {
        return this.parkingLot.fetch(parkingTicket);
    }
}
