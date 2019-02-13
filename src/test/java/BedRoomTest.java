import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BedRoomTest {

    private BedRoom bedRoom;
    private Client client1;
    private Client client2;
    private Client client3;

    @Before
    public void before() {
        bedRoom = new BedRoom(69, 2, "double", 20, true);
        client1 = new Client("Davide Venditti", 30, 1000);
        client2 = new Client("Jamie Reid", 33, 1200);
        client3 = new Client("Donald", 100, 12000);
    }


    @Test
    public void canGetRoomNumber() {
        assertEquals(69, bedRoom.getRoomNumber());
    }

    @Test
    public void canGetCapacity() {
        assertEquals(2, bedRoom.getCapacity());
    }

    @Test
    public void canGetType() {
        assertEquals("double", bedRoom.getType());
    }

    @Test
    public void canGetRate() {
        assertEquals(20, bedRoom.getRate(), 1);
    }

    @Test
    public void canGetAvailability() {
        assertEquals(true, bedRoom.getAvailability());
    }
}



//    @Test
//    public void canAddClient(){
//        bedRoom.addClient(client1);
//        assertEquals(false, bedRoom.getAvailability());
//        assertEquals(1, bedRoom.checkAvailability());
//    }
//
//    @Test
//    public void canCheckOutClient(){
//        bedRoom.addClient(client1);
//        bedRoom.addClient(client2);
//        assertEquals(2, bedRoom.checkAvailability());
//        assertEquals(false, bedRoom.getAvailability());
//        bedRoom.checkOut();
//        assertEquals(0, bedRoom.checkAvailability());
//        assertEquals(true, bedRoom.getAvailability());
//    }
//}
