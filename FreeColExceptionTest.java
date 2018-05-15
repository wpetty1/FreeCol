package net.sf.freecol.common;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FreeColExceptionTest</code> contains tests for the class <code>{@link FreeColException}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:15 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class FreeColExceptionTest {
	/**
	 * Run the FreeColException(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:15 PM
	 */
	@Test
	public void testFreeColException_1()
		throws Exception {
		String message = "";

		FreeColException result = new FreeColException(message);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("net.sf.freecol.common.FreeColException: ", result.toString());
		assertEquals("", result.getLocalizedMessage());
		assertEquals("", result.getMessage());
	}

	/**
	 * Run the FreeColException(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:15 PM
	 */
	@Test
	public void testFreeColException_2()
		throws Exception {
		String message = "";
		Throwable throwable = new Throwable();

		FreeColException result = new FreeColException(message, throwable);

		// add additional test code here
		assertNotNull(result);
		assertEquals("net.sf.freecol.common.FreeColException: ", result.toString());
		assertEquals("", result.getLocalizedMessage());
		assertEquals("", result.getMessage());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/18 4:15 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/18 4:15 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/14/18 4:15 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FreeColExceptionTest.class);
	}
}