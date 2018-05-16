package net.sf.freecol.common.util;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import javax.imageio.metadata.IIOMetadataNode;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

/**
 * The class <code>XmlTest</code> contains tests for the class <code>{@link Xml}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:41 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class XmlTest {
	/**
	 * Run the String[] arrayAttribute(Node,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testArrayAttribute_1()
		throws Exception {
		Node xmlElement = new IIOMetadataNode();
		String attributeName = "";

		String[] result = Xml.arrayAttribute(xmlElement, attributeName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.util.Xml.attribute(Xml.java:87)
		//       at net.sf.freecol.common.util.Xml.arrayAttribute(Xml.java:100)
		//       at net.sf.freecol.common.util.Xml.arrayAttribute(Xml.java:105)
		assertNotNull(result);
	}

	/**
	 * Run the String[] arrayAttribute(Node,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testArrayAttribute_2()
		throws Exception {
		Node xmlElement = new IIOMetadataNode();
		String attributeName = "";
		String separator = "";

		String[] result = Xml.arrayAttribute(xmlElement, attributeName, separator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.util.Xml.attribute(Xml.java:87)
		//       at net.sf.freecol.common.util.Xml.arrayAttribute(Xml.java:100)
		assertNotNull(result);
	}

	/**
	 * Run the String[] arrayAttribute(Node,String,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testArrayAttribute_3()
		throws Exception {
		Node xmlElement = new IIOMetadataNode();
		String attributeName = "";
		String[] otherwise = new String[] {};

		String[] result = Xml.arrayAttribute(xmlElement, attributeName, otherwise);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the String[] arrayAttribute(Node,String,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testArrayAttribute_4()
		throws Exception {
		Node xmlElement = new IIOMetadataNode();
		String attributeName = "";
		String[] otherwise = new String[] {};

		String[] result = Xml.arrayAttribute(xmlElement, attributeName, otherwise);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the String attribute(Node,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testAttribute_1()
		throws Exception {
		Node xmlElement = new IIOMetadataNode();
		String attributeName = "";

		String result = Xml.attribute(xmlElement, attributeName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.util.Xml.attribute(Xml.java:87)
		assertNotNull(result);
	}

	/**
	 * Run the String attribute(Node,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testAttribute_2()
		throws Exception {
		Node xmlElement = new IIOMetadataNode();
		String attributeName = "";

		String result = Xml.attribute(xmlElement, attributeName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.util.Xml.attribute(Xml.java:87)
		assertNotNull(result);
	}

	/**
	 * Run the String attribute(Node,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testAttribute_3()
		throws Exception {
		Node xmlElement = new IIOMetadataNode();
		String attributeName = "";
		String otherwise = "";

		String result = Xml.attribute(xmlElement, attributeName, otherwise);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String attribute(Node,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testAttribute_4()
		throws Exception {
		Node xmlElement = new IIOMetadataNode();
		String attributeName = "";
		String otherwise = "";

		String result = Xml.attribute(xmlElement, attributeName, otherwise);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the boolean booleanAttribute(Node,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testBooleanAttribute_1()
		throws Exception {
		Node xmlElement = new IIOMetadataNode();
		String attributeName = "";

		boolean result = Xml.booleanAttribute(xmlElement, attributeName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.util.Xml.attribute(Xml.java:87)
		//       at net.sf.freecol.common.util.Xml.booleanAttribute(Xml.java:213)
		assertTrue(result);
	}

	/**
	 * Run the boolean booleanAttribute(Node,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testBooleanAttribute_2()
		throws Exception {
		Node xmlElement = new IIOMetadataNode();
		String attributeName = "";

		boolean result = Xml.booleanAttribute(xmlElement, attributeName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.util.Xml.attribute(Xml.java:87)
		//       at net.sf.freecol.common.util.Xml.booleanAttribute(Xml.java:213)
		assertTrue(result);
	}

	/**
	 * Run the boolean booleanAttribute(Node,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testBooleanAttribute_3()
		throws Exception {
		Node xmlElement = new IIOMetadataNode();
		String attributeName = "";
		boolean otherwise = true;

		boolean result = Xml.booleanAttribute(xmlElement, attributeName, otherwise);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean booleanAttribute(Node,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testBooleanAttribute_4()
		throws Exception {
		Node xmlElement = new IIOMetadataNode();
		String attributeName = "";
		boolean otherwise = true;

		boolean result = Xml.booleanAttribute(xmlElement, attributeName, otherwise);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean booleanAttribute(Node,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testBooleanAttribute_5()
		throws Exception {
		Node xmlElement = new IIOMetadataNode();
		String attributeName = "";
		boolean otherwise = true;

		boolean result = Xml.booleanAttribute(xmlElement, attributeName, otherwise);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean booleanAttribute(Node,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testBooleanAttribute_6()
		throws Exception {
		Node xmlElement = new IIOMetadataNode();
		String attributeName = "";
		boolean otherwise = false;

		boolean result = Xml.booleanAttribute(xmlElement, attributeName, otherwise);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the char charAttribute(Node,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testCharAttribute_1()
		throws Exception {
		Node xmlElement = new IIOMetadataNode();
		String attributeName = "";

		char result = Xml.charAttribute(xmlElement, attributeName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.util.Xml.attribute(Xml.java:87)
		//       at net.sf.freecol.common.util.Xml.charAttribute(Xml.java:118)
		assertEquals(' ', result);
	}

	/**
	 * Run the char charAttribute(Node,String,char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testCharAttribute_2()
		throws Exception {
		Node xmlElement = new IIOMetadataNode();
		String attributeName = "";
		char otherwise = '';

		char result = Xml.charAttribute(xmlElement, attributeName, otherwise);

		// add additional test code here
		assertEquals('', result);
	}

	/**
	 * Run the char charAttribute(Node,String,char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testCharAttribute_3()
		throws Exception {
		Node xmlElement = new IIOMetadataNode();
		String attributeName = "";
		char otherwise = '';

		char result = Xml.charAttribute(xmlElement, attributeName, otherwise);

		// add additional test code here
		assertEquals('', result);
	}

	/**
	 * Run the Document documentFrom(InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testDocumentFrom_1()
		throws Exception {
		InputStream stream = new ByteArrayInputStream("".getBytes());

		Document result = Xml.documentFrom(stream);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sf.freecol.common.util.Xml$Exception: org.xml.sax.SAXParseException; lineNumber: 1; columnNumber: 1; Premature end of file.
		//       at net.sf.freecol.common.util.Xml.documentFrom(Xml.java:249)
		//       at net.sf.freecol.common.util.Xml.documentFrom(Xml.java:69)
		assertNotNull(result);
	}

	/**
	 * Run the Document documentFrom(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testDocumentFrom_2()
		throws Exception {
		String string = "";

		Document result = Xml.documentFrom(string);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sf.freecol.common.util.Xml$Exception: org.xml.sax.SAXParseException; lineNumber: 1; columnNumber: 1; Premature end of file.
		//       at net.sf.freecol.common.util.Xml.documentFrom(Xml.java:249)
		//       at net.sf.freecol.common.util.Xml.documentFrom(Xml.java:63)
		assertNotNull(result);
	}

	/**
	 * Run the float[] floatArrayAttribute(Node,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testFloatArrayAttribute_1()
		throws Exception {
		Node xmlElement = new IIOMetadataNode();
		String attributeName = "";

		float[] result = Xml.floatArrayAttribute(xmlElement, attributeName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.util.Xml.attribute(Xml.java:87)
		//       at net.sf.freecol.common.util.Xml.arrayAttribute(Xml.java:100)
		//       at net.sf.freecol.common.util.Xml.floatArrayAttribute(Xml.java:150)
		//       at net.sf.freecol.common.util.Xml.floatArrayAttribute(Xml.java:160)
		assertNotNull(result);
	}

	/**
	 * Run the float[] floatArrayAttribute(Node,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testFloatArrayAttribute_2()
		throws Exception {
		Node xmlElement = new IIOMetadataNode();
		String attributeName = "";
		String separator = "";

		float[] result = Xml.floatArrayAttribute(xmlElement, attributeName, separator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.util.Xml.attribute(Xml.java:87)
		//       at net.sf.freecol.common.util.Xml.arrayAttribute(Xml.java:100)
		//       at net.sf.freecol.common.util.Xml.floatArrayAttribute(Xml.java:150)
		assertNotNull(result);
	}

	/**
	 * Run the float[] floatArrayAttribute(Node,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testFloatArrayAttribute_3()
		throws Exception {
		Node xmlElement = new IIOMetadataNode();
		String attributeName = "a";
		String separator = "a";

		float[] result = Xml.floatArrayAttribute(xmlElement, attributeName, separator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.util.Xml.attribute(Xml.java:87)
		//       at net.sf.freecol.common.util.Xml.arrayAttribute(Xml.java:100)
		//       at net.sf.freecol.common.util.Xml.floatArrayAttribute(Xml.java:150)
		assertNotNull(result);
	}

	/**
	 * Run the float[] floatArrayAttribute(Node,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testFloatArrayAttribute_4()
		throws Exception {
		Node xmlElement = new IIOMetadataNode();
		String attributeName = "";
		String separator = "";

		float[] result = Xml.floatArrayAttribute(xmlElement, attributeName, separator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.util.Xml.attribute(Xml.java:87)
		//       at net.sf.freecol.common.util.Xml.arrayAttribute(Xml.java:100)
		//       at net.sf.freecol.common.util.Xml.floatArrayAttribute(Xml.java:150)
		assertNotNull(result);
	}

	/**
	 * Run the float[] floatArrayAttribute(Node,String,float[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testFloatArrayAttribute_5()
		throws Exception {
		Node xmlElement = new IIOMetadataNode();
		String attributeName = "";
		float[] otherwise = new float[] {};

		float[] result = Xml.floatArrayAttribute(xmlElement, attributeName, otherwise);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the float[] floatArrayAttribute(Node,String,float[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testFloatArrayAttribute_6()
		throws Exception {
		Node xmlElement = new IIOMetadataNode();
		String attributeName = "";
		float[] otherwise = new float[] {};

		float[] result = Xml.floatArrayAttribute(xmlElement, attributeName, otherwise);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the float floatAttribute(Node,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testFloatAttribute_1()
		throws Exception {
		Node xmlElement = new IIOMetadataNode();
		String attributeName = "";

		float result = Xml.floatAttribute(xmlElement, attributeName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.util.Xml.attribute(Xml.java:87)
		//       at net.sf.freecol.common.util.Xml.floatAttribute(Xml.java:138)
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float floatAttribute(Node,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testFloatAttribute_2()
		throws Exception {
		Node xmlElement = new IIOMetadataNode();
		String attributeName = "";

		float result = Xml.floatAttribute(xmlElement, attributeName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.util.Xml.attribute(Xml.java:87)
		//       at net.sf.freecol.common.util.Xml.floatAttribute(Xml.java:138)
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float floatAttribute(Node,String,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testFloatAttribute_3()
		throws Exception {
		Node xmlElement = new IIOMetadataNode();
		String attributeName = "";
		float otherwise = 1.0f;

		float result = Xml.floatAttribute(xmlElement, attributeName, otherwise);

		// add additional test code here
		assertEquals(1.0f, result, 0.1f);
	}

	/**
	 * Run the float floatAttribute(Node,String,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testFloatAttribute_4()
		throws Exception {
		Node xmlElement = new IIOMetadataNode();
		String attributeName = "";
		float otherwise = 1.0f;

		float result = Xml.floatAttribute(xmlElement, attributeName, otherwise);

		// add additional test code here
		assertEquals(1.0f, result, 0.1f);
	}

	/**
	 * Run the void forEachChild(Node,Method) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testForEachChild_1()
		throws Exception {
		Node xml = new IIOMetadataNode();
		Xml.Method method = null;

		Xml.forEachChild(xml, method);

		// add additional test code here
	}

	/**
	 * Run the void forEachChild(Node,Method) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testForEachChild_2()
		throws Exception {
		Node xml = new IIOMetadataNode();
		Xml.Method method = null;

		Xml.forEachChild(xml, method);

		// add additional test code here
	}

	/**
	 * Run the void forEachChild(Node,Method) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testForEachChild_3()
		throws Exception {
		Node xml = new IIOMetadataNode();
		Xml.Method method = null;

		Xml.forEachChild(xml, method);

		// add additional test code here
	}

	/**
	 * Run the boolean hasAttribute(Node,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testHasAttribute_1()
		throws Exception {
		Node xmlElement = new IIOMetadataNode();
		String attributeName = "";

		boolean result = Xml.hasAttribute(xmlElement, attributeName);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasAttribute(Node,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testHasAttribute_2()
		throws Exception {
		Node xmlElement = new IIOMetadataNode();
		String attributeName = "";

		boolean result = Xml.hasAttribute(xmlElement, attributeName);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the int[] intArrayAttribute(Node,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testIntArrayAttribute_1()
		throws Exception {
		Node xmlElement = new IIOMetadataNode();
		String attributeName = "";

		int[] result = Xml.intArrayAttribute(xmlElement, attributeName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.util.Xml.attribute(Xml.java:87)
		//       at net.sf.freecol.common.util.Xml.arrayAttribute(Xml.java:100)
		//       at net.sf.freecol.common.util.Xml.intArrayAttribute(Xml.java:186)
		//       at net.sf.freecol.common.util.Xml.intArrayAttribute(Xml.java:200)
		assertNotNull(result);
	}

	/**
	 * Run the int[] intArrayAttribute(Node,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testIntArrayAttribute_2()
		throws Exception {
		Node xmlElement = new IIOMetadataNode();
		String attributeName = "";
		String separator = "";

		int[] result = Xml.intArrayAttribute(xmlElement, attributeName, separator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.util.Xml.attribute(Xml.java:87)
		//       at net.sf.freecol.common.util.Xml.arrayAttribute(Xml.java:100)
		//       at net.sf.freecol.common.util.Xml.intArrayAttribute(Xml.java:186)
		assertNotNull(result);
	}

	/**
	 * Run the int[] intArrayAttribute(Node,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testIntArrayAttribute_3()
		throws Exception {
		Node xmlElement = new IIOMetadataNode();
		String attributeName = "a";
		String separator = "a";

		int[] result = Xml.intArrayAttribute(xmlElement, attributeName, separator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.util.Xml.attribute(Xml.java:87)
		//       at net.sf.freecol.common.util.Xml.arrayAttribute(Xml.java:100)
		//       at net.sf.freecol.common.util.Xml.intArrayAttribute(Xml.java:186)
		assertNotNull(result);
	}

	/**
	 * Run the int[] intArrayAttribute(Node,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testIntArrayAttribute_4()
		throws Exception {
		Node xmlElement = new IIOMetadataNode();
		String attributeName = "";
		String separator = "";

		int[] result = Xml.intArrayAttribute(xmlElement, attributeName, separator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.util.Xml.attribute(Xml.java:87)
		//       at net.sf.freecol.common.util.Xml.arrayAttribute(Xml.java:100)
		//       at net.sf.freecol.common.util.Xml.intArrayAttribute(Xml.java:186)
		assertNotNull(result);
	}

	/**
	 * Run the int[] intArrayAttribute(Node,String,int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testIntArrayAttribute_5()
		throws Exception {
		Node xmlElement = new IIOMetadataNode();
		String attributeName = "";
		int[] otherwise = new int[] {};

		int[] result = Xml.intArrayAttribute(xmlElement, attributeName, otherwise);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the int[] intArrayAttribute(Node,String,int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testIntArrayAttribute_6()
		throws Exception {
		Node xmlElement = new IIOMetadataNode();
		String attributeName = "";
		int[] otherwise = new int[] {};

		int[] result = Xml.intArrayAttribute(xmlElement, attributeName, otherwise);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the int intAttribute(Node,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testIntAttribute_1()
		throws Exception {
		Node xmlElement = new IIOMetadataNode();
		String attributeName = "";

		int result = Xml.intAttribute(xmlElement, attributeName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.util.Xml.attribute(Xml.java:87)
		//       at net.sf.freecol.common.util.Xml.intAttribute(Xml.java:174)
		assertEquals(0, result);
	}

	/**
	 * Run the int intAttribute(Node,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testIntAttribute_2()
		throws Exception {
		Node xmlElement = new IIOMetadataNode();
		String attributeName = "";

		int result = Xml.intAttribute(xmlElement, attributeName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.util.Xml.attribute(Xml.java:87)
		//       at net.sf.freecol.common.util.Xml.intAttribute(Xml.java:174)
		assertEquals(0, result);
	}

	/**
	 * Run the int intAttribute(Node,String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testIntAttribute_3()
		throws Exception {
		Node xmlElement = new IIOMetadataNode();
		String attributeName = "";
		int otherwise = 1;

		int result = Xml.intAttribute(xmlElement, attributeName, otherwise);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int intAttribute(Node,String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testIntAttribute_4()
		throws Exception {
		Node xmlElement = new IIOMetadataNode();
		String attributeName = "";
		int otherwise = 1;

		int result = Xml.intAttribute(xmlElement, attributeName, otherwise);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the Document newDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testNewDocument_1()
		throws Exception {

		Document result = Xml.newDocument();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getInputEncoding());
		assertEquals(null, result.getDocumentURI());
		assertEquals(true, result.getStrictErrorChecking());
		assertEquals(null, result.getXmlEncoding());
		assertEquals(false, result.getXmlStandalone());
		assertEquals("1.0", result.getXmlVersion());
		assertEquals(null, result.getDoctype());
		assertEquals(null, result.getDocumentElement());
		assertEquals(null, result.getAttributes());
		assertEquals(null, result.getPrefix());
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getFirstChild());
		assertEquals(null, result.getLastChild());
		assertEquals(null, result.getLocalName());
		assertEquals(null, result.getNamespaceURI());
		assertEquals(null, result.getNextSibling());
		assertEquals("#document", result.getNodeName());
		assertEquals((short) 9, result.getNodeType());
		assertEquals(null, result.getNodeValue());
		assertEquals(null, result.getOwnerDocument());
		assertEquals(null, result.getParentNode());
		assertEquals(null, result.getPreviousSibling());
		assertEquals(null, result.getTextContent());
		assertEquals(false, result.hasAttributes());
		assertEquals(false, result.hasChildNodes());
	}

	/**
	 * Run the Document newDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testNewDocument_2()
		throws Exception {

		Document result = Xml.newDocument();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getInputEncoding());
		assertEquals(null, result.getDocumentURI());
		assertEquals(true, result.getStrictErrorChecking());
		assertEquals(null, result.getXmlEncoding());
		assertEquals(false, result.getXmlStandalone());
		assertEquals("1.0", result.getXmlVersion());
		assertEquals(null, result.getDoctype());
		assertEquals(null, result.getDocumentElement());
		assertEquals(null, result.getAttributes());
		assertEquals(null, result.getPrefix());
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getFirstChild());
		assertEquals(null, result.getLastChild());
		assertEquals(null, result.getLocalName());
		assertEquals(null, result.getNamespaceURI());
		assertEquals(null, result.getNextSibling());
		assertEquals("#document", result.getNodeName());
		assertEquals((short) 9, result.getNodeType());
		assertEquals(null, result.getNodeValue());
		assertEquals(null, result.getOwnerDocument());
		assertEquals(null, result.getParentNode());
		assertEquals(null, result.getPreviousSibling());
		assertEquals(null, result.getTextContent());
		assertEquals(false, result.hasAttributes());
		assertEquals(false, result.hasChildNodes());
	}

	/**
	 * Run the String toString(Document) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Document document = null;

		String result = Xml.toString(document);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.util.Xml.toString(Xml.java:75)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/18 4:41 PM
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
	 * @generatedBy CodePro at 5/14/18 4:41 PM
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
	 * @generatedBy CodePro at 5/14/18 4:41 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(XmlTest.class);
	}
}