package net.sf.freecol.common.option;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import net.sf.freecol.common.model.AbstractUnit;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import net.sf.freecol.common.io.FreeColXMLReader;
import net.sf.freecol.common.model.Specification;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AbstractUnitOptionTest</code> contains tests for the class <code>{@link AbstractUnitOption}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:45 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class AbstractUnitOptionTest {
	/**
	 * Run the AbstractUnitOption(Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testAbstractUnitOption_1()
		throws Exception {
		Specification specification = new Specification();

		AbstractUnitOption result = new AbstractUnitOption(specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[null null]", result.toString());
		assertEquals(null, result.getValue());
		assertEquals(null, result.getNumber());
		assertEquals(null, result.getUnitType());
		assertEquals(null, result.getRole());
		assertEquals("unitOption", result.getXMLTagName());
		assertEquals(true, result.isNullValueOK());
		assertEquals("", result.getGroup());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the AbstractUnitOption(String,Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testAbstractUnitOption_2()
		throws Exception {
		String id = "";
		Specification specification = new Specification();

		AbstractUnitOption result = new AbstractUnitOption(id, specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[ null]", result.toString());
		assertEquals(null, result.getValue());
		assertEquals(null, result.getNumber());
		assertEquals(null, result.getUnitType());
		assertEquals(null, result.getRole());
		assertEquals("unitOption", result.getXMLTagName());
		assertEquals(true, result.isNullValueOK());
		assertEquals("", result.getGroup());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the AbstractUnitOption clone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testClone_1()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue((AbstractUnit) null);
		fixture.isDefined = true;

		AbstractUnitOption result = fixture.clone();

		// add additional test code here
		assertNotNull(result);
		assertEquals("[null null]", result.toString());
		assertEquals(null, result.getValue());
		assertEquals(null, result.getNumber());
		assertEquals(null, result.getUnitType());
		assertEquals(null, result.getRole());
		assertEquals("unitOption", result.getXMLTagName());
		assertEquals(true, result.isNullValueOK());
		assertEquals("", result.getGroup());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the AbstractUnitOption clone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testClone_2()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = true;

		AbstractUnitOption result = fixture.clone();

		// add additional test code here
		assertNotNull(result);
		assertEquals("[null 1  ()]", result.toString());
		assertEquals("unitOption", result.getXMLTagName());
		assertEquals(true, result.isNullValueOK());
		assertEquals("", result.getGroup());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals("<unitOption><number id=\"null.number\" value=\"1\"></number><role id=\"null.role\" value=\"\"></role><unitType id=\"null.unitType\" value=\"\" generate=\"units\"></unitType></unitOption>", result.serialize());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the void generateChoices() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testGenerateChoices_1()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = true;

		fixture.generateChoices();

		// add additional test code here
	}

	/**
	 * Run the void generateChoices() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testGenerateChoices_2()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = true;

		fixture.generateChoices();

		// add additional test code here
	}

	/**
	 * Run the IntegerOption getNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testGetNumber_1()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = true;

		IntegerOption result = fixture.getNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals("[null.number value=1]", result.toString());
		assertEquals(new Integer(1), result.getValue());
		assertEquals(Integer.MIN_VALUE, result.getMinimumValue());
		assertEquals(Integer.MAX_VALUE, result.getMaximumValue());
		assertEquals("integerOption", result.getXMLTagName());
		assertEquals("", result.getGroup());
		assertEquals(false, result.isNullValueOK());
		assertEquals("null.number", result.getId());
		assertEquals("number", result.getSuffix());
		assertEquals("<integerOption id=\"null.number\" value=\"1\"></integerOption>", result.serialize());
		assertEquals("null.number", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the StringOption getRole() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testGetRole_1()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = true;

		StringOption result = fixture.getRole();

		// add additional test code here
		assertNotNull(result);
		assertEquals("[null.role value= choices=[]]", result.toString());
		assertEquals("", result.getValue());
		assertEquals("stringOption", result.getXMLTagName());
		assertEquals("", result.getGroup());
		assertEquals(false, result.isNullValueOK());
		assertEquals("null.role", result.getId());
		assertEquals("role", result.getSuffix());
		assertEquals("<stringOption id=\"null.role\" value=\"\"></stringOption>", result.serialize());
		assertEquals("null.role", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the UnitTypeOption getUnitType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testGetUnitType_1()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = true;

		UnitTypeOption result = fixture.getUnitType();

		// add additional test code here
		assertNotNull(result);
		assertEquals("[null.unitType value= addNone=false selector=UNITS]", result.toString());
		assertEquals("unitTypeOption", result.getXMLTagName());
		assertEquals(true, result.isNullValueOK());
		assertEquals(false, result.addNone());
		assertEquals("", result.getGroup());
		assertEquals("null.unitType", result.getId());
		assertEquals("unitType", result.getSuffix());
		assertEquals("<unitTypeOption id=\"null.unitType\" value=\"\" generate=\"units\"></unitTypeOption>", result.serialize());
		assertEquals("null.unitType", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the AbstractUnit getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testGetValue_1()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = true;

		AbstractUnit result = fixture.getValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1  ()", result.toString());
		assertEquals(1, result.getNumber());
		assertEquals("", result.getRoleId());
		assertEquals("", result.getDescription());
		assertEquals("abstractUnit", result.getXMLTagName());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("<abstractUnit id=\"\" role=\"\" number=\"1\"></abstractUnit>", result.serialize());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
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

		String result = AbstractUnitOption.getXMLElementTagName();

		// add additional test code here
		assertEquals("unitOption", result);
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
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = true;

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("unitOption", result);
	}

	/**
	 * Run the boolean isNullValueOK() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testIsNullValueOK_1()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = true;

		boolean result = fixture.isNullValueOK();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testReadChild_1()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.option.AbstractUnitOption.readChild(AbstractUnitOption.java:246)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testReadChild_2()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.option.AbstractUnitOption.readChild(AbstractUnitOption.java:246)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testReadChild_3()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.option.AbstractUnitOption.readChild(AbstractUnitOption.java:246)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testReadChild_4()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.option.AbstractUnitOption.readChild(AbstractUnitOption.java:246)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testReadChild_5()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.option.AbstractUnitOption.readChild(AbstractUnitOption.java:246)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testReadChild_6()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.option.AbstractUnitOption.readChild(AbstractUnitOption.java:246)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testReadChild_7()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.option.AbstractUnitOption.readChild(AbstractUnitOption.java:246)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testReadChild_8()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.option.AbstractUnitOption.readChild(AbstractUnitOption.java:246)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testReadChild_9()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.option.AbstractUnitOption.readChild(AbstractUnitOption.java:246)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testReadChildren_1()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.readChildren(FreeColObject.java:1274)
		//       at net.sf.freecol.common.option.AbstractUnitOption.readChildren(AbstractUnitOption.java:229)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testReadChildren_2()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.readChildren(FreeColObject.java:1274)
		//       at net.sf.freecol.common.option.AbstractUnitOption.readChildren(AbstractUnitOption.java:229)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testReadChildren_3()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.readChildren(FreeColObject.java:1274)
		//       at net.sf.freecol.common.option.AbstractUnitOption.readChildren(AbstractUnitOption.java:229)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testReadChildren_4()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.readChildren(FreeColObject.java:1274)
		//       at net.sf.freecol.common.option.AbstractUnitOption.readChildren(AbstractUnitOption.java:229)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testReadChildren_5()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.readChildren(FreeColObject.java:1274)
		//       at net.sf.freecol.common.option.AbstractUnitOption.readChildren(AbstractUnitOption.java:229)
	}

	/**
	 * Run the void setValue(AbstractUnit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testSetValue_1()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = true;
		AbstractUnit value = new AbstractUnit("", "", 1);

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(AbstractUnit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testSetValue_2()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = true;
		AbstractUnit value = null;

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(AbstractUnit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testSetValue_3()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = true;
		AbstractUnit value = new AbstractUnit("", "", 1);

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(AbstractUnit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testSetValue_4()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = false;
		AbstractUnit value = new AbstractUnit("", "", 1);

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(AbstractUnit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testSetValue_5()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = false;
		AbstractUnit value = null;

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(AbstractUnit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testSetValue_6()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue((AbstractUnit) null);
		fixture.isDefined = true;
		AbstractUnit value = null;

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(AbstractUnit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testSetValue_7()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = true;
		AbstractUnit value = new AbstractUnit("", "", 1);

		fixture.setValue(value);

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
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = true;

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[null 1  ()]", result);
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testWriteChildren_1()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
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
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testWriteChildren_2()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
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
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testWriteChildren_3()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
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
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testWriteChildren_4()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
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
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testWriteChildren_5()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
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
		new org.junit.runner.JUnitCore().run(AbstractUnitOptionTest.class);
	}
}