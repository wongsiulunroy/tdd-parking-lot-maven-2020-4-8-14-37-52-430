package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class SuperSmartParkingBoyTest {

    @Test
    public void should_park_to_ParkingLot_with_more_postion_rate(){
        ParkingLot parkingLot1 = new ParkingLot(2);
        ParkingLot parkingLot2 = new ParkingLot(8);
        SuperSmartParkingBoy superSmartParkingBoy = new SuperSmartParkingBoy(parkingLot1, parkingLot2);
        Car car = new Car();
        Car car2 = new Car();
        superSmartParkingBoy.park(car);
        ParkingTicket parkingTicket = SuperSmartParkingBoy.park(car2);
        Car fetchedCar = parkingLot2.fetch(parkingTicket);

        Assert.assertEquals(car2, fetchedCar);

    }
}
