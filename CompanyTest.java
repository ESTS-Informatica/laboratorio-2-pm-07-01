

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CompanyTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CompanyTest
{
        Company company1;
        User client1;
        User client2;
        User seller1;
        User seller2;
    /**
     * Default constructor for test class CompanyTest
     */
    public CompanyTest()
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
        company1 = new Company();
        client1 = new User("José Manuel","911111111","zemanel@yahoo.com");
        client2 = new User("António Francisco","922222222","tochico@hotmail.com");
        seller1 = new User("Fernando Fernandes","966777101","fefe@remax.pt");
        seller2 = new User("Rodrigo Rodrigues","966777152","roro@remax.pt");
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
    public void  testConstructor()
    {
        assertNotNull(company1);
        assertNotNull(client1);
        assertNotNull(client2);
        assertNotNull(seller1);
        assertNotNull(seller2);
    }
}
