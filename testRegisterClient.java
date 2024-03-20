

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

/**
 * The test class testRegisterClient.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class testRegisterClient
{
    private ArrayList<User> clients;
    private User client1;
    private User client2;
    private User client3;
    private boolean aux;
    /**
     * Default constructor for test class testRegisterClient
     */
    public testRegisterClient()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        clients = new ArrayList<User>();
        client1 = new User("nome1","telefone1","email1");
        clients.add(client1);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    @Test
    public void testRegisterClients()
    {
        aux = false;
        client2 = new User("nome2","telefone2","email2");
        client3 = new User("nome3","telefone3","email3");
        if(!clients.contains(client2))
        {
            clients.add(client2);
            aux = true;
        }
        if(!clients.contains(client3))
        {
            clients.add(client3);
            aux = true;
        }
        assertTrue(aux);
    }
    
    @Test
    public void  testRegisterClientDuplicate()
    {
        User client4 = new User("nome4","telefone4","email4");
    }
    
    @Test
    public void  testRegisterClientNull()
    {
        aux = false;
        User client4 = null;
        if(client4 == null)
        {
            aux = false;
        }
        assertFalse(aux);
    }
}
