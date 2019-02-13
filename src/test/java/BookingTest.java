import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private  Booking booking;
    private BedRoom bedRoom1;

    @Before
    public void before(){

        booking = new Booking(bedRoom1, 2, 2);

        bedRoom1 = new BedRoom(2, 2, "double", 20, true);

    }


    @Test
    public void canGetBedroom(){
        assertEquals(bedRoom1, booking.getBedroom());
    }

    @Test
    public void canGetNoOfNights(){
        assertEquals(2, booking.getNoOfNights());
    }

    @Test
    public void canGetNoOfClients(){
        assertEquals(2, booking.getNoOfClients());
    }


}
