import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private BedRoom bedRoom1;
    private BedRoom bedRoom2;
    private BedRoom bedRoom3;
    private BedRoom bedRoom4;
    private Client client1;
    private Client client2;
    private Client client3;

    @Before
    public void before(){

        hotel = new Hotel("CodeClanHostel", 5);


        bedRoom1 = new BedRoom(69, 2, "suit", 60, true);
        bedRoom2 = new BedRoom(1, 1, "single", 15, true);
        bedRoom3 = new BedRoom(4, 4, "family", 50, true);
        bedRoom4 = new BedRoom(5, 2, "double", 20, false);

        hotel.addBedroom(bedRoom1);
        hotel.addBedroom(bedRoom2);
        hotel.addBedroom(bedRoom3);
        hotel.addBedroom(bedRoom4);

        client1 = new Client("Davide Venditti", 30, 1000);
        client2 = new Client("Jamie Reid", 33, 1200);
        client3 = new Client("Donald", 100, 12000);
    }



    @Test
    public void canGetNumberOfBedrooms(){
        assertEquals(4, hotel.numberOfBedrooms());
    }

    @Test
    public void canCheckClientInRoom(){
        hotel.addClient(client1, bedRoom1);
        assertEquals(1, bedRoom1.clientCount());
        hotel.addClient(client2,bedRoom4);
        assertEquals(0,bedRoom4.clientCount());
    }

    @Test
    public void canGetCustomerOutRoom(){
        hotel.addClient(client1, bedRoom1);
        assertEquals(1, bedRoom1.clientCount());
        hotel.getCustomerOut(bedRoom1);
        assertEquals(0, bedRoom1.clientCount());
    }


}
