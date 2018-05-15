package net.sf.freecol.common.option;

import org.junit.*;
import net.sf.freecol.common.model.Specification;
import static org.junit.Assert.*;

/**
 * The class <code>UnitListOptionTest</code> contains tests for the class <code>{@link UnitListOption}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:47 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class UnitListOptionTest {
	/**
	 * Run the UnitListOption(Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test
	public void testUnitListOption_1()
		throws Exception {
		Specification specification = new Specification();

		UnitListOption result = new UnitListOption(specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals("unitListOption", result.getXMLTagName());
		assertEquals("[null [ ]]", result.toString());
		assertEquals(Integer.MAX_VALUE, result.getMaximumValue());
		assertEquals(true, result.isNullValueOK());
		assertEquals(null, result.getTemplate());
		assertEquals(true, result.allowsDuplicates());
		assertEquals("", result.getGroup());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals("<unitListOption maximumNumber=\"2147483647\"></unitListOption>", result.serialize());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the UnitListOption(String,Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test
	public void testUnitListOption_2()
		throws Exception {
		String id = "";
		Specification specification = new Specification();

		UnitListOption result = new UnitListOption(id, specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals("unitListOption", result.getXMLTagName());
		assertEquals("[ [ ]]", result.toString());
		assertEquals(Integer.MAX_VALUE, result.getMaximumValue());
		assertEquals(true, result.isNullValueOK());
		assertEquals(null, result.getTemplate());
		assertEquals(true, result.allowsDuplicates());
		assertEquals("", result.getGroup());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<unitListOption id=\"\" maximumNumber=\"2147483647\"></unitListOption>", result.serialize());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the UnitListOption clone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test
	public void testClone_1()
		throws Exception {
		UnitListOption fixture = new UnitListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;

		UnitListOption result = fixture.clone();

		// add additional test code here
		assertNotNull(result);
		assertEquals("unitListOption", result.getXMLTagName());
		assertEquals("[null [ ]]", result.toString());
		assertEquals(Integer.MAX_VALUE, result.getMaximumValue());
		assertEquals(true, result.isNullValueOK());
		assertEquals(null, result.getTemplate());
		assertEquals(true, result.allowsDuplicates());
		assertEquals("", result.getGroup());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals("<unitListOption maximumNumber=\"2147483647\"></unitListOption>", result.serialize());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = UnitListOption.getXMLElementTagName();

		// add additional test code here
		assertEquals("unitListOption", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		UnitListOption fixture = new UnitListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("unitListOption", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/18 4:47 PM
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
	 * @generatedBy CodePro at 5/14/18 4:47 PM
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
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(UnitListOptionTest.class);
	}
}