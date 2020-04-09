package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class ParkingLotTest {

    @Test
    public void should_return_parkingTicket_when_parkingBoy_parks_car(){
        ParkingLot parkingLot = new ParkingLot(10);
        Car car = new Car();
        ParkingTicket parkingTicket = parkingLot.park(car);
        Assert.assertNotNull(parkingTicket);
    }

    @Test
    public void should_return_car_when_parkingBoy_fetch_with_parkingTicket(){
        ParkingLot parkingLot = new ParkingLot(10);
        Car car = new Car();
        ParkingTicket parkingTicket = parkingLot.park(car);
        Car fetchedCar = parkingLot.fetch(parkingTicket);

        Assert.assertEquals(car, fetchedCar);
    }
    @Test
    public void should_not_return_car_when_parkingBoy_fetch_with_incorrect_parkingTicket(){
        ParkingLot parkingLot = new ParkingLot(10);
        Car car = new Car();
        ParkingTicket parkingTicket1 = new ParkingTicket();
        Car fetchedCar = parkingLot.fetch(parkingTicket1);
        Assert.assertNull(fetchedCar);
    }

    @Test
    public void should_not_return_car_when_parkingBoy_fetch_with_used_parkingTicket(){
        ParkingLot parkingLot = new ParkingLot(10);
        Car car = new Car();
        ParkingTicket parkingTicket = parkingLot.park(car);
        parkingLot.fetch(parkingTicket);
        Car fetchedCar = parkingLot.fetch(parkingTicket);
        Assert.assertNull(fetchedCar);
    }
    @Test
    public void should_not_park_car_when_parking_capacity_is_full(){
        ParkingLot parkingLot = new ParkingLot(1);
        Car car = new Car();
        Car car2 = new Car();
        parkingLot.park(car);
        ParkingTicket parkingTicket = parkingLot.park(car2);

        Assert.assertNull(parkingTicket);
    }



}
