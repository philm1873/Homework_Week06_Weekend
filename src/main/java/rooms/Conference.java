package rooms;

public class Conference extends Room {
    ConferenceValue name;


    public Conference(int inputRoomNumber, int inputCapacity, int inputCost, ConferenceValue inputName) {
        super(inputRoomNumber, inputCapacity, inputCost);
        this.name = inputName;
    }
}
