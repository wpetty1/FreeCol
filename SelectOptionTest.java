package net.sf.freecol.common.option;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import java.util.Map;
import javax.xml.stream.XMLStreamException;
import org.junit.*;
import net.sf.freecol.common.io.FreeColXMLReader;
import net.sf.freecol.common.model.Specification;
import static org.junit.Assert.*;

/**
 * The class <code>SelectOptionTest</code> contains tests for the class <code>{@link SelectOption}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:47 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class SelectOptionTest {
	/**
	 * Run the SelectOption(Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test
	public void testSelectOption_1()
		throws Exception {
		Specification specification = new Specification();

		SelectOption result = new SelectOption(specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[null value=0 localized=false]", result.toString());
		assertEquals("selectOption", result.getXMLTagName());
		assertEquals("selectValue", result.getXMLItemElementTagName());
		assertEquals(false, result.localizeLabels());
		assertEquals(new Integer(0), result.getValue());
		assertEquals(Integer.MIN_VALUE, result.getMinimumValue());
		assertEquals(Integer.MAX_VALUE, result.getMaximumValue());
		assertEquals("", result.getGroup());
		assertEquals(false, result.isNullValueOK());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals("<selectOption value=\"0\" localizedLabels=\"false\"></selectOption>", result.serialize());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the void addItemValue(Integer,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test
	public void testAddItemValue_1()
		throws Exception {
		SelectOption fixture = new SelectOption(new Specification());
		fixture.localizedLabels = true;
		fixture.isDefined = true;
		Integer key = new Integer(1);
		String value = "";

		fixture.addItemValue(key, value);

		// add additional test code here
	}

	/**
	 * Run the void clearItemValues() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test
	public void testClearItemValues_1()
		throws Exception {
		SelectOption fixture = new SelectOption(new Specification());
		fixture.localizedLabels = true;
		fixture.isDefined = true;

		fixture.clearItemValues();

		// add additional test code here
	}

	/**
	 * Run the Map<Integer, String> getItemValues() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test
	public void testGetItemValues_1()
		throws Exception {
		SelectOption fixture = new SelectOption(new Specification());
		fixture.localizedLabels = true;
		fixture.isDefined = true;

		Map<Integer, String> result = fixture.getItemValues();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
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

		String result = SelectOption.getXMLElementTagName();

		// add additional test code here
		assertEquals("selectOption", result);
	}

	/**
	 * Run the String getXMLItemElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test
	public void testGetXMLItemElementTagName_1()
		throws Exception {
		SelectOption fixture = new SelectOption(new Specification());
		fixture.localizedLabels = true;
		fixture.isDefined = true;

		String result = fixture.getXMLItemElementTagName();

		// add additional test code here
		assertEquals("selectValue", result);
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
		SelectOption fixture = new SelectOption(new Specification());
		fixture.localizedLabels = true;
		fixture.isDefined = true;

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("selectOption", result);
	}

	/**
	 * Run the boolean localizeLabels() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test
	public void testLocalizeLabels_1()
		throws Exception {
		SelectOption fixture = new SelectOption(new Specification());
		fixture.localizedLabels = true;
		fixture.isDefined = true;

		boolean result = fixture.localizeLabels();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean localizeLabels() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test
	public void testLocalizeLabels_2()
		throws Exception {
		SelectOption fixture = new SelectOption(new Specification());
		fixture.localizedLabels = false;
		fixture.isDefined = true;

		boolean result = fixture.localizeLabels();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		SelectOption fixture = new SelectOption(new Specification());
		fixture.localizedLabels = true;
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.FreeColObject.readAttributes(FreeColObject.java:1257)
		//       at net.sf.freecol.common.option.AbstractOption.readAttributes(AbstractOption.java:190)
		//       at net.sf.freecol.common.option.IntegerOption.readAttributes(IntegerOption.java:197)
		//       at net.sf.freecol.common.option.SelectOption.readAttributes(SelectOption.java:180)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		SelectOption fixture = new SelectOption(new Specification());
		fixture.localizedLabels = true;
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.FreeColObject.readAttributes(FreeColObject.java:1257)
		//       at net.sf.freecol.common.option.AbstractOption.readAttributes(AbstractOption.java:190)
		//       at net.sf.freecol.common.option.IntegerOption.readAttributes(IntegerOption.java:197)
		//       at net.sf.freecol.common.option.SelectOption.readAttributes(SelectOption.java:180)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test
	public void testReadChild_1()
		throws Exception {
		SelectOption fixture = new SelectOption(new Specification());
		fixture.localizedLabels = true;
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.option.SelectOption.readChild(SelectOption.java:209)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test
	public void testReadChild_2()
		throws Exception {
		SelectOption fixture = new SelectOption(new Specification());
		fixture.localizedLabels = true;
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.option.SelectOption.readChild(SelectOption.java:209)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test
	public void testReadChild_3()
		throws Exception {
		SelectOption fixture = new SelectOption(new Specification());
		fixture.localizedLabels = true;
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.option.SelectOption.readChild(SelectOption.java:209)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test
	public void testReadChild_4()
		throws Exception {
		SelectOption fixture = new SelectOption(new Specification());
		fixture.localizedLabels = true;
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.option.SelectOption.readChild(SelectOption.java:209)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test
	public void testReadChildren_1()
		throws Exception {
		SelectOption fixture = new SelectOption(new Specification());
		fixture.localizedLabels = true;
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.option.SelectOption.readChildren(SelectOption.java:192)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test
	public void testReadChildren_2()
		throws Exception {
		SelectOption fixture = new SelectOption(new Specification());
		fixture.localizedLabels = true;
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.option.SelectOption.readChildren(SelectOption.java:192)
	}

	/**
	 * Run the void setValue(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test
	public void testSetValue_1()
		throws Exception {
		SelectOption fixture = new SelectOption(new Specification());
		fixture.localizedLabels = true;
		fixture.isDefined = true;
		Integer value = new Integer(1);

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test
	public void testSetValue_2()
		throws Exception {
		SelectOption fixture = new SelectOption(new Specification());
		fixture.localizedLabels = true;
		fixture.isDefined = true;
		Integer value = new Integer(1);

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test
	public void testSetValue_3()
		throws Exception {
		SelectOption fixture = new SelectOption(new Specification());
		fixture.localizedLabels = true;
		fixture.isDefined = true;
		Integer value = new Integer(1);

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test
	public void testSetValue_4()
		throws Exception {
		SelectOption fixture = new SelectOption(new Specification());
		fixture.localizedLabels = true;
		fixture.isDefined = true;
		Integer value = new Integer(1);

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test
	public void testSetValue_5()
		throws Exception {
		SelectOption fixture = new SelectOption(new Specification());
		fixture.localizedLabels = true;
		fixture.isDefined = true;
		Integer value = new Integer(1);

		fixture.setValue(value);

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
		SelectOption fixture = new SelectOption(new Specification());
		fixture.localizedLabels = true;
		fixture.isDefined = true;

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[null value=0 localized=true]", result);
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
		SelectOption fixture = new SelectOption(new Specification());
		fixture.localizedLabels = true;
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
		SelectOption fixture = new SelectOption(new Specification());
		fixture.localizedLabels = true;
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
		SelectOption fixture = new SelectOption(new Specification());
		fixture.localizedLabels = true;
		fixture.isDefined = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test
	public void testWriteChildren_1()
		throws Exception {
		SelectOption fixture = new SelectOption(new Specification());
		fixture.localizedLabels = true;
		fixture.isDefined = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test
	public void testWriteChildren_2()
		throws Exception {
		SelectOption fixture = new SelectOption(new Specification());
		fixture.localizedLabels = true;
		fixture.isDefined = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test
	public void testWriteChildren_3()
		throws Exception {
		SelectOption fixture = new SelectOption(new Specification());
		fixture.localizedLabels = true;
		fixture.isDefined = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test
	public void testWriteChildren_4()
		throws Exception {
		SelectOption fixture = new SelectOption(new Specification());
		fixture.localizedLabels = true;
		fixture.isDefined = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test
	public void testWriteChildren_5()
		throws Exception {
		SelectOption fixture = new SelectOption(new Specification());
		fixture.localizedLabels = true;
		fixture.isDefined = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test
	public void testWriteChildren_6()
		throws Exception {
		SelectOption fixture = new SelectOption(new Specification());
		fixture.localizedLabels = true;
		fixture.isDefined = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:47 PM
	 */
	@Test
	public void testWriteChildren_7()
		throws Exception {
		SelectOption fixture = new SelectOption(new Specification());
		fixture.localizedLabels = true;
		fixture.isDefined = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

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
		new org.junit.runner.JUnitCore().run(SelectOptionTest.class);
	}
}