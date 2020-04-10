package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class SmartParkingBoyTest {
    @Test
    public void should_smartParkingBoy_park_to_parkingLot_with_more_spaces(){
        ParkingLot parkingLot1 = new ParkingLot(2);
        ParkingLot parkingLot2 = new ParkingLot(5);
        SmartParkingBoy smartParkingBoy = new SmartParkingBoy(parkingLot1, parkingLot2);
        Car car = new Car();
        ParkingTicket parkingTicket = smartParkingBoy.park(car);
        Car fetchedCar = parkingLot2.fetch(parkingTicket);
        Assert.assertEquals(car, fetchedCar);
    }
}
