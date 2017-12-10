import hotel.Guest;
import org.junit.Before;
import org.junit.Test;
import rooms.Bedroom;
import rooms.BedroomValue;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom testSingleBedroom;
    private Bedroom testDoubleBedroom;
    private BedroomValue typeDouble = BedroomValue.DOUBLE;
    private BedroomValue typeSingle = BedroomValue.SINGLE;
    private int capacityDouble = BedroomValue.DOUBLE.getCapacity();
    private int capacitySingle = BedroomValue.SINGLE.getCapacity();
    private int costDouble = BedroomValue.SINGLE.getCost();
    private int costSingle = BedroomValue.SINGLE.getCost();



    @Before
    public void before() {
        testDoubleBedroom = new Bedroom(5, capacityDouble, costDouble , typeDouble);
        testSingleBedroom = new Bedroom(4, capacitySingle, costSingle, typeSingle);
    }

    @Test
    public void singleRoomStartsEmpty() {
        ArrayList<Guest> test = new ArrayList<>();
        assertEquals(test, testSingleBedroom.getGuests());
    }

    @Test
    public void doubleRoomStartsEmpty() {
        ArrayList<Guest> test = new ArrayList<>();
        assertEquals(test, testDoubleBedroom.getGuests());
    }

    @Test
    public void canGetRoomNumber() {
        assertEquals(5, testDoubleBedroom.getRoomNumber());
    }

    @Test
    public void canGetCapacity() {
        assertEquals(2, testDoubleBedroom.getCapacity());
    }

    @Test
    public void canGetCost() {
        assertEquals(50, testSingleBedroom.getCost());
    }



}
