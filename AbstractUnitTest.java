package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import java.util.ArrayList;
import java.util.List;
import javax.xml.stream.XMLStreamException;
import net.sf.freecol.common.io.FreeColXMLReader;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AbstractUnitTest</code> contains tests for the class <code>{@link AbstractUnit}</code>.
 *
 * @generatedBy CodePro at 5/14/18 2:24 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class AbstractUnitTest {
	/**
	 * Run the AbstractUnit() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:24 PM
	 */
	@Test
	public void testAbstractUnit_1()
		throws Exception {

		AbstractUnit result = new AbstractUnit();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1 null (model.role.default)", result.toString());
		assertEquals(1, result.getNumber());
		assertEquals("model.role.default", result.getRoleId());
		assertEquals("abstractUnit", result.getXMLTagName());
		assertEquals("", result.getDescription());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals("<abstractUnit role=\"model.role.default\" number=\"1\"></abstractUnit>", result.serialize());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the AbstractUnit(FreeColXMLReader) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:24 PM
	 */
	@Test
	public void testAbstractUnit_2()
		throws Exception {
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		AbstractUnit result = new AbstractUnit(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.AbstractUnit.<init>(AbstractUnit.java:80)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractUnit(FreeColXMLReader) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:24 PM
	 */
	@Test
	public void testAbstractUnit_3()
		throws Exception {
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		AbstractUnit result = new AbstractUnit(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.AbstractUnit.<init>(AbstractUnit.java:80)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractUnit(String,String,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:24 PM
	 */
	@Test
	public void testAbstractUnit_4()
		throws Exception {
		String id = "";
		String roleId = "";
		int number = 1;

		AbstractUnit result = new AbstractUnit(id, roleId, number);

		// add additional test code here
		assertNotNull(result);
		assertEquals("1  ()", result.toString());
		assertEquals(1, result.getNumber());
		assertEquals("", result.getRoleId());
		assertEquals("abstractUnit", result.getXMLTagName());
		assertEquals("", result.getDescription());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals("<abstractUnit id=\"\" role=\"\" number=\"1\"></abstractUnit>", result.serialize());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the AbstractUnit(UnitType,String,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:24 PM
	 */
	@Test
	public void testAbstractUnit_5()
		throws Exception {
		UnitType unitType = new UnitType("", new Specification());
		String roleId = "";
		int number = 1;

		AbstractUnit result = new AbstractUnit(unitType, roleId, number);

		// add additional test code here
		assertNotNull(result);
		assertEquals("1  ()", result.toString());
		assertEquals(1, result.getNumber());
		assertEquals("", result.getRoleId());
		assertEquals("abstractUnit", result.getXMLTagName());
		assertEquals("", result.getDescription());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals("<abstractUnit id=\"\" role=\"\" number=\"1\"></abstractUnit>", result.serialize());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the double calculateStrength(Specification,List<AbstractUnit>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:24 PM
	 */
	@Test
	public void testCalculateStrength_1()
		throws Exception {
		Specification spec = new Specification();
		List<AbstractUnit> units = new ArrayList<AbstractUnit>();

		double result = AbstractUnit.calculateStrength(spec, units);

		// add additional test code here
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the List<AbstractUnit> deepCopy(List<AbstractUnit>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:24 PM
	 */
	@Test
	public void testDeepCopy_1()
		throws Exception {
		List<AbstractUnit> units = new ArrayList<AbstractUnit>();

		List<AbstractUnit> result = AbstractUnit.deepCopy(units);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<AbstractUnit> deepCopy(List<AbstractUnit>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:24 PM
	 */
	@Test
	public void testDeepCopy_2()
		throws Exception {
		List<AbstractUnit> units = new ArrayList<AbstractUnit>();

		List<AbstractUnit> result = AbstractUnit.deepCopy(units);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:24 PM
	 */
	@Test
	public void testGetDescription_1()
		throws Exception {
		AbstractUnit fixture = new AbstractUnit("", "", 1);

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the StringTemplate getLabel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:24 PM
	 */
	@Test
	public void testGetLabel_1()
		throws Exception {
		AbstractUnit fixture = new AbstractUnit("", "", 1);

		StringTemplate result = fixture.getLabel();

		// add additional test code here
		assertNotNull(result);
		assertEquals("TEMPLATE: model.abstractUnit.label [[%number%: NAME: 1][%unit%: LABEL: KEY: .nameNAME:  (TEMPLATE: .name [[%number%: NAME: 1]]NAME: )]]", result.toString());
		assertEquals("stringTemplate", result.getXMLTagName());
		assertEquals(null, result.getDefaultId());
		assertEquals("model.abstractUnit.label", result.getId());
		assertEquals("label", result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("model.abstractUnit.label", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals("<stringTemplate id=\"model.abstractUnit.label\" templateType=\"template\"><key value=\"%number%\"></key><key value=\"%unit%\"></key><stringTemplate id=\"1\" templateType=\"name\"></stringTemplate><stringTemplate id=\"\" templateType=\"label\"><stringTemplate id=\".name\" templateType=\"key\"></stringTemplate><stringTemplate id=\" (\" templateType=\"name\"></stringTemplate><stringTemplate id=\".name\" templateType=\"template\"><key value=\"%number%\"></key><stringTemplate id=\"1\" templateType=\"name\"></stringTemplate></stringTemplate><stringTemplate id=\")\" templateType=\"name\"></stringTemplate></stringTemplate></stringTemplate>", result.serialize());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the StringTemplate getListLabel(String,List<AbstractUnit>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:24 PM
	 */
	@Test
	public void testGetListLabel_1()
		throws Exception {
		String base = "";
		List<AbstractUnit> units = new ArrayList<AbstractUnit>();

		StringTemplate result = AbstractUnit.getListLabel(base, units);

		// add additional test code here
		assertNotNull(result);
		assertEquals("LABEL: ", result.toString());
		assertEquals("stringTemplate", result.getXMLTagName());
		assertEquals(null, result.getDefaultId());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals("<stringTemplate id=\"\" templateType=\"label\"></stringTemplate>", result.serialize());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the StringTemplate getListLabel(String,List<AbstractUnit>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:24 PM
	 */
	@Test
	public void testGetListLabel_2()
		throws Exception {
		String base = "";
		List<AbstractUnit> units = new ArrayList<AbstractUnit>();

		StringTemplate result = AbstractUnit.getListLabel(base, units);

		// add additional test code here
		assertNotNull(result);
		assertEquals("LABEL: ", result.toString());
		assertEquals("stringTemplate", result.getXMLTagName());
		assertEquals(null, result.getDefaultId());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals("<stringTemplate id=\"\" templateType=\"label\"></stringTemplate>", result.serialize());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the int getNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:24 PM
	 */
	@Test
	public void testGetNumber_1()
		throws Exception {
		AbstractUnit fixture = new AbstractUnit("", "", 1);

		int result = fixture.getNumber();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the double getOffence(Specification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:24 PM
	 */
	@Test
	public void testGetOffence_1()
		throws Exception {
		AbstractUnit fixture = new AbstractUnit("", "", 1);
		Specification spec = new Specification();

		double result = fixture.getOffence(spec);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: Cannot cast net.sf.freecol.common.model.Role to net.sf.freecol.common.model.UnitType
		//       at java.lang.Class.cast(Unknown Source)
		//       at net.sf.freecol.common.model.Specification.getType(Specification.java:1777)
		//       at net.sf.freecol.common.model.Specification.getUnitType(Specification.java:1424)
		//       at net.sf.freecol.common.model.AbstractUnit.getOffence(AbstractUnit.java:172)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the Role getRole(Specification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:24 PM
	 */
	@Test
	public void testGetRole_1()
		throws Exception {
		AbstractUnit fixture = new AbstractUnit("", "", 1);
		Specification spec = new Specification();

		Role result = fixture.getRole(spec);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isDefaultRole());
		assertEquals("", result.getRoleSuffix());
		assertEquals(null, result.getDowngrade());
		assertEquals("[Role ]", result.toFullString());
		assertEquals(0.0, result.getOffence(), 1.0);
		assertEquals("role", result.getXMLTagName());
		assertEquals(false, result.isDefensive());
		assertEquals(false, result.isOffensive());
		assertEquals(null, result.getExpertUnit());
		assertEquals(1, result.getMaximumCount());
		assertEquals(false, result.needsGoodsToBuild());
		assertEquals(1, result.getRequiredPopulation());
		assertEquals("", result.toString());
		assertEquals(".name", result.getNameKey());
		assertEquals(false, result.isAbstractType());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals("<role id=\"\"></role>", result.serialize());
	}

	/**
	 * Run the String getRoleId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:24 PM
	 */
	@Test
	public void testGetRoleId_1()
		throws Exception {
		AbstractUnit fixture = new AbstractUnit("", "", 1);

		String result = fixture.getRoleId();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the UnitType getType(Specification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:24 PM
	 */
	@Test
	public void testGetType_1()
		throws Exception {
		AbstractUnit fixture = new AbstractUnit("", "", 1);
		Specification spec = new Specification();

		UnitType result = fixture.getType(spec);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals(1000, result.getPriority());
		assertEquals(0, result.getSpace());
		assertEquals(0.0, result.getOffence(), 1.0);
		assertEquals("unit-type", result.getXMLTagName());
		assertEquals(false, result.isDefensive());
		assertEquals(false, result.canCarryUnits());
		assertEquals(false, result.canCarryGoods());
		assertEquals(3, result.getMovement());
		assertEquals(null, result.getSkillTaught());
		assertEquals(1, result.getLineOfSight());
		assertEquals(0, result.getHitPoints());
		assertEquals(false, result.isNaval());
		assertEquals(false, result.isPerson());
		assertEquals(".workingAs", result.getWorkingAsKey());
		assertEquals("model.role.default", result.getDisplayRoleId());
		assertEquals(Integer.MIN_VALUE, result.getPrice());
		assertEquals(false, result.isRecruitable());
		assertEquals(false, result.hasSkill());
		assertEquals(false, result.isOffensive());
		assertEquals(1.0, result.getDefence(), 1.0);
		assertEquals(1, result.getBaseDefence());
		assertEquals(1, result.getSpaceTaken());
		assertEquals(Integer.MIN_VALUE, result.getSkill());
		assertEquals(0, result.getScoreValue());
		assertEquals(0, result.getBaseOffence());
		assertEquals(false, result.canBuildColony());
		assertEquals(false, result.hasPrice());
		assertEquals(false, result.canMoveToHighSeas());
		assertEquals(false, result.isDefaultUnitType());
		assertEquals(0, result.getRecruitProbability());
		assertEquals(null, result.getExpertProduction());
		assertEquals(Integer.MAX_VALUE, result.getMaximumAttrition());
		assertEquals(0, result.getMaximumExperience());
		assertEquals(false, result.needsGoodsToBuild());
		assertEquals(1, result.getRequiredPopulation());
		assertEquals(".name", result.getNameKey());
		assertEquals(false, result.isAbstractType());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals("<unit-type id=\"\" offence=\"0\" defence=\"1\" default-unit=\"false\" movement=\"3\" line-of-sight=\"1\" score-value=\"0\" space=\"0\" space-taken=\"1\" hit-points=\"0\" maximum-experience=\"0\" recruit-probability=\"0\" priority=\"1000\"></unit-type>", result.serialize());
	}

	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:24 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = AbstractUnit.getXMLElementTagName();

		// add additional test code here
		assertEquals("abstractUnit", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:24 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		AbstractUnit fixture = new AbstractUnit("", "", 1);

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("abstractUnit", result);
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:24 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		AbstractUnit fixture = new AbstractUnit("", "", 1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.FreeColObject.readAttributes(FreeColObject.java:1257)
		//       at net.sf.freecol.common.model.AbstractUnit.readAttributes(AbstractUnit.java:243)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:24 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		AbstractUnit fixture = new AbstractUnit("", "", 1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.FreeColObject.readAttributes(FreeColObject.java:1257)
		//       at net.sf.freecol.common.model.AbstractUnit.readAttributes(AbstractUnit.java:243)
	}

	/**
	 * Run the void setNumber(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:24 PM
	 */
	@Test
	public void testSetNumber_1()
		throws Exception {
		AbstractUnit fixture = new AbstractUnit("", "", 1);
		int newNumber = 1;

		fixture.setNumber(newNumber);

		// add additional test code here
	}

	/**
	 * Run the void setRoleId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:24 PM
	 */
	@Test
	public void testSetRoleId_1()
		throws Exception {
		AbstractUnit fixture = new AbstractUnit("", "", 1);
		String roleId = "";

		fixture.setRoleId(roleId);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:24 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		AbstractUnit fixture = new AbstractUnit("", "", 1);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("1  ()", result);
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:24 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_1()
		throws Exception {
		AbstractUnit fixture = new AbstractUnit("", "", 1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:24 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_2()
		throws Exception {
		AbstractUnit fixture = new AbstractUnit("", "", 1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:24 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_3()
		throws Exception {
		AbstractUnit fixture = new AbstractUnit("", "", 1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:24 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_4()
		throws Exception {
		AbstractUnit fixture = new AbstractUnit("", "", 1);
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
	 * @generatedBy CodePro at 5/14/18 2:24 PM
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
	 * @generatedBy CodePro at 5/14/18 2:24 PM
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
	 * @generatedBy CodePro at 5/14/18 2:24 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AbstractUnitTest.class);
	}
}