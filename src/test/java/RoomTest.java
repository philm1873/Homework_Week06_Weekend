import org.junit.Before;
import org.junit.Test;
import rooms.Room;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room testRoom;

    @Before
    public void before() {
        testRoom = new Room(1, 2, 50);
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

}
