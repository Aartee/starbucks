

package starbucks ;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class StrategyPatternTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StrategyPatternTest
{
    IApp app ;
    PinEntryMachine pinEntry ;
    
    /**
     * Default constructor for test class StrategyPatternTest
     */
    public StrategyPatternTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    		pinEntry = new PinEntryMachine();
        app = new AppAuthProxy() ;
    }


    @Test
    public void testLandscape()
    {
        // Login to App

        // Put in Landscape Mode   

        // Validate App is in Landscape Mode 
        // (replace with correct assert)
    		app.touch(1, 5);
    		app.touch(2, 5);
    		app.touch(3, 5);
    		app.touch(4, 5);
        app.landscape();
        assertEquals( "MyCards", app.screen() );
        //assertTrue( "portraitStrategy", app.screen() ) ;     
    }
    @Test
    public void testPortrait()
    {
        // Login to App

        // Put in Portrait Mode   

        // Validate App is in Landscape Mode 
        // (replace with correct assert)
    		app.touch(1, 5);
		app.touch(2, 5);
		app.touch(3, 5);
		app.touch(4, 5);
        app.portrait();
        assertEquals( "MyCards", app.screen() );
        
        //assertTrue( false ) ;       
    }

    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
