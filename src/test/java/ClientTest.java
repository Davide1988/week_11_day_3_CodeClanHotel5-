import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClientTest {

    private Client client;
    private Client client2;



    @Before
    public void before(){
        client = new Client("Davide Venditti", 30, 1000);
        client2= new Client("Jamie Reid", 33, 1200);
    }

    @Test
    public void canGetName(){
        assertEquals("Davide Venditti", client.getName());
    }

    @Test
    public void canGetWalletAmount(){
        assertEquals(1000, client.getWalletAmount() , 1);
    }



}
