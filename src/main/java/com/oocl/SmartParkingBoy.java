package com.oocl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmartParkingBoy extends ParkingBoy {
    private List<ParkingLot> parkingLots = new ArrayList<ParkingLot>();

    public SmartParkingBoy(ParkingLot... parkingLot) {
        super(parkingLot);
        this.parkingLots.addAll(Arrays.asList(parkingLot));
    }

    @Override
    public ParkingTicket park(Car car) {
        ParkingLot selectedParkingLot = this.parkingLots.get(0);
        List<Integer> remainingSpaceInParkingLot = new ArrayList<>();
        if (this.parkingLots.size() > 1) {
            for (int index = 0; index < this.parkingLots.size(); index++) {
                remainingSpaceInParkingLot.add(this.getParkingLot().getCapacity() - getParkingLot().getParkingTicketMap().size());
            }
            selectedParkingLot = parkingLots.get(remainingSpaceInParkingLot.indexOf(Collections.max(remainingSpaceInParkingLot)));
        }
        return selectedParkingLot.park(car);
    }

}
