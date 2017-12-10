package rooms;

public enum BedroomValue {
    DOUBLE(2, 80),
    SINGLE(1, 50);

    private int capacity;
    private int cost;

    BedroomValue(int inputCapacity, int inputCost) {
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
