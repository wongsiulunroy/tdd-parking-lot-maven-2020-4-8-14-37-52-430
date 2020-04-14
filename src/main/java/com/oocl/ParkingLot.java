package com.oocl;

import java.util.HashMap;
import java.util.Map;


public class ParkingLot {
    private int capacity;
    private Map<ParkingTicket, Car> parkingTicketMap = new HashMap();

    public ParkingLot(int capacity) {
        this.capacity = capacity;
    }
    public ParkingLot() {
        this.capacity = 10;
    }

    public ParkingTicket park(Car car) {
        if (isFull()) {
            throw new ParkingLotFullException();
        }
        if (car == null || parkingTicketMap.containsValue(car) ) {
            return null;
        }
        ParkingTicket parkingTicket = new ParkingTicket();
        this.parkingTicketMap.put(parkingTicket, car);
        //this.capacity -= 1 ;
        return parkingTicket;
    }

    public boolean isFull() {
        return this.capacity == parkingTicketMap.size();
    }

    public Car fetch(ParkingTicket parkingTicket) {
        if (parkingTicket == null) {
            throw new MissingParkingTicket();
        }
        if (!this.parkingTicketMap.containsKey(parkingTicket)) {
            throw new UnrecognisedParkingTicket();
        }
        Car car = this.parkingTicketMap.remove(parkingTicket);
        return car;
    }

    public int getCapacity() {
        return capacity;
    }

    public Map<ParkingTicket, Car> getParkingTicketMap() {
        return parkingTicketMap;
    }
}
