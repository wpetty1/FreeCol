package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import java.util.ArrayList;
import net.sf.freecol.common.io.FreeColXMLReader;
import java.util.HashMap;
import java.util.List;
import javax.imageio.metadata.IIOMetadataNode;
import javax.xml.stream.XMLStreamException;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>FoundingFatherTest</code> contains tests for the class <code>{@link FoundingFather}</code>.
 *
 * @generatedBy CodePro at 5/14/18 3:19 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class FoundingFatherTest {
	/**
	 * Run the FoundingFather(String,Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testFoundingFather_1()
		throws Exception {
		String id = "";
		Specification specification = new Specification();

		FoundingFather result = new FoundingFather(id, specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals("founding-father", result.getXMLTagName());
		assertEquals("", result.toString());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(".name", result.getNameKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the List<Event> getEvents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testGetEvents_1()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());

		List<Event> result = fixture.getEvents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Event> getEvents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testGetEvents_2()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(null);
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());

		List<Event> result = fixture.getEvents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Scope> getScopes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testGetScopes_1()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());

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
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testGetScopes_2()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(null);
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());

		List<Scope> result = fixture.getScopes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the FoundingFather.FoundingFatherType getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testGetType_1()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());

		FoundingFather.FoundingFatherType result = fixture.getType();

		// add additional test code here
		assertNotNull(result);
		assertEquals("exploration", result.getKey());
		assertEquals("EXPLORATION", result.name());
		assertEquals("EXPLORATION", result.toString());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the String getTypeKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testGetTypeKey_1()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());

		String result = fixture.getTypeKey();

		// add additional test code here
		assertEquals("model.foundingFather.exploration", result);
	}

	/**
	 * Run the String getTypeKey(FoundingFatherType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testGetTypeKey_2()
		throws Exception {
		FoundingFather.FoundingFatherType type = FoundingFather.FoundingFatherType.EXPLORATION;

		String result = FoundingFather.getTypeKey(type);

		// add additional test code here
		assertEquals("model.foundingFather.exploration", result);
	}

	/**
	 * Run the List<AbstractUnit> getUnits() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testGetUnits_1()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());

		List<AbstractUnit> result = fixture.getUnits();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<AbstractUnit> getUnits() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testGetUnits_2()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(null);
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());

		List<AbstractUnit> result = fixture.getUnits();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the java.util.Map<UnitType, UnitType> getUpgrades() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testGetUpgrades_1()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());

		java.util.Map<UnitType, UnitType> result = fixture.getUpgrades();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the java.util.Map<UnitType, UnitType> getUpgrades() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testGetUpgrades_2()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(null);

		java.util.Map<UnitType, UnitType> result = fixture.getUpgrades();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the int getWeight(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testGetWeight_1()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		int age = -1;

		int result = fixture.getWeight(age);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getWeight(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testGetWeight_2()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		int age = 1;

		int result = fixture.getWeight(age);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getWeight(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testGetWeight_3()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		int age = 1;

		int result = fixture.getWeight(age);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = FoundingFather.getXMLElementTagName();

		// add additional test code here
		assertEquals("founding-father", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("founding-father", result);
	}

	/**
	 * Run the boolean isAvailableTo(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testIsAvailableTo_1()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(null);
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		boolean result = fixture.isAvailableTo(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isAvailableTo(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testIsAvailableTo_2()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		boolean result = fixture.isAvailableTo(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isAvailableTo(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testIsAvailableTo_3()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		boolean result = fixture.isAvailableTo(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isAvailableTo(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testIsAvailableTo_4()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		boolean result = fixture.isAvailableTo(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.FreeColObject.readAttributes(FreeColObject.java:1257)
		//       at net.sf.freecol.common.model.FreeColGameObjectType.readAttributes(FreeColGameObjectType.java:207)
		//       at net.sf.freecol.common.model.FoundingFather.readAttributes(FoundingFather.java:347)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.FreeColObject.readAttributes(FreeColObject.java:1257)
		//       at net.sf.freecol.common.model.FreeColGameObjectType.readAttributes(FreeColGameObjectType.java:207)
		//       at net.sf.freecol.common.model.FoundingFather.readAttributes(FoundingFather.java:347)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testReadAttributes_3()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.FreeColObject.readAttributes(FreeColObject.java:1257)
		//       at net.sf.freecol.common.model.FreeColGameObjectType.readAttributes(FreeColGameObjectType.java:207)
		//       at net.sf.freecol.common.model.FoundingFather.readAttributes(FoundingFather.java:347)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testReadChild_1()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FoundingFather.readChild(FoundingFather.java:379)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testReadChild_2()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FoundingFather.readChild(FoundingFather.java:379)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testReadChild_3()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FoundingFather.readChild(FoundingFather.java:379)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testReadChild_4()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FoundingFather.readChild(FoundingFather.java:379)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testReadChild_5()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FoundingFather.readChild(FoundingFather.java:379)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testReadChild_6()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FoundingFather.readChild(FoundingFather.java:379)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testReadChild_7()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FoundingFather.readChild(FoundingFather.java:379)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testReadChild_8()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FoundingFather.readChild(FoundingFather.java:379)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testReadChild_9()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FoundingFather.readChild(FoundingFather.java:379)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testReadChild_10()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FoundingFather.readChild(FoundingFather.java:379)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testReadChildren_1()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:801)
		//       at net.sf.freecol.common.model.FoundingFather.readChildren(FoundingFather.java:363)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testReadChildren_2()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:801)
		//       at net.sf.freecol.common.model.FoundingFather.readChildren(FoundingFather.java:363)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testReadChildren_3()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:801)
		//       at net.sf.freecol.common.model.FoundingFather.readChildren(FoundingFather.java:363)
	}

	/**
	 * Run the void setEvents(List<Event>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testSetEvents_1()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		List<Event> newEvents = new ArrayList<Event>();

		fixture.setEvents(newEvents);

		// add additional test code here
	}

	/**
	 * Run the void setScopes(List<Scope>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testSetScopes_1()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		List<Scope> newScopes = new ArrayList<Scope>();

		fixture.setScopes(newScopes);

		// add additional test code here
	}

	/**
	 * Run the void setType(FoundingFatherType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testSetType_1()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		FoundingFather.FoundingFatherType type = FoundingFather.FoundingFatherType.EXPLORATION;

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setUnits(List<AbstractUnit>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testSetUnits_1()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		List<AbstractUnit> newUnits = new ArrayList<AbstractUnit>();

		fixture.setUnits(newUnits);

		// add additional test code here
	}

	/**
	 * Run the void setUpgrades(Map<UnitType,UnitType>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testSetUpgrades_1()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		java.util.Map<UnitType, UnitType> newUpgrades = new HashMap<UnitType, UnitType>();

		fixture.setUpgrades(newUpgrades);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_1()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_2()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_3()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_4()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_5()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testWriteChildren_1()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testWriteChildren_2()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testWriteChildren_3()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testWriteChildren_4()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testWriteChildren_5()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testWriteChildren_6()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testWriteChildren_7()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testWriteChildren_8()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(new HashMap<UnitType, UnitType>());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	@Test
	public void testWriteChildren_9()
		throws Exception {
		FoundingFather fixture = new FoundingFather("", new Specification());
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setEvents(new ArrayList<Event>());
		fixture.setUnits(new ArrayList<AbstractUnit>());
		fixture.setType(FoundingFather.FoundingFatherType.EXPLORATION);
		fixture.setUpgrades(null);
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
	 * @generatedBy CodePro at 5/14/18 3:19 PM
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
	 * @generatedBy CodePro at 5/14/18 3:19 PM
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
	 * @generatedBy CodePro at 5/14/18 3:19 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FoundingFatherTest.class);
	}
}