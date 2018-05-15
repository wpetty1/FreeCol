package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import javax.imageio.metadata.IIOMetadataNode;
import net.sf.freecol.common.io.FreeColXMLReader;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>HistoryEventTest</code> contains tests for the class <code>{@link HistoryEvent}</code>.
 *
 * @generatedBy CodePro at 5/14/18 3:30 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class HistoryEventTest {
	/**
	 * Run the HistoryEvent(FreeColXMLReader) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testHistoryEvent_1()
		throws Exception {
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		HistoryEvent result = new HistoryEvent(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.HistoryEvent.<init>(HistoryEvent.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the HistoryEvent(FreeColXMLReader) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testHistoryEvent_2()
		throws Exception {
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		HistoryEvent result = new HistoryEvent(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.HistoryEvent.<init>(HistoryEvent.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the HistoryEvent(Element) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testHistoryEvent_3()
		throws Exception {
		Element element = new IIOMetadataNode();

		HistoryEvent result = new HistoryEvent(element);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.HistoryEvent.<init>(HistoryEvent.java:131)
		assertNotNull(result);
	}

	/**
	 * Run the HistoryEvent(Turn,HistoryEventType,Player) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testHistoryEvent_4()
		throws Exception {
		Turn turn = new Turn(1);
		HistoryEvent.HistoryEventType eventType = HistoryEvent.HistoryEventType.ABANDON_COLONY;
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		HistoryEvent result = new HistoryEvent(turn, eventType, player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the HistoryEvent(Turn,HistoryEventType,Player) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testHistoryEvent_5()
		throws Exception {
		Turn turn = new Turn(1);
		HistoryEvent.HistoryEventType eventType = HistoryEvent.HistoryEventType.ABANDON_COLONY;
		Player player = null;

		HistoryEvent result = new HistoryEvent(turn, eventType, player);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[model.historyEventType.abandonColony.description ABANDON_COLONY (1492) TEMPLATE: model.historyEventType.abandonColony.description []]", result.toString());
		assertEquals(0, result.getScore());
		assertEquals("historyEvent", result.getXMLTagName());
		assertEquals(null, result.getPlayerId());
		assertEquals(null, result.getDefaultId());
		assertEquals("model.historyEventType.abandonColony.description", result.getId());
		assertEquals("description", result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("<historyEvent id=\"model.historyEventType.abandonColony.description\" templateType=\"template\" turn=\"1\" eventType=\"abandon_colony\" score=\"0\"></historyEvent>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals("model.historyEventType.abandonColony.description", result.getIdType());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the HistoryEvent add(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testAdd_1()
		throws Exception {
		HistoryEvent fixture = new HistoryEvent(new Turn(1), HistoryEvent.HistoryEventType.ABANDON_COLONY, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setScore(1);
		fixture.setPlayerId("");
		String key = "";
		String value = "";

		HistoryEvent result = fixture.add(key, value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the HistoryEvent addAmount(String,Number) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testAddAmount_1()
		throws Exception {
		HistoryEvent fixture = new HistoryEvent(new Turn(1), HistoryEvent.HistoryEventType.ABANDON_COLONY, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setScore(1);
		fixture.setPlayerId("");
		String key = "";
		Number amount = new Byte((byte) 32);

		HistoryEvent result = fixture.addAmount(key, amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the HistoryEvent addName(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testAddName_1()
		throws Exception {
		HistoryEvent fixture = new HistoryEvent(new Turn(1), HistoryEvent.HistoryEventType.ABANDON_COLONY, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setScore(1);
		fixture.setPlayerId("");
		String key = "";
		String value = "";

		HistoryEvent result = fixture.addName(key, value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the HistoryEvent addNamed(String,Named) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testAddNamed_1()
		throws Exception {
		HistoryEvent fixture = new HistoryEvent(new Turn(1), HistoryEvent.HistoryEventType.ABANDON_COLONY, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setScore(1);
		fixture.setPlayerId("");
		String key = "";
		Named value = new AbstractGoods();

		HistoryEvent result = fixture.addNamed(key, value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the HistoryEvent addStringTemplate(String,StringTemplate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testAddStringTemplate_1()
		throws Exception {
		HistoryEvent fixture = new HistoryEvent(new Turn(1), HistoryEvent.HistoryEventType.ABANDON_COLONY, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setScore(1);
		fixture.setPlayerId("");
		String key = "";
		StringTemplate template = new StringTemplate(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		HistoryEvent result = fixture.addStringTemplate(key, template);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		HistoryEvent fixture = new HistoryEvent(new Turn(1), HistoryEvent.HistoryEventType.ABANDON_COLONY, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setScore(1);
		fixture.setPlayerId("");
		HistoryEvent o = new HistoryEvent(new Turn(1), HistoryEvent.HistoryEventType.ABANDON_COLONY, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		o.setScore(1);
		o.setPlayerId("");

		boolean result = fixture.equals(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		HistoryEvent fixture = new HistoryEvent(new Turn(1), HistoryEvent.HistoryEventType.ABANDON_COLONY, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setScore(1);
		fixture.setPlayerId("");
		HistoryEvent o = new HistoryEvent(new Turn(1), HistoryEvent.HistoryEventType.ABANDON_COLONY, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		o.setScore(1);
		o.setPlayerId("");

		boolean result = fixture.equals(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		HistoryEvent fixture = new HistoryEvent(new Turn(1), HistoryEvent.HistoryEventType.ABANDON_COLONY, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setScore(1);
		fixture.setPlayerId("");
		Object o = new HistoryEvent(new Turn(1), HistoryEvent.HistoryEventType.ABANDON_COLONY, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));

		boolean result = fixture.equals(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		HistoryEvent fixture = new HistoryEvent(new Turn(1), HistoryEvent.HistoryEventType.ABANDON_COLONY, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setScore(1);
		fixture.setPlayerId("");
		Object o = new HistoryEvent(new Turn(1), HistoryEvent.HistoryEventType.ABANDON_COLONY, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));

		boolean result = fixture.equals(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		HistoryEvent fixture = new HistoryEvent(new Turn(1), HistoryEvent.HistoryEventType.ABANDON_COLONY, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setScore(1);
		fixture.setPlayerId("");
		HistoryEvent o = new HistoryEvent(new Turn(1), HistoryEvent.HistoryEventType.ABANDON_COLONY, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		o.setPlayerId("");

		boolean result = fixture.equals(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testEquals_6()
		throws Exception {
		HistoryEvent fixture = new HistoryEvent(new Turn(1), HistoryEvent.HistoryEventType.ABANDON_COLONY, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setScore(1);
		fixture.setPlayerId("");
		HistoryEvent o = new HistoryEvent(new Turn(1), HistoryEvent.HistoryEventType.ABANDON_COLONY, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		o.setScore(1);
		o.setPlayerId("");

		boolean result = fixture.equals(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testEquals_7()
		throws Exception {
		HistoryEvent fixture = new HistoryEvent(new Turn(1), HistoryEvent.HistoryEventType.ABANDON_COLONY, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setScore(1);
		fixture.setPlayerId("");
		Object o = new Object();

		boolean result = fixture.equals(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the HistoryEvent.HistoryEventType getEventType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testGetEventType_1()
		throws Exception {
		HistoryEvent fixture = new HistoryEvent(new Turn(1), HistoryEvent.HistoryEventType.ABANDON_COLONY, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setScore(1);
		fixture.setPlayerId("");

		HistoryEvent.HistoryEventType result = fixture.getEventType();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the HistoryEvent.HistoryEventType getEventTypeFromStance(Stance) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testGetEventTypeFromStance_1()
		throws Exception {
		Stance stance = Stance.ALLIANCE;

		HistoryEvent.HistoryEventType result = HistoryEvent.getEventTypeFromStance(stance);

		// add additional test code here
		assertNotNull(result);
		assertEquals("model.historyEventType.formAlliance.description", result.getDescriptionKey());
		assertEquals("model.historyEventType.formAlliance.name", result.getNameKey());
		assertEquals("FORM_ALLIANCE", result.name());
		assertEquals("FORM_ALLIANCE", result.toString());
		assertEquals(19, result.ordinal());
	}

	/**
	 * Run the HistoryEvent.HistoryEventType getEventTypeFromStance(Stance) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testGetEventTypeFromStance_2()
		throws Exception {
		Stance stance = Stance.ALLIANCE;

		HistoryEvent.HistoryEventType result = HistoryEvent.getEventTypeFromStance(stance);

		// add additional test code here
		assertNotNull(result);
		assertEquals("model.historyEventType.formAlliance.description", result.getDescriptionKey());
		assertEquals("model.historyEventType.formAlliance.name", result.getNameKey());
		assertEquals("FORM_ALLIANCE", result.name());
		assertEquals("FORM_ALLIANCE", result.toString());
		assertEquals(19, result.ordinal());
	}

	/**
	 * Run the HistoryEvent.HistoryEventType getEventTypeFromStance(Stance) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testGetEventTypeFromStance_3()
		throws Exception {
		Stance stance = Stance.ALLIANCE;

		HistoryEvent.HistoryEventType result = HistoryEvent.getEventTypeFromStance(stance);

		// add additional test code here
		assertNotNull(result);
		assertEquals("model.historyEventType.formAlliance.description", result.getDescriptionKey());
		assertEquals("model.historyEventType.formAlliance.name", result.getNameKey());
		assertEquals("FORM_ALLIANCE", result.name());
		assertEquals("FORM_ALLIANCE", result.toString());
		assertEquals(19, result.ordinal());
	}

	/**
	 * Run the HistoryEvent.HistoryEventType getEventTypeFromStance(Stance) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testGetEventTypeFromStance_4()
		throws Exception {
		Stance stance = Stance.ALLIANCE;

		HistoryEvent.HistoryEventType result = HistoryEvent.getEventTypeFromStance(stance);

		// add additional test code here
		assertNotNull(result);
		assertEquals("model.historyEventType.formAlliance.description", result.getDescriptionKey());
		assertEquals("model.historyEventType.formAlliance.name", result.getNameKey());
		assertEquals("FORM_ALLIANCE", result.name());
		assertEquals("FORM_ALLIANCE", result.toString());
		assertEquals(19, result.ordinal());
	}

	/**
	 * Run the HistoryEvent.HistoryEventType getEventTypeFromStance(Stance) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testGetEventTypeFromStance_5()
		throws Exception {
		Stance stance = Stance.ALLIANCE;

		HistoryEvent.HistoryEventType result = HistoryEvent.getEventTypeFromStance(stance);

		// add additional test code here
		assertNotNull(result);
		assertEquals("model.historyEventType.formAlliance.description", result.getDescriptionKey());
		assertEquals("model.historyEventType.formAlliance.name", result.getNameKey());
		assertEquals("FORM_ALLIANCE", result.name());
		assertEquals("FORM_ALLIANCE", result.toString());
		assertEquals(19, result.ordinal());
	}

	/**
	 * Run the String getPlayerId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testGetPlayerId_1()
		throws Exception {
		HistoryEvent fixture = new HistoryEvent(new Turn(1), HistoryEvent.HistoryEventType.ABANDON_COLONY, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setScore(1);
		fixture.setPlayerId("");

		String result = fixture.getPlayerId();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getScore() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testGetScore_1()
		throws Exception {
		HistoryEvent fixture = new HistoryEvent(new Turn(1), HistoryEvent.HistoryEventType.ABANDON_COLONY, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setScore(1);
		fixture.setPlayerId("");

		int result = fixture.getScore();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the Turn getTurn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testGetTurn_1()
		throws Exception {
		HistoryEvent fixture = new HistoryEvent(new Turn(1), HistoryEvent.HistoryEventType.ABANDON_COLONY, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setScore(1);
		fixture.setPlayerId("");

		Turn result = fixture.getTurn();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = HistoryEvent.getXMLElementTagName();

		// add additional test code here
		assertEquals("historyEvent", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		HistoryEvent fixture = new HistoryEvent(new Turn(1), HistoryEvent.HistoryEventType.ABANDON_COLONY, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setScore(1);
		fixture.setPlayerId("");

		String result = fixture.getXMLTagName();

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
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		HistoryEvent fixture = new HistoryEvent(new Turn(1), HistoryEvent.HistoryEventType.ABANDON_COLONY, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setScore(1);
		fixture.setPlayerId("");
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		HistoryEvent fixture = new HistoryEvent(new Turn(1), HistoryEvent.HistoryEventType.ABANDON_COLONY, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setScore(1);
		fixture.setPlayerId("");
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setPlayerId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testSetPlayerId_1()
		throws Exception {
		HistoryEvent fixture = new HistoryEvent(new Turn(1), HistoryEvent.HistoryEventType.ABANDON_COLONY, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setScore(1);
		fixture.setPlayerId("");
		String playerId = "";

		fixture.setPlayerId(playerId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setScore(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testSetScore_1()
		throws Exception {
		HistoryEvent fixture = new HistoryEvent(new Turn(1), HistoryEvent.HistoryEventType.ABANDON_COLONY, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setScore(1);
		fixture.setPlayerId("");
		int score = 1;

		fixture.setScore(score);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		HistoryEvent fixture = new HistoryEvent(new Turn(1), HistoryEvent.HistoryEventType.ABANDON_COLONY, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setScore(1);
		fixture.setPlayerId("");

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testToString_2()
		throws Exception {
		HistoryEvent fixture = new HistoryEvent(new Turn(1), HistoryEvent.HistoryEventType.ABANDON_COLONY, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setScore(1);
		fixture.setPlayerId((String) null);

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testWriteAttributes_1()
		throws Exception {
		HistoryEvent fixture = new HistoryEvent(new Turn(1), HistoryEvent.HistoryEventType.ABANDON_COLONY, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setScore(1);
		fixture.setPlayerId("");
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testWriteAttributes_2()
		throws Exception {
		HistoryEvent fixture = new HistoryEvent(new Turn(1), HistoryEvent.HistoryEventType.ABANDON_COLONY, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setScore(1);
		fixture.setPlayerId("");
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testWriteAttributes_3()
		throws Exception {
		HistoryEvent fixture = new HistoryEvent(new Turn(1), HistoryEvent.HistoryEventType.ABANDON_COLONY, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setScore(1);
		fixture.setPlayerId("");
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testWriteAttributes_4()
		throws Exception {
		HistoryEvent fixture = new HistoryEvent(new Turn(1), HistoryEvent.HistoryEventType.ABANDON_COLONY, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setScore(1);
		fixture.setPlayerId("");
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testWriteAttributes_5()
		throws Exception {
		HistoryEvent fixture = new HistoryEvent(new Turn(1), HistoryEvent.HistoryEventType.ABANDON_COLONY, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setScore(1);
		fixture.setPlayerId((String) null);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testWriteAttributes_6()
		throws Exception {
		HistoryEvent fixture = new HistoryEvent(new Turn(1), HistoryEvent.HistoryEventType.ABANDON_COLONY, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setScore(1);
		fixture.setPlayerId("");
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	@Test
	public void testWriteAttributes_7()
		throws Exception {
		HistoryEvent fixture = new HistoryEvent(new Turn(1), HistoryEvent.HistoryEventType.ABANDON_COLONY, new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setScore(1);
		fixture.setPlayerId((String) null);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/18 3:30 PM
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
	 * @generatedBy CodePro at 5/14/18 3:30 PM
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
	 * @generatedBy CodePro at 5/14/18 3:30 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(HistoryEventTest.class);
	}
}