package rooms;


public class Bedroom extends Room {
    BedroomValue type;

    public Bedroom(int inputRoomNumber, int inputCapacity, int inputCost, BedroomValue type) {
        super(inputRoomNumber, inputCapacity, inputCost);
        this.type = type;
    }



}
