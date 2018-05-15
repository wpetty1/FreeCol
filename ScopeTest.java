package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import javax.xml.stream.XMLStreamException;
import org.junit.*;
import net.sf.freecol.common.io.FreeColXMLReader;
import static org.junit.Assert.*;

/**
 * The class <code>ScopeTest</code> contains tests for the class <code>{@link Scope}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:19 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class ScopeTest {
	/**
	 * Run the Scope() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testScope_1()
		throws Exception {

		Scope result = new Scope();

		// add additional test code here
		assertNotNull(result);
		assertEquals("[Scope null matches-null]", result.toString());
		assertEquals(null, result.getKey());
		assertEquals(null, result.getType());
		assertEquals(null, result.getMethodName());
		assertEquals(null, result.getAbilityId());
		assertEquals("scope", result.getXMLTagName());
		assertEquals(false, result.isMatchNegated());
		assertEquals(true, result.isMatchesNull());
		assertEquals(true, result.getAbilityValue());
		assertEquals(null, result.getMethodValue());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("<scope match-negated=\"false\" matches-null=\"true\"></scope>", result.serialize());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the Scope(FreeColXMLReader) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testScope_2()
		throws Exception {
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		Scope result = new Scope(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Scope.<init>(Scope.java:75)
		assertNotNull(result);
	}

	/**
	 * Run the Scope(FreeColXMLReader) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testScope_3()
		throws Exception {
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		Scope result = new Scope(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Scope.<init>(Scope.java:75)
		assertNotNull(result);
	}

	/**
	 * Run the boolean appliesTo(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testAppliesTo_1()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		FreeColObject object = null;

		boolean result = fixture.appliesTo(object);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean appliesTo(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testAppliesTo_2()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(false);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		FreeColObject object = null;

		boolean result = fixture.appliesTo(object);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean appliesTo(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testAppliesTo_3()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		FreeColObject object = new AbstractGoods();

		boolean result = fixture.appliesTo(object);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean appliesTo(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testAppliesTo_4()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(false);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		FreeColObject object = new AbstractGoods();

		boolean result = fixture.appliesTo(object);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean appliesTo(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testAppliesTo_5()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		FreeColObject object = new AbstractGoods();

		boolean result = fixture.appliesTo(object);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean appliesTo(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testAppliesTo_6()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(false);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		FreeColObject object = new AbstractGoods();

		boolean result = fixture.appliesTo(object);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean appliesTo(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testAppliesTo_7()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		FreeColObject object = new AbstractGoods();

		boolean result = fixture.appliesTo(object);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean appliesTo(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testAppliesTo_8()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(false);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		FreeColObject object = new AbstractGoods();

		boolean result = fixture.appliesTo(object);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean appliesTo(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testAppliesTo_9()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType((String) null);
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		FreeColObject object = new AbstractGoods();

		boolean result = fixture.appliesTo(object);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean appliesTo(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testAppliesTo_10()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType((String) null);
		fixture.setMatchNegated(false);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		FreeColObject object = new AbstractGoods();

		boolean result = fixture.appliesTo(object);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean appliesTo(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testAppliesTo_11()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		FreeColObject object = new AbstractGoods();

		boolean result = fixture.appliesTo(object);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean appliesTo(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testAppliesTo_12()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType((String) null);
		fixture.setMatchNegated(false);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		FreeColObject object = new AbstractGoods();

		boolean result = fixture.appliesTo(object);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean appliesTo(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testAppliesTo_13()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType((String) null);
		fixture.setMatchNegated(false);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		FreeColObject object = new AbstractGoods();

		boolean result = fixture.appliesTo(object);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean appliesTo(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testAppliesTo_14()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId((String) null);
		fixture.setMethodName((String) null);
		FreeColObject object = new AbstractGoods();

		boolean result = fixture.appliesTo(object);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		Scope o = new Scope();
		o.setMethodValue("");
		o.setAbilityValue(true);
		o.setType("");
		o.setMatchNegated(true);
		o.setMatchesNull(true);
		o.setAbilityId("");
		o.setMethodName("");

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		Scope o = new Scope();
		o.setMethodValue("");
		o.setAbilityValue(true);
		o.setType("");
		o.setMatchNegated(true);
		o.setMatchesNull(true);
		o.setAbilityId("");
		o.setMethodName("");

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		Scope o = new Scope();
		o.setMethodValue("");
		o.setAbilityValue(true);
		o.setType("");
		o.setMatchNegated(true);
		o.setMatchesNull(true);
		o.setAbilityId("");
		o.setMethodName("");

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		Scope o = new Scope();
		o.setMethodValue("");
		o.setAbilityValue(true);
		o.setType("");
		o.setMatchNegated(true);
		o.setMatchesNull(true);
		o.setAbilityId("");
		o.setMethodName("");

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		Scope o = new Scope();
		o.setMethodValue("");
		o.setAbilityValue(true);
		o.setType("");
		o.setMatchNegated(true);
		o.setMatchesNull(true);
		o.setAbilityId("");
		o.setMethodName("");

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testEquals_6()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId((String) null);
		fixture.setMethodName("");
		Scope o = new Scope();
		o.setMethodValue("");
		o.setAbilityValue(true);
		o.setType("");
		o.setMatchNegated(true);
		o.setMatchesNull(true);
		o.setAbilityId((String) null);
		o.setMethodName("");

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testEquals_7()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		Scope o = new Scope();
		o.setMethodValue("");
		o.setAbilityValue(true);
		o.setType("");
		o.setMatchNegated(true);
		o.setMatchesNull(true);
		o.setAbilityId("");
		o.setMethodName("");

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testEquals_8()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		Scope o = new Scope();
		o.setMethodValue("");
		o.setAbilityValue(true);
		o.setType("");
		o.setMatchNegated(true);
		o.setMatchesNull(true);
		o.setAbilityId("");
		o.setMethodName("");

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testEquals_9()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName((String) null);
		Scope o = new Scope();
		o.setMethodValue("");
		o.setAbilityValue(true);
		o.setType("");
		o.setMatchNegated(true);
		o.setMatchesNull(true);
		o.setAbilityId("");
		o.setMethodName((String) null);

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testEquals_10()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		Scope o = new Scope();
		o.setMethodValue("");
		o.setAbilityValue(true);
		o.setType("");
		o.setMatchNegated(true);
		o.setMatchesNull(true);
		o.setAbilityId("");
		o.setMethodName("");

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testEquals_11()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue((String) null);
		fixture.setAbilityValue(true);
		fixture.setType((String) null);
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId((String) null);
		fixture.setMethodName((String) null);
		Scope o = new Scope();
		o.setMethodValue((String) null);
		o.setAbilityValue(true);
		o.setType((String) null);
		o.setMatchNegated(true);
		o.setMatchesNull(true);
		o.setAbilityId((String) null);
		o.setMethodName((String) null);

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testEquals_12()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		Scope o = new Scope();
		o.setMethodValue("");
		o.setAbilityValue(true);
		o.setType("");
		o.setMatchNegated(true);
		o.setMatchesNull(true);
		o.setAbilityId("");
		o.setMethodName("");

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testEquals_13()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		Scope o = new Scope();
		o.setMethodValue("");
		o.setAbilityValue(true);
		o.setType("");
		o.setMatchNegated(true);
		o.setMatchesNull(true);
		o.setAbilityId("");
		o.setMethodName("");

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testEquals_14()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue((String) null);
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		Scope o = new Scope();
		o.setMethodValue((String) null);
		o.setAbilityValue(true);
		o.setType("");
		o.setMatchNegated(true);
		o.setMatchesNull(true);
		o.setAbilityId("");
		o.setMethodName("");

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testEquals_15()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		Object o = new Object();

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the String getAbilityId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testGetAbilityId_1()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");

		String result = fixture.getAbilityId();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the boolean getAbilityValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testGetAbilityValue_1()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");

		boolean result = fixture.getAbilityValue();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean getAbilityValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testGetAbilityValue_2()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(false);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");

		boolean result = fixture.getAbilityValue();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the String getKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testGetKey_1()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType((String) null);
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId((String) null);
		fixture.setMethodName((String) null);

		String result = fixture.getKey();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testGetKey_2()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType((String) null);
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId((String) null);
		fixture.setMethodName("");

		String result = fixture.getKey();

		// add additional test code here
		assertEquals("scope.method.", result);
	}

	/**
	 * Run the String getKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testGetKey_3()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType((String) null);
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");

		String result = fixture.getKey();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testGetKey_4()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");

		String result = fixture.getKey();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getMethodName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testGetMethodName_1()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");

		String result = fixture.getMethodName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getMethodValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testGetMethodValue_1()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");

		String result = fixture.getMethodValue();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testGetType_1()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");

		String result = fixture.getType();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = Scope.getXMLElementTagName();

		// add additional test code here
		assertEquals("scope", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("scope", result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType((String) null);
		fixture.setMatchNegated(false);
		fixture.setMatchesNull(false);
		fixture.setAbilityId((String) null);
		fixture.setMethodName("");

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(-1806530942, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue((String) null);
		fixture.setAbilityValue(false);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName((String) null);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(-1807454431, result);
	}

	/**
	 * Run the boolean isMatchNegated() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testIsMatchNegated_1()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");

		boolean result = fixture.isMatchNegated();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isMatchNegated() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testIsMatchNegated_2()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(false);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");

		boolean result = fixture.isMatchNegated();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isMatchesNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testIsMatchesNull_1()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");

		boolean result = fixture.isMatchesNull();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isMatchesNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testIsMatchesNull_2()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(false);
		fixture.setAbilityId("");
		fixture.setMethodName("");

		boolean result = fixture.isMatchesNull();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the Scope makeNegatedPersonScope() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testMakeNegatedPersonScope_1()
		throws Exception {

		Scope result = Scope.makeNegatedPersonScope();

		// add additional test code here
		assertNotNull(result);
		assertEquals("[Scope null model.ability.person=true matches-null match-negated]", result.toString());
		assertEquals("model.ability.person", result.getKey());
		assertEquals(null, result.getType());
		assertEquals(null, result.getMethodName());
		assertEquals("model.ability.person", result.getAbilityId());
		assertEquals("scope", result.getXMLTagName());
		assertEquals(true, result.isMatchNegated());
		assertEquals(true, result.isMatchesNull());
		assertEquals(true, result.getAbilityValue());
		assertEquals(null, result.getMethodValue());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("<scope match-negated=\"true\" matches-null=\"true\" ability-id=\"model.ability.person\" ability-value=\"true\"></scope>", result.serialize());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.Scope.readAttributes(Scope.java:342)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.Scope.readAttributes(Scope.java:342)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testReadAttributes_3()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.Scope.readAttributes(Scope.java:342)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testReadAttributes_4()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.Scope.readAttributes(Scope.java:342)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testReadAttributes_5()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.Scope.readAttributes(Scope.java:342)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testReadAttributes_6()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.Scope.readAttributes(Scope.java:342)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testReadAttributes_7()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.Scope.readAttributes(Scope.java:342)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testReadAttributes_8()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.Scope.readAttributes(Scope.java:342)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testReadAttributes_9()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.Scope.readAttributes(Scope.java:342)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testReadAttributes_10()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.Scope.readAttributes(Scope.java:342)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testReadAttributes_11()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.Scope.readAttributes(Scope.java:342)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testReadAttributes_12()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.Scope.readAttributes(Scope.java:342)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testReadAttributes_13()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.Scope.readAttributes(Scope.java:342)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testReadAttributes_14()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.Scope.readAttributes(Scope.java:342)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testReadAttributes_15()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.Scope.readAttributes(Scope.java:342)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testReadAttributes_16()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.Scope.readAttributes(Scope.java:342)
	}

	/**
	 * Run the void setAbilityId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testSetAbilityId_1()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		String newAbilityId = "";

		fixture.setAbilityId(newAbilityId);

		// add additional test code here
	}

	/**
	 * Run the void setAbilityValue(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testSetAbilityValue_1()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		boolean newAbilityValue = true;

		fixture.setAbilityValue(newAbilityValue);

		// add additional test code here
	}

	/**
	 * Run the void setMatchNegated(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testSetMatchNegated_1()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		boolean newMatchNegated = true;

		fixture.setMatchNegated(newMatchNegated);

		// add additional test code here
	}

	/**
	 * Run the void setMatchesNull(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testSetMatchesNull_1()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		boolean newMatchesNull = true;

		fixture.setMatchesNull(newMatchesNull);

		// add additional test code here
	}

	/**
	 * Run the void setMethodName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testSetMethodName_1()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		String newMethodName = "";

		fixture.setMethodName(newMethodName);

		// add additional test code here
	}

	/**
	 * Run the void setMethodValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testSetMethodValue_1()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		String newMethodValue = "";

		fixture.setMethodValue(newMethodValue);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testSetType_1()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		String newType = "";

		fixture.setType(newType);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId((String) null);
		fixture.setMethodName((String) null);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[Scope  matches-null match-negated]", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testToString_2()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(false);
		fixture.setMatchesNull(false);
		fixture.setAbilityId("");
		fixture.setMethodName("");

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[Scope  =true =]", result);
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_1()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_2()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_3()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_4()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType((String) null);
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId((String) null);
		fixture.setMethodName("");
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_5()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_6()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType((String) null);
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_7()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId((String) null);
		fixture.setMethodName("");
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_8()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType((String) null);
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId((String) null);
		fixture.setMethodName("");
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_9()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue((String) null);
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_10()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue((String) null);
		fixture.setAbilityValue(true);
		fixture.setType((String) null);
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName("");
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_11()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue((String) null);
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId((String) null);
		fixture.setMethodName("");
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_12()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue((String) null);
		fixture.setAbilityValue(true);
		fixture.setType((String) null);
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId((String) null);
		fixture.setMethodName("");
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_13()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName((String) null);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_14()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType((String) null);
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId("");
		fixture.setMethodName((String) null);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_15()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType("");
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId((String) null);
		fixture.setMethodName((String) null);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_16()
		throws Exception {
		Scope fixture = new Scope();
		fixture.setMethodValue("");
		fixture.setAbilityValue(true);
		fixture.setType((String) null);
		fixture.setMatchNegated(true);
		fixture.setMatchesNull(true);
		fixture.setAbilityId((String) null);
		fixture.setMethodName((String) null);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
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
	 * @generatedBy CodePro at 5/14/18 4:19 PM
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
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ScopeTest.class);
	}
}