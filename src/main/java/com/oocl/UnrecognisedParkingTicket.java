package com.oocl;

public class UnrecognisedParkingTicket extends RuntimeException {
    public UnrecognisedParkingTicket() {
        super("Unrecognised Parking Ticket");
    }
}
