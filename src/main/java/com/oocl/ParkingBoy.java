package com.oocl;

import java.util.HashMap;
import java.util.Map;


public class ParkingBoy {
    private Map<ParkingTicket, Car> parkingTicketMap = new HashMap();

    public ParkingTicket park(Car car) {
        ParkingTicket parkingTicket = new ParkingTicket();
        this.parkingTicketMap.put(parkingTicket, car);
        return parkingTicket;
    }

    public Car fetch(ParkingTicket parkingTicket) {
        Car car = this.parkingTicketMap.remove(parkingTicket);
        return car;
    }
}
