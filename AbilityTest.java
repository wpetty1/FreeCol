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
 * The class <code>AbilityTest</code> contains tests for the class <code>{@link Ability}</code>.
 *
 * @generatedBy CodePro at 5/14/18 1:59 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class AbilityTest {
	/**
	 * Run the Ability(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 1:59 PM
	 */
	@Test
	public void testAbility_1()
		throws Exception {
		String id = "";

		Ability result = new Ability(id);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[  = true ]", result.toString());
		assertEquals(true, result.getValue());
		assertEquals("ability", result.getXMLTagName());
		assertEquals(null, result.getSource());
		assertEquals(false, result.isTemporary());
		assertEquals(0, result.getDuration());
		assertEquals(null, result.getFirstTurn());
		assertEquals(false, result.hasScope());
		assertEquals(true, result.isIndependent());
		assertEquals(".name", result.getNameKey());
		assertEquals(null, result.getLastTurn());
		assertEquals(false, result.hasTimeLimit());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(null, result.getSpecification());
		assertEquals("<ability id=\"\" value=\"true\"></ability>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
	}

	/**
	 * Run the Ability(Ability) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 1:59 PM
	 */
	@Test
	public void testAbility_2()
		throws Exception {
		Ability template = new Ability("", new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification()), true);

		Ability result = new Ability(template);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the Ability(String,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 1:59 PM
	 */
	@Test
	public void testAbility_3()
		throws Exception {
		String id = "";
		boolean value = true;

		Ability result = new Ability(id, value);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[  = true ]", result.toString());
		assertEquals(true, result.getValue());
		assertEquals("ability", result.getXMLTagName());
		assertEquals(null, result.getSource());
		assertEquals(false, result.isTemporary());
		assertEquals(0, result.getDuration());
		assertEquals(null, result.getFirstTurn());
		assertEquals(false, result.hasScope());
		assertEquals(true, result.isIndependent());
		assertEquals(".name", result.getNameKey());
		assertEquals(null, result.getLastTurn());
		assertEquals(false, result.hasTimeLimit());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(null, result.getSpecification());
		assertEquals("<ability id=\"\" value=\"true\"></ability>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
	}

	/**
	 * Run the Ability(FreeColXMLReader,Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 1:59 PM
	 */
	@Test
	public void testAbility_4()
		throws Exception {
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		Specification specification = new Specification();

		Ability result = new Ability(xr, specification);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Ability.<init>(Ability.java:464)
		assertNotNull(result);
	}

	/**
	 * Run the Ability(FreeColXMLReader,Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 1:59 PM
	 */
	@Test
	public void testAbility_5()
		throws Exception {
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		Specification specification = new Specification();

		Ability result = new Ability(xr, specification);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Ability.<init>(Ability.java:464)
		assertNotNull(result);
	}

	/**
	 * Run the Ability(Element,Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 1:59 PM
	 */
	@Test
	public void testAbility_6()
		throws Exception {
		Element e = new IIOMetadataNode();
		Specification specification = new Specification();

		Ability result = new Ability(e, specification);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Ability.<init>(Ability.java:475)
		assertNotNull(result);
	}

	/**
	 * Run the Ability(String,FreeColGameObjectType,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 1:59 PM
	 */
	@Test
	public void testAbility_7()
		throws Exception {
		String id = "";
		FreeColGameObjectType source = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());
		boolean value = true;

		Ability result = new Ability(id, source, value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 1:59 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		Ability fixture = new Ability("", new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification()), true);
		Object o = new Ability("", new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification()), true);

		boolean result = fixture.equals(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 1:59 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		Ability fixture = new Ability("", new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification()), true);
		Object o = new Ability("", new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification()), true);

		boolean result = fixture.equals(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 1:59 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		Ability fixture = new Ability("", new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification()), true);
		Object o = new Ability("", new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification()), true);

		boolean result = fixture.equals(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 1:59 PM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		Ability fixture = new Ability("", new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification()), true);
		Object o = new Ability("", new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification()), true);

		boolean result = fixture.equals(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 1:59 PM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		Ability fixture = new Ability("", new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification()), true);
		Object o = new Object();

		boolean result = fixture.equals(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
		assertTrue(result);
	}

	/**
	 * Run the boolean getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 1:59 PM
	 */
	@Test
	public void testGetValue_1()
		throws Exception {
		Ability fixture = new Ability("", new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification()), true);

		boolean result = fixture.getValue();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
		assertTrue(result);
	}

	/**
	 * Run the boolean getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 1:59 PM
	 */
	@Test
	public void testGetValue_2()
		throws Exception {
		Ability fixture = new Ability("", new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification()), false);

		boolean result = fixture.getValue();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
		assertTrue(result);
	}

	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 1:59 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = Ability.getXMLElementTagName();

		// add additional test code here
		assertEquals("ability", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 1:59 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		Ability fixture = new Ability("", new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification()), true);

		String result = fixture.getXMLTagName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 1:59 PM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		Ability fixture = new Ability("", new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification()), false);

		int result = fixture.hashCode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 1:59 PM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		Ability fixture = new Ability("", new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification()), true);

		int result = fixture.hashCode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
		assertEquals(0, result);
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 1:59 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		Ability fixture = new Ability("", new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification()), true);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 1:59 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		Ability fixture = new Ability("", new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification()), true);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
	}

	/**
	 * Run the void setValue(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 1:59 PM
	 */
	@Test
	public void testSetValue_1()
		throws Exception {
		Ability fixture = new Ability("", new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification()), true);
		boolean newValue = true;

		fixture.setValue(newValue);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 1:59 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Ability fixture = new Ability("", new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification()), true);

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 1:59 PM
	 */
	@Test
	public void testToString_2()
		throws Exception {
		Ability fixture = new Ability("", new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification()), true);

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 1:59 PM
	 */
	@Test
	public void testWriteAttributes_1()
		throws Exception {
		Ability fixture = new Ability("", new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification()), true);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 1:59 PM
	 */
	@Test
	public void testWriteAttributes_2()
		throws Exception {
		Ability fixture = new Ability("", new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification()), true);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 1:59 PM
	 */
	@Test
	public void testWriteAttributes_3()
		throws Exception {
		Ability fixture = new Ability("", new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification()), true);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Effect.<init>(Effect.java:82)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/18 1:59 PM
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
	 * @generatedBy CodePro at 5/14/18 1:59 PM
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
	 * @generatedBy CodePro at 5/14/18 1:59 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AbilityTest.class);
	}
}