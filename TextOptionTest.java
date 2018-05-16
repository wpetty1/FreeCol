package net.sf.freecol.common.option;

import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import javax.xml.stream.XMLStreamException;
import org.junit.*;
import net.sf.freecol.common.model.Specification;
import static org.junit.Assert.*;

/**
 * The class <code>TextOptionTest</code> contains tests for the class <code>{@link TextOption}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:47 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class TextOptionTest {
	/**
	 * Run the TextOption(Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test
	public void testTextOption_1()
		throws Exception {
		Specification specification = new Specification();

		TextOption result = new TextOption(specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[null value=null]", result.toString());
		assertEquals(null, result.getValue());
		assertEquals("textOption", result.getXMLTagName());
		assertEquals("", result.getGroup());
		assertEquals(false, result.isNullValueOK());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the TextOption(String,Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test
	public void testTextOption_2()
		throws Exception {
		String id = "";
		Specification specification = new Specification();

		TextOption result = new TextOption(id, specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[ value=null]", result.toString());
		assertEquals(null, result.getValue());
		assertEquals("textOption", result.getXMLTagName());
		assertEquals("", result.getGroup());
		assertEquals(false, result.isNullValueOK());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the TextOption clone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test
	public void testClone_1()
		throws Exception {
		TextOption fixture = new TextOption(new Specification());
		fixture.setValue("");
		fixture.isDefined = true;

		TextOption result = fixture.clone();

		// add additional test code here
		assertNotNull(result);
		assertEquals("[null value=]", result.toString());
		assertEquals("", result.getValue());
		assertEquals("textOption", result.getXMLTagName());
		assertEquals("", result.getGroup());
		assertEquals(false, result.isNullValueOK());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals("<textOption value=\"\"></textOption>", result.serialize());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the String getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test
	public void testGetValue_1()
		throws Exception {
		TextOption fixture = new TextOption(new Specification());
		fixture.setValue("");
		fixture.isDefined = true;

		String result = fixture.getValue();

		// add additional test code here
		assertEquals("", result);
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

		String result = TextOption.getXMLElementTagName();

		// add additional test code here
		assertEquals("textOption", result);
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
		TextOption fixture = new TextOption(new Specification());
		fixture.setValue("");
		fixture.isDefined = true;

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("textOption", result);
	}

	/**
	 * Run the void setValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test
	public void testSetValue_1()
		throws Exception {
		TextOption fixture = new TextOption(new Specification());
		fixture.setValue("");
		fixture.isDefined = true;
		String value = "";

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test
	public void testSetValue_2()
		throws Exception {
		TextOption fixture = new TextOption(new Specification());
		fixture.setValue("");
		fixture.isDefined = false;
		String value = "";

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test
	public void testSetValue_3()
		throws Exception {
		TextOption fixture = new TextOption(new Specification());
		fixture.setValue("");
		fixture.isDefined = true;
		String value = "";

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test
	public void testSetValue_4()
		throws Exception {
		TextOption fixture = new TextOption(new Specification());
		fixture.setValue("");
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
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test
	public void testSetValue_5()
		throws Exception {
		TextOption fixture = new TextOption(new Specification());
		fixture.setValue("");
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
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		TextOption fixture = new TextOption(new Specification());
		fixture.setValue("");
		fixture.isDefined = true;

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[null value=]", result);
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_1()
		throws Exception {
		TextOption fixture = new TextOption(new Specification());
		fixture.setValue("");
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
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_2()
		throws Exception {
		TextOption fixture = new TextOption(new Specification());
		fixture.setValue("");
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
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_3()
		throws Exception {
		TextOption fixture = new TextOption(new Specification());
		fixture.setValue("");
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
		new org.junit.runner.JUnitCore().run(TextOptionTest.class);
	}
}