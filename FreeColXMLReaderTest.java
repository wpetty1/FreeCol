package net.sf.freecol.common.io;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import net.sf.freecol.server.FreeColServer;
import java.io.Reader;
import java.io.StringReader;
import net.sf.freecol.common.model.FreeColObject;
import java.util.List;
import net.sf.freecol.server.ai.AIMain;
import net.sf.freecol.common.model.FreeColGameObjectType;
import net.sf.freecol.common.model.Location;
import net.sf.freecol.common.model.Specification;
import javax.imageio.metadata.IIOMetadataNode;
import javax.xml.stream.XMLStreamException;
import org.junit.*;
import net.sf.freecol.server.ai.AIObject;
import net.sf.freecol.common.model.Game;
import net.sf.freecol.common.model.FreeColGameObject;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>FreeColXMLReaderTest</code> contains tests for the class <code>{@link FreeColXMLReader}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:42 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class FreeColXMLReaderTest {
	/**
	 * Run the FreeColXMLReader(InputStream) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testFreeColXMLReader_1()
		throws Exception {
		InputStream inputStream = new ByteArrayInputStream("".getBytes());

		FreeColXMLReader result = new FreeColXMLReader(inputStream);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.shouldIntern());
		assertEquals(true, result.hasNext());
		assertEquals("UTF-8", result.getEncoding());
		assertEquals(false, result.hasName());
		assertEquals(null, result.getPrefix());
		assertEquals(null, result.getVersion());
		assertEquals(null, result.getNamespaceURI());
		assertEquals(null, result.getCharacterEncodingScheme());
		assertEquals(false, result.standaloneSet());
		assertEquals(false, result.isStandalone());
		assertEquals(7, result.getEventType());
		assertEquals(false, result.isWhiteSpace());
		assertEquals(false, result.hasText());
		assertEquals(false, result.isStartElement());
		assertEquals(false, result.isCharacters());
		assertEquals(false, result.isEndElement());
	}

	/**
	 * Run the FreeColXMLReader(InputStream) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testFreeColXMLReader_2()
		throws Exception {
		InputStream inputStream = new ByteArrayInputStream("".getBytes());

		FreeColXMLReader result = new FreeColXMLReader(inputStream);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.shouldIntern());
		assertEquals(true, result.hasNext());
		assertEquals("UTF-8", result.getEncoding());
		assertEquals(false, result.hasName());
		assertEquals(null, result.getPrefix());
		assertEquals(null, result.getVersion());
		assertEquals(null, result.getNamespaceURI());
		assertEquals(null, result.getCharacterEncodingScheme());
		assertEquals(false, result.standaloneSet());
		assertEquals(false, result.isStandalone());
		assertEquals(7, result.getEventType());
		assertEquals(false, result.isWhiteSpace());
		assertEquals(false, result.hasText());
		assertEquals(false, result.isStartElement());
		assertEquals(false, result.isCharacters());
		assertEquals(false, result.isEndElement());
	}

	/**
	 * Run the FreeColXMLReader(InputStream) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testFreeColXMLReader_3()
		throws Exception {
		InputStream inputStream = new ByteArrayInputStream("".getBytes());

		FreeColXMLReader result = new FreeColXMLReader(inputStream);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.shouldIntern());
		assertEquals(true, result.hasNext());
		assertEquals("UTF-8", result.getEncoding());
		assertEquals(false, result.hasName());
		assertEquals(null, result.getPrefix());
		assertEquals(null, result.getVersion());
		assertEquals(null, result.getNamespaceURI());
		assertEquals(null, result.getCharacterEncodingScheme());
		assertEquals(false, result.standaloneSet());
		assertEquals(false, result.isStandalone());
		assertEquals(7, result.getEventType());
		assertEquals(false, result.isWhiteSpace());
		assertEquals(false, result.hasText());
		assertEquals(false, result.isStartElement());
		assertEquals(false, result.isCharacters());
		assertEquals(false, result.isEndElement());
	}

	/**
	 * Run the FreeColXMLReader(Reader) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testFreeColXMLReader_4()
		throws Exception {
		Reader reader = new StringReader("");

		FreeColXMLReader result = new FreeColXMLReader(reader);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.shouldIntern());
		assertEquals(true, result.hasNext());
		assertEquals(null, result.getEncoding());
		assertEquals(false, result.hasName());
		assertEquals(null, result.getPrefix());
		assertEquals(null, result.getVersion());
		assertEquals(null, result.getNamespaceURI());
		assertEquals(null, result.getCharacterEncodingScheme());
		assertEquals(false, result.standaloneSet());
		assertEquals(false, result.isStandalone());
		assertEquals(7, result.getEventType());
		assertEquals(false, result.isWhiteSpace());
		assertEquals(false, result.hasText());
		assertEquals(false, result.isStartElement());
		assertEquals(false, result.isCharacters());
		assertEquals(false, result.isEndElement());
	}

	/**
	 * Run the FreeColXMLReader(Reader) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testFreeColXMLReader_5()
		throws Exception {
		Reader reader = new StringReader("");

		FreeColXMLReader result = new FreeColXMLReader(reader);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.shouldIntern());
		assertEquals(true, result.hasNext());
		assertEquals(null, result.getEncoding());
		assertEquals(false, result.hasName());
		assertEquals(null, result.getPrefix());
		assertEquals(null, result.getVersion());
		assertEquals(null, result.getNamespaceURI());
		assertEquals(null, result.getCharacterEncodingScheme());
		assertEquals(false, result.standaloneSet());
		assertEquals(false, result.isStandalone());
		assertEquals(7, result.getEventType());
		assertEquals(false, result.isWhiteSpace());
		assertEquals(false, result.hasText());
		assertEquals(false, result.isStartElement());
		assertEquals(false, result.isCharacters());
		assertEquals(false, result.isEndElement());
	}

	/**
	 * Run the FreeColXMLReader(Reader) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testFreeColXMLReader_6()
		throws Exception {
		Reader reader = new StringReader("");

		FreeColXMLReader result = new FreeColXMLReader(reader);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.shouldIntern());
		assertEquals(true, result.hasNext());
		assertEquals(null, result.getEncoding());
		assertEquals(false, result.hasName());
		assertEquals(null, result.getPrefix());
		assertEquals(null, result.getVersion());
		assertEquals(null, result.getNamespaceURI());
		assertEquals(null, result.getCharacterEncodingScheme());
		assertEquals(false, result.standaloneSet());
		assertEquals(false, result.isStandalone());
		assertEquals(7, result.getEventType());
		assertEquals(false, result.isWhiteSpace());
		assertEquals(false, result.hasText());
		assertEquals(false, result.isStartElement());
		assertEquals(false, result.isCharacters());
		assertEquals(false, result.isEndElement());
	}

	/**
	 * Run the boolean atTag(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testAtTag_1()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		String tag = "";

		boolean result = fixture.atTag(tag);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.atTag(FreeColXMLReader.java:220)
		assertTrue(result);
	}

	/**
	 * Run the boolean atTag(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testAtTag_2()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		String tag = "";

		boolean result = fixture.atTag(tag);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.atTag(FreeColXMLReader.java:220)
		assertTrue(result);
	}

	/**
	 * Run the void close() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testClose_1()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);

		fixture.close();

		// add additional test code here
	}

	/**
	 * Run the void close() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testClose_2()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);

		fixture.close();

		// add additional test code here
	}

	/**
	 * Run the void close() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testClose_3()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);

		fixture.close();

		// add additional test code here
	}

	/**
	 * Run the void close() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testClose_4()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);

		fixture.close();

		// add additional test code here
	}

	/**
	 * Run the void close() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testClose_5()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader((InputStream) null);
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);

		fixture.close();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.net.MalformedURLException
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:94)
	}

	/**
	 * Run the void close() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testClose_6()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader((InputStream) null);
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);

		fixture.close();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.net.MalformedURLException
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:94)
	}

	/**
	 * Run the void closeTag(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testCloseTag_1()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		String tag = "";

		fixture.closeTag(tag);

		// add additional test code here
	}

	/**
	 * Run the void closeTag(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testCloseTag_2()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		String tag = "";

		fixture.closeTag(tag);

		// add additional test code here
	}

	/**
	 * Run the void closeTag(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testCloseTag_3()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		String tag = "";

		fixture.closeTag(tag);

		// add additional test code here
	}

	/**
	 * Run the void closeTag(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testCloseTag_4()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		String tag = "";

		fixture.closeTag(tag);

		// add additional test code here
	}

	/**
	 * Run the FreeColObject copy(Game,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testCopy_1()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		Game game = new Game(new IIOMetadataNode(), "");
		Class<FreeColObject> returnClass = FreeColObject.class;

		FreeColObject result = fixture.copy(game, returnClass);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColObject copy(Game,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testCopy_2()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		Game game = new Game(new IIOMetadataNode(), "");
		Class<FreeColObject> returnClass = FreeColObject.class;

		FreeColObject result = fixture.copy(game, returnClass);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColObject copy(Game,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testCopy_3()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		Game game = new Game(new IIOMetadataNode(), "");
		Class<FreeColObject> returnClass = FreeColObject.class;

		FreeColObject result = fixture.copy(game, returnClass);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String currentTag() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testCurrentTag_1()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);

		String result = fixture.currentTag();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.currentTag(FreeColXMLReader.java:258)
		assertNotNull(result);
	}

	/**
	 * Run the String currentTag() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testCurrentTag_2()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);

		String result = fixture.currentTag();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.currentTag(FreeColXMLReader.java:258)
		assertNotNull(result);
	}

	/**
	 * Run the void expectTag(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testExpectTag_1()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		String tag = "";

		fixture.expectTag(tag);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.expectTag(FreeColXMLReader.java:230)
	}

	/**
	 * Run the void expectTag(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testExpectTag_2()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		String tag = "";

		fixture.expectTag(tag);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.expectTag(FreeColXMLReader.java:230)
	}

	/**
	 * Run the AIObject findAIObject(AIMain,String,Class<T>,T,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testFindAIObject_1()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		AIMain aiMain = new AIMain(new FreeColServer(true, true, new Specification(), 1, ""));
		String attributeName = "";
		Class<AIObject> returnClass = AIObject.class;
		boolean required = true;

		AIObject result = fixture.findAIObject(aiMain, attributeName, returnClass, null, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: Bind exception starting server at: 0.0.0.0:1
		//       at net.sf.freecol.server.FreeColServer.serverStart(FreeColServer.java:383)
		//       at net.sf.freecol.server.FreeColServer.<init>(FreeColServer.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the AIObject findAIObject(AIMain,String,Class<T>,T,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testFindAIObject_2()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		AIMain aiMain = new AIMain(new FreeColServer(true, true, new Specification(), 1, ""));
		String attributeName = "";
		Class<AIObject> returnClass = AIObject.class;
		boolean required = false;

		AIObject result = fixture.findAIObject(aiMain, attributeName, returnClass, null, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: Bind exception starting server at: 0.0.0.0:1
		//       at net.sf.freecol.server.FreeColServer.serverStart(FreeColServer.java:383)
		//       at net.sf.freecol.server.FreeColServer.<init>(FreeColServer.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the AIObject findAIObject(AIMain,String,Class<T>,T,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testFindAIObject_3()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		AIMain aiMain = new AIMain(new FreeColServer(true, true, new Specification(), 1, ""));
		String attributeName = "";
		Class<AIObject> returnClass = AIObject.class;
		boolean required = true;

		AIObject result = fixture.findAIObject(aiMain, attributeName, returnClass, null, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: Bind exception starting server at: 0.0.0.0:1
		//       at net.sf.freecol.server.FreeColServer.serverStart(FreeColServer.java:383)
		//       at net.sf.freecol.server.FreeColServer.<init>(FreeColServer.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColGameObject findFreeColGameObject(Game,String,Class<T>,T,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testFindFreeColGameObject_1()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		Game game = new Game(new IIOMetadataNode(), "");
		String attributeName = "";
		Class<FreeColGameObject> returnClass = FreeColGameObject.class;
		boolean required = true;

		FreeColGameObject result = fixture.findFreeColGameObject(game, attributeName, returnClass, null, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColGameObject findFreeColGameObject(Game,String,Class<T>,T,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testFindFreeColGameObject_2()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		Game game = new Game(new IIOMetadataNode(), "");
		String attributeName = "";
		Class<FreeColGameObject> returnClass = FreeColGameObject.class;
		boolean required = true;

		FreeColGameObject result = fixture.findFreeColGameObject(game, attributeName, returnClass, null, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColGameObject findFreeColGameObject(Game,String,Class<T>,T,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testFindFreeColGameObject_3()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		Game game = new Game(new IIOMetadataNode(), "");
		String attributeName = "";
		Class<FreeColGameObject> returnClass = FreeColGameObject.class;
		boolean required = false;

		FreeColGameObject result = fixture.findFreeColGameObject(game, attributeName, returnClass, null, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColGameObject findFreeColGameObject(Game,String,Class<T>,T,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testFindFreeColGameObject_4()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		Game game = new Game(new IIOMetadataNode(), "");
		String attributeName = "";
		Class<FreeColGameObject> returnClass = FreeColGameObject.class;
		boolean required = true;

		FreeColGameObject result = fixture.findFreeColGameObject(game, attributeName, returnClass, null, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the float getAttribute(String,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetAttribute_1()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		String attributeName = "";
		float defaultValue = 1.0f;

		float result = fixture.getAttribute(attributeName, defaultValue);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:300)
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float getAttribute(String,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetAttribute_2()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		String attributeName = "";
		float defaultValue = 1.0f;

		float result = fixture.getAttribute(attributeName, defaultValue);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:300)
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the int getAttribute(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetAttribute_3()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		String attributeName = "";
		int defaultValue = 1;

		int result = fixture.getAttribute(attributeName, defaultValue);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:321)
		assertEquals(0, result);
	}

	/**
	 * Run the int getAttribute(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetAttribute_4()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		String attributeName = "";
		int defaultValue = 1;

		int result = fixture.getAttribute(attributeName, defaultValue);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:321)
		assertEquals(0, result);
	}

	/**
	 * Run the long getAttribute(String,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetAttribute_5()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		String attributeName = "";
		long defaultValue = 1L;

		long result = fixture.getAttribute(attributeName, defaultValue);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:342)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getAttribute(String,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetAttribute_6()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		String attributeName = "";
		long defaultValue = 1L;

		long result = fixture.getAttribute(attributeName, defaultValue);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:342)
		assertEquals(0L, result);
	}

	/**
	 * Run the String getAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetAttribute_7()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		String attributeName = "";
		String defaultValue = "";

		String result = fixture.getAttribute(attributeName, defaultValue);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		assertNotNull(result);
	}

	/**
	 * Run the String getAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetAttribute_8()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		String attributeName = "";
		String defaultValue = "";

		String result = fixture.getAttribute(attributeName, defaultValue);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		assertNotNull(result);
	}

	/**
	 * Run the boolean getAttribute(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetAttribute_9()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		String attributeName = "";
		boolean defaultValue = true;

		boolean result = fixture.getAttribute(attributeName, defaultValue);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:286)
		assertTrue(result);
	}

	/**
	 * Run the boolean getAttribute(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetAttribute_10()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		String attributeName = "";
		boolean defaultValue = true;

		boolean result = fixture.getAttribute(attributeName, defaultValue);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:286)
		assertTrue(result);
	}

	/**
	 * Run the boolean getAttribute(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetAttribute_11()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		String attributeName = "";
		boolean defaultValue = false;

		boolean result = fixture.getAttribute(attributeName, defaultValue);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:286)
		assertTrue(result);
	}

	/**
	 * Run the boolean getAttribute(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetAttribute_12()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		String attributeName = "";
		boolean defaultValue = true;

		boolean result = fixture.getAttribute(attributeName, defaultValue);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:286)
		assertTrue(result);
	}

	/**
	 * Run the Enum getAttribute(String,Class<T>,T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetAttribute_13()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		String attributeName = "";
		Class<Enum> returnClass = Enum.class;

		Enum result = fixture.getAttribute(attributeName, returnClass, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:380)
		assertNotNull(result);
	}

	/**
	 * Run the Enum getAttribute(String,Class<T>,T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetAttribute_14()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		String attributeName = "";
		Class<Enum> returnClass = Enum.class;

		Enum result = fixture.getAttribute(attributeName, returnClass, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:380)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColObject getAttribute(Game,String,Class<T>,T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetAttribute_15()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		Game game = new Game(new IIOMetadataNode(), "");
		String attributeName = "";
		Class<FreeColObject> returnClass = FreeColObject.class;

		FreeColObject result = fixture.getAttribute(game, attributeName, returnClass, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColObject getAttribute(Game,String,Class<T>,T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetAttribute_16()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		Game game = new Game(new IIOMetadataNode(), "");
		String attributeName = "id";
		Class<FreeColObject> returnClass = FreeColObject.class;

		FreeColObject result = fixture.getAttribute(game, attributeName, returnClass, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the AIObject getAttribute(AIMain,String,Class<T>,T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetAttribute_17()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		AIMain aiMain = new AIMain(new FreeColServer(true, true, new Specification(), 1, ""));
		String attributeName = "id";
		Class<AIObject> returnClass = AIObject.class;

		AIObject result = fixture.getAttribute(aiMain, attributeName, returnClass, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:438)
		assertNotNull(result);
	}

	/**
	 * Run the AIObject getAttribute(AIMain,String,Class<T>,T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetAttribute_18()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		AIMain aiMain = new AIMain(new FreeColServer(true, true, new Specification(), 1, ""));
		String attributeName = "";
		Class<AIObject> returnClass = AIObject.class;

		AIObject result = fixture.getAttribute(aiMain, attributeName, returnClass, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: Bind exception starting server at: 0.0.0.0:1
		//       at net.sf.freecol.server.FreeColServer.serverStart(FreeColServer.java:383)
		//       at net.sf.freecol.server.FreeColServer.<init>(FreeColServer.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Location getLocationAttribute(Game,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetLocationAttribute_1()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		Game game = new Game(new IIOMetadataNode(), "");
		String attributeName = null;
		boolean make = true;

		Location result = fixture.getLocationAttribute(game, attributeName, make);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Location getLocationAttribute(Game,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetLocationAttribute_2()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		Game game = new Game(new IIOMetadataNode(), "");
		String attributeName = "id";
		boolean make = true;

		Location result = fixture.getLocationAttribute(game, attributeName, make);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Location getLocationAttribute(Game,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetLocationAttribute_3()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		Game game = new Game(new IIOMetadataNode(), "");
		String attributeName = "";
		boolean make = true;

		Location result = fixture.getLocationAttribute(game, attributeName, make);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Location getLocationAttribute(Game,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetLocationAttribute_4()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		Game game = new Game(new IIOMetadataNode(), "");
		String attributeName = "";
		boolean make = true;

		Location result = fixture.getLocationAttribute(game, attributeName, make);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Location getLocationAttribute(Game,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetLocationAttribute_5()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		Game game = new Game(new IIOMetadataNode(), "");
		String attributeName = "id";
		boolean make = false;

		Location result = fixture.getLocationAttribute(game, attributeName, make);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Location getLocationAttribute(Game,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetLocationAttribute_6()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		Game game = new Game(new IIOMetadataNode(), "");
		String attributeName = "";
		boolean make = true;

		Location result = fixture.getLocationAttribute(game, attributeName, make);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColXMLReader.ReadScope getReadScope() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetReadScope_1()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);

		FreeColXMLReader.ReadScope result = fixture.getReadScope();

		// add additional test code here
		assertNotNull(result);
		assertEquals("NOINTERN", result.name());
		assertEquals("NOINTERN", result.toString());
		assertEquals(2, result.ordinal());
	}

	/**
	 * Run the FreeColGameObjectType getRole(Specification,String,Class<T>,T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetRole_1()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		Specification spec = new Specification();
		String attributeName = "";
		Class<FreeColGameObjectType> returnClass = FreeColGameObjectType.class;

		FreeColGameObjectType result = fixture.getRole(spec, attributeName, returnClass, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getRole(FreeColXMLReader.java:837)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColGameObjectType getRole(Specification,String,Class<T>,T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetRole_2()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		Specification spec = new Specification();
		String attributeName = "id";
		Class<FreeColGameObjectType> returnClass = FreeColGameObjectType.class;

		FreeColGameObjectType result = fixture.getRole(spec, attributeName, returnClass, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getRole(FreeColXMLReader.java:836)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColGameObjectType getType(Specification,String,Class<T>,T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetType_1()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		Specification spec = new Specification();
		String attributeName = "id";
		Class<FreeColGameObjectType> returnClass = FreeColGameObjectType.class;

		FreeColGameObjectType result = fixture.getType(spec, attributeName, returnClass, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getType(FreeColXMLReader.java:823)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColGameObjectType getType(Specification,String,Class<T>,T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testGetType_2()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		Specification spec = new Specification();
		String attributeName = "";
		Class<FreeColGameObjectType> returnClass = FreeColGameObjectType.class;

		FreeColGameObjectType result = fixture.getType(spec, attributeName, returnClass, null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getType(FreeColXMLReader.java:825)
		assertNotNull(result);
	}

	/**
	 * Run the boolean hasAttribute(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testHasAttribute_1()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		String attributeName = "";

		boolean result = fixture.hasAttribute(attributeName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasAttribute(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testHasAttribute_2()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		String attributeName = "";

		boolean result = fixture.hasAttribute(attributeName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		assertTrue(result);
	}

	/**
	 * Run the AIObject makeAIObject(AIMain,String,Class<T>,T,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testMakeAIObject_1()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		AIMain aiMain = new AIMain(new FreeColServer(true, true, new Specification(), 1, ""));
		String attributeName = "";
		Class<AIObject> returnClass = AIObject.class;
		boolean required = true;

		AIObject result = fixture.makeAIObject(aiMain, attributeName, returnClass, null, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: Bind exception starting server at: 0.0.0.0:1
		//       at net.sf.freecol.server.FreeColServer.serverStart(FreeColServer.java:383)
		//       at net.sf.freecol.server.FreeColServer.<init>(FreeColServer.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the AIObject makeAIObject(AIMain,String,Class<T>,T,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testMakeAIObject_2()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		AIMain aiMain = new AIMain(new FreeColServer(true, true, new Specification(), 1, ""));
		String attributeName = "";
		Class<AIObject> returnClass = AIObject.class;
		boolean required = false;

		AIObject result = fixture.makeAIObject(aiMain, attributeName, returnClass, null, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: Bind exception starting server at: 0.0.0.0:1
		//       at net.sf.freecol.server.FreeColServer.serverStart(FreeColServer.java:383)
		//       at net.sf.freecol.server.FreeColServer.<init>(FreeColServer.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the AIObject makeAIObject(AIMain,String,Class<T>,T,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testMakeAIObject_3()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		AIMain aiMain = new AIMain(new FreeColServer(true, true, new Specification(), 1, ""));
		String attributeName = "id";
		Class<AIObject> returnClass = AIObject.class;
		boolean required = true;

		AIObject result = fixture.makeAIObject(aiMain, attributeName, returnClass, null, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: Bind exception starting server at: 0.0.0.0:1
		//       at net.sf.freecol.server.FreeColServer.serverStart(FreeColServer.java:383)
		//       at net.sf.freecol.server.FreeColServer.<init>(FreeColServer.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the AIObject makeAIObject(AIMain,String,Class<T>,T,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testMakeAIObject_4()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		AIMain aiMain = new AIMain(new FreeColServer(true, true, new Specification(), 1, ""));
		String attributeName = "id";
		Class<AIObject> returnClass = AIObject.class;
		boolean required = false;

		AIObject result = fixture.makeAIObject(aiMain, attributeName, returnClass, null, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: Bind exception starting server at: 0.0.0.0:1
		//       at net.sf.freecol.server.FreeColServer.serverStart(FreeColServer.java:383)
		//       at net.sf.freecol.server.FreeColServer.<init>(FreeColServer.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the AIObject makeAIObject(AIMain,String,Class<T>,T,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testMakeAIObject_5()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		AIMain aiMain = new AIMain(new FreeColServer(true, true, new Specification(), 1, ""));
		String attributeName = "";
		Class<AIObject> returnClass = AIObject.class;
		boolean required = false;

		AIObject result = fixture.makeAIObject(aiMain, attributeName, returnClass, null, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: Bind exception starting server at: 0.0.0.0:1
		//       at net.sf.freecol.server.FreeColServer.serverStart(FreeColServer.java:383)
		//       at net.sf.freecol.server.FreeColServer.<init>(FreeColServer.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the AIObject makeAIObject(AIMain,String,Class<T>,T,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testMakeAIObject_6()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		AIMain aiMain = new AIMain(new FreeColServer(true, true, new Specification(), 1, ""));
		String attributeName = "";
		Class<AIObject> returnClass = AIObject.class;
		boolean required = false;

		AIObject result = fixture.makeAIObject(aiMain, attributeName, returnClass, null, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: Bind exception starting server at: 0.0.0.0:1
		//       at net.sf.freecol.server.FreeColServer.serverStart(FreeColServer.java:383)
		//       at net.sf.freecol.server.FreeColServer.<init>(FreeColServer.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the AIObject makeAIObject(AIMain,String,Class<T>,T,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testMakeAIObject_7()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		AIMain aiMain = new AIMain(new FreeColServer(true, true, new Specification(), 1, ""));
		String attributeName = "";
		Class<AIObject> returnClass = AIObject.class;
		boolean required = false;

		AIObject result = fixture.makeAIObject(aiMain, attributeName, returnClass, null, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: Bind exception starting server at: 0.0.0.0:1
		//       at net.sf.freecol.server.FreeColServer.serverStart(FreeColServer.java:383)
		//       at net.sf.freecol.server.FreeColServer.<init>(FreeColServer.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the AIObject makeAIObject(AIMain,String,Class<T>,T,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testMakeAIObject_8()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		AIMain aiMain = new AIMain(new FreeColServer(true, true, new Specification(), 1, ""));
		String attributeName = "";
		Class<AIObject> returnClass = AIObject.class;
		boolean required = false;

		AIObject result = fixture.makeAIObject(aiMain, attributeName, returnClass, null, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: Bind exception starting server at: 0.0.0.0:1
		//       at net.sf.freecol.server.FreeColServer.serverStart(FreeColServer.java:383)
		//       at net.sf.freecol.server.FreeColServer.<init>(FreeColServer.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the AIObject makeAIObject(AIMain,String,Class<T>,T,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testMakeAIObject_9()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		AIMain aiMain = new AIMain(new FreeColServer(true, true, new Specification(), 1, ""));
		String attributeName = "";
		Class<AIObject> returnClass = AIObject.class;
		boolean required = false;

		AIObject result = fixture.makeAIObject(aiMain, attributeName, returnClass, null, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: Bind exception starting server at: 0.0.0.0:1
		//       at net.sf.freecol.server.FreeColServer.serverStart(FreeColServer.java:383)
		//       at net.sf.freecol.server.FreeColServer.<init>(FreeColServer.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the AIObject makeAIObject(AIMain,String,Class<T>,T,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testMakeAIObject_10()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		AIMain aiMain = new AIMain(new FreeColServer(true, true, new Specification(), 1, ""));
		String attributeName = "";
		Class<AIObject> returnClass = AIObject.class;
		boolean required = true;

		AIObject result = fixture.makeAIObject(aiMain, attributeName, returnClass, null, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: Bind exception starting server at: 0.0.0.0:1
		//       at net.sf.freecol.server.FreeColServer.serverStart(FreeColServer.java:383)
		//       at net.sf.freecol.server.FreeColServer.<init>(FreeColServer.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the AIObject makeAIObject(AIMain,String,Class<T>,T,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testMakeAIObject_11()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		AIMain aiMain = new AIMain(new FreeColServer(true, true, new Specification(), 1, ""));
		String attributeName = "id";
		Class<AIObject> returnClass = AIObject.class;
		boolean required = false;

		AIObject result = fixture.makeAIObject(aiMain, attributeName, returnClass, null, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: Bind exception starting server at: 0.0.0.0:1
		//       at net.sf.freecol.server.FreeColServer.serverStart(FreeColServer.java:383)
		//       at net.sf.freecol.server.FreeColServer.<init>(FreeColServer.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColGameObject makeFreeColGameObject(Game,String,Class<T>,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testMakeFreeColGameObject_1()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		Game game = new Game(new IIOMetadataNode(), "");
		String attributeName = "id";
		Class<FreeColGameObject> returnClass = FreeColGameObject.class;
		boolean required = true;

		FreeColGameObject result = fixture.makeFreeColGameObject(game, attributeName, returnClass, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColGameObject makeFreeColGameObject(Game,String,Class<T>,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testMakeFreeColGameObject_2()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		Game game = new Game(new IIOMetadataNode(), "");
		String attributeName = "";
		Class<FreeColGameObject> returnClass = FreeColGameObject.class;
		boolean required = true;

		FreeColGameObject result = fixture.makeFreeColGameObject(game, attributeName, returnClass, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColGameObject makeFreeColGameObject(Game,String,Class<T>,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testMakeFreeColGameObject_3()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		Game game = new Game(new IIOMetadataNode(), "");
		String attributeName = "id";
		Class<FreeColGameObject> returnClass = FreeColGameObject.class;
		boolean required = true;

		FreeColGameObject result = fixture.makeFreeColGameObject(game, attributeName, returnClass, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColGameObject makeFreeColGameObject(Game,String,Class<T>,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testMakeFreeColGameObject_4()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		Game game = new Game(new IIOMetadataNode(), "");
		String attributeName = "";
		Class<FreeColGameObject> returnClass = FreeColGameObject.class;
		boolean required = true;

		FreeColGameObject result = fixture.makeFreeColGameObject(game, attributeName, returnClass, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColGameObject makeFreeColGameObject(Game,String,Class<T>,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testMakeFreeColGameObject_5()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		Game game = new Game(new IIOMetadataNode(), "");
		String attributeName = "";
		Class<FreeColGameObject> returnClass = FreeColGameObject.class;
		boolean required = true;

		FreeColGameObject result = fixture.makeFreeColGameObject(game, attributeName, returnClass, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColGameObject makeFreeColGameObject(Game,String,Class<T>,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testMakeFreeColGameObject_6()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		Game game = new Game(new IIOMetadataNode(), "");
		String attributeName = "";
		Class<FreeColGameObject> returnClass = FreeColGameObject.class;
		boolean required = false;

		FreeColGameObject result = fixture.makeFreeColGameObject(game, attributeName, returnClass, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColGameObject makeFreeColGameObject(Game,String,Class<T>,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testMakeFreeColGameObject_7()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		Game game = new Game(new IIOMetadataNode(), "");
		String attributeName = "id";
		Class<FreeColGameObject> returnClass = FreeColGameObject.class;
		boolean required = false;

		FreeColGameObject result = fixture.makeFreeColGameObject(game, attributeName, returnClass, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColGameObject readFreeColGameObject(Game,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testReadFreeColGameObject_1()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		Game game = new Game(new IIOMetadataNode(), "");
		Class<FreeColGameObject> returnClass = FreeColGameObject.class;

		FreeColGameObject result = fixture.readFreeColGameObject(game, returnClass);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColGameObject readFreeColGameObject(Game,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testReadFreeColGameObject_2()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		Game game = new Game(new IIOMetadataNode(), "");
		Class<FreeColGameObject> returnClass = FreeColGameObject.class;

		FreeColGameObject result = fixture.readFreeColGameObject(game, returnClass);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColGameObject readFreeColGameObject(Game,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testReadFreeColGameObject_3()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		Game game = new Game(new IIOMetadataNode(), "");
		Class<FreeColGameObject> returnClass = FreeColGameObject.class;

		FreeColGameObject result = fixture.readFreeColGameObject(game, returnClass);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String readId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testReadId_1()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);

		String result = fixture.readId();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		assertNotNull(result);
	}

	/**
	 * Run the String readId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testReadId_2()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);

		String result = fixture.readId();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		assertNotNull(result);
	}

	/**
	 * Run the List<Object> readList(String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testReadList_1()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		String tag = "";
		Class<Object> type = Object.class;

		List<Object> result = fixture.readList(tag, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.expectTag(FreeColXMLReader.java:230)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readList(FreeColXMLReader.java:495)
		assertNotNull(result);
	}

	/**
	 * Run the List<Object> readList(String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testReadList_2()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		String tag = "";
		Class<Object> type = Object.class;

		List<Object> result = fixture.readList(tag, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.expectTag(FreeColXMLReader.java:230)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readList(FreeColXMLReader.java:495)
		assertNotNull(result);
	}

	/**
	 * Run the List<Object> readList(String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testReadList_3()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		String tag = "";
		Class<Object> type = Object.class;

		List<Object> result = fixture.readList(tag, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.expectTag(FreeColXMLReader.java:230)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readList(FreeColXMLReader.java:495)
		assertNotNull(result);
	}

	/**
	 * Run the List<Object> readList(String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testReadList_4()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		String tag = "";
		Class<Object> type = Object.class;

		List<Object> result = fixture.readList(tag, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.expectTag(FreeColXMLReader.java:230)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readList(FreeColXMLReader.java:495)
		assertNotNull(result);
	}

	/**
	 * Run the List<Object> readList(String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testReadList_5()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		String tag = "";
		Class<Object> type = Object.class;

		List<Object> result = fixture.readList(tag, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.expectTag(FreeColXMLReader.java:230)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readList(FreeColXMLReader.java:495)
		assertNotNull(result);
	}

	/**
	 * Run the List<Object> readList(String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testReadList_6()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		String tag = "";
		Class<Object> type = Object.class;

		List<Object> result = fixture.readList(tag, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.expectTag(FreeColXMLReader.java:230)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readList(FreeColXMLReader.java:495)
		assertNotNull(result);
	}

	/**
	 * Run the List<Object> readList(String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testReadList_7()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		String tag = "";
		Class<Object> type = Object.class;

		List<Object> result = fixture.readList(tag, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.expectTag(FreeColXMLReader.java:230)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readList(FreeColXMLReader.java:495)
		assertNotNull(result);
	}

	/**
	 * Run the List<Object> readList(String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testReadList_8()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		String tag = "";
		Class<Object> type = Object.class;

		List<Object> result = fixture.readList(tag, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.expectTag(FreeColXMLReader.java:230)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readList(FreeColXMLReader.java:495)
		assertNotNull(result);
	}

	/**
	 * Run the List<Object> readList(String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testReadList_9()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		String tag = "";
		Class<Object> type = Object.class;

		List<Object> result = fixture.readList(tag, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.expectTag(FreeColXMLReader.java:230)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readList(FreeColXMLReader.java:495)
		assertNotNull(result);
	}

	/**
	 * Run the List<Object> readList(String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testReadList_10()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		String tag = "";
		Class<Object> type = Object.class;

		List<Object> result = fixture.readList(tag, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.expectTag(FreeColXMLReader.java:230)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readList(FreeColXMLReader.java:495)
		assertNotNull(result);
	}

	/**
	 * Run the List<Object> readList(String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testReadList_11()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		String tag = "";
		Class<Object> type = Object.class;

		List<Object> result = fixture.readList(tag, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.expectTag(FreeColXMLReader.java:230)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readList(FreeColXMLReader.java:495)
		assertNotNull(result);
	}

	/**
	 * Run the List<FreeColGameObjectType> readList(Specification,String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testReadList_12()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		Specification spec = new Specification();
		String tag = "";
		Class<FreeColGameObjectType> type = FreeColGameObjectType.class;

		List<FreeColGameObjectType> result = fixture.readList(spec, tag, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.expectTag(FreeColXMLReader.java:230)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readList(FreeColXMLReader.java:535)
		assertNotNull(result);
	}

	/**
	 * Run the List<FreeColGameObjectType> readList(Specification,String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testReadList_13()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		Specification spec = new Specification();
		String tag = "";
		Class<FreeColGameObjectType> type = FreeColGameObjectType.class;

		List<FreeColGameObjectType> result = fixture.readList(spec, tag, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.expectTag(FreeColXMLReader.java:230)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readList(FreeColXMLReader.java:535)
		assertNotNull(result);
	}

	/**
	 * Run the List<FreeColGameObjectType> readList(Specification,String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testReadList_14()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		Specification spec = new Specification();
		String tag = "";
		Class<FreeColGameObjectType> type = FreeColGameObjectType.class;

		List<FreeColGameObjectType> result = fixture.readList(spec, tag, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.expectTag(FreeColXMLReader.java:230)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readList(FreeColXMLReader.java:535)
		assertNotNull(result);
	}

	/**
	 * Run the List<FreeColGameObjectType> readList(Specification,String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testReadList_15()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		Specification spec = new Specification();
		String tag = "";
		Class<FreeColGameObjectType> type = FreeColGameObjectType.class;

		List<FreeColGameObjectType> result = fixture.readList(spec, tag, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.expectTag(FreeColXMLReader.java:230)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readList(FreeColXMLReader.java:535)
		assertNotNull(result);
	}

	/**
	 * Run the List<FreeColGameObjectType> readList(Specification,String,Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testReadList_16()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		Specification spec = new Specification();
		String tag = "";
		Class<FreeColGameObjectType> type = FreeColGameObjectType.class;

		List<FreeColGameObjectType> result = fixture.readList(spec, tag, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.expectTag(FreeColXMLReader.java:230)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readList(FreeColXMLReader.java:535)
		assertNotNull(result);
	}

	/**
	 * Run the void setReadScope(ReadScope) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testSetReadScope_1()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		FreeColXMLReader.ReadScope readScope = FreeColXMLReader.ReadScope.NOINTERN;

		fixture.setReadScope(readScope);

		// add additional test code here
	}

	/**
	 * Run the void setReadScope(ReadScope) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testSetReadScope_2()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);
		FreeColXMLReader.ReadScope readScope = FreeColXMLReader.ReadScope.NOINTERN;

		fixture.setReadScope(readScope);

		// add additional test code here
	}

	/**
	 * Run the boolean shouldClearContainers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testShouldClearContainers_1()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);

		boolean result = fixture.shouldClearContainers();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:801)
		assertTrue(result);
	}

	/**
	 * Run the boolean shouldClearContainers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testShouldClearContainers_2()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);

		boolean result = fixture.shouldClearContainers();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:801)
		assertTrue(result);
	}

	/**
	 * Run the boolean shouldClearContainers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testShouldClearContainers_3()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);

		boolean result = fixture.shouldClearContainers();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:801)
		assertTrue(result);
	}

	/**
	 * Run the boolean shouldIntern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testShouldIntern_1()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);

		boolean result = fixture.shouldIntern();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean shouldIntern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	@Test
	public void testShouldIntern_2()
		throws Exception {
		FreeColXMLReader fixture = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		fixture.setReadScope(FreeColXMLReader.ReadScope.NOINTERN);

		boolean result = fixture.shouldIntern();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/18 4:42 PM
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
	 * @generatedBy CodePro at 5/14/18 4:42 PM
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
	 * @generatedBy CodePro at 5/14/18 4:42 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FreeColXMLReaderTest.class);
	}
}