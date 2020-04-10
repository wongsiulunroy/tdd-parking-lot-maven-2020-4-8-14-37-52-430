package com.oocl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SuperSmartParkingBoy extends ParkingBoy{
    private List<ParkingLot> parkingLots = new ArrayList<ParkingLot>();

    public SuperSmartParkingBoy(ParkingLot... parkingLot) {
        super(parkingLot);
    }

    @Override
    public ParkingTicket park(Car car) {
        ParkingLot selectedParkingLot = this.parkingLots.get(0);
        List<Float> PositionRate = new ArrayList<>();
        if (this.parkingLots.size() > 1) {
            for (int index = 0; index < this.parkingLots.size(); index++) {
                PositionRate.add((float) (this.getParkingLot().getCapacity() - getParkingLot().getParkingTicketMap().size()/getParkingLot().getCapacity()));
            }
            selectedParkingLot = parkingLots.get(PositionRate.indexOf(Collections.max(PositionRate)));
        }
        return selectedParkingLot.park(car);
    }

}
