package net.sf.freecol.common.i18n;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DualNumberRuleTest</code> contains tests for the class <code>{@link DualNumberRule}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:43 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class DualNumberRuleTest {
	/**
	 * Run the Number.Category getCategory(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testGetCategory_1()
		throws Exception {
		DualNumberRule fixture = new DualNumberRule();
		double input = 1;

		Number.Category result = fixture.getCategory(input);

		// add additional test code here
		assertNotNull(result);
		assertEquals("one", result.name());
		assertEquals("one", result.toString());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the Number.Category getCategory(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testGetCategory_2()
		throws Exception {
		DualNumberRule fixture = new DualNumberRule();
		double input = 2;

		Number.Category result = fixture.getCategory(input);

		// add additional test code here
		assertNotNull(result);
		assertEquals("two", result.name());
		assertEquals("two", result.toString());
		assertEquals(2, result.ordinal());
	}

	/**
	 * Run the Number.Category getCategory(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testGetCategory_3()
		throws Exception {
		DualNumberRule fixture = new DualNumberRule();
		double input = 1.0;

		Number.Category result = fixture.getCategory(input);

		// add additional test code here
		assertNotNull(result);
		assertEquals("one", result.name());
		assertEquals("one", result.toString());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
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
	 * @generatedBy CodePro at 5/14/18 4:43 PM
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
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DualNumberRuleTest.class);
	}
}