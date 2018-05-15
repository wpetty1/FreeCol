package net.sf.freecol.common.i18n;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PluralNumberRuleTest</code> contains tests for the class <code>{@link PluralNumberRule}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:44 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class PluralNumberRuleTest {
	/**
	 * Run the Number.Category getCategory(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:44 PM
	 */
	@Test
	public void testGetCategory_1()
		throws Exception {
		PluralNumberRule fixture = new PluralNumberRule();
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
	 * @generatedBy CodePro at 5/14/18 4:44 PM
	 */
	@Test
	public void testGetCategory_2()
		throws Exception {
		PluralNumberRule fixture = new PluralNumberRule();
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
		new org.junit.runner.JUnitCore().run(PluralNumberRuleTest.class);
	}
}