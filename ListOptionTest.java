package net.sf.freecol.common.option;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import java.util.ArrayList;
import java.util.List;
import javax.xml.stream.XMLStreamException;
import net.sf.freecol.common.io.FreeColXMLReader;
import net.sf.freecol.common.model.Specification;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ListOptionTest</code> contains tests for the class <code>{@link ListOption}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:46 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class ListOptionTest {
	/**
	 * Run the boolean allowsDuplicates() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testAllowsDuplicates_1()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;

		boolean result = fixture.allowsDuplicates();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean allowsDuplicates() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testAllowsDuplicates_2()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = false;

		boolean result = fixture.allowsDuplicates();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean canAdd(AbstractOption<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testCanAdd_1()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;
		AbstractOption<Object> ao = new AbstractUnitOption(new Specification());

		boolean result = fixture.canAdd(ao);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean canAdd(AbstractOption<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testCanAdd_2()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = false;
		AbstractOption<Object> ao = new AbstractUnitOption(new Specification());

		boolean result = fixture.canAdd(ao);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean canAdd(AbstractOption<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testCanAdd_3()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = false;
		AbstractOption<Object> ao = new AbstractUnitOption(new Specification());

		boolean result = fixture.canAdd(ao);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the int getMaximumValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testGetMaximumValue_1()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;

		int result = fixture.getMaximumValue();

		// add additional test code here
		assertEquals(Integer.MAX_VALUE, result);
	}

	/**
	 * Run the List<Object> getOptionValues() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testGetOptionValues_1()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;

		List<Object> result = fixture.getOptionValues();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Object> getOptionValues() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testGetOptionValues_2()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;

		List<Object> result = fixture.getOptionValues();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Object> getOptionValues() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testGetOptionValues_3()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;

		List<Object> result = fixture.getOptionValues();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the AbstractOption<Object> getTemplate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testGetTemplate_1()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;

		AbstractOption<Object> result = fixture.getTemplate();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<AbstractOption<Object>> getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testGetValue_1()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;

		List<AbstractOption<Object>> result = fixture.getValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the boolean isNullValueOK() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testIsNullValueOK_1()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;

		boolean result = fixture.isNullValueOK();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;
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
		//       at net.sf.freecol.common.option.ListOption.readAttributes(ListOption.java:234)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;
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
		//       at net.sf.freecol.common.option.ListOption.readAttributes(ListOption.java:234)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testReadChild_1()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.option.ListOption.readChild(ListOption.java:255)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testReadChild_2()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.option.ListOption.readChild(ListOption.java:255)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testReadChild_3()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.option.ListOption.readChild(ListOption.java:255)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testReadChild_4()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.option.ListOption.readChild(ListOption.java:255)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testReadChild_5()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.option.ListOption.readChild(ListOption.java:255)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testReadChild_6()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.option.ListOption.readChild(ListOption.java:255)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testReadChild_7()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.option.ListOption.readChild(ListOption.java:255)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testReadChild_8()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.option.ListOption.readChild(ListOption.java:255)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testReadChild_9()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.option.ListOption.readChild(ListOption.java:255)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testReadChild_10()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.option.ListOption.readChild(ListOption.java:255)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testReadChild_11()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.option.ListOption.readChild(ListOption.java:255)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testReadChild_12()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.option.ListOption.readChild(ListOption.java:255)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testReadChild_13()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.option.ListOption.readChild(ListOption.java:255)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testReadChild_14()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.option.ListOption.readChild(ListOption.java:255)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testReadChildren_1()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.readChildren(FreeColObject.java:1274)
		//       at net.sf.freecol.common.option.ListOption.readChildren(ListOption.java:247)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testReadChildren_2()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.readChildren(FreeColObject.java:1274)
		//       at net.sf.freecol.common.option.ListOption.readChildren(ListOption.java:247)
	}

	/**
	 * Run the void setAllowDuplicates(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testSetAllowDuplicates_1()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;
		boolean allowDuplicates = true;

		fixture.setAllowDuplicates(allowDuplicates);

		// add additional test code here
	}

	/**
	 * Run the void setValue(List<AbstractOption<T>>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testSetValue_1()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;
		List<AbstractOption<Object>> value = new ArrayList<AbstractOption<Object>>();

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(List<AbstractOption<T>>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testSetValue_2()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;
		List<AbstractOption<Object>> value = new ArrayList<AbstractOption<Object>>();

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(List<AbstractOption<T>>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testSetValue_3()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = false;
		fixture.allowDuplicates = true;
		List<AbstractOption<Object>> value = new ArrayList<AbstractOption<Object>>();

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(List<AbstractOption<T>>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testSetValue_4()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = false;
		fixture.allowDuplicates = true;
		List<AbstractOption<Object>> value = new ArrayList<AbstractOption<Object>>();

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(List<AbstractOption<T>>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testSetValue_5()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;
		List<AbstractOption<Object>> value = new ArrayList<AbstractOption<Object>>();

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(List<AbstractOption<T>>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testSetValue_6()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;
		List<AbstractOption<Object>> value = new ArrayList<AbstractOption<Object>>();

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(List<AbstractOption<T>>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testSetValue_7()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;
		List<AbstractOption<Object>> value = null;

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[null [ ]]", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testToString_2()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[null [ ]]", result);
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_1()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_2()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_3()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testWriteChildren_1()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testWriteChildren_2()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testWriteChildren_3()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testWriteChildren_4()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testWriteChildren_5()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testWriteChildren_6()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testWriteChildren_7()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	@Test
	public void testWriteChildren_8()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;
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
	 * @generatedBy CodePro at 5/14/18 4:46 PM
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
	 * @generatedBy CodePro at 5/14/18 4:46 PM
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
	 * @generatedBy CodePro at 5/14/18 4:46 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ListOptionTest.class);
	}
}