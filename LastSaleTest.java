package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import javax.imageio.metadata.IIOMetadataNode;
import javax.xml.stream.XMLStreamException;
import net.sf.freecol.common.io.FreeColXMLReader;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>LastSaleTest</code> contains tests for the class <code>{@link LastSale}</code>.
 *
 * @generatedBy CodePro at 5/14/18 3:44 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class LastSaleTest {
	/**
	 * Run the LastSale(FreeColXMLReader) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testLastSale_1()
		throws Exception {
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		LastSale result = new LastSale(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.LastSale.<init>(LastSale.java:76)
		assertNotNull(result);
	}

	/**
	 * Run the LastSale(FreeColXMLReader) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testLastSale_2()
		throws Exception {
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		LastSale result = new LastSale(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.LastSale.<init>(LastSale.java:76)
		assertNotNull(result);
	}

	/**
	 * Run the LastSale(Element) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testLastSale_3()
		throws Exception {
		Element element = new IIOMetadataNode();

		LastSale result = new LastSale(element);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.LastSale.<init>(LastSale.java:85)
		assertNotNull(result);
	}

	/**
	 * Run the LastSale(String,Turn,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testLastSale_4()
		throws Exception {
		String id = "";
		Turn when = new Turn(1);
		int price = 1;

		LastSale result = new LastSale(id, when, price);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[ when=1 price=1]", result.toString());
		assertEquals(1, result.getPrice());
		assertEquals("lastSale", result.getXMLTagName());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("<lastSale id=\"\" when=\"1\" price=\"1\"></lastSale>", result.serialize());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
	}

	/**
	 * Run the LastSale(Location,GoodsType,Turn,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testLastSale_5()
		throws Exception {
		Location where = new HighSeas(new Game(new IIOMetadataNode(), ""));
		GoodsType what = new GoodsType("", new Specification());
		Turn when = new Turn(1);
		int price = 1;

		LastSale result = new LastSale(where, what, when, price);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int compareTo(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testCompareTo_1()
		throws Exception {
		LastSale fixture = new LastSale("", new Turn(1), 1);
		FreeColObject other = new AbstractGoods();

		int result = fixture.compareTo(other);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int compareTo(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testCompareTo_2()
		throws Exception {
		LastSale fixture = new LastSale("", new Turn(1), 1);
		FreeColObject other = new LastSale(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		int result = fixture.compareTo(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.LastSale.<init>(LastSale.java:76)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPrice() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testGetPrice_1()
		throws Exception {
		LastSale fixture = new LastSale("", new Turn(1), 1);

		int result = fixture.getPrice();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the Turn getWhen() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testGetWhen_1()
		throws Exception {
		LastSale fixture = new LastSale("", new Turn(1), 1);

		Turn result = fixture.getWhen();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
		assertEquals(1, result.getNumber());
		assertEquals(1492, result.getYear());
		assertEquals(-1, result.getSeason());
		assertEquals(true, result.isFirstTurn());
		assertEquals(false, result.isFirstSeasonTurn());
		assertEquals("1492", result.getSaveGameSuffix());
	}

	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = LastSale.getXMLElementTagName();

		// add additional test code here
		assertEquals("lastSale", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		LastSale fixture = new LastSale("", new Turn(1), 1);

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("lastSale", result);
	}

	/**
	 * Run the String makeKey(Location,GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testMakeKey_1()
		throws Exception {
		Location where = new HighSeas(new Game(new IIOMetadataNode(), ""));
		GoodsType what = new GoodsType("", new Specification());

		String result = LastSale.makeKey(where, what);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		LastSale fixture = new LastSale("", new Turn(1), 1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.FreeColObject.readAttributes(FreeColObject.java:1257)
		//       at net.sf.freecol.common.model.LastSale.readAttributes(LastSale.java:160)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		LastSale fixture = new LastSale("", new Turn(1), 1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.FreeColObject.readAttributes(FreeColObject.java:1257)
		//       at net.sf.freecol.common.model.LastSale.readAttributes(LastSale.java:160)
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		LastSale fixture = new LastSale("", new Turn(1), 1);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[ when=1 price=1]", result);
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_1()
		throws Exception {
		LastSale fixture = new LastSale("", new Turn(1), 1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_2()
		throws Exception {
		LastSale fixture = new LastSale("", new Turn(1), 1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_3()
		throws Exception {
		LastSale fixture = new LastSale("", new Turn(1), 1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_4()
		throws Exception {
		LastSale fixture = new LastSale("", new Turn(1), 1);
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
	 * @generatedBy CodePro at 5/14/18 3:44 PM
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
	 * @generatedBy CodePro at 5/14/18 3:44 PM
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
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(LastSaleTest.class);
	}
}