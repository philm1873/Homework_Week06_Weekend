package rooms;

import hotel.Guest;

import java.util.ArrayList;

public class Bedroom extends Room {
    ArrayList<Guest> guests;
    BedroomValue type;

    public Bedroom(int inputRoomNumber, int inputCapacity, int inputCost, BedroomValue type) {
        super(inputRoomNumber, inputCapacity, inputCost);
        this.guests = new ArrayList<>();
        this.type = type;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }
}
