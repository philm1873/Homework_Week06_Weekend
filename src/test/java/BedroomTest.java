import guest.Guest;
import org.junit.Before;
import org.junit.Test;
import rooms.Bedroom;
import rooms.BedroomValue;

import java.util.ArrayList;
import java.util.Arrays;

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
    private ArrayList<String> testGuests;



    @Before
    public void before() {
        testDoubleBedroom = new Bedroom(5, capacityDouble, costDouble , typeDouble);
        testSingleBedroom = new Bedroom(4, capacitySingle, costSingle, typeSingle);
        testGuests = new ArrayList<>(Arrays.asList("Phil", "Gal"));
    }

    @Test
    public void singleRoomStartsEmpty() {
        ArrayList<String> test = new ArrayList<>();
        assertEquals(test, testSingleBedroom.getGuests());
    }

    @Test
    public void doubleRoomStartsEmpty() {
        ArrayList<String> test = new ArrayList<>();
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

    @Test
    public void canAddGuests() {
        testDoubleBedroom.addGuests(testGuests);
        assertEquals(2, testDoubleBedroom.getGuests().size());
    }

    @Test
    public void canRemoveGuests() {
        testDoubleBedroom.addGuests(testGuests);
        assertEquals(2, testDoubleBedroom.getGuests().size());
        testDoubleBedroom.removeGuests();
        assertEquals(0, testDoubleBedroom.getGuests().size());
    }



}
