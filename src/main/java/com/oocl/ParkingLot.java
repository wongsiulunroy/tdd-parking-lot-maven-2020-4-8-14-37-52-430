package com.oocl;

import java.util.HashMap;
import java.util.Map;


public class ParkingLot {
    private final int capacity;
    private Map<ParkingTicket, Car> parkingTicketMap = new HashMap();

    public ParkingLot(int capacity) {
        this.capacity = capacity;
    }

    public ParkingTicket park(Car car) {
        if(this.capacity == parkingTicketMap.size()){
            return null;
        }
        ParkingTicket parkingTicket = new ParkingTicket();
        this.parkingTicketMap.put(parkingTicket, car);
        return parkingTicket;
    }

    public Car fetch(ParkingTicket parkingTicket) {
        Car car = this.parkingTicketMap.remove(parkingTicket);
        return car;
    }
}
