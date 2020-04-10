package com.oocl;

public class ParkingLotFullException extends RuntimeException {
    public ParkingLotFullException() {
        super("Not enough position.");
    }
}
