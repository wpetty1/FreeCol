package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import java.util.List;
import javax.imageio.metadata.IIOMetadataNode;
import net.sf.freecol.common.io.FreeColXMLReader;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>ModelMessageTest</code> contains tests for the class <code>{@link ModelMessage}</code>.
 *
 * @generatedBy CodePro at 5/14/18 3:51 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class ModelMessageTest {
	/**
	 * Run the ModelMessage(FreeColXMLReader) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testModelMessage_1()
		throws Exception {
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		ModelMessage result = new ModelMessage(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.ModelMessage.<init>(ModelMessage.java:193)
		assertNotNull(result);
	}

	/**
	 * Run the ModelMessage(FreeColXMLReader) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testModelMessage_2()
		throws Exception {
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		ModelMessage result = new ModelMessage(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.ModelMessage.<init>(ModelMessage.java:193)
		assertNotNull(result);
	}

	/**
	 * Run the ModelMessage(Element) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testModelMessage_3()
		throws Exception {
		Element element = new IIOMetadataNode();

		ModelMessage result = new ModelMessage(element);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.ModelMessage.<init>(ModelMessage.java:202)
		assertNotNull(result);
	}

	/**
	 * Run the ModelMessage(String,FreeColGameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testModelMessage_4()
		throws Exception {
		String id = "";
		FreeColGameObject source = new Region(new Game(new IIOMetadataNode(), ""));

		ModelMessage result = new ModelMessage(id, source);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the ModelMessage(String,FreeColGameObject,FreeColObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testModelMessage_5()
		throws Exception {
		String id = "";
		FreeColGameObject source = new Region(new Game(new IIOMetadataNode(), ""));
		FreeColObject display = new AbstractGoods();

		ModelMessage result = new ModelMessage(id, source, display);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the ModelMessage(MessageType,String,FreeColGameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testModelMessage_6()
		throws Exception {
		ModelMessage.MessageType messageType = ModelMessage.MessageType.BUILDING_COMPLETED;
		String id = "";
		FreeColGameObject source = new Region(new Game(new IIOMetadataNode(), ""));

		ModelMessage result = new ModelMessage(messageType, id, source);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the ModelMessage(MessageType,String,String,FreeColGameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testModelMessage_7()
		throws Exception {
		ModelMessage.MessageType messageType = ModelMessage.MessageType.BUILDING_COMPLETED;
		String id = "";
		String defaultId = "";
		FreeColGameObject source = new Region(new Game(new IIOMetadataNode(), ""));

		ModelMessage result = new ModelMessage(messageType, id, defaultId, source);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the ModelMessage(MessageType,String,FreeColGameObject,FreeColObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testModelMessage_8()
		throws Exception {
		ModelMessage.MessageType messageType = ModelMessage.MessageType.BUILDING_COMPLETED;
		String id = "";
		FreeColGameObject source = new Region(new Game(new IIOMetadataNode(), ""));
		FreeColObject display = new AbstractGoods();

		ModelMessage result = new ModelMessage(messageType, id, source, display);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the ModelMessage(MessageType,String,String,FreeColGameObject,FreeColObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testModelMessage_9()
		throws Exception {
		ModelMessage.MessageType messageType = ModelMessage.MessageType.BUILDING_COMPLETED;
		String id = "";
		String defaultId = "";
		FreeColGameObject source = new Region(new Game(new IIOMetadataNode(), ""));
		FreeColObject display = null;

		ModelMessage result = new ModelMessage(messageType, id, defaultId, source, display);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the ModelMessage(MessageType,String,String,FreeColGameObject,FreeColObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testModelMessage_10()
		throws Exception {
		ModelMessage.MessageType messageType = ModelMessage.MessageType.BUILDING_COMPLETED;
		String id = "";
		String defaultId = "";
		FreeColGameObject source = new Region(new Game(new IIOMetadataNode(), ""));
		FreeColObject display = new AbstractGoods();

		ModelMessage result = new ModelMessage(messageType, id, defaultId, source, display);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the ModelMessage add(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testAdd_1()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");
		String value = "";

		ModelMessage result = fixture.add(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the ModelMessage add(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testAdd_2()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");
		String key = "";
		String value = "";

		ModelMessage result = fixture.add(key, value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the ModelMessage addAmount(String,Number) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testAddAmount_1()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");
		String key = "";
		Number amount = new Byte((byte) 32);

		ModelMessage result = fixture.addAmount(key, amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the ModelMessage addName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testAddName_1()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");
		String value = "";

		ModelMessage result = fixture.addName(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the ModelMessage addName(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testAddName_2()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");
		String key = "";
		String value = "";

		ModelMessage result = fixture.addName(key, value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the ModelMessage addName(String,FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testAddName_3()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");
		String key = "";
		FreeColObject object = new AbstractGoods();

		ModelMessage result = fixture.addName(key, object);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the ModelMessage addNamed(String,Named) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testAddNamed_1()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");
		String key = "";
		Named named = new AbstractGoods();

		ModelMessage result = fixture.addNamed(key, named);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the ModelMessage addStringTemplate(StringTemplate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testAddStringTemplate_1()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");
		StringTemplate template = new StringTemplate(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		ModelMessage result = fixture.addStringTemplate(template);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the ModelMessage addStringTemplate(String,StringTemplate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testAddStringTemplate_2()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");
		String key = "";
		StringTemplate template = new StringTemplate(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		ModelMessage result = fixture.addStringTemplate(key, template);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the void divert(FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testDivert_1()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");
		FreeColGameObject newSource = new Region(new Game(new IIOMetadataNode(), ""));

		fixture.divert(newSource);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void divert(FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testDivert_2()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");
		FreeColGameObject newSource = new Region(new Game(new IIOMetadataNode(), ""));

		fixture.divert(newSource);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");
		ModelMessage o = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		o.setSourceId("");
		o.setBeenDisplayed(true);
		o.setDisplayId("");

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
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");
		ModelMessage o = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		o.setSourceId("");

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
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");
		ModelMessage o = new ModelMessage(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));
		o.setSourceId("");

		boolean result = fixture.equals(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.ModelMessage.<init>(ModelMessage.java:193)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");
		ModelMessage o = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		o.setSourceId("");

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
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");
		ModelMessage o = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		o.setSourceId("");

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
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testEquals_6()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");
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
	 * Run the String getDisplayId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testGetDisplayId_1()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");

		String result = fixture.getDisplayId();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getIgnoredMessageKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testGetIgnoredMessageKey_1()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");

		String result = fixture.getIgnoredMessageKey();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getIgnoredMessageKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testGetIgnoredMessageKey_2()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");

		String result = fixture.getIgnoredMessageKey();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getIgnoredMessageKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testGetIgnoredMessageKey_3()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");

		String result = fixture.getIgnoredMessageKey();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getIgnoredMessageKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testGetIgnoredMessageKey_4()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");

		String result = fixture.getIgnoredMessageKey();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the ModelMessage.MessageType getMessageType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testGetMessageType_1()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");

		ModelMessage.MessageType result = fixture.getMessageType();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getSourceId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testGetSourceId_1()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");

		String result = fixture.getSourceId();

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
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = ModelMessage.getXMLElementTagName();

		// add additional test code here
		assertEquals("modelMessage", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");

		String result = fixture.getXMLTagName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the boolean hasBeenDisplayed() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testHasBeenDisplayed_1()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");

		boolean result = fixture.hasBeenDisplayed();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenDisplayed() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testHasBeenDisplayed_2()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(false);
		fixture.setDisplayId("");

		boolean result = fixture.hasBeenDisplayed();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");

		int result = fixture.hashCode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");
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
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setBeenDisplayed(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testSetBeenDisplayed_1()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");
		boolean beenDisplayed = true;

		fixture.setBeenDisplayed(beenDisplayed);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setDisplayId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testSetDisplayId_1()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");
		String displayId = "";

		fixture.setDisplayId(displayId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setMessageType(MessageType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testSetMessageType_1()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");
		ModelMessage.MessageType messageType = ModelMessage.MessageType.BUILDING_COMPLETED;

		fixture.setMessageType(messageType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setSourceId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testSetSourceId_1()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");
		String sourceId = "";

		fixture.setSourceId(sourceId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the List<Object> splitLinks(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testSplitLinks_1()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		List<Object> result = fixture.splitLinks(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Object> splitLinks(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testSplitLinks_2()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		List<Object> result = fixture.splitLinks(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Object> splitLinks(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testSplitLinks_3()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		List<Object> result = fixture.splitLinks(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Object> splitLinks(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testSplitLinks_4()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		List<Object> result = fixture.splitLinks(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Object> splitLinks(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testSplitLinks_5()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		List<Object> result = fixture.splitLinks(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Object> splitLinks(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testSplitLinks_6()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		List<Object> result = fixture.splitLinks(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Object> splitLinks(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testSplitLinks_7()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		List<Object> result = fixture.splitLinks(player);

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
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId((String) null);
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");

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
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testToString_2()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId((String) null);

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
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testWriteAttributes_1()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");
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
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testWriteAttributes_2()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");
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
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testWriteAttributes_3()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");
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
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testWriteAttributes_4()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId((String) null);
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
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testWriteAttributes_5()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");
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
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testWriteAttributes_6()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId("");
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
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testWriteAttributes_7()
		throws Exception {
		ModelMessage fixture = new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Region(new Game(new IIOMetadataNode(), "")), new AbstractGoods());
		fixture.setSourceId("");
		fixture.setBeenDisplayed(true);
		fixture.setDisplayId((String) null);
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
	 * @generatedBy CodePro at 5/14/18 3:51 PM
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
	 * @generatedBy CodePro at 5/14/18 3:51 PM
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
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ModelMessageTest.class);
	}
}