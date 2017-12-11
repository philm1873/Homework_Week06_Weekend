package hotel;

import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {
    private String name;
    private ArrayList<Floor> floors;

    public Hotel(String inputName, ArrayList<Floor> inputFloors) {
        this.name = inputName;
        this.floors = inputFloors;
    }
}
