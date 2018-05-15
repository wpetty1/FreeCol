package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import org.junit.*;
import net.sf.freecol.common.io.FreeColXMLReader;
import static org.junit.Assert.*;

/**
 * The class <code>TileTypeChangeTest</code> contains tests for the class <code>{@link TileTypeChange}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:31 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class TileTypeChangeTest {
	/**
	 * Run the TileTypeChange() constructor test.
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testTileTypeChange_1()
		throws Exception {
		TileTypeChange result = new TileTypeChange();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the int compareTo(TileTypeChange) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testCompareTo_1()
		throws Exception {
		TileTypeChange fixture = new TileTypeChange();
		fixture.setFrom((TileType) null);
		fixture.setTo(new TileType("", new Specification()));
		fixture.setProduction(new AbstractGoods());
		TileTypeChange other = new TileTypeChange();
		other.setFrom((TileType) null);
		other.setTo(new TileType("", new Specification()));

		int result = fixture.compareTo(other);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		TileTypeChange fixture = new TileTypeChange();
		fixture.setFrom(new TileType("", new Specification()));
		fixture.setTo(new TileType("", new Specification()));
		fixture.setProduction(new AbstractGoods());
		Object other = new TileTypeChange();

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		TileTypeChange fixture = new TileTypeChange();
		fixture.setFrom(new TileType("", new Specification()));
		fixture.setTo(new TileType("", new Specification()));
		fixture.setProduction(new AbstractGoods());
		Object other = new TileTypeChange();

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		TileTypeChange fixture = new TileTypeChange();
		fixture.setFrom(new TileType("", new Specification()));
		fixture.setTo(new TileType("", new Specification()));
		fixture.setProduction(new AbstractGoods());
		Object other = new Object();

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		TileTypeChange fixture = new TileTypeChange();
		fixture.setFrom(new TileType("", new Specification()));
		fixture.setTo(new TileType("", new Specification()));
		fixture.setProduction(new AbstractGoods());
		Object other = new Object();

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the TileType getFrom() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testGetFrom_1()
		throws Exception {
		TileTypeChange fixture = new TileTypeChange();
		fixture.setFrom(new TileType("", new Specification()));
		fixture.setTo(new TileType("", new Specification()));
		fixture.setProduction(new AbstractGoods());

		TileType result = fixture.getFrom();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-1, result.getIndex());
		assertEquals(0, result.getBasicWorkTurns());
		assertEquals(false, result.isDirectlyHighSeasConnected());
		assertEquals("tile-type", result.getXMLTagName());
		assertEquals(false, result.isWater());
		assertEquals(false, result.canSettle());
		assertEquals(false, result.isElevation());
		assertEquals(false, result.isForested());
		assertEquals(false, result.isHighSeasConnected());
		assertEquals(0, result.getBasicMoveCost());
		assertEquals("", result.toString());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(".name", result.getNameKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals("<tile-type id=\"\" basic-move-cost=\"0\" basic-work-turns=\"0\" is-forest=\"false\" is-water=\"false\" is-elevation=\"false\" is-connected=\"false\" can-settle=\"false\"><gen humidity-minimum=\"0\" humidity-maximum=\"0\" temperature-minimum=\"0\" temperature-maximum=\"0\" altitude-minimum=\"0\" altitude-maximum=\"0\"></gen></tile-type>", result.serialize());
	}

	/**
	 * Run the AbstractGoods getProduction() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testGetProduction_1()
		throws Exception {
		TileTypeChange fixture = new TileTypeChange();
		fixture.setFrom(new TileType("", new Specification()));
		fixture.setTo(new TileType("", new Specification()));
		fixture.setProduction(new AbstractGoods());

		AbstractGoods result = fixture.getProduction();

		// add additional test code here
		assertNotNull(result);
		assertEquals("0 (null)", result.toString());
		assertEquals(null, result.getType());
		assertEquals("abstractGoods", result.getXMLTagName());
		assertEquals(0, result.getAmount());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals("<abstractGoods amount=\"0\"></abstractGoods>", result.serialize());
	}

	/**
	 * Run the TileType getTo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testGetTo_1()
		throws Exception {
		TileTypeChange fixture = new TileTypeChange();
		fixture.setFrom(new TileType("", new Specification()));
		fixture.setTo(new TileType("", new Specification()));
		fixture.setProduction(new AbstractGoods());

		TileType result = fixture.getTo();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-1, result.getIndex());
		assertEquals(0, result.getBasicWorkTurns());
		assertEquals(false, result.isDirectlyHighSeasConnected());
		assertEquals("tile-type", result.getXMLTagName());
		assertEquals(false, result.isWater());
		assertEquals(false, result.canSettle());
		assertEquals(false, result.isElevation());
		assertEquals(false, result.isForested());
		assertEquals(false, result.isHighSeasConnected());
		assertEquals(0, result.getBasicMoveCost());
		assertEquals("", result.toString());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(".name", result.getNameKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals("<tile-type id=\"\" basic-move-cost=\"0\" basic-work-turns=\"0\" is-forest=\"false\" is-water=\"false\" is-elevation=\"false\" is-connected=\"false\" can-settle=\"false\"><gen humidity-minimum=\"0\" humidity-maximum=\"0\" temperature-minimum=\"0\" temperature-maximum=\"0\" altitude-minimum=\"0\" altitude-maximum=\"0\"></gen></tile-type>", result.serialize());
	}

	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = TileTypeChange.getXMLElementTagName();

		// add additional test code here
		assertEquals("change", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		TileTypeChange fixture = new TileTypeChange();
		fixture.setFrom(new TileType("", new Specification()));
		fixture.setTo(new TileType("", new Specification()));
		fixture.setProduction(new AbstractGoods());

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("change", result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		TileTypeChange fixture = new TileTypeChange();
		fixture.setFrom(new TileType("", new Specification()));
		fixture.setTo(new TileType("", new Specification()));
		fixture.setProduction(new AbstractGoods());

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1561929278, result);
	}

	/**
	 * Run the void readFromXML(FreeColXMLReader,Specification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testReadFromXML_1()
		throws Exception {
		TileTypeChange fixture = new TileTypeChange();
		fixture.setFrom(new TileType("", new Specification()));
		fixture.setTo(new TileType("", new Specification()));
		fixture.setProduction(new AbstractGoods());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		Specification spec = new Specification();

		fixture.readFromXML(xr, spec);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getType(FreeColXMLReader.java:825)
		//       at net.sf.freecol.common.model.TileTypeChange.readFromXML(TileTypeChange.java:191)
	}

	/**
	 * Run the void readFromXML(FreeColXMLReader,Specification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testReadFromXML_2()
		throws Exception {
		TileTypeChange fixture = new TileTypeChange();
		fixture.setFrom(new TileType("", new Specification()));
		fixture.setTo(new TileType("", new Specification()));
		fixture.setProduction(new AbstractGoods());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		Specification spec = new Specification();

		fixture.readFromXML(xr, spec);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getType(FreeColXMLReader.java:825)
		//       at net.sf.freecol.common.model.TileTypeChange.readFromXML(TileTypeChange.java:191)
	}

	/**
	 * Run the void readFromXML(FreeColXMLReader,Specification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testReadFromXML_3()
		throws Exception {
		TileTypeChange fixture = new TileTypeChange();
		fixture.setFrom(new TileType("", new Specification()));
		fixture.setTo(new TileType("", new Specification()));
		fixture.setProduction(new AbstractGoods());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		Specification spec = new Specification();

		fixture.readFromXML(xr, spec);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getType(FreeColXMLReader.java:825)
		//       at net.sf.freecol.common.model.TileTypeChange.readFromXML(TileTypeChange.java:191)
	}

	/**
	 * Run the void readFromXML(FreeColXMLReader,Specification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testReadFromXML_4()
		throws Exception {
		TileTypeChange fixture = new TileTypeChange();
		fixture.setFrom(new TileType("", new Specification()));
		fixture.setTo(new TileType("", new Specification()));
		fixture.setProduction(new AbstractGoods());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		Specification spec = new Specification();

		fixture.readFromXML(xr, spec);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getType(FreeColXMLReader.java:825)
		//       at net.sf.freecol.common.model.TileTypeChange.readFromXML(TileTypeChange.java:191)
	}

	/**
	 * Run the void readFromXML(FreeColXMLReader,Specification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testReadFromXML_5()
		throws Exception {
		TileTypeChange fixture = new TileTypeChange();
		fixture.setFrom(new TileType("", new Specification()));
		fixture.setTo(new TileType("", new Specification()));
		fixture.setProduction(new AbstractGoods());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		Specification spec = new Specification();

		fixture.readFromXML(xr, spec);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getType(FreeColXMLReader.java:825)
		//       at net.sf.freecol.common.model.TileTypeChange.readFromXML(TileTypeChange.java:191)
	}

	/**
	 * Run the void readFromXML(FreeColXMLReader,Specification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testReadFromXML_6()
		throws Exception {
		TileTypeChange fixture = new TileTypeChange();
		fixture.setFrom(new TileType("", new Specification()));
		fixture.setTo(new TileType("", new Specification()));
		fixture.setProduction(new AbstractGoods());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		Specification spec = new Specification();

		fixture.readFromXML(xr, spec);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getType(FreeColXMLReader.java:825)
		//       at net.sf.freecol.common.model.TileTypeChange.readFromXML(TileTypeChange.java:191)
	}

	/**
	 * Run the void setFrom(TileType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testSetFrom_1()
		throws Exception {
		TileTypeChange fixture = new TileTypeChange();
		fixture.setFrom(new TileType("", new Specification()));
		fixture.setTo(new TileType("", new Specification()));
		fixture.setProduction(new AbstractGoods());
		TileType from = new TileType("", new Specification());

		fixture.setFrom(from);

		// add additional test code here
	}

	/**
	 * Run the void setProduction(AbstractGoods) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testSetProduction_1()
		throws Exception {
		TileTypeChange fixture = new TileTypeChange();
		fixture.setFrom(new TileType("", new Specification()));
		fixture.setTo(new TileType("", new Specification()));
		fixture.setProduction(new AbstractGoods());
		AbstractGoods production = new AbstractGoods();

		fixture.setProduction(production);

		// add additional test code here
	}

	/**
	 * Run the void setTo(TileType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testSetTo_1()
		throws Exception {
		TileTypeChange fixture = new TileTypeChange();
		fixture.setFrom(new TileType("", new Specification()));
		fixture.setTo(new TileType("", new Specification()));
		fixture.setProduction(new AbstractGoods());
		TileType to = new TileType("", new Specification());

		fixture.setTo(to);

		// add additional test code here
	}

	/**
	 * Run the void toXML(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testToXML_1()
		throws Exception {
		TileTypeChange fixture = new TileTypeChange();
		fixture.setFrom(new TileType("", new Specification()));
		fixture.setTo(new TileType("", new Specification()));
		fixture.setProduction(new AbstractGoods());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.toXML(xw);

		// add additional test code here
	}

	/**
	 * Run the void toXML(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testToXML_2()
		throws Exception {
		TileTypeChange fixture = new TileTypeChange();
		fixture.setFrom(new TileType("", new Specification()));
		fixture.setTo(new TileType("", new Specification()));
		fixture.setProduction(new AbstractGoods());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.toXML(xw);

		// add additional test code here
	}

	/**
	 * Run the void toXML(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testToXML_3()
		throws Exception {
		TileTypeChange fixture = new TileTypeChange();
		fixture.setFrom(new TileType("", new Specification()));
		fixture.setTo(new TileType("", new Specification()));
		fixture.setProduction(new AbstractGoods());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.toXML(xw);

		// add additional test code here
	}

	/**
	 * Run the void toXML(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testToXML_4()
		throws Exception {
		TileTypeChange fixture = new TileTypeChange();
		fixture.setFrom(new TileType("", new Specification()));
		fixture.setTo(new TileType("", new Specification()));
		fixture.setProduction(new AbstractGoods());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.toXML(xw);

		// add additional test code here
	}

	/**
	 * Run the void toXML(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testToXML_5()
		throws Exception {
		TileTypeChange fixture = new TileTypeChange();
		fixture.setFrom(new TileType("", new Specification()));
		fixture.setTo(new TileType("", new Specification()));
		fixture.setProduction(new AbstractGoods());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.toXML(xw);

		// add additional test code here
	}

	/**
	 * Run the void toXML(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testToXML_6()
		throws Exception {
		TileTypeChange fixture = new TileTypeChange();
		fixture.setFrom(new TileType("", new Specification()));
		fixture.setTo(new TileType("", new Specification()));
		fixture.setProduction(new AbstractGoods());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.toXML(xw);

		// add additional test code here
	}

	/**
	 * Run the void toXML(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testToXML_7()
		throws Exception {
		TileTypeChange fixture = new TileTypeChange();
		fixture.setFrom(new TileType("", new Specification()));
		fixture.setTo(new TileType("", new Specification()));
		fixture.setProduction(new AbstractGoods());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.toXML(xw);

		// add additional test code here
	}

	/**
	 * Run the void toXML(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testToXML_8()
		throws Exception {
		TileTypeChange fixture = new TileTypeChange();
		fixture.setFrom(new TileType("", new Specification()));
		fixture.setTo(new TileType("", new Specification()));
		fixture.setProduction((AbstractGoods) null);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.toXML(xw);

		// add additional test code here
	}

	/**
	 * Run the void toXML(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testToXML_9()
		throws Exception {
		TileTypeChange fixture = new TileTypeChange();
		fixture.setFrom(new TileType("", new Specification()));
		fixture.setTo(new TileType("", new Specification()));
		fixture.setProduction(new AbstractGoods());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.toXML(xw);

		// add additional test code here
	}

	/**
	 * Run the void toXML(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testToXML_10()
		throws Exception {
		TileTypeChange fixture = new TileTypeChange();
		fixture.setFrom(new TileType("", new Specification()));
		fixture.setTo(new TileType("", new Specification()));
		fixture.setProduction((AbstractGoods) null);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.toXML(xw);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
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
	 * @generatedBy CodePro at 5/14/18 4:31 PM
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
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TileTypeChangeTest.class);
	}
}