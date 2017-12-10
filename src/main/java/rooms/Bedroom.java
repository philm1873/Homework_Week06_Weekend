package rooms;

import hotel.Guest;

import java.util.ArrayList;

public class Bedroom extends Room {
    ArrayList<Guest> guests;
    BedroomValue type;

    public Bedroom(int inputRoomNumber, int inputCapacity, BedroomValue type) {
        super(inputRoomNumber, inputCapacity);
        this.guests = new ArrayList<>();
        this.type = type;
    }
}
