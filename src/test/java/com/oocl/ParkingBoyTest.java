package com.oocl;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ParkingBoyTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void parkingBoy_should_park_a_car(){
        ParkingLot parkingLot = new ParkingLot(10);
        ParkingBoy parkingBoy = new ParkingBoy(parkingLot);
        ParkingTicket parkingTicket = parkingBoy.park(new Car());
        Assert.assertNotNull(parkingTicket);
    }
    @Test
    public void parkingBoy_should_fetch_a_car_with_a_parkingTicket(){
        ParkingLot parkingLot = new ParkingLot(10);
        ParkingBoy parkingBoy = new ParkingBoy(parkingLot);
        Car car = new Car();
        ParkingTicket parkingTicket = parkingBoy.park(car);
        Car fetchedCar = parkingBoy.fetch(parkingTicket);
        Assert.assertEquals(car, fetchedCar);
    }
    @Test
    public void should_return_exception_message_when_fetch_with_incorrect_parkingTicket(){
        expectedException.expect(UnrecognisedParkingTicket.class);
        expectedException.expectMessage("Unrecognised Parking Ticket");
        ParkingLot parkingLot = new ParkingLot(10);
        ParkingBoy parkingBoy = new ParkingBoy(parkingLot);
        Car car = new Car();

        ParkingTicket parkingTicket = parkingBoy.park(car);
        parkingBoy.fetch(new ParkingTicket());
    }
    @Test
    public void should_park_in_second_parkingLot_when_first_parkingLot_isFull(){
        
    }

}
