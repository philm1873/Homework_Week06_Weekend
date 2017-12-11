import org.junit.Before;
import org.junit.Test;
import rooms.Suite;
import rooms.SuiteValue;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SuiteTest {

    private Suite testSuite;
    private ArrayList<String> testGuests;
    private SuiteValue suiteName = SuiteValue.PENTHOUSE;
    private int suiteCapacity = SuiteValue.PENTHOUSE.getCapacity();
    private int suiteCost = SuiteValue.PENTHOUSE.getCost();

    @Before
    public void before() {
        testSuite = new Suite(1, suiteCapacity, suiteCost, suiteName);
        testGuests = new ArrayList<>(Arrays.asList("Phil", "John", "Louis", "Richie"));
    }

    @Test
    public void conferenceRoomStartsEmpty() {
        ArrayList<String> test = new ArrayList<>();
        assertEquals(test, testSuite.getGuests());
    }


    @Test
    public void canGetRoomNumber() {
        assertEquals(1, testSuite.getRoomNumber());
    }

    @Test
    public void canGetCapacity() {
        assertEquals(8, testSuite.getCapacity());
    }

    @Test
    public void canGetCost() {
        assertEquals(500, testSuite.getCost());
    }

    @Test
    public void canAddGuests() {
        testSuite.addGuests(testGuests);
        assertEquals(4, testSuite.getGuests().size());
    }

    @Test
    public void canRemoveGuests() {
        testSuite.addGuests(testGuests);
        assertEquals(4, testSuite.getGuests().size());
        testSuite.removeGuests();
        assertEquals(0, testSuite.getGuests().size());
    }
}
