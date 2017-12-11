import org.junit.Before;
import org.junit.Test;
import rooms.Conference;
import rooms.ConferenceValue;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ConferenceTest {
    private Conference testConferenceRoom;
    private ConferenceValue conferenceType = ConferenceValue.BALMORAL;
    private int conferenceCapacity = ConferenceValue.BALMORAL.getCapacity();
    private int conferenceCost = ConferenceValue.BALMORAL.getCost();
    private ArrayList<String> testGuests;

    @Before
    public void before() {
        testConferenceRoom = new Conference(2, conferenceCapacity, conferenceCost, conferenceType );
        testGuests = new ArrayList<>(Arrays.asList("Phil", "Gal"));
    }

    @Test
    public void conferenceRoomStartsEmpty() {
        ArrayList<String> test = new ArrayList<>();
        assertEquals(test, testConferenceRoom.getGuests());
    }


    @Test
    public void canGetRoomNumber() {
        assertEquals(2, testConferenceRoom.getRoomNumber());
    }

    @Test
    public void canGetCapacity() {
        assertEquals(25, testConferenceRoom.getCapacity());
    }

    @Test
    public void canGetCost() {
        assertEquals(800, testConferenceRoom.getCost());
    }

    @Test
    public void canAddGuests() {
        testConferenceRoom.addGuests(testGuests);
        assertEquals(2, testConferenceRoom.getGuests().size());
    }

    @Test
    public void canRemoveGuests() {
        testConferenceRoom.addGuests(testGuests);
        assertEquals(2, testConferenceRoom.getGuests().size());
        testConferenceRoom.removeGuests();
        assertEquals(0, testConferenceRoom.getGuests().size());
    }

}
