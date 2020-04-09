package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class ParkingBoyTest {

    @Test
    public void should_return_parkingTicket_when_parkingBoy_parks_car(){
        ParkingBoy parkingBoy = new ParkingBoy();
        Car car = new Car();
        ParkingTicket parkingTicket = parkingBoy.park(car);
        Assert.assertNotNull(parkingTicket);
    }

    @Test
    public void should_return_car_when_parkingBoy_fetch_with_parkingTicket(){
        ParkingBoy parkingBoy = new ParkingBoy();
        Car car = new Car();
        ParkingTicket parkingTicket = parkingBoy.park(car);
        Car fetchedCar = parkingBoy.fetch(parkingTicket);

        Assert.assertEquals(car, fetchedCar);
    }

}
