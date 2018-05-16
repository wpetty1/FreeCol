package net.sf.freecol.common.option;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import javax.xml.stream.XMLStreamException;
import org.junit.*;
import net.sf.freecol.common.io.FreeColXMLReader;
import net.sf.freecol.common.model.Specification;
import static org.junit.Assert.*;

/**
 * The class <code>AbstractOptionTest</code> contains tests for the class <code>{@link AbstractOption}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:45 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class AbstractOptionTest {
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
		fixture.isDefined = true;

		fixture.generateChoices();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.option.AbstractUnitOption.generateChoices(AbstractUnitOption.java:194)
	}

	/**
	 * Run the String getGroup() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testGetGroup_1()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.isDefined = true;

		String result = fixture.getGroup();

		// add additional test code here
		assertEquals("", result);
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
		fixture.isDefined = true;

		boolean result = fixture.isNullValueOK();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
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
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
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
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testReadAttributes_3()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
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
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testReadAttributes_4()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
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
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testReadAttributes_5()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
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
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testReadAttributes_6()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
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
	}

	/**
	 * Run the AbstractOption readOption(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testReadOption_1()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		AbstractOption result = fixture.readOption(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.option.AbstractOption.readOption(AbstractOption.java:218)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractOption readOption(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testReadOption_2()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		AbstractOption result = fixture.readOption(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.option.AbstractOption.readOption(AbstractOption.java:218)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractOption readOption(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testReadOption_3()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		AbstractOption result = fixture.readOption(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.option.AbstractOption.readOption(AbstractOption.java:218)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractOption readOption(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testReadOption_4()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		AbstractOption result = fixture.readOption(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.option.AbstractOption.readOption(AbstractOption.java:218)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractOption readOption(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testReadOption_5()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		AbstractOption result = fixture.readOption(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.option.AbstractOption.readOption(AbstractOption.java:218)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractOption readOption(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testReadOption_6()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		AbstractOption result = fixture.readOption(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.option.AbstractOption.readOption(AbstractOption.java:218)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractOption readOption(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testReadOption_7()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		AbstractOption result = fixture.readOption(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.option.AbstractOption.readOption(AbstractOption.java:218)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractOption readOption(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testReadOption_8()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		AbstractOption result = fixture.readOption(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.option.AbstractOption.readOption(AbstractOption.java:218)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractOption readOption(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testReadOption_9()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		AbstractOption result = fixture.readOption(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.option.AbstractOption.readOption(AbstractOption.java:218)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractOption readOption(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testReadOption_10()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		AbstractOption result = fixture.readOption(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.option.AbstractOption.readOption(AbstractOption.java:218)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractOption readOption(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testReadOption_11()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		AbstractOption result = fixture.readOption(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.option.AbstractOption.readOption(AbstractOption.java:218)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractOption readOption(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testReadOption_12()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		AbstractOption result = fixture.readOption(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.option.AbstractOption.readOption(AbstractOption.java:218)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractOption readOption(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testReadOption_13()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		AbstractOption result = fixture.readOption(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.option.AbstractOption.readOption(AbstractOption.java:218)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractOption readOption(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testReadOption_14()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		AbstractOption result = fixture.readOption(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.option.AbstractOption.readOption(AbstractOption.java:218)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractOption readOption(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testReadOption_15()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		AbstractOption result = fixture.readOption(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.option.AbstractOption.readOption(AbstractOption.java:218)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractOption readOption(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testReadOption_16()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		AbstractOption result = fixture.readOption(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.option.AbstractOption.readOption(AbstractOption.java:218)
		assertNotNull(result);
	}

	/**
	 * Run the void setGroup(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testSetGroup_1()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.isDefined = true;
		String group = "";

		fixture.setGroup(group);

		// add additional test code here
	}

	/**
	 * Run the void setGroup(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testSetGroup_2()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.isDefined = true;
		String group = null;

		fixture.setGroup(group);

		// add additional test code here
	}

	/**
	 * Run the void setValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testSetValue_1()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.isDefined = true;
		String valueString = "";
		String defaultValueString = "";

		fixture.setValue(valueString, defaultValueString);

		// add additional test code here
	}

	/**
	 * Run the void setValues(AbstractOption<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:45 PM
	 */
	@Test
	public void testSetValues_1()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.isDefined = true;
		AbstractUnitOption source = new AbstractUnitOption(new Specification());
		source.isDefined = true;

		fixture.setValues(source);

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
		new org.junit.runner.JUnitCore().run(AbstractOptionTest.class);
	}
}