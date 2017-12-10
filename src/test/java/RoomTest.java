import org.junit.Before;
import org.junit.Test;
import rooms.Room;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room testRoom;
    ArrayList<String> guestList;

    @Before
    public void before() {
        testRoom = new Room(1, 2, 50);
        guestList = new ArrayList<>(Arrays.asList("Phil", "Gal"));
    }

    @Test
    public void roomStartsEmpty() {
        ArrayList<String> test = new ArrayList<>();
        assertEquals(test, testRoom.getGuests());
    }

    @Test
    public void canGetRoomNumber() {
        assertEquals(1, testRoom.getRoomNumber());
    }

    @Test
    public void canGetCapacity() {
        assertEquals(2, testRoom.getCapacity());
    }

    @Test
    public void canGetCost() {
        assertEquals(50, testRoom.getCost());
    }

    @Test
    public void canAddGuests() {
        testRoom.addGuests(guestList);
        assertEquals(2, testRoom.getGuests().size());
    }


}
