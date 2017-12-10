package guest;

public class Guest {
    private String name;
    private int wallet;

    public Guest(String inputName, int inputWallet) {
        this.name = inputName;
        this.wallet = inputWallet;
    }

    public String getName() {
        return this.name;
    }
}
