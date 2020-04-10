package com.oocl;

public class MissingParkingTicket extends RuntimeException{
    public MissingParkingTicket() {
        super("Please provide your parking ticket.");
    }
}
