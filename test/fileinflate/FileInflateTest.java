package fileinflate;

import junit.framework.TestCase;

/**
 * A test suite for Inflator class
 */
public class FileInflateTest extends TestCase {
    
    
    public FileInflateTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of main method, of class FileInflate.
     */
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FileInflate.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
