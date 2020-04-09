package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class ParkingBoyTest {

    @Test
    public void parkingBoy_should_park_a_car(){
        ParkingBoy parkingBoy = new ParkingBoy();
        ParkingTicket parkingTicket = parkingBoy.park(new Car());
        Assert.assertNotNull(parkingTicket);
    }
    @Test
    public void parkingBoy_should_fetch_a_car_with_a_parkingTicket(){
        ParkingBoy parkingBoy = new ParkingBoy();
        Car car = new Car();
        ParkingTicket parkingTicket = parkingBoy.park(car);
        Car fetchedCar = parkingBoy.fetch(parkingTicket);
        Assert.assertEquals(car, fetchedCar);
    }

}
