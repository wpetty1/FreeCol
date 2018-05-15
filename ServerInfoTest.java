package net.sf.freecol.common;

import javax.imageio.metadata.IIOMetadataNode;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * The class <code>ServerInfoTest</code> contains tests for the class <code>{@link ServerInfo}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:15 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class ServerInfoTest {
	/**
	 * Run the ServerInfo() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:15 PM
	 */
	@Test
	public void testServerInfo_1()
		throws Exception {

		ServerInfo result = new ServerInfo();

		// add additional test code here
		assertNotNull(result);
		assertEquals("null(null:0) 0, 0, false, null, 0", result.toString());
		assertEquals(null, result.getAddress());
		assertEquals(null, result.getName());
		assertEquals(0, result.getPort());
		assertEquals(null, result.getVersion());
		assertEquals(0, result.getCurrentlyPlaying());
		assertEquals(0, result.getSlotsAvailable());
		assertEquals(0, result.getGameState());
	}

	/**
	 * Run the ServerInfo(Element) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:15 PM
	 */
	@Test
	public void testServerInfo_2()
		throws Exception {
		Element element = new IIOMetadataNode();

		ServerInfo result = new ServerInfo(element);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at net.sf.freecol.common.ServerInfo.update(ServerInfo.java:115)
		//       at net.sf.freecol.common.ServerInfo.readFromXMLElement(ServerInfo.java:218)
		//       at net.sf.freecol.common.ServerInfo.<init>(ServerInfo.java:79)
		assertNotNull(result);
	}

	/**
	 * Run the ServerInfo(String,String,int,int,int,boolean,String,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:15 PM
	 */
	@Test
	public void testServerInfo_3()
		throws Exception {
		String name = "";
		String address = "";
		int port = 1;
		int slotsAvailable = 1;
		int currentlyPlaying = 1;
		boolean isGameStarted = true;
		String version = "";
		int gameState = 1;

		ServerInfo result = new ServerInfo(name, address, port, slotsAvailable, currentlyPlaying, isGameStarted, version, gameState);

		// add additional test code here
		assertNotNull(result);
		assertEquals("(:1) 1, 1, true, , 1", result.toString());
		assertEquals("", result.getAddress());
		assertEquals("", result.getName());
		assertEquals(1, result.getPort());
		assertEquals("", result.getVersion());
		assertEquals(1, result.getCurrentlyPlaying());
		assertEquals(1, result.getSlotsAvailable());
		assertEquals(1, result.getGameState());
	}

	/**
	 * Run the String getAddress() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:15 PM
	 */
	@Test
	public void testGetAddress_1()
		throws Exception {
		ServerInfo fixture = new ServerInfo(new IIOMetadataNode());
		fixture.update("", "", 1, 1, 1, true, "", 1);

		String result = fixture.getAddress();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at net.sf.freecol.common.ServerInfo.update(ServerInfo.java:115)
		//       at net.sf.freecol.common.ServerInfo.readFromXMLElement(ServerInfo.java:218)
		//       at net.sf.freecol.common.ServerInfo.<init>(ServerInfo.java:79)
		assertNotNull(result);
	}

	/**
	 * Run the int getCurrentlyPlaying() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:15 PM
	 */
	@Test
	public void testGetCurrentlyPlaying_1()
		throws Exception {
		ServerInfo fixture = new ServerInfo(new IIOMetadataNode());
		fixture.update("", "", 1, 1, 1, true, "", 1);

		int result = fixture.getCurrentlyPlaying();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at net.sf.freecol.common.ServerInfo.update(ServerInfo.java:115)
		//       at net.sf.freecol.common.ServerInfo.readFromXMLElement(ServerInfo.java:218)
		//       at net.sf.freecol.common.ServerInfo.<init>(ServerInfo.java:79)
		assertEquals(0, result);
	}

	/**
	 * Run the int getGameState() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:15 PM
	 */
	@Test
	public void testGetGameState_1()
		throws Exception {
		ServerInfo fixture = new ServerInfo(new IIOMetadataNode());
		fixture.update("", "", 1, 1, 1, true, "", 1);

		int result = fixture.getGameState();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at net.sf.freecol.common.ServerInfo.update(ServerInfo.java:115)
		//       at net.sf.freecol.common.ServerInfo.readFromXMLElement(ServerInfo.java:218)
		//       at net.sf.freecol.common.ServerInfo.<init>(ServerInfo.java:79)
		assertEquals(0, result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:15 PM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		ServerInfo fixture = new ServerInfo(new IIOMetadataNode());
		fixture.update("", "", 1, 1, 1, true, "", 1);

		String result = fixture.getName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at net.sf.freecol.common.ServerInfo.update(ServerInfo.java:115)
		//       at net.sf.freecol.common.ServerInfo.readFromXMLElement(ServerInfo.java:218)
		//       at net.sf.freecol.common.ServerInfo.<init>(ServerInfo.java:79)
		assertNotNull(result);
	}

	/**
	 * Run the int getPort() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:15 PM
	 */
	@Test
	public void testGetPort_1()
		throws Exception {
		ServerInfo fixture = new ServerInfo(new IIOMetadataNode());
		fixture.update("", "", 1, 1, 1, true, "", 1);

		int result = fixture.getPort();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at net.sf.freecol.common.ServerInfo.update(ServerInfo.java:115)
		//       at net.sf.freecol.common.ServerInfo.readFromXMLElement(ServerInfo.java:218)
		//       at net.sf.freecol.common.ServerInfo.<init>(ServerInfo.java:79)
		assertEquals(0, result);
	}

	/**
	 * Run the int getSlotsAvailable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:15 PM
	 */
	@Test
	public void testGetSlotsAvailable_1()
		throws Exception {
		ServerInfo fixture = new ServerInfo(new IIOMetadataNode());
		fixture.update("", "", 1, 1, 1, true, "", 1);

		int result = fixture.getSlotsAvailable();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at net.sf.freecol.common.ServerInfo.update(ServerInfo.java:115)
		//       at net.sf.freecol.common.ServerInfo.readFromXMLElement(ServerInfo.java:218)
		//       at net.sf.freecol.common.ServerInfo.<init>(ServerInfo.java:79)
		assertEquals(0, result);
	}

	/**
	 * Run the String getVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:15 PM
	 */
	@Test
	public void testGetVersion_1()
		throws Exception {
		ServerInfo fixture = new ServerInfo(new IIOMetadataNode());
		fixture.update("", "", 1, 1, 1, true, "", 1);

		String result = fixture.getVersion();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at net.sf.freecol.common.ServerInfo.update(ServerInfo.java:115)
		//       at net.sf.freecol.common.ServerInfo.readFromXMLElement(ServerInfo.java:218)
		//       at net.sf.freecol.common.ServerInfo.<init>(ServerInfo.java:79)
		assertNotNull(result);
	}

	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:15 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = ServerInfo.getXMLElementTagName();

		// add additional test code here
		assertEquals("serverInfo", result);
	}

	/**
	 * Run the void readFromXMLElement(Element) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:15 PM
	 */
	@Test
	public void testReadFromXMLElement_1()
		throws Exception {
		ServerInfo fixture = new ServerInfo(new IIOMetadataNode());
		fixture.update("", "", 1, 1, 1, true, "", 1);
		Element element = new IIOMetadataNode();

		fixture.readFromXMLElement(element);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at net.sf.freecol.common.ServerInfo.update(ServerInfo.java:115)
		//       at net.sf.freecol.common.ServerInfo.readFromXMLElement(ServerInfo.java:218)
		//       at net.sf.freecol.common.ServerInfo.<init>(ServerInfo.java:79)
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:15 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		ServerInfo fixture = new ServerInfo(new IIOMetadataNode());
		fixture.update("", "", 1, 1, 1, true, "", 1);

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at net.sf.freecol.common.ServerInfo.update(ServerInfo.java:115)
		//       at net.sf.freecol.common.ServerInfo.readFromXMLElement(ServerInfo.java:218)
		//       at net.sf.freecol.common.ServerInfo.<init>(ServerInfo.java:79)
		assertNotNull(result);
	}

	/**
	 * Run the Element toXMLElement(Document) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:15 PM
	 */
	@Test
	public void testToXMLElement_1()
		throws Exception {
		ServerInfo fixture = new ServerInfo(new IIOMetadataNode());
		fixture.update("", "", 1, 1, 1, true, "", 1);
		Document document = null;

		Element result = fixture.toXMLElement(document);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at net.sf.freecol.common.ServerInfo.update(ServerInfo.java:115)
		//       at net.sf.freecol.common.ServerInfo.readFromXMLElement(ServerInfo.java:218)
		//       at net.sf.freecol.common.ServerInfo.<init>(ServerInfo.java:79)
		assertNotNull(result);
	}

	/**
	 * Run the Element toXMLElement(Document) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:15 PM
	 */
	@Test
	public void testToXMLElement_2()
		throws Exception {
		ServerInfo fixture = new ServerInfo(new IIOMetadataNode());
		fixture.update("", "", 1, 1, 1, true, "", 1);
		Document document = null;

		Element result = fixture.toXMLElement(document);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at net.sf.freecol.common.ServerInfo.update(ServerInfo.java:115)
		//       at net.sf.freecol.common.ServerInfo.readFromXMLElement(ServerInfo.java:218)
		//       at net.sf.freecol.common.ServerInfo.<init>(ServerInfo.java:79)
		assertNotNull(result);
	}

	/**
	 * Run the Element toXMLElement(Document) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:15 PM
	 */
	@Test
	public void testToXMLElement_3()
		throws Exception {
		ServerInfo fixture = new ServerInfo(new IIOMetadataNode());
		fixture.update("", "", 1, 1, 1, true, "", 1);
		Document document = null;

		Element result = fixture.toXMLElement(document);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at net.sf.freecol.common.ServerInfo.update(ServerInfo.java:115)
		//       at net.sf.freecol.common.ServerInfo.readFromXMLElement(ServerInfo.java:218)
		//       at net.sf.freecol.common.ServerInfo.<init>(ServerInfo.java:79)
		assertNotNull(result);
	}

	/**
	 * Run the Element toXMLElement(Document) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:15 PM
	 */
	@Test
	public void testToXMLElement_4()
		throws Exception {
		ServerInfo fixture = new ServerInfo(new IIOMetadataNode());
		fixture.update("", "", 1, 1, 1, true, "", 1);
		Document document = null;

		Element result = fixture.toXMLElement(document);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at net.sf.freecol.common.ServerInfo.update(ServerInfo.java:115)
		//       at net.sf.freecol.common.ServerInfo.readFromXMLElement(ServerInfo.java:218)
		//       at net.sf.freecol.common.ServerInfo.<init>(ServerInfo.java:79)
		assertNotNull(result);
	}

	/**
	 * Run the Element toXMLElement(Document) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:15 PM
	 */
	@Test
	public void testToXMLElement_5()
		throws Exception {
		ServerInfo fixture = new ServerInfo(new IIOMetadataNode());
		fixture.update("", "", 1, 1, 1, true, "", 1);
		Document document = null;

		Element result = fixture.toXMLElement(document);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at net.sf.freecol.common.ServerInfo.update(ServerInfo.java:115)
		//       at net.sf.freecol.common.ServerInfo.readFromXMLElement(ServerInfo.java:218)
		//       at net.sf.freecol.common.ServerInfo.<init>(ServerInfo.java:79)
		assertNotNull(result);
	}

	/**
	 * Run the Element toXMLElement(Document) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:15 PM
	 */
	@Test
	public void testToXMLElement_6()
		throws Exception {
		ServerInfo fixture = new ServerInfo(new IIOMetadataNode());
		fixture.update("", "", 1, 1, 1, true, "", 1);
		Document document = null;

		Element result = fixture.toXMLElement(document);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at net.sf.freecol.common.ServerInfo.update(ServerInfo.java:115)
		//       at net.sf.freecol.common.ServerInfo.readFromXMLElement(ServerInfo.java:218)
		//       at net.sf.freecol.common.ServerInfo.<init>(ServerInfo.java:79)
		assertNotNull(result);
	}

	/**
	 * Run the Element toXMLElement(Document) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:15 PM
	 */
	@Test
	public void testToXMLElement_7()
		throws Exception {
		ServerInfo fixture = new ServerInfo(new IIOMetadataNode());
		fixture.update("", "", 1, 1, 1, true, "", 1);
		Document document = null;

		Element result = fixture.toXMLElement(document);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at net.sf.freecol.common.ServerInfo.update(ServerInfo.java:115)
		//       at net.sf.freecol.common.ServerInfo.readFromXMLElement(ServerInfo.java:218)
		//       at net.sf.freecol.common.ServerInfo.<init>(ServerInfo.java:79)
		assertNotNull(result);
	}

	/**
	 * Run the Element toXMLElement(Document) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:15 PM
	 */
	@Test
	public void testToXMLElement_8()
		throws Exception {
		ServerInfo fixture = new ServerInfo(new IIOMetadataNode());
		fixture.update("", "", 1, 1, 1, true, "", 1);
		Document document = null;

		Element result = fixture.toXMLElement(document);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at net.sf.freecol.common.ServerInfo.update(ServerInfo.java:115)
		//       at net.sf.freecol.common.ServerInfo.readFromXMLElement(ServerInfo.java:218)
		//       at net.sf.freecol.common.ServerInfo.<init>(ServerInfo.java:79)
		assertNotNull(result);
	}

	/**
	 * Run the Element toXMLElement(Document) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:15 PM
	 */
	@Test
	public void testToXMLElement_9()
		throws Exception {
		ServerInfo fixture = new ServerInfo(new IIOMetadataNode());
		fixture.update("", "", 1, 1, 1, true, "", 1);
		Document document = null;

		Element result = fixture.toXMLElement(document);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at net.sf.freecol.common.ServerInfo.update(ServerInfo.java:115)
		//       at net.sf.freecol.common.ServerInfo.readFromXMLElement(ServerInfo.java:218)
		//       at net.sf.freecol.common.ServerInfo.<init>(ServerInfo.java:79)
		assertNotNull(result);
	}

	/**
	 * Run the Element toXMLElement(Document) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:15 PM
	 */
	@Test
	public void testToXMLElement_10()
		throws Exception {
		ServerInfo fixture = new ServerInfo(new IIOMetadataNode());
		fixture.update("", "", 1, 1, 1, true, "", 1);
		Document document = null;

		Element result = fixture.toXMLElement(document);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at net.sf.freecol.common.ServerInfo.update(ServerInfo.java:115)
		//       at net.sf.freecol.common.ServerInfo.readFromXMLElement(ServerInfo.java:218)
		//       at net.sf.freecol.common.ServerInfo.<init>(ServerInfo.java:79)
		assertNotNull(result);
	}

	/**
	 * Run the void update(Element) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:15 PM
	 */
	@Test
	public void testUpdate_1()
		throws Exception {
		ServerInfo fixture = new ServerInfo(new IIOMetadataNode());
		fixture.update("", "", 1, 1, 1, true, "", 1);
		Element element = new IIOMetadataNode();

		fixture.update(element);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at net.sf.freecol.common.ServerInfo.update(ServerInfo.java:115)
		//       at net.sf.freecol.common.ServerInfo.readFromXMLElement(ServerInfo.java:218)
		//       at net.sf.freecol.common.ServerInfo.<init>(ServerInfo.java:79)
	}

	/**
	 * Run the void update(Element) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:15 PM
	 */
	@Test(expected = java.lang.NumberFormatException.class)
	public void testUpdate_2()
		throws Exception {
		ServerInfo fixture = new ServerInfo(new IIOMetadataNode());
		fixture.update("", "", 1, 1, 1, true, "", 1);
		Element element = new IIOMetadataNode();

		fixture.update(element);

		// add additional test code here
	}

	/**
	 * Run the void update(Element) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:15 PM
	 */
	@Test(expected = java.lang.NumberFormatException.class)
	public void testUpdate_3()
		throws Exception {
		ServerInfo fixture = new ServerInfo(new IIOMetadataNode());
		fixture.update("", "", 1, 1, 1, true, "", 1);
		Element element = new IIOMetadataNode();

		fixture.update(element);

		// add additional test code here
	}

	/**
	 * Run the void update(Element) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:15 PM
	 */
	@Test(expected = java.lang.NumberFormatException.class)
	public void testUpdate_4()
		throws Exception {
		ServerInfo fixture = new ServerInfo(new IIOMetadataNode());
		fixture.update("", "", 1, 1, 1, true, "", 1);
		Element element = new IIOMetadataNode();

		fixture.update(element);

		// add additional test code here
	}

	/**
	 * Run the void update(Element) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:15 PM
	 */
	@Test(expected = java.lang.NumberFormatException.class)
	public void testUpdate_5()
		throws Exception {
		ServerInfo fixture = new ServerInfo(new IIOMetadataNode());
		fixture.update("", "", 1, 1, 1, true, "", 1);
		Element element = new IIOMetadataNode();

		fixture.update(element);

		// add additional test code here
	}

	/**
	 * Run the void update(String,String,int,int,int,boolean,String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:15 PM
	 */
	@Test
	public void testUpdate_6()
		throws Exception {
		ServerInfo fixture = new ServerInfo(new IIOMetadataNode());
		fixture.update("", "", 1, 1, 1, true, "", 1);
		String name = "";
		String address = "";
		int port = 1;
		int slotsAvailable = 1;
		int currentlyPlaying = 1;
		boolean isGameStarted = true;
		String version = "";
		int gameState = 1;

		fixture.update(name, address, port, slotsAvailable, currentlyPlaying, isGameStarted, version, gameState);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at net.sf.freecol.common.ServerInfo.update(ServerInfo.java:115)
		//       at net.sf.freecol.common.ServerInfo.readFromXMLElement(ServerInfo.java:218)
		//       at net.sf.freecol.common.ServerInfo.<init>(ServerInfo.java:79)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/18 4:15 PM
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
	 * @generatedBy CodePro at 5/14/18 4:15 PM
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
	 * @generatedBy CodePro at 5/14/18 4:15 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ServerInfoTest.class);
	}
}