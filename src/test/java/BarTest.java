import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarTest {

    private Bar bar;
    private Client client1;
    private Client client2;
    private Client client3;


    @Before
    public void before(){

        bar = new Bar("Cheers", 1);

        client1 = new Client("Davide Venditti", 30, 1000);
        client2 = new Client("Jamie Reid", 17, 1200);
        client3 = new Client("Donald", 100, 12000);

    }


    @Test
    public void canGetName(){
        assertEquals("Cheers", bar.getName());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(1, bar.getCapacity());
    }

    @Test
    public void canAddClient(){
        bar.addClient(client2);
        assertEquals(0, bar.clientCount());
        bar.addClient(client1);
        bar.addClient(client3);
        assertEquals(1, bar.clientCount());
    }

    @Test
    public void canRemoveClient(){
        bar.addClient(client1);
        assertEquals(1, bar.clientCount());
        bar.removeClient(client1);
        assertEquals(0, bar.clientCount());
    }

}
