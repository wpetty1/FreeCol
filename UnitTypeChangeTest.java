package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import java.util.ArrayList;
import java.util.List;
import net.sf.freecol.common.io.FreeColXMLReader;
import javax.imageio.metadata.IIOMetadataNode;
import javax.xml.stream.XMLStreamException;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>UnitTypeChangeTest</code> contains tests for the class <code>{@link UnitTypeChange}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:37 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class UnitTypeChangeTest {
	/**
	 * Run the UnitTypeChange() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testUnitTypeChange_1()
		throws Exception {

		UnitTypeChange result = new UnitTypeChange();

		// add additional test code here
		assertNotNull(result);
		assertEquals("[null 0]", result.toString());
		assertEquals(0, result.getTurnsToLearn());
		assertEquals(null, result.getNewUnitType());
		assertEquals(false, result.canBeTaught());
		assertEquals("upgrade", result.getXMLTagName());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("<upgrade turns-to-learn=\"0\"></upgrade>", result.serialize());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the UnitTypeChange(FreeColXMLReader,Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testUnitTypeChange_2()
		throws Exception {
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		Specification specification = new Specification();

		UnitTypeChange result = new UnitTypeChange(xr, specification);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.UnitTypeChange.<init>(UnitTypeChange.java:113)
		assertNotNull(result);
	}

	/**
	 * Run the UnitTypeChange(FreeColXMLReader,Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testUnitTypeChange_3()
		throws Exception {
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		Specification specification = new Specification();

		UnitTypeChange result = new UnitTypeChange(xr, specification);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.UnitTypeChange.<init>(UnitTypeChange.java:113)
		assertNotNull(result);
	}

	/**
	 * Run the boolean appliesTo(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testAppliesTo_1()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		boolean result = fixture.appliesTo(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean appliesTo(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testAppliesTo_2()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		boolean result = fixture.appliesTo(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean appliesTo(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testAppliesTo_3()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		boolean result = fixture.appliesTo(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean asResultOf(ChangeType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testAsResultOf_1()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));
		UnitTypeChange.ChangeType type = UnitTypeChange.ChangeType.CAPTURE;

		boolean result = fixture.asResultOf(type);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean asResultOf(ChangeType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testAsResultOf_2()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));
		UnitTypeChange.ChangeType type = UnitTypeChange.ChangeType.CAPTURE;

		boolean result = fixture.asResultOf(type);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean asResultOf(ChangeType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testAsResultOf_3()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));
		UnitTypeChange.ChangeType type = UnitTypeChange.ChangeType.CAPTURE;

		boolean result = fixture.asResultOf(type);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean canBeTaught() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testCanBeTaught_1()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));

		boolean result = fixture.canBeTaught();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean canBeTaught() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testCanBeTaught_2()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));

		boolean result = fixture.canBeTaught();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean canBeTaught() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testCanBeTaught_3()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(0);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));

		boolean result = fixture.canBeTaught();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the java.util.Map<UnitTypeChange.ChangeType, Integer> getChangeTypes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetChangeTypes_1()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));

		java.util.Map<UnitTypeChange.ChangeType, Integer> result = fixture.getChangeTypes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the UnitType getNewUnitType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetNewUnitType_1()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));

		UnitType result = fixture.getNewUnitType();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals(1000, result.getPriority());
		assertEquals(0, result.getSpace());
		assertEquals(3, result.getMovement());
		assertEquals(Integer.MIN_VALUE, result.getSkill());
		assertEquals(false, result.hasSkill());
		assertEquals(0, result.getBaseOffence());
		assertEquals(1, result.getBaseDefence());
		assertEquals(false, result.isNaval());
		assertEquals(0.0, result.getOffence(), 1.0);
		assertEquals(false, result.isOffensive());
		assertEquals(false, result.hasPrice());
		assertEquals(Integer.MIN_VALUE, result.getPrice());
		assertEquals(1, result.getLineOfSight());
		assertEquals(false, result.canCarryUnits());
		assertEquals(false, result.isRecruitable());
		assertEquals(1.0, result.getDefence(), 1.0);
		assertEquals(false, result.canCarryGoods());
		assertEquals(null, result.getSkillTaught());
		assertEquals(false, result.isPerson());
		assertEquals(1, result.getSpaceTaken());
		assertEquals(0, result.getRecruitProbability());
		assertEquals(0, result.getMaximumExperience());
		assertEquals(false, result.canMoveToHighSeas());
		assertEquals(Integer.MAX_VALUE, result.getMaximumAttrition());
		assertEquals(null, result.getExpertProduction());
		assertEquals(false, result.isDefaultUnitType());
		assertEquals(0, result.getHitPoints());
		assertEquals(false, result.canBuildColony());
		assertEquals(false, result.isDefensive());
		assertEquals(".workingAs", result.getWorkingAsKey());
		assertEquals("model.role.default", result.getDisplayRoleId());
		assertEquals(0, result.getScoreValue());
		assertEquals("unit-type", result.getXMLTagName());
		assertEquals(1, result.getRequiredPopulation());
		assertEquals(false, result.needsGoodsToBuild());
		assertEquals(".name", result.getNameKey());
		assertEquals(false, result.isAbstractType());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<unit-type id=\"\" offence=\"0\" defence=\"1\" default-unit=\"false\" movement=\"3\" line-of-sight=\"1\" score-value=\"0\" space=\"0\" space-taken=\"1\" hit-points=\"0\" maximum-experience=\"0\" recruit-probability=\"0\" priority=\"1000\"></unit-type>", result.serialize());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the int getProbability(ChangeType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetProbability_1()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));
		UnitTypeChange.ChangeType type = UnitTypeChange.ChangeType.CAPTURE;

		int result = fixture.getProbability(type);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getProbability(ChangeType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetProbability_2()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));
		UnitTypeChange.ChangeType type = UnitTypeChange.ChangeType.CAPTURE;

		int result = fixture.getProbability(type);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the List<Scope> getScopes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetScopes_1()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));

		List<Scope> result = fixture.getScopes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Scope> getScopes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetScopes_2()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(null);
		fixture.setNewUnitType(new UnitType("", new Specification()));

		List<Scope> result = fixture.getScopes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the int getTurnsToLearn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetTurnsToLearn_1()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));

		int result = fixture.getTurnsToLearn();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = UnitTypeChange.getXMLElementTagName();

		// add additional test code here
		assertEquals("upgrade", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("upgrade", result);
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.UnitTypeChange.readAttributes(UnitTypeChange.java:290)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.UnitTypeChange.readAttributes(UnitTypeChange.java:290)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadAttributes_3()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.UnitTypeChange.readAttributes(UnitTypeChange.java:290)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadAttributes_4()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.UnitTypeChange.readAttributes(UnitTypeChange.java:290)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadAttributes_5()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.UnitTypeChange.readAttributes(UnitTypeChange.java:290)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadAttributes_6()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.UnitTypeChange.readAttributes(UnitTypeChange.java:290)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadAttributes_7()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.UnitTypeChange.readAttributes(UnitTypeChange.java:290)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadAttributes_8()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.UnitTypeChange.readAttributes(UnitTypeChange.java:290)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadAttributes_9()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.UnitTypeChange.readAttributes(UnitTypeChange.java:290)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadAttributes_10()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.UnitTypeChange.readAttributes(UnitTypeChange.java:290)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadAttributes_11()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.UnitTypeChange.readAttributes(UnitTypeChange.java:290)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadAttributes_12()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.UnitTypeChange.readAttributes(UnitTypeChange.java:290)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadAttributes_13()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.UnitTypeChange.readAttributes(UnitTypeChange.java:290)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadAttributes_14()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.UnitTypeChange.readAttributes(UnitTypeChange.java:290)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadAttributes_15()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.UnitTypeChange.readAttributes(UnitTypeChange.java:290)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadAttributes_16()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.UnitTypeChange.readAttributes(UnitTypeChange.java:290)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadChild_1()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.UnitTypeChange.readChild(UnitTypeChange.java:335)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadChild_2()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.UnitTypeChange.readChild(UnitTypeChange.java:335)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadChild_3()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.UnitTypeChange.readChild(UnitTypeChange.java:335)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadChild_4()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.UnitTypeChange.readChild(UnitTypeChange.java:335)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadChildren_1()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.readChildren(FreeColObject.java:1274)
		//       at net.sf.freecol.common.model.UnitTypeChange.readChildren(UnitTypeChange.java:327)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadChildren_2()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.readChildren(FreeColObject.java:1274)
		//       at net.sf.freecol.common.model.UnitTypeChange.readChildren(UnitTypeChange.java:327)
	}

	/**
	 * Run the void setNewUnitType(UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testSetNewUnitType_1()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));
		UnitType newUnitType = new UnitType("", new Specification());

		fixture.setNewUnitType(newUnitType);

		// add additional test code here
	}

	/**
	 * Run the void setScopes(List<Scope>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testSetScopes_1()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));
		List<Scope> scopes = new ArrayList<Scope>();

		fixture.setScopes(scopes);

		// add additional test code here
	}

	/**
	 * Run the void setTurnsToLearn(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testSetTurnsToLearn_1()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));
		int newTurnsToLearn = 1;

		fixture.setTurnsToLearn(newTurnsToLearn);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[ 1]", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testToString_2()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[ 1]", result);
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testWriteAttributes_1()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(Integer.MIN_VALUE);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType((UnitType) null);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testWriteAttributes_2()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(Integer.MIN_VALUE);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType((UnitType) null);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testWriteAttributes_3()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(Integer.MIN_VALUE);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType((UnitType) null);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_4()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_5()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_6()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_7()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType((UnitType) null);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_8()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(Integer.MIN_VALUE);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_9()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_10()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType((UnitType) null);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_11()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(Integer.MIN_VALUE);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testWriteChildren_1()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testWriteChildren_2()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testWriteChildren_3()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testWriteChildren_4()
		throws Exception {
		UnitTypeChange fixture = new UnitTypeChange();
		fixture.setTurnsToLearn(1);
		fixture.setScopes(new ArrayList<Scope>());
		fixture.setNewUnitType(new UnitType("", new Specification()));
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
	 * @generatedBy CodePro at 5/14/18 4:37 PM
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
	 * @generatedBy CodePro at 5/14/18 4:37 PM
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
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(UnitTypeChangeTest.class);
	}
}