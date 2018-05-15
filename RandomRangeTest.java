package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import java.util.List;
import java.util.Random;
import net.sf.freecol.common.io.FreeColXMLReader;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>RandomRangeTest</code> contains tests for the class <code>{@link RandomRange}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:18 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class RandomRangeTest {
	/**
	 * Run the RandomRange(FreeColXMLReader) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testRandomRange_1()
		throws Exception {
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		RandomRange result = new RandomRange(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:321)
		//       at net.sf.freecol.common.model.RandomRange.readFromXML(RandomRange.java:232)
		//       at net.sf.freecol.common.model.RandomRange.<init>(RandomRange.java:91)
		assertNotNull(result);
	}

	/**
	 * Run the RandomRange(FreeColXMLReader) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testRandomRange_2()
		throws Exception {
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		RandomRange result = new RandomRange(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:321)
		//       at net.sf.freecol.common.model.RandomRange.readFromXML(RandomRange.java:232)
		//       at net.sf.freecol.common.model.RandomRange.<init>(RandomRange.java:91)
		assertNotNull(result);
	}

	/**
	 * Run the RandomRange(int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testRandomRange_3()
		throws Exception {
		int probability = 1;
		int minimum = 1;
		int maximum = 1;
		int factor = 1;

		RandomRange result = new RandomRange(probability, minimum, maximum, factor);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getMaximum());
		assertEquals(1, result.getMinimum());
		assertEquals(1, result.getProbability());
		assertEquals(1, result.getFactor());
	}

	/**
	 * Run the RandomRange(int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testRandomRange_4()
		throws Exception {
		int probability = 1;
		int minimum = 1;
		int maximum = 1;
		int factor = 1;

		RandomRange result = new RandomRange(probability, minimum, maximum, factor);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getMaximum());
		assertEquals(1, result.getMinimum());
		assertEquals(1, result.getProbability());
		assertEquals(1, result.getFactor());
	}

	/**
	 * Run the RandomRange(int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testRandomRange_5()
		throws Exception {
		int probability = -1;
		int minimum = 1;
		int maximum = 1;
		int factor = 1;

		RandomRange result = new RandomRange(probability, minimum, maximum, factor);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean appliesTo(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testAppliesTo_1()
		throws Exception {
		RandomRange fixture = new RandomRange(1, 1, 1, 1);
		FreeColObject fco = new AbstractGoods();

		boolean result = fixture.appliesTo(fco);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean appliesTo(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testAppliesTo_2()
		throws Exception {
		RandomRange fixture = new RandomRange(1, 1, 1, 1);
		FreeColObject fco = new AbstractGoods();

		boolean result = fixture.appliesTo(fco);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean appliesTo(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testAppliesTo_3()
		throws Exception {
		RandomRange fixture = new RandomRange(1, 1, 1, 1);
		FreeColObject fco = new AbstractGoods();

		boolean result = fixture.appliesTo(fco);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the int getAmount(String,Random,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testGetAmount_1()
		throws Exception {
		RandomRange fixture = new RandomRange(100, 1, 1, 1);
		String prefix = "";
		Random random = new Random();
		boolean continuous = true;

		int result = fixture.getAmount(prefix, random, continuous);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getAmount(String,Random,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testGetAmount_2()
		throws Exception {
		RandomRange fixture = new RandomRange(1, 1, 1, 1);
		String prefix = "";
		Random random = new Random();
		boolean continuous = false;

		int result = fixture.getAmount(prefix, random, continuous);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getAmount(String,Random,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testGetAmount_3()
		throws Exception {
		RandomRange fixture = new RandomRange(0, 1, 1, 1);
		String prefix = "";
		Random random = new Random();
		boolean continuous = true;

		int result = fixture.getAmount(prefix, random, continuous);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getAmount(String,Random,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testGetAmount_4()
		throws Exception {
		RandomRange fixture = new RandomRange(1, 1, 1, 1);
		String prefix = "";
		Random random = new Random();
		boolean continuous = true;

		int result = fixture.getAmount(prefix, random, continuous);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getFactor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testGetFactor_1()
		throws Exception {
		RandomRange fixture = new RandomRange(1, 1, 1, 1);

		int result = fixture.getFactor();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getMaximum() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testGetMaximum_1()
		throws Exception {
		RandomRange fixture = new RandomRange(1, 1, 1, 1);

		int result = fixture.getMaximum();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getMinimum() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testGetMinimum_1()
		throws Exception {
		RandomRange fixture = new RandomRange(1, 1, 1, 1);

		int result = fixture.getMinimum();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getProbability() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testGetProbability_1()
		throws Exception {
		RandomRange fixture = new RandomRange(1, 1, 1, 1);

		int result = fixture.getProbability();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the List<Scope> getScopes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testGetScopes_1()
		throws Exception {
		RandomRange fixture = new RandomRange(1, 1, 1, 1);

		List<Scope> result = fixture.getScopes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Scope> getScopes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testGetScopes_2()
		throws Exception {
		RandomRange fixture = new RandomRange(1, 1, 1, 1);

		List<Scope> result = fixture.getScopes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the void readFromXML(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testReadFromXML_1()
		throws Exception {
		RandomRange fixture = new RandomRange(1, 1, 1, 1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readFromXML(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:321)
		//       at net.sf.freecol.common.model.RandomRange.readFromXML(RandomRange.java:232)
	}

	/**
	 * Run the void readFromXML(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testReadFromXML_2()
		throws Exception {
		RandomRange fixture = new RandomRange(1, 1, 1, 1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readFromXML(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:321)
		//       at net.sf.freecol.common.model.RandomRange.readFromXML(RandomRange.java:232)
	}

	/**
	 * Run the void readFromXML(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testReadFromXML_3()
		throws Exception {
		RandomRange fixture = new RandomRange(1, 1, 1, 1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readFromXML(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:321)
		//       at net.sf.freecol.common.model.RandomRange.readFromXML(RandomRange.java:232)
	}

	/**
	 * Run the void readFromXML(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testReadFromXML_4()
		throws Exception {
		RandomRange fixture = new RandomRange(1, 1, 1, 1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readFromXML(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:321)
		//       at net.sf.freecol.common.model.RandomRange.readFromXML(RandomRange.java:232)
	}

	/**
	 * Run the void readFromXML(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testReadFromXML_5()
		throws Exception {
		RandomRange fixture = new RandomRange(1, 1, 1, 1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readFromXML(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:321)
		//       at net.sf.freecol.common.model.RandomRange.readFromXML(RandomRange.java:232)
	}

	/**
	 * Run the void readFromXML(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testReadFromXML_6()
		throws Exception {
		RandomRange fixture = new RandomRange(1, 1, 1, 1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readFromXML(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:321)
		//       at net.sf.freecol.common.model.RandomRange.readFromXML(RandomRange.java:232)
	}

	/**
	 * Run the void readFromXML(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testReadFromXML_7()
		throws Exception {
		RandomRange fixture = new RandomRange(1, 1, 1, 1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readFromXML(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:321)
		//       at net.sf.freecol.common.model.RandomRange.readFromXML(RandomRange.java:232)
	}

	/**
	 * Run the void readFromXML(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testReadFromXML_8()
		throws Exception {
		RandomRange fixture = new RandomRange(1, 1, 1, 1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readFromXML(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:321)
		//       at net.sf.freecol.common.model.RandomRange.readFromXML(RandomRange.java:232)
	}

	/**
	 * Run the void toXML(FreeColXMLWriter,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testToXML_1()
		throws Exception {
		RandomRange fixture = new RandomRange(1, 1, 1, 1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);
		String tag = "";

		fixture.toXML(xw, tag);

		// add additional test code here
	}

	/**
	 * Run the void toXML(FreeColXMLWriter,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testToXML_2()
		throws Exception {
		RandomRange fixture = new RandomRange(1, 1, 1, 1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);
		String tag = "";

		fixture.toXML(xw, tag);

		// add additional test code here
	}

	/**
	 * Run the void toXML(FreeColXMLWriter,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testToXML_3()
		throws Exception {
		RandomRange fixture = new RandomRange(1, 1, 1, 1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);
		String tag = "";

		fixture.toXML(xw, tag);

		// add additional test code here
	}

	/**
	 * Run the void toXML(FreeColXMLWriter,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testToXML_4()
		throws Exception {
		RandomRange fixture = new RandomRange(1, 1, 1, 1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);
		String tag = "";

		fixture.toXML(xw, tag);

		// add additional test code here
	}

	/**
	 * Run the void toXML(FreeColXMLWriter,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testToXML_5()
		throws Exception {
		RandomRange fixture = new RandomRange(1, 1, 1, 1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);
		String tag = "";

		fixture.toXML(xw, tag);

		// add additional test code here
	}

	/**
	 * Run the void toXML(FreeColXMLWriter,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testToXML_6()
		throws Exception {
		RandomRange fixture = new RandomRange(1, 1, 1, 1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);
		String tag = "";

		fixture.toXML(xw, tag);

		// add additional test code here
	}

	/**
	 * Run the void toXML(FreeColXMLWriter,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testToXML_7()
		throws Exception {
		RandomRange fixture = new RandomRange(1, 1, 1, 1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);
		String tag = "";

		fixture.toXML(xw, tag);

		// add additional test code here
	}

	/**
	 * Run the void toXML(FreeColXMLWriter,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testToXML_8()
		throws Exception {
		RandomRange fixture = new RandomRange(1, 1, 1, 1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);
		String tag = "";

		fixture.toXML(xw, tag);

		// add additional test code here
	}

	/**
	 * Run the void toXML(FreeColXMLWriter,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testToXML_9()
		throws Exception {
		RandomRange fixture = new RandomRange(1, 1, 1, 1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);
		String tag = "";

		fixture.toXML(xw, tag);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(RandomRangeTest.class);
	}
}