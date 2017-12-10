package rooms;

public enum ConferenceValue {
    BALMORAL(25, 800),
    CALEDONIAN(30, 1000),
    SCOTSMAN(75, 2000);

    private int capacity;
    private int cost;

    ConferenceValue(int inputCapacity, int inputCost) {
        this.capacity = inputCapacity;
        this.cost = inputCost;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getCost() {
        return this.cost;
    }
}
