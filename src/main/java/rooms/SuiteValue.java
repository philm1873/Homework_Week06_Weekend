package rooms;

public enum SuiteValue {
    BRIDAL(6, 200),
    HONEYMOON(2, 300),
    PENTHOUSE(8, 500);

    private int capacity;
    private int cost;

    SuiteValue(int inputCapacity, int inputCost) {
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
