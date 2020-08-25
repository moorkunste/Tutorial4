package pack;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class bTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param TestCalc name of the test case
     */
    public bTest( String TestCalc )
    {
        super( TestCalc );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( bTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
		Calc a = new Calc();
        assertTrue( a.subtract(4,2)==2 );
		assertTrue( a.subtract(4,3)==1 );
    }
}