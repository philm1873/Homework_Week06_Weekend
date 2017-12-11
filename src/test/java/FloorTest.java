import hotel.Floor;
import org.junit.Before;
import org.junit.Test;
import rooms.Bedroom;
import rooms.Conference;
import rooms.Suite;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FloorTest {

    Floor testFloor;
    Conference testConferenceRoom;
    Bedroom testDoubleBedroom;
    Bedroom testSingleBedroom;
    Suite testSuite;

    @Before
    public void before() {
        testFloor = new Floor(0);
    }

    @Test
    public void conferenceStartsEmpty() {
        ArrayList<Conference> test = new ArrayList<>();
        assertEquals(test, testFloor.getConferenceRooms());
    }

    @Test
    public void bedroomStartsEmpty() {
        ArrayList<Bedroom> test = new ArrayList<>();
        assertEquals(test, testFloor.getBedrooms());
    }

    @Test
    public void suiteStartsEmpty() {
        ArrayList<Suite> test = new ArrayList<>();
        assertEquals(test, testFloor.getSuites());
    }
}
