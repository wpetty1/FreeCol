package net.sf.freecol.common.option;

import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import javax.xml.stream.XMLStreamException;
import org.junit.*;
import net.sf.freecol.common.model.Specification;
import static org.junit.Assert.*;

/**
 * The class <code>BooleanOptionTest</code> contains tests for the class <code>{@link BooleanOption}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:45 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class BooleanOptionTest {
	/**
	 * Run the BooleanOption(Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testBooleanOption_1()
		throws Exception {
		Specification specification = new Specification();

		BooleanOption result = new BooleanOption(specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[null value=false]", result.toString());
		assertEquals(Boolean.FALSE, result.getValue());
		assertEquals("booleanOption", result.getXMLTagName());
		assertEquals("", result.getGroup());
		assertEquals(false, result.isNullValueOK());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals("<booleanOption value=\"false\"></booleanOption>", result.serialize());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the BooleanOption(String,Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testBooleanOption_2()
		throws Exception {
		String id = "";
		Specification specification = new Specification();

		BooleanOption result = new BooleanOption(id, specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[ value=false]", result.toString());
		assertEquals(Boolean.FALSE, result.getValue());
		assertEquals("booleanOption", result.getXMLTagName());
		assertEquals("", result.getGroup());
		assertEquals(false, result.isNullValueOK());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<booleanOption id=\"\" value=\"false\"></booleanOption>", result.serialize());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the BooleanOption clone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testClone_1()
		throws Exception {
		BooleanOption fixture = new BooleanOption(new Specification());
		fixture.setValue(new Boolean(true));
		fixture.isDefined = true;

		BooleanOption result = fixture.clone();

		// add additional test code here
		assertNotNull(result);
		assertEquals("[null value=true]", result.toString());
		assertEquals(Boolean.TRUE, result.getValue());
		assertEquals("booleanOption", result.getXMLTagName());
		assertEquals("", result.getGroup());
		assertEquals(false, result.isNullValueOK());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals("<booleanOption value=\"true\"></booleanOption>", result.serialize());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the Boolean getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testGetValue_1()
		throws Exception {
		BooleanOption fixture = new BooleanOption(new Specification());
		fixture.setValue(new Boolean(true));
		fixture.isDefined = true;

		Boolean result = fixture.getValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the Boolean getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testGetValue_2()
		throws Exception {
		BooleanOption fixture = new BooleanOption(new Specification());
		fixture.setValue(new Boolean(true));
		fixture.isDefined = true;

		Boolean result = fixture.getValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals("true", result.toString());
		assertEquals(true, result.booleanValue());
	}

	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = BooleanOption.getXMLElementTagName();

		// add additional test code here
		assertEquals("booleanOption", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		BooleanOption fixture = new BooleanOption(new Specification());
		fixture.setValue(new Boolean(true));
		fixture.isDefined = true;

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("booleanOption", result);
	}

	/**
	 * Run the void setValue(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testSetValue_1()
		throws Exception {
		BooleanOption fixture = new BooleanOption(new Specification());
		fixture.setValue(new Boolean(true));
		fixture.isDefined = true;
		Boolean value = new Boolean(true);

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testSetValue_2()
		throws Exception {
		BooleanOption fixture = new BooleanOption(new Specification());
		fixture.setValue(new Boolean(true));
		fixture.isDefined = true;
		Boolean value = new Boolean(true);

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(Boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testSetValue_3()
		throws Exception {
		BooleanOption fixture = new BooleanOption(new Specification());
		fixture.setValue(new Boolean(true));
		fixture.isDefined = false;
		Boolean value = new Boolean(true);

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testSetValue_4()
		throws Exception {
		BooleanOption fixture = new BooleanOption(new Specification());
		fixture.setValue(new Boolean(true));
		fixture.isDefined = true;
		String valueString = null;
		String defaultValueString = "";

		fixture.setValue(valueString, defaultValueString);

		// add additional test code here
	}

	/**
	 * Run the void setValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testSetValue_5()
		throws Exception {
		BooleanOption fixture = new BooleanOption(new Specification());
		fixture.setValue(new Boolean(true));
		fixture.isDefined = true;
		String valueString = "";
		String defaultValueString = "";

		fixture.setValue(valueString, defaultValueString);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		BooleanOption fixture = new BooleanOption(new Specification());
		fixture.setValue(new Boolean(true));
		fixture.isDefined = true;

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[null value=true]", result);
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_1()
		throws Exception {
		BooleanOption fixture = new BooleanOption(new Specification());
		fixture.setValue(new Boolean(true));
		fixture.isDefined = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_2()
		throws Exception {
		BooleanOption fixture = new BooleanOption(new Specification());
		fixture.setValue(new Boolean(true));
		fixture.isDefined = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_3()
		throws Exception {
		BooleanOption fixture = new BooleanOption(new Specification());
		fixture.setValue(new Boolean(true));
		fixture.isDefined = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
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
	 * @generatedBy CodePro at 5/14/18 4:45 PM
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
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(BooleanOptionTest.class);
	}
}