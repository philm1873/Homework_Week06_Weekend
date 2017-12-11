package rooms;

import java.util.ArrayList;

public class Room {
    private int roomNumber;
    private int capacity;
    private int cost;
    private ArrayList<String> guests;

    public Room(int inputRoomNumber, int inputCapacity, int inputCost) {
        this.roomNumber = inputRoomNumber;
        this.capacity = inputCapacity;
        this.cost = inputCost;
        this.guests = new ArrayList<>();
    }


    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCost() {
        return cost;
    }

    public ArrayList<String> getGuests() {
        return guests;
    }

    public void addGuests(ArrayList<String> inputGuests) {
        guests.addAll(inputGuests);
    }

    public void removeGuests() {
        guests.clear();
    }

}
