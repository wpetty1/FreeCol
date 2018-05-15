package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import javax.imageio.metadata.IIOMetadataNode;
import javax.xml.stream.XMLStreamException;
import net.sf.freecol.common.io.FreeColXMLReader;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>ModifierTest</code> contains tests for the class <code>{@link Modifier}</code>.
 *
 * @generatedBy CodePro at 5/14/18 3:52 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class ModifierTest {
	/**
	 * Run the Modifier() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testModifier_1()
		throws Exception {

		Modifier result = new Modifier();

		// add additional test code here
		assertNotNull(result);
		assertEquals("[Modifier null null 0.0 index=0]", result.toString());
		assertEquals(0.0f, result.getValue(), 1.0f);
		assertEquals(null, result.getType());
		assertEquals(0.0f, result.getIncrement(), 1.0f);
		assertEquals("modifier", result.getXMLTagName());
		assertEquals(0, result.getModifierIndex());
		assertEquals(false, result.hasIncrement());
		assertEquals(true, result.requireNegatedPersonScope());
		assertEquals(null, result.getIncrementType());
		assertEquals(null, result.getSource());
		assertEquals(0, result.getDuration());
		assertEquals(false, result.isTemporary());
		assertEquals(true, result.isIndependent());
		assertEquals("null.name", result.getNameKey());
		assertEquals(null, result.getFirstTurn());
		assertEquals(true, result.hasScope());
		assertEquals(false, result.hasTimeLimit());
		assertEquals(null, result.getLastTurn());
		assertEquals("[Modifier null null 0.0 index=0 [ [Scope null model.ability.person=true matches-null match-negated] ]]", result.toString());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the Modifier(Modifier) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testModifier_2()
		throws Exception {
		Modifier template = new Modifier(new Specification());

		Modifier result = new Modifier(template);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[Modifier null null 0.0 index=0]", result.toString());
		assertEquals(0.0f, result.getValue(), 1.0f);
		assertEquals(null, result.getType());
		assertEquals(0.0f, result.getIncrement(), 1.0f);
		assertEquals("modifier", result.getXMLTagName());
		assertEquals(0, result.getModifierIndex());
		assertEquals(false, result.hasIncrement());
		assertEquals(null, result.getIncrementType());
		assertEquals(null, result.getSource());
		assertEquals(0, result.getDuration());
		assertEquals(false, result.isTemporary());
		assertEquals(true, result.isIndependent());
		assertEquals("null.name", result.getNameKey());
		assertEquals(null, result.getFirstTurn());
		assertEquals(false, result.hasScope());
		assertEquals(false, result.hasTimeLimit());
		assertEquals(null, result.getLastTurn());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the Modifier(Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testModifier_3()
		throws Exception {
		Specification specification = new Specification();

		Modifier result = new Modifier(specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[Modifier null null 0.0 index=0]", result.toString());
		assertEquals(0.0f, result.getValue(), 1.0f);
		assertEquals(null, result.getType());
		assertEquals(0.0f, result.getIncrement(), 1.0f);
		assertEquals("modifier", result.getXMLTagName());
		assertEquals(0, result.getModifierIndex());
		assertEquals(false, result.hasIncrement());
		assertEquals(true, result.requireNegatedPersonScope());
		assertEquals(null, result.getIncrementType());
		assertEquals(null, result.getSource());
		assertEquals(0, result.getDuration());
		assertEquals(false, result.isTemporary());
		assertEquals(true, result.isIndependent());
		assertEquals("null.name", result.getNameKey());
		assertEquals(null, result.getFirstTurn());
		assertEquals(true, result.hasScope());
		assertEquals(false, result.hasTimeLimit());
		assertEquals(null, result.getLastTurn());
		assertEquals("[Modifier null null 0.0 index=0 [ [Scope null model.ability.person=true matches-null match-negated] ]]", result.toString());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the Modifier(String,Modifier) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testModifier_4()
		throws Exception {
		String id = "";
		Modifier template = new Modifier(new Specification());

		Modifier result = new Modifier(id, template);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[Modifier  null 0.0 index=0]", result.toString());
		assertEquals(0.0f, result.getValue(), 1.0f);
		assertEquals(null, result.getType());
		assertEquals(0.0f, result.getIncrement(), 1.0f);
		assertEquals("modifier", result.getXMLTagName());
		assertEquals(0, result.getModifierIndex());
		assertEquals(false, result.hasIncrement());
		assertEquals(null, result.getIncrementType());
		assertEquals(null, result.getSource());
		assertEquals(0, result.getDuration());
		assertEquals(false, result.isTemporary());
		assertEquals(true, result.isIndependent());
		assertEquals(".name", result.getNameKey());
		assertEquals(null, result.getFirstTurn());
		assertEquals(false, result.hasScope());
		assertEquals(false, result.hasTimeLimit());
		assertEquals(null, result.getLastTurn());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the Modifier(FreeColXMLReader,Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testModifier_5()
		throws Exception {
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		Specification specification = new Specification();

		Modifier result = new Modifier(xr, specification);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Modifier.<init>(Modifier.java:268)
		assertNotNull(result);
	}

	/**
	 * Run the Modifier(FreeColXMLReader,Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testModifier_6()
		throws Exception {
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		Specification specification = new Specification();

		Modifier result = new Modifier(xr, specification);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Modifier.<init>(Modifier.java:268)
		assertNotNull(result);
	}

	/**
	 * Run the Modifier(Element,Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testModifier_7()
		throws Exception {
		Element e = new IIOMetadataNode();
		Specification specification = new Specification();

		Modifier result = new Modifier(e, specification);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Modifier.<init>(Modifier.java:279)
		assertNotNull(result);
	}

	/**
	 * Run the Modifier(String,float,ModifierType) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testModifier_8()
		throws Exception {
		String id = "";
		float value = 1.0f;
		Modifier.ModifierType type = Modifier.ModifierType.ADDITIVE;

		Modifier result = new Modifier(id, value, type);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[Modifier  ADDITIVE 1.0 index=0]", result.toString());
		assertEquals(1.0f, result.getValue(), 1.0f);
		assertEquals(0.0f, result.getIncrement(), 1.0f);
		assertEquals("modifier", result.getXMLTagName());
		assertEquals(0, result.getModifierIndex());
		assertEquals(false, result.hasIncrement());
		assertEquals(true, result.requireNegatedPersonScope());
		assertEquals(null, result.getIncrementType());
		assertEquals(null, result.getSource());
		assertEquals(0, result.getDuration());
		assertEquals(false, result.isTemporary());
		assertEquals(true, result.isIndependent());
		assertEquals(".name", result.getNameKey());
		assertEquals(null, result.getFirstTurn());
		assertEquals(true, result.hasScope());
		assertEquals(false, result.hasTimeLimit());
		assertEquals(null, result.getLastTurn());
		assertEquals("[Modifier  ADDITIVE 1.0 index=0 [ [Scope null model.ability.person=true matches-null match-negated] ]]", result.toString());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals("<modifier id=\"\" value=\"1.0\" type=\"additive\" index=\"0\"><scope match-negated=\"true\" matches-null=\"true\" ability-id=\"model.ability.person\" ability-value=\"true\"></scope></modifier>", result.serialize());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the Modifier(String,float,ModifierType,FreeColObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testModifier_9()
		throws Exception {
		String id = "";
		float value = 1.0f;
		Modifier.ModifierType type = Modifier.ModifierType.ADDITIVE;
		FreeColObject source = new AbstractGoods();

		Modifier result = new Modifier(id, value, type, source);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[Modifier  (null) ADDITIVE 1.0 index=0]", result.toString());
		assertEquals(1.0f, result.getValue(), 1.0f);
		assertEquals(0.0f, result.getIncrement(), 1.0f);
		assertEquals("modifier", result.getXMLTagName());
		assertEquals(0, result.getModifierIndex());
		assertEquals(false, result.hasIncrement());
		assertEquals(true, result.requireNegatedPersonScope());
		assertEquals(null, result.getIncrementType());
		assertEquals(0, result.getDuration());
		assertEquals(false, result.isTemporary());
		assertEquals(true, result.isIndependent());
		assertEquals(".name", result.getNameKey());
		assertEquals(null, result.getFirstTurn());
		assertEquals(true, result.hasScope());
		assertEquals(false, result.hasTimeLimit());
		assertEquals(null, result.getLastTurn());
		assertEquals("[Modifier  (null) ADDITIVE 1.0 index=0 [ [Scope null model.ability.person=true matches-null match-negated] ]]", result.toString());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the Modifier(String,float,ModifierType,FreeColObject,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testModifier_10()
		throws Exception {
		String id = "";
		float value = 1.0f;
		Modifier.ModifierType type = Modifier.ModifierType.ADDITIVE;
		FreeColObject source = new AbstractGoods();
		int modifierIndex = 1;

		Modifier result = new Modifier(id, value, type, source, modifierIndex);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[Modifier  (null) ADDITIVE 1.0 index=1]", result.toString());
		assertEquals(1.0f, result.getValue(), 1.0f);
		assertEquals(0.0f, result.getIncrement(), 1.0f);
		assertEquals("modifier", result.getXMLTagName());
		assertEquals(1, result.getModifierIndex());
		assertEquals(false, result.hasIncrement());
		assertEquals(true, result.requireNegatedPersonScope());
		assertEquals(null, result.getIncrementType());
		assertEquals(0, result.getDuration());
		assertEquals(false, result.isTemporary());
		assertEquals(true, result.isIndependent());
		assertEquals(".name", result.getNameKey());
		assertEquals(null, result.getFirstTurn());
		assertEquals(true, result.hasScope());
		assertEquals(false, result.hasTimeLimit());
		assertEquals(null, result.getLastTurn());
		assertEquals("[Modifier  (null) ADDITIVE 1.0 index=1 [ [Scope null model.ability.person=true matches-null match-negated] ]]", result.toString());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the float apply(float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testApply_1()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);
		float base = 1.0f;
		float value = 1.0f;

		float result = fixture.apply(base, value);

		// add additional test code here
		assertEquals(2.0f, result, 0.1f);
	}

	/**
	 * Run the float applyTo(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testApplyTo_1()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);
		float number = 1.0f;

		float result = fixture.applyTo(number);

		// add additional test code here
		assertEquals(2.0f, result, 0.1f);
	}

	/**
	 * Run the float applyTo(float,Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testApplyTo_2()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);
		float number = 1.0f;
		Turn turn = new Turn(1);

		float result = fixture.applyTo(number, turn);

		// add additional test code here
		assertEquals(2.0f, result, 0.1f);
	}

	/**
	 * Run the float applyTo(float,Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testApplyTo_3()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement((Modifier.ModifierType) null, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);
		float number = 1.0f;
		Turn turn = new Turn(1);

		float result = fixture.applyTo(number, turn);

		// add additional test code here
		assertEquals(2.0f, result, 0.1f);
	}

	/**
	 * Run the int compareTo(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testCompareTo_1()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);
		Modifier other = new Modifier(new Specification());
		other.setModifierIndex(1);

		int result = fixture.compareTo(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.model.Modifier.compareTo(Modifier.java:536)
		assertEquals(0, result);
	}

	/**
	 * Run the int compareTo(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testCompareTo_2()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);
		Modifier other = new Modifier(new Specification());
		other.setType(Modifier.ModifierType.ADDITIVE);
		other.setModifierIndex(1);

		int result = fixture.compareTo(other);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int compareTo(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testCompareTo_3()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);
		FreeColObject other = new AbstractGoods();

		int result = fixture.compareTo(other);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);
		Modifier o = new Modifier(new Specification());
		o.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		o.setType(Modifier.ModifierType.ADDITIVE);
		o.setModifierIndex(1);
		o.setValue(1.0f);

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);
		Modifier o = new Modifier(new Specification());
		o.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		o.setType(Modifier.ModifierType.ADDITIVE);
		o.setModifierIndex(1);
		o.setValue(1.0f);

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);
		Modifier o = new Modifier(new Specification());
		o.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		o.setType(Modifier.ModifierType.ADDITIVE);
		o.setModifierIndex(1);
		o.setValue(1.0f);

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);
		Modifier o = new Modifier(new Specification());
		o.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		o.setType(Modifier.ModifierType.ADDITIVE);
		o.setModifierIndex(1);
		o.setValue(1.0f);

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);
		Modifier o = new Modifier(new Specification());
		o.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		o.setType(Modifier.ModifierType.ADDITIVE);
		o.setModifierIndex(1);
		o.setValue(1.0f);

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testEquals_6()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);
		Modifier o = new Modifier(new Specification());
		o.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		o.setType(Modifier.ModifierType.ADDITIVE);
		o.setModifierIndex(1);
		o.setValue(1.0f);

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testEquals_7()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);
		Modifier o = new Modifier(new Specification());
		o.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		o.setType(Modifier.ModifierType.ADDITIVE);
		o.setModifierIndex(1);
		o.setValue(1.0f);

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testEquals_8()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);
		Modifier o = new Modifier(new Specification());
		o.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		o.setType(Modifier.ModifierType.ADDITIVE);
		o.setModifierIndex(1);
		o.setValue(1.0f);

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testEquals_9()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);
		Object o = new Object();

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the float getIncrement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetIncrement_1()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);

		float result = fixture.getIncrement();

		// add additional test code here
		assertEquals(1.0f, result, 0.1f);
	}

	/**
	 * Run the Modifier.ModifierType getIncrementType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetIncrementType_1()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);

		Modifier.ModifierType result = fixture.getIncrementType();

		// add additional test code here
		assertNotNull(result);
		assertEquals("ADDITIVE", result.name());
		assertEquals("ADDITIVE", result.toString());
		assertEquals(0, result.ordinal());
	}

	/**
	 * Run the int getModifierIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetModifierIndex_1()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);

		int result = fixture.getModifierIndex();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the Modifier.ModifierType getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetType_1()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);

		Modifier.ModifierType result = fixture.getType();

		// add additional test code here
		assertNotNull(result);
		assertEquals("ADDITIVE", result.name());
		assertEquals("ADDITIVE", result.toString());
		assertEquals(0, result.ordinal());
	}

	/**
	 * Run the float getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetValue_1()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);

		float result = fixture.getValue();

		// add additional test code here
		assertEquals(1.0f, result, 0.1f);
	}

	/**
	 * Run the float getValue(Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetValue_2()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);
		Turn turn = new Turn(1);

		float result = fixture.getValue(turn);

		// add additional test code here
		assertEquals(1.0f, result, 0.1f);
	}

	/**
	 * Run the float getValue(Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetValue_3()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement((Modifier.ModifierType) null, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);
		Turn turn = new Turn(1);

		float result = fixture.getValue(turn);

		// add additional test code here
		assertEquals(1.0f, result, 0.1f);
	}

	/**
	 * Run the float getValue(Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetValue_4()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);
		Turn turn = new Turn(1);

		float result = fixture.getValue(turn);

		// add additional test code here
		assertEquals(1.0f, result, 0.1f);
	}

	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = Modifier.getXMLElementTagName();

		// add additional test code here
		assertEquals("modifier", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("modifier", result);
	}

	/**
	 * Run the boolean hasIncrement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testHasIncrement_1()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);

		boolean result = fixture.hasIncrement();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean hasIncrement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testHasIncrement_2()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement((Modifier.ModifierType) null, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);

		boolean result = fixture.hasIncrement();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(590457217, result);
	}

	/**
	 * Run the Modifier makeTimedModifier(String,Modifier,Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testMakeTimedModifier_1()
		throws Exception {
		String id = "";
		Modifier template = new Modifier(new Specification());
		template.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		template.setValue(1.0f);
		Turn start = new Turn(1);

		Modifier result = Modifier.makeTimedModifier(id, template, start);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[Modifier  null 1.0 index=0]", result.toString());
		assertEquals(1.0f, result.getValue(), 1.0f);
		assertEquals(null, result.getType());
		assertEquals(1.0f, result.getIncrement(), 1.0f);
		assertEquals("modifier", result.getXMLTagName());
		assertEquals(0, result.getModifierIndex());
		assertEquals(true, result.hasIncrement());
		assertEquals(null, result.getSource());
		assertEquals(0, result.getDuration());
		assertEquals(false, result.isTemporary());
		assertEquals(true, result.isIndependent());
		assertEquals(".name", result.getNameKey());
		assertEquals(false, result.hasScope());
		assertEquals(true, result.hasTimeLimit());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the Modifier makeTimedModifier(String,Modifier,Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testMakeTimedModifier_2()
		throws Exception {
		String id = "";
		Modifier template = new Modifier(new Specification());
		template.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		Turn start = new Turn(1);

		Modifier result = Modifier.makeTimedModifier(id, template, start);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[Modifier  null 0.0 index=0]", result.toString());
		assertEquals(0.0f, result.getValue(), 1.0f);
		assertEquals(null, result.getType());
		assertEquals(1.0f, result.getIncrement(), 1.0f);
		assertEquals("modifier", result.getXMLTagName());
		assertEquals(0, result.getModifierIndex());
		assertEquals(true, result.hasIncrement());
		assertEquals(null, result.getSource());
		assertEquals(0, result.getDuration());
		assertEquals(false, result.isTemporary());
		assertEquals(true, result.isIndependent());
		assertEquals(".name", result.getNameKey());
		assertEquals(false, result.hasScope());
		assertEquals(true, result.hasTimeLimit());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.FreeColObject.readAttributes(FreeColObject.java:1257)
		//       at net.sf.freecol.common.model.Feature.readAttributes(Feature.java:417)
		//       at net.sf.freecol.common.model.Modifier.readAttributes(Modifier.java:620)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.FreeColObject.readAttributes(FreeColObject.java:1257)
		//       at net.sf.freecol.common.model.Feature.readAttributes(Feature.java:417)
		//       at net.sf.freecol.common.model.Modifier.readAttributes(Modifier.java:620)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testReadAttributes_3()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.FreeColObject.readAttributes(FreeColObject.java:1257)
		//       at net.sf.freecol.common.model.Feature.readAttributes(Feature.java:417)
		//       at net.sf.freecol.common.model.Modifier.readAttributes(Modifier.java:620)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testReadAttributes_4()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.FreeColObject.readAttributes(FreeColObject.java:1257)
		//       at net.sf.freecol.common.model.Feature.readAttributes(Feature.java:417)
		//       at net.sf.freecol.common.model.Modifier.readAttributes(Modifier.java:620)
	}

	/**
	 * Run the boolean requireNegatedPersonScope() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testRequireNegatedPersonScope_1()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);

		boolean result = fixture.requireNegatedPersonScope();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean requireNegatedPersonScope() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testRequireNegatedPersonScope_2()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);

		boolean result = fixture.requireNegatedPersonScope();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the void setIncrement(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testSetIncrement_1()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);
		float increment = 1.0f;

		fixture.setIncrement(increment);

		// add additional test code here
	}

	/**
	 * Run the void setIncrement(ModifierType,float,Turn,Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testSetIncrement_2()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);
		Modifier.ModifierType incrementType = Modifier.ModifierType.ADDITIVE;
		float increment = 1.0f;
		Turn firstTurn = new Turn(1);
		Turn lastTurn = new Turn(1);

		fixture.setIncrement(incrementType, increment, firstTurn, lastTurn);

		// add additional test code here
	}

	/**
	 * Run the void setIncrement(ModifierType,float,Turn,Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testSetIncrement_3()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);
		Modifier.ModifierType incrementType = Modifier.ModifierType.ADDITIVE;
		float increment = 1.0f;
		Turn firstTurn = null;
		Turn lastTurn = new Turn(1);

		fixture.setIncrement(incrementType, increment, firstTurn, lastTurn);

		// add additional test code here
	}

	/**
	 * Run the void setIncrementType(ModifierType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testSetIncrementType_1()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);
		Modifier.ModifierType incrementType = Modifier.ModifierType.ADDITIVE;

		fixture.setIncrementType(incrementType);

		// add additional test code here
	}

	/**
	 * Run the void setModifierIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testSetModifierIndex_1()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);
		int modifierIndex = 1;

		fixture.setModifierIndex(modifierIndex);

		// add additional test code here
	}

	/**
	 * Run the void setType(ModifierType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testSetType_1()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);
		Modifier.ModifierType modifierType = Modifier.ModifierType.ADDITIVE;

		fixture.setType(modifierType);

		// add additional test code here
	}

	/**
	 * Run the void setValue(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testSetValue_1()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);
		float value = 1.0f;

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[Modifier null ADDITIVE 1.0 index=1]", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testToString_2()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[Modifier null ADDITIVE 1.0 index=1]", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test
	public void testToString_3()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(-1);
		fixture.setValue(1.0f);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[Modifier null ADDITIVE 1.0]", result);
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_1()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_2()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_3()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_4()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_5()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_6()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement((Modifier.ModifierType) null, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_7()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_8()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement((Modifier.ModifierType) null, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(1);
		fixture.setValue(1.0f);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_9()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement(Modifier.ModifierType.ADDITIVE, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(-1);
		fixture.setValue(1.0f);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_10()
		throws Exception {
		Modifier fixture = new Modifier(new Specification());
		fixture.setIncrement((Modifier.ModifierType) null, 1.0f, new Turn(1), new Turn(1));
		fixture.setType(Modifier.ModifierType.ADDITIVE);
		fixture.setModifierIndex(-1);
		fixture.setValue(1.0f);
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
	 * @generatedBy CodePro at 5/14/18 3:52 PM
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
	 * @generatedBy CodePro at 5/14/18 3:52 PM
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
	 * @generatedBy CodePro at 5/14/18 3:52 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ModifierTest.class);
	}
}