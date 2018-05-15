package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import java.util.List;
import javax.xml.stream.XMLStreamException;
import net.sf.freecol.common.io.FreeColXMLReader;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>StringTemplateTest</code> contains tests for the class <code>{@link StringTemplate}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:25 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class StringTemplateTest {
	/**
	 * Run the StringTemplate() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testStringTemplate_1()
		throws Exception {

		StringTemplate result = new StringTemplate();

		// add additional test code here
		assertNotNull(result);
		assertEquals("KEY: null", result.toString());
		assertEquals(null, result.getDefaultId());
		assertEquals("stringTemplate", result.getXMLTagName());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("<stringTemplate templateType=\"key\"></stringTemplate>", result.serialize());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getIdType());
	}

	/**
	 * Run the StringTemplate(FreeColXMLReader) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testStringTemplate_2()
		throws Exception {
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		StringTemplate result = new StringTemplate(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.StringTemplate.<init>(StringTemplate.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate(FreeColXMLReader) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testStringTemplate_3()
		throws Exception {
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		StringTemplate result = new StringTemplate(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.StringTemplate.<init>(StringTemplate.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate(String,StringTemplate) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testStringTemplate_4()
		throws Exception {
		String id = "";
		StringTemplate template = new StringTemplate("", "", StringTemplate.TemplateType.KEY);

		StringTemplate result = new StringTemplate(id, template);

		// add additional test code here
		assertNotNull(result);
		assertEquals("KEY:  ()", result.toString());
		assertEquals("", result.getDefaultId());
		assertEquals("stringTemplate", result.getXMLTagName());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("<stringTemplate id=\"\" templateType=\"key\" defaultId=\"\"></stringTemplate>", result.serialize());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
	}

	/**
	 * Run the StringTemplate(String,String,TemplateType) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testStringTemplate_5()
		throws Exception {
		String id = "";
		String defaultId = "";
		StringTemplate.TemplateType templateType = StringTemplate.TemplateType.KEY;

		StringTemplate result = new StringTemplate(id, defaultId, templateType);

		// add additional test code here
		assertNotNull(result);
		assertEquals("KEY:  ()", result.toString());
		assertEquals("", result.getDefaultId());
		assertEquals("stringTemplate", result.getXMLTagName());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("<stringTemplate id=\"\" templateType=\"key\" defaultId=\"\"></stringTemplate>", result.serialize());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
	}

	/**
	 * Run the StringTemplate add(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testAdd_1()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		String value = "";

		StringTemplate result = fixture.add(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Cannot add a single string to StringTemplate.KEY
		//       at net.sf.freecol.common.model.StringTemplate.add(StringTemplate.java:270)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate add(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testAdd_2()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		String value = "";

		StringTemplate result = fixture.add(value);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate add(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testAdd_3()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		String key = "";
		String value = "";

		StringTemplate result = fixture.add(key, value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Cannot add key-value pair to StringTemplate.KEY
		//       at net.sf.freecol.common.model.StringTemplate.add(StringTemplate.java:252)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate add(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testAdd_4()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		String key = "";
		String value = "";

		StringTemplate result = fixture.add(key, value);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate addAmount(String,Number) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testAddAmount_1()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		String key = "";
		Number amount = new Byte((byte) 32);

		StringTemplate result = fixture.addAmount(key, amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Cannot add key-name pair to StringTemplate.KEY
		//       at net.sf.freecol.common.model.StringTemplate.addName(StringTemplate.java:288)
		//       at net.sf.freecol.common.model.StringTemplate.addAmount(StringTemplate.java:361)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate addName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testAddName_1()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		String value = "";

		StringTemplate result = fixture.addName(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Cannot add a single string to StringTemplate.KEY
		//       at net.sf.freecol.common.model.StringTemplate.addName(StringTemplate.java:325)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate addName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testAddName_2()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		String value = "";

		StringTemplate result = fixture.addName(value);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate addName(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testAddName_3()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		String key = "";
		String value = "";

		StringTemplate result = fixture.addName(key, value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Cannot add key-name pair to StringTemplate.KEY
		//       at net.sf.freecol.common.model.StringTemplate.addName(StringTemplate.java:288)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate addName(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testAddName_4()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		String key = "";
		String value = "";

		StringTemplate result = fixture.addName(key, value);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate addName(String,FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testAddName_5()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		String key = "";
		FreeColObject object = new AbstractGoods();

		StringTemplate result = fixture.addName(key, object);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Cannot add key-object pair to StringTemplate.KEY
		//       at net.sf.freecol.common.model.StringTemplate.addName(StringTemplate.java:307)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate addName(String,FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testAddName_6()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		String key = "";
		FreeColObject object = new AbstractGoods();

		StringTemplate result = fixture.addName(key, object);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate addNamed(Named) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testAddNamed_1()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		Named named = new AbstractGoods();

		StringTemplate result = fixture.addNamed(named);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.model.AbstractGoods.getNameKey(AbstractGoods.java:237)
		//       at net.sf.freecol.common.model.StringTemplate.addNamed(StringTemplate.java:350)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate addNamed(String,Named) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testAddNamed_2()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		String key = "";
		Named named = new AbstractGoods();

		StringTemplate result = fixture.addNamed(key, named);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.model.AbstractGoods.getNameKey(AbstractGoods.java:237)
		//       at net.sf.freecol.common.model.StringTemplate.addNamed(StringTemplate.java:340)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate addStringTemplate(StringTemplate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testAddStringTemplate_1()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		StringTemplate template = new StringTemplate(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		StringTemplate result = fixture.addStringTemplate(template);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.StringTemplate.<init>(StringTemplate.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate addStringTemplate(StringTemplate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testAddStringTemplate_2()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		StringTemplate template = new StringTemplate(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		StringTemplate result = fixture.addStringTemplate(template);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.StringTemplate.<init>(StringTemplate.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate addStringTemplate(String,StringTemplate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testAddStringTemplate_3()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		String key = "";
		StringTemplate template = new StringTemplate(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		StringTemplate result = fixture.addStringTemplate(key, template);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.StringTemplate.<init>(StringTemplate.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate addStringTemplate(String,StringTemplate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testAddStringTemplate_4()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		String key = "";
		StringTemplate template = new StringTemplate(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		StringTemplate result = fixture.addStringTemplate(key, template);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.StringTemplate.<init>(StringTemplate.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate copy(String,StringTemplate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testCopy_1()
		throws Exception {
		String id = "";
		StringTemplate template = new StringTemplate(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		StringTemplate result = StringTemplate.copy(id, template);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.StringTemplate.<init>(StringTemplate.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		Object o = new StringTemplate("", "", StringTemplate.TemplateType.KEY);

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		Object o = new StringTemplate(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		boolean result = fixture.equals(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.StringTemplate.<init>(StringTemplate.java:117)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		Object o = new StringTemplate("", "", StringTemplate.TemplateType.KEY);

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		Object o = new StringTemplate("", "", StringTemplate.TemplateType.KEY);

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		Object o = new StringTemplate("", "", StringTemplate.TemplateType.KEY);

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testEquals_6()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		Object o = new StringTemplate("", "", StringTemplate.TemplateType.KEY);

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testEquals_7()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		Object o = new StringTemplate("", "", StringTemplate.TemplateType.KEY);

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testEquals_8()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		Object o = new StringTemplate("", "", StringTemplate.TemplateType.KEY);

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testEquals_9()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		Object o = new StringTemplate("", "", StringTemplate.TemplateType.KEY);

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testEquals_10()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		Object o = new StringTemplate("", "", StringTemplate.TemplateType.KEY);

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testEquals_11()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		Object o = new StringTemplate("", "", StringTemplate.TemplateType.KEY);

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testEquals_12()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		Object o = new StringTemplate("", "", StringTemplate.TemplateType.KEY);

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testEquals_13()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		Object o = new StringTemplate("", "", StringTemplate.TemplateType.KEY);

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testEquals_14()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		Object o = new StringTemplate("", "", StringTemplate.TemplateType.KEY);

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testEquals_15()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		Object o = new Object();

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the String getDefaultId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetDefaultId_1()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);

		String result = fixture.getDefaultId();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the List<String> getKeys() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetKeys_1()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);

		List<String> result = fixture.getKeys();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<String> getKeys() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetKeys_2()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);

		List<String> result = fixture.getKeys();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the StringTemplate getReplacement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetReplacement_1()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		String key = "";

		StringTemplate result = fixture.getReplacement(key);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the StringTemplate getReplacement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetReplacement_2()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		String key = "";

		StringTemplate result = fixture.getReplacement(key);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the StringTemplate getReplacement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetReplacement_3()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		String key = "";

		StringTemplate result = fixture.getReplacement(key);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the StringTemplate getReplacement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetReplacement_4()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		String key = "";

		StringTemplate result = fixture.getReplacement(key);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the StringTemplate getReplacement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetReplacement_5()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		String key = "";

		StringTemplate result = fixture.getReplacement(key);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the StringTemplate getReplacement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetReplacement_6()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		String key = "";

		StringTemplate result = fixture.getReplacement(key);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<StringTemplate> getReplacements() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetReplacements_1()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);

		List<StringTemplate> result = fixture.getReplacements();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<StringTemplate> getReplacements() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetReplacements_2()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);

		List<StringTemplate> result = fixture.getReplacements();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the StringTemplate.TemplateType getTemplateType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetTemplateType_1()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);

		StringTemplate.TemplateType result = fixture.getTemplateType();

		// add additional test code here
		assertNotNull(result);
		assertEquals("KEY", result.name());
		assertEquals("KEY", result.toString());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = StringTemplate.getXMLElementTagName();

		// add additional test code here
		assertEquals("stringTemplate", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("stringTemplate", result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(31, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(31, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testHashCode_3()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(31, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testHashCode_4()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(31, result);
	}

	/**
	 * Run the StringTemplate key(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testKey_1()
		throws Exception {
		String value = "";

		StringTemplate result = StringTemplate.key(value);

		// add additional test code here
		assertNotNull(result);
		assertEquals("KEY: ", result.toString());
		assertEquals(null, result.getDefaultId());
		assertEquals("stringTemplate", result.getXMLTagName());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("<stringTemplate id=\"\" templateType=\"key\"></stringTemplate>", result.serialize());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
	}

	/**
	 * Run the StringTemplate key(Named) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testKey_2()
		throws Exception {
		Named named = new AbstractGoods();

		StringTemplate result = StringTemplate.key(named);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.model.AbstractGoods.getNameKey(AbstractGoods.java:237)
		//       at net.sf.freecol.common.model.StringTemplate.key(StringTemplate.java:135)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate label(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testLabel_1()
		throws Exception {
		String value = "";

		StringTemplate result = StringTemplate.label(value);

		// add additional test code here
		assertNotNull(result);
		assertEquals("LABEL: ", result.toString());
		assertEquals(null, result.getDefaultId());
		assertEquals("stringTemplate", result.getXMLTagName());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("<stringTemplate id=\"\" templateType=\"label\"></stringTemplate>", result.serialize());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
	}

	/**
	 * Run the StringTemplate name(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testName_1()
		throws Exception {
		String value = null;

		StringTemplate result = StringTemplate.name(value);

		// add additional test code here
		assertNotNull(result);
		assertEquals("NAME: null", result.toString());
		assertEquals(null, result.getDefaultId());
		assertEquals("stringTemplate", result.getXMLTagName());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("<stringTemplate templateType=\"name\"></stringTemplate>", result.serialize());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getIdType());
	}

	/**
	 * Run the StringTemplate name(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testName_2()
		throws Exception {
		String value = "";

		StringTemplate result = StringTemplate.name(value);

		// add additional test code here
		assertNotNull(result);
		assertEquals("NAME: ", result.toString());
		assertEquals(null, result.getDefaultId());
		assertEquals("stringTemplate", result.getXMLTagName());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("<stringTemplate id=\"\" templateType=\"name\"></stringTemplate>", result.serialize());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.FreeColObject.readAttributes(FreeColObject.java:1257)
		//       at net.sf.freecol.common.model.StringTemplate.readAttributes(StringTemplate.java:525)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.FreeColObject.readAttributes(FreeColObject.java:1257)
		//       at net.sf.freecol.common.model.StringTemplate.readAttributes(StringTemplate.java:525)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testReadChild_1()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.StringTemplate.readChild(StringTemplate.java:550)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testReadChild_2()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.StringTemplate.readChild(StringTemplate.java:550)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testReadChild_3()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.StringTemplate.readChild(StringTemplate.java:550)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testReadChild_4()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.StringTemplate.readChild(StringTemplate.java:550)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testReadChild_5()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.StringTemplate.readChild(StringTemplate.java:550)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testReadChild_6()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.StringTemplate.readChild(StringTemplate.java:550)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testReadChildren_1()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.readChildren(FreeColObject.java:1274)
		//       at net.sf.freecol.common.model.StringTemplate.readChildren(StringTemplate.java:542)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testReadChildren_2()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.readChildren(FreeColObject.java:1274)
		//       at net.sf.freecol.common.model.StringTemplate.readChildren(StringTemplate.java:542)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testReadChildren_3()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.readChildren(FreeColObject.java:1274)
		//       at net.sf.freecol.common.model.StringTemplate.readChildren(StringTemplate.java:542)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testReadChildren_4()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.readChildren(FreeColObject.java:1274)
		//       at net.sf.freecol.common.model.StringTemplate.readChildren(StringTemplate.java:542)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testReadChildren_5()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.readChildren(FreeColObject.java:1274)
		//       at net.sf.freecol.common.model.StringTemplate.readChildren(StringTemplate.java:542)
	}

	/**
	 * Run the void setDefaultId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testSetDefaultId_1()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		String newDefaultId = "";

		fixture.setDefaultId(newDefaultId);

		// add additional test code here
	}

	/**
	 * Run the StringTemplate template(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testTemplate_1()
		throws Exception {
		String value = "";

		StringTemplate result = StringTemplate.template(value);

		// add additional test code here
		assertNotNull(result);
		assertEquals("TEMPLATE:  []", result.toString());
		assertEquals(null, result.getDefaultId());
		assertEquals("stringTemplate", result.getXMLTagName());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("<stringTemplate id=\"\" templateType=\"template\"></stringTemplate>", result.serialize());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
	}

	/**
	 * Run the StringTemplate template(Named) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testTemplate_2()
		throws Exception {
		Named named = new AbstractGoods();

		StringTemplate result = StringTemplate.template(named);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.model.AbstractGoods.getNameKey(AbstractGoods.java:237)
		//       at net.sf.freecol.common.model.StringTemplate.template(StringTemplate.java:143)
		assertNotNull(result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("KEY:  ()", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testToString_2()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("KEY:  ()", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testToString_3()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("KEY:  ()", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testToString_4()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", (String) null, StringTemplate.TemplateType.KEY);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("KEY: ", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testToString_5()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("KEY:  ()", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testToString_6()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("KEY:  ()", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testToString_7()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("KEY:  ()", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testToString_8()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", (String) null, StringTemplate.TemplateType.KEY);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("KEY: ", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testToString_9()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("KEY:  ()", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testToString_10()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("KEY:  ()", result);
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_1()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_2()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_3()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_4()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_5()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", (String) null, StringTemplate.TemplateType.KEY);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testWriteChildren_1()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testWriteChildren_2()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testWriteChildren_3()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testWriteChildren_4()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testWriteChildren_5()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testWriteChildren_6()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testWriteChildren_7()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testWriteChildren_8()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testWriteChildren_9()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testWriteChildren_10()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testWriteChildren_11()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testWriteChildren_12()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	@Test
	public void testWriteChildren_13()
		throws Exception {
		StringTemplate fixture = new StringTemplate("", "", StringTemplate.TemplateType.KEY);
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
	 * @generatedBy CodePro at 5/14/18 4:25 PM
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
	 * @generatedBy CodePro at 5/14/18 4:25 PM
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
	 * @generatedBy CodePro at 5/14/18 4:25 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(StringTemplateTest.class);
	}
}