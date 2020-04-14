package com.oocl;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ParkingBoy {
    private List<ParkingLot> parkingLots = new ArrayList<ParkingLot>();
    private ParkingLot parkingLot;

    public ParkingBoy(ParkingLot... parkingLot) {
        this.parkingLots.addAll(Arrays.asList(parkingLot));
    }

    public ParkingTicket park(Car car) {
        ParkingLot selectedParking = this.parkingLots.stream()
                .filter(parkingLot-> !parkingLot.isFull())
                .findFirst()
                .orElseThrow(ParkingLotFullException::new);
        return selectedParking.park(car);
    }

    public Car fetch(ParkingTicket parkingTicket)  {
        return this.parkingLots.get(0).fetch(parkingTicket);
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }
    /*
    public List<ParkingLot> getParkingLots() {
        return parkingLots;
    }*/
}
