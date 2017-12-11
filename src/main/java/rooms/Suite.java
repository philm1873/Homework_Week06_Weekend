package rooms;

public class Suite extends Room {
    SuiteValue name;

    public Suite(int inputRoomNumber, int inputCapacity, int inputCost, SuiteValue inputSuite) {
        super(inputRoomNumber, inputCapacity, inputCost);
        this.name = inputSuite;
    }
}
