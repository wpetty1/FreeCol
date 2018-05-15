package net.sf.freecol.common.io;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.model.Player;
import java.util.ArrayList;
import net.sf.freecol.common.model.Location;
import java.util.Collection;
import javax.imageio.metadata.IIOMetadataNode;
import javax.xml.namespace.NamespaceContext;
import javax.xml.stream.XMLStreamException;
import net.sf.freecol.common.model.HighSeas;
import net.sf.freecol.common.model.Game;
import org.junit.*;
import net.sf.freecol.common.model.AbstractGoods;
import static org.junit.Assert.*;
import org.w3c.dom.Element;
import net.sf.freecol.common.model.FreeColObject;

/**
 * The class <code>FreeColXMLWriterTest</code> contains tests for the class <code>{@link FreeColXMLWriter}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:43 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class FreeColXMLWriterTest {
	/**
	 * Run the FreeColXMLWriter(Writer,WriteScope) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testFreeColXMLWriter_1()
		throws Exception {
		Writer writer = new StringWriter();
		FreeColXMLWriter.WriteScope scope = FreeColXMLWriter.WriteScope.CLIENT;

		FreeColXMLWriter result = new FreeColXMLWriter(writer, scope);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.validForSave());
		assertEquals(null, result.getClientPlayer());
	}

	/**
	 * Run the FreeColXMLWriter(OutputStream,WriteScope,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testFreeColXMLWriter_2()
		throws Exception {
		OutputStream outputStream = new ByteArrayOutputStream();
		FreeColXMLWriter.WriteScope scope = FreeColXMLWriter.WriteScope.CLIENT;
		boolean indent = true;

		FreeColXMLWriter result = new FreeColXMLWriter(outputStream, scope, indent);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.validForSave());
		assertEquals(null, result.getClientPlayer());
	}

	/**
	 * Run the FreeColXMLWriter(OutputStream,WriteScope,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testFreeColXMLWriter_3()
		throws Exception {
		OutputStream outputStream = new ByteArrayOutputStream();
		FreeColXMLWriter.WriteScope scope = FreeColXMLWriter.WriteScope.CLIENT;
		boolean indent = true;

		FreeColXMLWriter result = new FreeColXMLWriter(outputStream, scope, indent);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.validForSave());
		assertEquals(null, result.getClientPlayer());
	}

	/**
	 * Run the void close() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testClose_1()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);

		fixture.close();

		// add additional test code here
	}

	/**
	 * Run the void close() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testClose_2()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);

		fixture.close();

		// add additional test code here
	}

	/**
	 * Run the void close() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testClose_3()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);

		fixture.close();

		// add additional test code here
	}

	/**
	 * Run the void close() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testClose_4()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);

		fixture.close();

		// add additional test code here
	}

	/**
	 * Run the void close() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testClose_5()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);

		fixture.close();

		// add additional test code here
	}

	/**
	 * Run the void close() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testClose_6()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);

		fixture.close();

		// add additional test code here
	}

	/**
	 * Run the void close() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testClose_7()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);

		fixture.close();

		// add additional test code here
	}

	/**
	 * Run the void close() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testClose_8()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);

		fixture.close();

		// add additional test code here
	}

	/**
	 * Run the void close() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testClose_9()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);

		fixture.close();

		// add additional test code here
	}

	/**
	 * Run the void close() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testClose_10()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);

		fixture.close();

		// add additional test code here
	}

	/**
	 * Run the void flush() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testFlush_1()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);

		fixture.flush();

		// add additional test code here
	}

	/**
	 * Run the void flush() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testFlush_2()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);

		fixture.flush();

		// add additional test code here
	}

	/**
	 * Run the Player getClientPlayer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testGetClientPlayer_1()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);

		Player result = fixture.getClientPlayer();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the NamespaceContext getNamespaceContext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testGetNamespaceContext_1()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);

		NamespaceContext result = fixture.getNamespaceContext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getPrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testGetPrefix_1()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String uri = "";

		String result = fixture.getPrefix(uri);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getPrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testGetPrefix_2()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String uri = "";

		String result = fixture.getPrefix(uri);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getProperty(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testGetProperty_1()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String name = "";

		Object result = fixture.getProperty(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Property '' is not supported
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.getProperty(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLWriter.getProperty(FreeColXMLWriter.java:410)
		assertNotNull(result);
	}

	/**
	 * Run the Object getProperty(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testGetProperty_2()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String name = "";

		Object result = fixture.getProperty(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the FreeColXMLWriter.WriteScope getWriteScope() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testGetWriteScope_1()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);

		FreeColXMLWriter.WriteScope result = fixture.getWriteScope();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isValid());
		assertEquals(false, result.validForSave());
		assertEquals(null, result.getClient());
		assertEquals("CLIENT", result.name());
		assertEquals("CLIENT", result.toString());
		assertEquals(0, result.ordinal());
	}

	/**
	 * Run the void setDefaultNamespace(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testSetDefaultNamespace_1()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String uri = "";

		fixture.setDefaultNamespace(uri);

		// add additional test code here
	}

	/**
	 * Run the void setDefaultNamespace(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testSetDefaultNamespace_2()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String uri = "";

		fixture.setDefaultNamespace(uri);

		// add additional test code here
	}

	/**
	 * Run the void setNamespaceContext(NamespaceContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testSetNamespaceContext_1()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		NamespaceContext context = null;

		fixture.setNamespaceContext(context);

		// add additional test code here
	}

	/**
	 * Run the void setNamespaceContext(NamespaceContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testSetNamespaceContext_2()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		NamespaceContext context = null;

		fixture.setNamespaceContext(context);

		// add additional test code here
	}

	/**
	 * Run the void setPrefix(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testSetPrefix_1()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String prefix = "";
		String uri = "";

		fixture.setPrefix(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void setPrefix(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testSetPrefix_2()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String prefix = "";
		String uri = "";

		fixture.setPrefix(prefix, uri);

		// add additional test code here
	}

	/**
	 * Run the void setWriteScope(WriteScope) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testSetWriteScope_1()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		FreeColXMLWriter.WriteScope writeScope = FreeColXMLWriter.WriteScope.CLIENT;

		fixture.setWriteScope(writeScope);

		// add additional test code here
	}

	/**
	 * Run the boolean validFor(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testValidFor_1()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		boolean result = fixture.validFor(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean validFor(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testValidFor_2()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		boolean result = fixture.validFor(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean validForSave() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testValidForSave_1()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);

		boolean result = fixture.validForSave();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean validForSave() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testValidForSave_2()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);

		boolean result = fixture.validForSave();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void writeAttribute(String,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttribute_1()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String attributeName = "";
		float value = 1.0f;

		fixture.writeAttribute(attributeName, value);

		// add additional test code here
	}

	/**
	 * Run the void writeAttribute(String,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttribute_2()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String attributeName = "";
		float value = 1.0f;

		fixture.writeAttribute(attributeName, value);

		// add additional test code here
	}

	/**
	 * Run the void writeAttribute(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttribute_3()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String attributeName = "";
		int value = 1;

		fixture.writeAttribute(attributeName, value);

		// add additional test code here
	}

	/**
	 * Run the void writeAttribute(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttribute_4()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String attributeName = "";
		int value = 1;

		fixture.writeAttribute(attributeName, value);

		// add additional test code here
	}

	/**
	 * Run the void writeAttribute(String,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttribute_5()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String attributeName = "";
		long value = 1L;

		fixture.writeAttribute(attributeName, value);

		// add additional test code here
	}

	/**
	 * Run the void writeAttribute(String,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttribute_6()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String attributeName = "";
		long value = 1L;

		fixture.writeAttribute(attributeName, value);

		// add additional test code here
	}

	/**
	 * Run the void writeAttribute(String,Enum<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteAttribute_7()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String attributeName = "";
		Enum<Enum> value = null;

		fixture.writeAttribute(attributeName, value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.io.FreeColXMLWriter.writeAttribute(FreeColXMLWriter.java:311)
	}

	/**
	 * Run the void writeAttribute(String,Enum<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteAttribute_8()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String attributeName = "";
		Enum<Enum> value = null;

		fixture.writeAttribute(attributeName, value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.io.FreeColXMLWriter.writeAttribute(FreeColXMLWriter.java:311)
	}

	/**
	 * Run the void writeAttribute(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttribute_9()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String attributeName = "";
		Object value = new Object();

		fixture.writeAttribute(attributeName, value);

		// add additional test code here
	}

	/**
	 * Run the void writeAttribute(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttribute_10()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String attributeName = "";
		Object value = new Object();

		fixture.writeAttribute(attributeName, value);

		// add additional test code here
	}

	/**
	 * Run the void writeAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttribute_11()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String localName = "";
		String value = "";

		fixture.writeAttribute(localName, value);

		// add additional test code here
	}

	/**
	 * Run the void writeAttribute(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttribute_12()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String localName = "";
		String value = "";

		fixture.writeAttribute(localName, value);

		// add additional test code here
	}

	/**
	 * Run the void writeAttribute(String,FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteAttribute_13()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String attributeName = "";
		FreeColObject value = null;

		fixture.writeAttribute(attributeName, value);

		// add additional test code here
	}

	/**
	 * Run the void writeAttribute(String,FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttribute_14()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String attributeName = "";
		FreeColObject value = new AbstractGoods();

		fixture.writeAttribute(attributeName, value);

		// add additional test code here
	}

	/**
	 * Run the void writeAttribute(String,FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttribute_15()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String attributeName = "";
		FreeColObject value = new AbstractGoods();

		fixture.writeAttribute(attributeName, value);

		// add additional test code here
	}

	/**
	 * Run the void writeAttribute(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttribute_16()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String attributeName = "";
		boolean value = true;

		fixture.writeAttribute(attributeName, value);

		// add additional test code here
	}

	/**
	 * Run the void writeAttribute(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttribute_17()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String attributeName = "";
		boolean value = true;

		fixture.writeAttribute(attributeName, value);

		// add additional test code here
	}

	/**
	 * Run the void writeAttribute(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttribute_18()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String namespaceURI = "";
		String localName = "";
		String value = "";

		fixture.writeAttribute(namespaceURI, localName, value);

		// add additional test code here
	}

	/**
	 * Run the void writeAttribute(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttribute_19()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String namespaceURI = "";
		String localName = "";
		String value = "";

		fixture.writeAttribute(namespaceURI, localName, value);

		// add additional test code here
	}

	/**
	 * Run the void writeAttribute(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttribute_20()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String prefix = "";
		String namespaceURI = "";
		String localName = "";
		String value = "";

		fixture.writeAttribute(prefix, namespaceURI, localName, value);

		// add additional test code here
	}

	/**
	 * Run the void writeAttribute(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttribute_21()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String prefix = "";
		String namespaceURI = "";
		String localName = "";
		String value = "";

		fixture.writeAttribute(prefix, namespaceURI, localName, value);

		// add additional test code here
	}

	/**
	 * Run the void writeCData(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteCData_1()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String data = "";

		fixture.writeCData(data);

		// add additional test code here
	}

	/**
	 * Run the void writeCData(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteCData_2()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String data = "";

		fixture.writeCData(data);

		// add additional test code here
	}

	/**
	 * Run the void writeCharacters(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteCharacters_1()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String text = "";

		fixture.writeCharacters(text);

		// add additional test code here
	}

	/**
	 * Run the void writeCharacters(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteCharacters_2()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String text = "";

		fixture.writeCharacters(text);

		// add additional test code here
	}

	/**
	 * Run the void writeCharacters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteCharacters_3()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		char[] text = new char[] {};
		int start = 1;
		int len = 1;

		fixture.writeCharacters(text, start, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeXMLContent(Unknown Source)
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeCharacters(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLWriter.writeCharacters(FreeColXMLWriter.java:450)
	}

	/**
	 * Run the void writeCharacters(char[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteCharacters_4()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		char[] text = new char[] {};
		int start = 1;
		int len = 1;

		fixture.writeCharacters(text, start, len);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeXMLContent(Unknown Source)
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeCharacters(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLWriter.writeCharacters(FreeColXMLWriter.java:450)
	}

	/**
	 * Run the void writeComment(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteComment_1()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String data = "";

		fixture.writeComment(data);

		// add additional test code here
	}

	/**
	 * Run the void writeComment(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteComment_2()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String data = "";

		fixture.writeComment(data);

		// add additional test code here
	}

	/**
	 * Run the void writeDTD(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteDTD_1()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String dtd = "";

		fixture.writeDTD(dtd);

		// add additional test code here
	}

	/**
	 * Run the void writeDTD(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteDTD_2()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String dtd = "";

		fixture.writeDTD(dtd);

		// add additional test code here
	}

	/**
	 * Run the void writeDefaultNamespace(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteDefaultNamespace_1()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String namespaceURI = "";

		fixture.writeDefaultNamespace(namespaceURI);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Namespace Attribute not associated with any element
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeDefaultNamespace(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLWriter.writeDefaultNamespace(FreeColXMLWriter.java:465)
	}

	/**
	 * Run the void writeDefaultNamespace(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteDefaultNamespace_2()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String namespaceURI = "";

		fixture.writeDefaultNamespace(namespaceURI);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Namespace Attribute not associated with any element
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeDefaultNamespace(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLWriter.writeDefaultNamespace(FreeColXMLWriter.java:465)
	}

	/**
	 * Run the void writeEmptyElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteEmptyElement_1()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String localName = "";

		fixture.writeEmptyElement(localName);

		// add additional test code here
	}

	/**
	 * Run the void writeEmptyElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteEmptyElement_2()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String localName = "";

		fixture.writeEmptyElement(localName);

		// add additional test code here
	}

	/**
	 * Run the void writeEmptyElement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteEmptyElement_3()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String namespaceURI = "";
		String localName = "";

		fixture.writeEmptyElement(namespaceURI, localName);

		// add additional test code here
	}

	/**
	 * Run the void writeEmptyElement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteEmptyElement_4()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String namespaceURI = "";
		String localName = "";

		fixture.writeEmptyElement(namespaceURI, localName);

		// add additional test code here
	}

	/**
	 * Run the void writeEmptyElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteEmptyElement_5()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String prefix = "";
		String localName = "";
		String namespaceURI = "";

		fixture.writeEmptyElement(prefix, localName, namespaceURI);

		// add additional test code here
	}

	/**
	 * Run the void writeEmptyElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteEmptyElement_6()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String prefix = "";
		String localName = "";
		String namespaceURI = "";

		fixture.writeEmptyElement(prefix, localName, namespaceURI);

		// add additional test code here
	}

	/**
	 * Run the void writeEndDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteEndDocument_1()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeEndDocument();

		// add additional test code here
	}

	/**
	 * Run the void writeEndDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteEndDocument_2()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeEndDocument();

		// add additional test code here
	}

	/**
	 * Run the void writeEndElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteEndElement_1()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeEndElement();

		// add additional test code here
	}

	/**
	 * Run the void writeEndElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteEndElement_2()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeEndElement();

		// add additional test code here
	}

	/**
	 * Run the void writeEntityRef(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteEntityRef_1()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String name = "";

		fixture.writeEntityRef(name);

		// add additional test code here
	}

	/**
	 * Run the void writeEntityRef(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteEntityRef_2()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String name = "";

		fixture.writeEntityRef(name);

		// add additional test code here
	}

	/**
	 * Run the void writeLocationAttribute(String,Location) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteLocationAttribute_1()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String attributeName = "";
		Location value = new HighSeas(new Game(new IIOMetadataNode(), ""));

		fixture.writeLocationAttribute(attributeName, value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeLocationAttribute(String,Location) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteLocationAttribute_2()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String attributeName = "";
		Location value = new Object();

		fixture.writeLocationAttribute(attributeName, value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void writeNamespace(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteNamespace_1()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String prefix = "";
		String namespaceURI = "";

		fixture.writeNamespace(prefix, namespaceURI);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Invalid state: start tag is not opened at writeNamespace(, )
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeNamespace(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLWriter.writeNamespace(FreeColXMLWriter.java:505)
	}

	/**
	 * Run the void writeNamespace(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteNamespace_2()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String prefix = "";
		String namespaceURI = "";

		fixture.writeNamespace(prefix, namespaceURI);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Invalid state: start tag is not opened at writeNamespace(, )
		//       at com.sun.xml.internal.stream.writers.XMLStreamWriterImpl.writeNamespace(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLWriter.writeNamespace(FreeColXMLWriter.java:505)
	}

	/**
	 * Run the void writeProcessingInstruction(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteProcessingInstruction_1()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String target = "";

		fixture.writeProcessingInstruction(target);

		// add additional test code here
	}

	/**
	 * Run the void writeProcessingInstruction(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteProcessingInstruction_2()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String target = "";

		fixture.writeProcessingInstruction(target);

		// add additional test code here
	}

	/**
	 * Run the void writeProcessingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteProcessingInstruction_3()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String target = "";
		String data = "";

		fixture.writeProcessingInstruction(target, data);

		// add additional test code here
	}

	/**
	 * Run the void writeProcessingInstruction(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteProcessingInstruction_4()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String target = "";
		String data = "";

		fixture.writeProcessingInstruction(target, data);

		// add additional test code here
	}

	/**
	 * Run the void writeStartDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteStartDocument_1()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeStartDocument();

		// add additional test code here
	}

	/**
	 * Run the void writeStartDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteStartDocument_2()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeStartDocument();

		// add additional test code here
	}

	/**
	 * Run the void writeStartDocument(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteStartDocument_3()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String version = "";

		fixture.writeStartDocument(version);

		// add additional test code here
	}

	/**
	 * Run the void writeStartDocument(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteStartDocument_4()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String version = "";

		fixture.writeStartDocument(version);

		// add additional test code here
	}

	/**
	 * Run the void writeStartDocument(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteStartDocument_5()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String encoding = "";
		String version = "";

		fixture.writeStartDocument(encoding, version);

		// add additional test code here
	}

	/**
	 * Run the void writeStartDocument(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteStartDocument_6()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String encoding = "";
		String version = "";

		fixture.writeStartDocument(encoding, version);

		// add additional test code here
	}

	/**
	 * Run the void writeStartElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteStartElement_1()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String localName = "";

		fixture.writeStartElement(localName);

		// add additional test code here
	}

	/**
	 * Run the void writeStartElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteStartElement_2()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String localName = "";

		fixture.writeStartElement(localName);

		// add additional test code here
	}

	/**
	 * Run the void writeStartElement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteStartElement_3()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String namespaceURI = "";
		String localName = "";

		fixture.writeStartElement(namespaceURI, localName);

		// add additional test code here
	}

	/**
	 * Run the void writeStartElement(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteStartElement_4()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String namespaceURI = "";
		String localName = "";

		fixture.writeStartElement(namespaceURI, localName);

		// add additional test code here
	}

	/**
	 * Run the void writeStartElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteStartElement_5()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String prefix = "";
		String localName = "";
		String namespaceURI = "";

		fixture.writeStartElement(prefix, localName, namespaceURI);

		// add additional test code here
	}

	/**
	 * Run the void writeStartElement(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteStartElement_6()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String prefix = "";
		String localName = "";
		String namespaceURI = "";

		fixture.writeStartElement(prefix, localName, namespaceURI);

		// add additional test code here
	}

	/**
	 * Run the void writeToListElement(String,Collection<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteToListElement_1()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String tag = "";
		Collection<FreeColObject> members = new ArrayList<FreeColObject>();

		fixture.writeToListElement(tag, members);

		// add additional test code here
	}

	/**
	 * Run the void writeToListElement(String,Collection<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteToListElement_2()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String tag = "";
		Collection<FreeColObject> members = new ArrayList<FreeColObject>();

		fixture.writeToListElement(tag, members);

		// add additional test code here
	}

	/**
	 * Run the void writeToListElement(String,Collection<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteToListElement_3()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String tag = "";
		Collection<FreeColObject> members = new ArrayList<FreeColObject>();

		fixture.writeToListElement(tag, members);

		// add additional test code here
	}

	/**
	 * Run the void writeToListElement(String,Collection<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteToListElement_4()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String tag = "";
		Collection<FreeColObject> members = new ArrayList<FreeColObject>();

		fixture.writeToListElement(tag, members);

		// add additional test code here
	}

	/**
	 * Run the void writeToListElement(String,Collection<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteToListElement_5()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String tag = "";
		Collection<FreeColObject> members = new ArrayList<FreeColObject>();

		fixture.writeToListElement(tag, members);

		// add additional test code here
	}

	/**
	 * Run the void writeToListElement(String,Collection<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	@Test
	public void testWriteToListElement_6()
		throws Exception {
		FreeColXMLWriter fixture = new FreeColXMLWriter(new StringWriter(), FreeColXMLWriter.WriteScope.CLIENT);
		fixture.setWriteScope(FreeColXMLWriter.WriteScope.CLIENT);
		String tag = "";
		Collection<FreeColObject> members = new ArrayList<FreeColObject>();

		fixture.writeToListElement(tag, members);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/18 4:43 PM
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
	 * @generatedBy CodePro at 5/14/18 4:43 PM
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
	 * @generatedBy CodePro at 5/14/18 4:43 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FreeColXMLWriterTest.class);
	}
}