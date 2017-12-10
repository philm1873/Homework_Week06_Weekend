package rooms;

public class Room {
    int roomNumber;
    int capacity;
    int cost;

    public Room(int inputRoomNumber, int inputCapacity, int inputCost) {
        this.roomNumber = inputRoomNumber;
        this.capacity = inputCapacity;
        this.cost = inputCost;
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
}
