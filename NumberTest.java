package net.sf.freecol.common.i18n;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>NumberTest</code> contains tests for the class <code>{@link Number}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:44 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class NumberTest {
	/**
	 * Run the String getKey(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:44 PM
	 */
	@Test
	public void testGetKey_1()
		throws Exception {
		Number fixture = new DefaultNumberRule();
		double selector = 1.0;

		String result = fixture.getKey(selector);

		// add additional test code here
		assertEquals("other", result);
	}

	/**
	 * Run the String getKey(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:44 PM
	 */
	@Test
	public void testGetKey_2()
		throws Exception {
		Number fixture = new DefaultNumberRule();
		String selector = "";
		String template = "";

		String result = fixture.getKey(selector, template);

		// add additional test code here
		assertEquals("other", result);
	}

	/**
	 * Run the String getKey(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:44 PM
	 */
	@Test
	public void testGetKey_3()
		throws Exception {
		Number fixture = new DefaultNumberRule();
		String selector = "";
		String template = "";

		String result = fixture.getKey(selector, template);

		// add additional test code here
		assertEquals("other", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/18 4:44 PM
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
	 * @generatedBy CodePro at 5/14/18 4:44 PM
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
	 * @generatedBy CodePro at 5/14/18 4:44 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(NumberTest.class);
	}
}