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
 * The class <code>LimitTest</code> contains tests for the class <code>{@link Limit}</code>.
 *
 * @generatedBy CodePro at 5/14/18 3:44 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class LimitTest {
	/**
	 * Run the Limit(Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testLimit_1()
		throws Exception {
		Specification specification = new Specification();

		Limit result = new Limit(specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals("null null null", result.toString());
		assertEquals(null, result.getLeftHandSide());
		assertEquals(null, result.getRightHandSide());
		assertEquals(null, result.getOperator());
		assertEquals("limit", result.getXMLTagName());
		assertEquals("null.name", result.getNameKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("null.description", result.getDescriptionKey());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getIdType());
	}

	/**
	 * Run the Limit(FreeColXMLReader,Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testLimit_2()
		throws Exception {
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		Specification specification = new Specification();

		Limit result = new Limit(xr, specification);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Limit.<init>(Limit.java:73)
		assertNotNull(result);
	}

	/**
	 * Run the Limit(FreeColXMLReader,Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testLimit_3()
		throws Exception {
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		Specification specification = new Specification();

		Limit result = new Limit(xr, specification);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Limit.<init>(Limit.java:73)
		assertNotNull(result);
	}

	/**
	 * Run the Limit(String,Operand,Operator,Operand) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testLimit_4()
		throws Exception {
		String id = "";
		Operand lhs = new Operand();
		Limit.Operator op = Limit.Operator.EQ;
		Operand rhs = new Operand();

		Limit result = new Limit(id, lhs, op, rhs);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[Operand type=NONE scopeLevel=NONE null matches-null] EQ [Operand type=NONE scopeLevel=NONE null matches-null]", result.toString());
		assertEquals("limit", result.getXMLTagName());
		assertEquals(".name", result.getNameKey());
		assertEquals(false, result.isAbstractType());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("<limit id=\"\" operator=\"eq\"><left-hand-side match-negated=\"false\" matches-null=\"true\" operand-type=\"none\" scope-level=\"none\"></left-hand-side><right-hand-side match-negated=\"false\" matches-null=\"true\" operand-type=\"none\" scope-level=\"none\"></right-hand-side></limit>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
	}

	/**
	 * Run the boolean appliesTo(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testAppliesTo_1()
		throws Exception {
		Limit fixture = new Limit("", new Operand(), Limit.Operator.EQ, new Operand());
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
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testAppliesTo_2()
		throws Exception {
		Limit fixture = new Limit("", new Operand(), Limit.Operator.EQ, new Operand());
		FreeColObject object = new AbstractGoods();

		boolean result = fixture.appliesTo(object);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean evaluate(Game) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testEvaluate_1()
		throws Exception {
		Limit fixture = new Limit("", new Operand(), Limit.Operator.EQ, new Operand());
		Game game = new Game(new IIOMetadataNode(), "");

		boolean result = fixture.evaluate(game);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean evaluate(Game) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testEvaluate_2()
		throws Exception {
		Limit fixture = new Limit("", new Operand(), Limit.Operator.EQ, new Operand());
		Game game = new Game(new IIOMetadataNode(), "");

		boolean result = fixture.evaluate(game);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean evaluate(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testEvaluate_3()
		throws Exception {
		Limit fixture = new Limit("", new Operand(), Limit.Operator.EQ, new Operand());
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		boolean result = fixture.evaluate(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean evaluate(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testEvaluate_4()
		throws Exception {
		Limit fixture = new Limit("", new Operand(), Limit.Operator.EQ, new Operand());
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		boolean result = fixture.evaluate(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean evaluate(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testEvaluate_5()
		throws Exception {
		Limit fixture = new Limit("", new Operand(), Limit.Operator.EQ, new Operand());
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		boolean result = fixture.evaluate(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean evaluate(Settlement) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testEvaluate_6()
		throws Exception {
		Limit fixture = new Limit("", new Operand(), Limit.Operator.EQ, new Operand());
		Settlement settlement = new Colony(new Game(new IIOMetadataNode(), ""), "");

		boolean result = fixture.evaluate(settlement);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean evaluate(Settlement) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testEvaluate_7()
		throws Exception {
		Limit fixture = new Limit("", new Operand(), Limit.Operator.EQ, new Operand());
		Colony settlement = new Colony(new Game(new IIOMetadataNode(), ""), "");
		settlement.owner = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		boolean result = fixture.evaluate(settlement);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean evaluate(Settlement) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testEvaluate_8()
		throws Exception {
		Limit fixture = new Limit("", new Operand(), Limit.Operator.EQ, new Operand());
		Settlement settlement = new Colony(new Game(new IIOMetadataNode(), ""), "");

		boolean result = fixture.evaluate(settlement);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean evaluate(Settlement) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testEvaluate_9()
		throws Exception {
		Limit fixture = new Limit("", new Operand(), Limit.Operator.EQ, new Operand());
		Settlement settlement = new Colony(new Game(new IIOMetadataNode(), ""), "");

		boolean result = fixture.evaluate(settlement);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the Operand getLeftHandSide() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testGetLeftHandSide_1()
		throws Exception {
		Limit fixture = new Limit("", new Operand(), Limit.Operator.EQ, new Operand());

		Operand result = fixture.getLeftHandSide();

		// add additional test code here
		assertNotNull(result);
		assertEquals("[Operand type=NONE scopeLevel=NONE null matches-null]", result.toString());
		assertEquals(null, result.getValue());
		assertEquals(null, result.getKey());
		assertEquals(null, result.getType());
		assertEquals(null, result.getMethodName());
		assertEquals(null, result.getAbilityId());
		assertEquals(true, result.isMatchesNull());
		assertEquals(true, result.getAbilityValue());
		assertEquals(false, result.isMatchNegated());
		assertEquals(null, result.getMethodValue());
		assertEquals("scope", result.getXMLTagName());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("<scope match-negated=\"false\" matches-null=\"true\" operand-type=\"none\" scope-level=\"none\"></scope>", result.serialize());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getIdType());
	}

	/**
	 * Run the Limit.Operator getOperator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testGetOperator_1()
		throws Exception {
		Limit fixture = new Limit("", new Operand(), Limit.Operator.EQ, new Operand());

		Limit.Operator result = fixture.getOperator();

		// add additional test code here
		assertNotNull(result);
		assertEquals("EQ", result.name());
		assertEquals("EQ", result.toString());
		assertEquals(0, result.ordinal());
	}

	/**
	 * Run the Operand getRightHandSide() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testGetRightHandSide_1()
		throws Exception {
		Limit fixture = new Limit("", new Operand(), Limit.Operator.EQ, new Operand());

		Operand result = fixture.getRightHandSide();

		// add additional test code here
		assertNotNull(result);
		assertEquals("[Operand type=NONE scopeLevel=NONE null matches-null]", result.toString());
		assertEquals(null, result.getValue());
		assertEquals(null, result.getKey());
		assertEquals(null, result.getType());
		assertEquals(null, result.getMethodName());
		assertEquals(null, result.getAbilityId());
		assertEquals(true, result.isMatchesNull());
		assertEquals(true, result.getAbilityValue());
		assertEquals(false, result.isMatchNegated());
		assertEquals(null, result.getMethodValue());
		assertEquals("scope", result.getXMLTagName());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("<scope match-negated=\"false\" matches-null=\"true\" operand-type=\"none\" scope-level=\"none\"></scope>", result.serialize());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getIdType());
	}

	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = Limit.getXMLElementTagName();

		// add additional test code here
		assertEquals("limit", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		Limit fixture = new Limit("", new Operand(), Limit.Operator.EQ, new Operand());

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("limit", result);
	}

	/**
	 * Run the boolean hasOperandType(OperandType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testHasOperandType_1()
		throws Exception {
		Limit fixture = new Limit("", new Operand(), Limit.Operator.EQ, new Operand());
		Operand.OperandType type = Operand.OperandType.BUILDINGS;

		boolean result = fixture.hasOperandType(type);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasOperandType(OperandType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testHasOperandType_2()
		throws Exception {
		Limit fixture = new Limit("", new Operand(), Limit.Operator.EQ, new Operand());
		Operand.OperandType type = Operand.OperandType.BUILDINGS;

		boolean result = fixture.hasOperandType(type);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasOperandType(OperandType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testHasOperandType_3()
		throws Exception {
		Limit fixture = new Limit("", new Operand(), Limit.Operator.EQ, new Operand());
		Operand.OperandType type = Operand.OperandType.BUILDINGS;

		boolean result = fixture.hasOperandType(type);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		Limit fixture = new Limit("", new Operand(), Limit.Operator.EQ, new Operand());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.FreeColObject.readAttributes(FreeColObject.java:1257)
		//       at net.sf.freecol.common.model.FreeColGameObjectType.readAttributes(FreeColGameObjectType.java:207)
		//       at net.sf.freecol.common.model.Limit.readAttributes(Limit.java:329)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		Limit fixture = new Limit("", new Operand(), Limit.Operator.EQ, new Operand());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.FreeColObject.readAttributes(FreeColObject.java:1257)
		//       at net.sf.freecol.common.model.FreeColGameObjectType.readAttributes(FreeColGameObjectType.java:207)
		//       at net.sf.freecol.common.model.Limit.readAttributes(Limit.java:329)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testReadChild_1()
		throws Exception {
		Limit fixture = new Limit("", new Operand(), Limit.Operator.EQ, new Operand());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.Limit.readChild(Limit.java:340)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testReadChild_2()
		throws Exception {
		Limit fixture = new Limit("", new Operand(), Limit.Operator.EQ, new Operand());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.Limit.readChild(Limit.java:340)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testReadChild_3()
		throws Exception {
		Limit fixture = new Limit("", new Operand(), Limit.Operator.EQ, new Operand());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.Limit.readChild(Limit.java:340)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testReadChild_4()
		throws Exception {
		Limit fixture = new Limit("", new Operand(), Limit.Operator.EQ, new Operand());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.Limit.readChild(Limit.java:340)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testReadChild_5()
		throws Exception {
		Limit fixture = new Limit("", new Operand(), Limit.Operator.EQ, new Operand());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.Limit.readChild(Limit.java:340)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testReadChild_6()
		throws Exception {
		Limit fixture = new Limit("", new Operand(), Limit.Operator.EQ, new Operand());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.Limit.readChild(Limit.java:340)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testReadChild_7()
		throws Exception {
		Limit fixture = new Limit("", new Operand(), Limit.Operator.EQ, new Operand());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.Limit.readChild(Limit.java:340)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testReadChild_8()
		throws Exception {
		Limit fixture = new Limit("", new Operand(), Limit.Operator.EQ, new Operand());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.Limit.readChild(Limit.java:340)
	}

	/**
	 * Run the void setLeftHandSide(Operand) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testSetLeftHandSide_1()
		throws Exception {
		Limit fixture = new Limit("", new Operand(), Limit.Operator.EQ, new Operand());
		Operand newLeftHandSide = new Operand();

		fixture.setLeftHandSide(newLeftHandSide);

		// add additional test code here
	}

	/**
	 * Run the void setOperator(Operator) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testSetOperator_1()
		throws Exception {
		Limit fixture = new Limit("", new Operand(), Limit.Operator.EQ, new Operand());
		Limit.Operator newOperator = Limit.Operator.EQ;

		fixture.setOperator(newOperator);

		// add additional test code here
	}

	/**
	 * Run the void setRightHandSide(Operand) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testSetRightHandSide_1()
		throws Exception {
		Limit fixture = new Limit("", new Operand(), Limit.Operator.EQ, new Operand());
		Operand newRightHandSide = new Operand();

		fixture.setRightHandSide(newRightHandSide);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Limit fixture = new Limit("", new Operand(), Limit.Operator.EQ, new Operand());

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[Operand type=NONE scopeLevel=NONE null matches-null] EQ [Operand type=NONE scopeLevel=NONE null matches-null]", result);
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_1()
		throws Exception {
		Limit fixture = new Limit("", new Operand(), Limit.Operator.EQ, new Operand());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_2()
		throws Exception {
		Limit fixture = new Limit("", new Operand(), Limit.Operator.EQ, new Operand());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_3()
		throws Exception {
		Limit fixture = new Limit("", new Operand(), Limit.Operator.EQ, new Operand());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testWriteChildren_1()
		throws Exception {
		Limit fixture = new Limit("", new Operand(), Limit.Operator.EQ, new Operand());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testWriteChildren_2()
		throws Exception {
		Limit fixture = new Limit("", new Operand(), Limit.Operator.EQ, new Operand());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testWriteChildren_3()
		throws Exception {
		Limit fixture = new Limit("", new Operand(), Limit.Operator.EQ, new Operand());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	@Test
	public void testWriteChildren_4()
		throws Exception {
		Limit fixture = new Limit("", new Operand(), Limit.Operator.EQ, new Operand());
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
	 * @generatedBy CodePro at 5/14/18 3:44 PM
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
	 * @generatedBy CodePro at 5/14/18 3:44 PM
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
	 * @generatedBy CodePro at 5/14/18 3:44 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(LimitTest.class);
	}
}