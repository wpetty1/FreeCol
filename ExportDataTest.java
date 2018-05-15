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
 * The class <code>ExportDataTest</code> contains tests for the class <code>{@link ExportData}</code>.
 *
 * @generatedBy CodePro at 5/14/18 3:18 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class ExportDataTest {
	/**
	 * Run the ExportData(FreeColXMLReader) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testExportData_1()
		throws Exception {
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		ExportData result = new ExportData(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.ExportData.<init>(ExportData.java:69)
		assertNotNull(result);
	}

	/**
	 * Run the ExportData(FreeColXMLReader) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testExportData_2()
		throws Exception {
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		ExportData result = new ExportData(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.ExportData.<init>(ExportData.java:69)
		assertNotNull(result);
	}

	/**
	 * Run the ExportData(GoodsType) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testExportData_3()
		throws Exception {
		GoodsType goodsType = new GoodsType("", new Specification());

		ExportData result = new ExportData(goodsType);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.getExported());
		assertEquals(50, result.getExportLevel());
		assertEquals(10, result.getLowLevel());
		assertEquals(90, result.getHighLevel());
		assertEquals("exportData", result.getXMLTagName());
		assertEquals("net.sf.freecol.common.model.ExportData:", result.toString());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("<exportData id=\"\" exported=\"false\" highLevel=\"90\" lowLevel=\"10\" exportLevel=\"50\"></exportData>", result.serialize());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the ExportData(Element) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testExportData_4()
		throws Exception {
		Element element = new IIOMetadataNode();

		ExportData result = new ExportData(element);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.ExportData.<init>(ExportData.java:78)
		assertNotNull(result);
	}

	/**
	 * Run the int getExportLevel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testGetExportLevel_1()
		throws Exception {
		ExportData fixture = new ExportData(new GoodsType("", new Specification()));
		fixture.setHighLevel(1);
		fixture.setExported(true);
		fixture.setExportLevel(1);
		fixture.setLowLevel(1);

		int result = fixture.getExportLevel();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the boolean getExported() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testGetExported_1()
		throws Exception {
		ExportData fixture = new ExportData(new GoodsType("", new Specification()));
		fixture.setHighLevel(1);
		fixture.setExported(true);
		fixture.setExportLevel(1);
		fixture.setLowLevel(1);

		boolean result = fixture.getExported();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean getExported() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testGetExported_2()
		throws Exception {
		ExportData fixture = new ExportData(new GoodsType("", new Specification()));
		fixture.setHighLevel(1);
		fixture.setExported(false);
		fixture.setExportLevel(1);
		fixture.setLowLevel(1);

		boolean result = fixture.getExported();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the int getHighLevel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testGetHighLevel_1()
		throws Exception {
		ExportData fixture = new ExportData(new GoodsType("", new Specification()));
		fixture.setHighLevel(1);
		fixture.setExported(true);
		fixture.setExportLevel(1);
		fixture.setLowLevel(1);

		int result = fixture.getHighLevel();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getLowLevel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testGetLowLevel_1()
		throws Exception {
		ExportData fixture = new ExportData(new GoodsType("", new Specification()));
		fixture.setHighLevel(1);
		fixture.setExported(true);
		fixture.setExportLevel(1);
		fixture.setLowLevel(1);

		int result = fixture.getLowLevel();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = ExportData.getXMLElementTagName();

		// add additional test code here
		assertEquals("exportData", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		ExportData fixture = new ExportData(new GoodsType("", new Specification()));
		fixture.setHighLevel(1);
		fixture.setExported(true);
		fixture.setExportLevel(1);
		fixture.setLowLevel(1);

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("exportData", result);
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		ExportData fixture = new ExportData(new GoodsType("", new Specification()));
		fixture.setHighLevel(1);
		fixture.setExported(true);
		fixture.setExportLevel(1);
		fixture.setLowLevel(1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.FreeColObject.readAttributes(FreeColObject.java:1257)
		//       at net.sf.freecol.common.model.ExportData.readAttributes(ExportData.java:185)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		ExportData fixture = new ExportData(new GoodsType("", new Specification()));
		fixture.setHighLevel(1);
		fixture.setExported(true);
		fixture.setExportLevel(1);
		fixture.setLowLevel(1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.FreeColObject.readAttributes(FreeColObject.java:1257)
		//       at net.sf.freecol.common.model.ExportData.readAttributes(ExportData.java:185)
	}

	/**
	 * Run the ExportData setExportLevel(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testSetExportLevel_1()
		throws Exception {
		ExportData fixture = new ExportData(new GoodsType("", new Specification()));
		fixture.setHighLevel(1);
		fixture.setExported(true);
		fixture.setExportLevel(1);
		fixture.setLowLevel(1);
		int newExportLevel = 1;

		ExportData result = fixture.setExportLevel(newExportLevel);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.getExported());
		assertEquals(1, result.getExportLevel());
		assertEquals(1, result.getLowLevel());
		assertEquals(1, result.getHighLevel());
		assertEquals("exportData", result.getXMLTagName());
		assertEquals("net.sf.freecol.common.model.ExportData:", result.toString());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("<exportData id=\"\" exported=\"true\" highLevel=\"1\" lowLevel=\"1\" exportLevel=\"1\"></exportData>", result.serialize());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the void setExported(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testSetExported_1()
		throws Exception {
		ExportData fixture = new ExportData(new GoodsType("", new Specification()));
		fixture.setHighLevel(1);
		fixture.setExported(true);
		fixture.setExportLevel(1);
		fixture.setLowLevel(1);
		boolean newExport = true;

		fixture.setExported(newExport);

		// add additional test code here
	}

	/**
	 * Run the ExportData setHighLevel(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testSetHighLevel_1()
		throws Exception {
		ExportData fixture = new ExportData(new GoodsType("", new Specification()));
		fixture.setHighLevel(1);
		fixture.setExported(true);
		fixture.setExportLevel(1);
		fixture.setLowLevel(1);
		int newHighLevel = 1;

		ExportData result = fixture.setHighLevel(newHighLevel);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.getExported());
		assertEquals(1, result.getExportLevel());
		assertEquals(1, result.getLowLevel());
		assertEquals(1, result.getHighLevel());
		assertEquals("exportData", result.getXMLTagName());
		assertEquals("net.sf.freecol.common.model.ExportData:", result.toString());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("<exportData id=\"\" exported=\"true\" highLevel=\"1\" lowLevel=\"1\" exportLevel=\"1\"></exportData>", result.serialize());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the ExportData setLowLevel(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test
	public void testSetLowLevel_1()
		throws Exception {
		ExportData fixture = new ExportData(new GoodsType("", new Specification()));
		fixture.setHighLevel(1);
		fixture.setExported(true);
		fixture.setExportLevel(1);
		fixture.setLowLevel(1);
		int newLowLevel = 1;

		ExportData result = fixture.setLowLevel(newLowLevel);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.getExported());
		assertEquals(1, result.getExportLevel());
		assertEquals(1, result.getLowLevel());
		assertEquals(1, result.getHighLevel());
		assertEquals("exportData", result.getXMLTagName());
		assertEquals("net.sf.freecol.common.model.ExportData:", result.toString());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("<exportData id=\"\" exported=\"true\" highLevel=\"1\" lowLevel=\"1\" exportLevel=\"1\"></exportData>", result.serialize());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_1()
		throws Exception {
		ExportData fixture = new ExportData(new GoodsType("", new Specification()));
		fixture.setHighLevel(1);
		fixture.setExported(true);
		fixture.setExportLevel(1);
		fixture.setLowLevel(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_2()
		throws Exception {
		ExportData fixture = new ExportData(new GoodsType("", new Specification()));
		fixture.setHighLevel(1);
		fixture.setExported(true);
		fixture.setExportLevel(1);
		fixture.setLowLevel(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_3()
		throws Exception {
		ExportData fixture = new ExportData(new GoodsType("", new Specification()));
		fixture.setHighLevel(1);
		fixture.setExported(true);
		fixture.setExportLevel(1);
		fixture.setLowLevel(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_4()
		throws Exception {
		ExportData fixture = new ExportData(new GoodsType("", new Specification()));
		fixture.setHighLevel(1);
		fixture.setExported(true);
		fixture.setExportLevel(1);
		fixture.setLowLevel(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_5()
		throws Exception {
		ExportData fixture = new ExportData(new GoodsType("", new Specification()));
		fixture.setHighLevel(1);
		fixture.setExported(true);
		fixture.setExportLevel(1);
		fixture.setLowLevel(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_6()
		throws Exception {
		ExportData fixture = new ExportData(new GoodsType("", new Specification()));
		fixture.setHighLevel(1);
		fixture.setExported(true);
		fixture.setExportLevel(1);
		fixture.setLowLevel(1);
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
	 * @generatedBy CodePro at 5/14/18 3:18 PM
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
	 * @generatedBy CodePro at 5/14/18 3:18 PM
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
	 * @generatedBy CodePro at 5/14/18 3:18 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ExportDataTest.class);
	}
}