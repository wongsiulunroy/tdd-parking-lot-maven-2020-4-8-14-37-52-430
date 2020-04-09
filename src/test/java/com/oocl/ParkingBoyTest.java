package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class ParkingBoyTest {

    @Test
    public void should_return_parkingTicket_when_parkingBoy_parks_car(){
        ParkingBoy parkingBoy = new ParkingBoy(10);
        Car car = new Car();
        ParkingTicket parkingTicket = parkingBoy.park(car);
        Assert.assertNotNull(parkingTicket);
    }

    @Test
    public void should_return_car_when_parkingBoy_fetch_with_parkingTicket(){
        ParkingBoy parkingBoy = new ParkingBoy(10);
        Car car = new Car();
        ParkingTicket parkingTicket = parkingBoy.park(car);
        Car fetchedCar = parkingBoy.fetch(parkingTicket);

        Assert.assertEquals(car, fetchedCar);
    }
    @Test
    public void should_not_return_car_when_parkingBoy_fetch_with_incorrect_parkingTicket(){
        ParkingBoy parkingBoy = new ParkingBoy(10);
        Car car = new Car();
        ParkingTicket parkingTicket1 = new ParkingTicket();
        Car fetchedCar = parkingBoy.fetch(parkingTicket1);
        Assert.assertNull(fetchedCar);
    }

    @Test
    public void should_not_return_car_when_parkingBoy_fetch_with_used_parkingTicket(){
        ParkingBoy parkingBoy = new ParkingBoy(10);
        Car car = new Car();
        ParkingTicket parkingTicket = parkingBoy.park(car);
        parkingBoy.fetch(parkingTicket);
        Car fetchedCar = parkingBoy.fetch(parkingTicket);
        Assert.assertNull(fetchedCar);
    }
    @Test
    public void should_not_park_car_when_parking_capacity_is_full(){
        ParkingBoy parkingBoy = new ParkingBoy(1);
        Car car = new Car();
        Car car2 = new Car();
        parkingBoy.park(car);
        ParkingTicket parkingTicket = parkingBoy.park(car2);

        Assert.assertNull(parkingTicket);
    }



}
