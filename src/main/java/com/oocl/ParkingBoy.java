package com.oocl;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ParkingBoy {
    private List<ParkingLot> parkingLots = new ArrayList<ParkingLot>();
    private ParkingLot parkingLot;

    public ParkingBoy(ParkingLot... parkingLots) {
        this.parkingLots.addAll(Arrays.asList(parkingLots));
    }

    public ParkingTicket park(Car car) {
        ParkingLot selectedParking = this.parkingLots.stream().filter(parkingLot-> !parkingLot.isFull()).findFirst().get();
        return selectedParking.park(car);
    }

    public Car fetch(ParkingTicket parkingTicket)  {
        if (parkingTicket ==null){
            throw new MissingParkingTicket();
        }
        return this.parkingLots.get(0).fetch(parkingTicket);
    }
}
