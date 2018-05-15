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
 * The class <code>UnitTypeTest</code> contains tests for the class <code>{@link UnitType}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:37 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class UnitTypeTest {
	/**
	 * Run the UnitType(String,Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testUnitType_1()
		throws Exception {
		String id = "";
		Specification specification = new Specification();

		UnitType result = new UnitType(id, specification);

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
	 * Run the boolean canBeUpgraded(UnitType,ChangeType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testCanBeUpgraded_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		UnitType newType = new UnitType("", new Specification());
		UnitTypeChange.ChangeType changeType = UnitTypeChange.ChangeType.CAPTURE;

		boolean result = fixture.canBeUpgraded(newType, changeType);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean canBeUpgraded(UnitType,ChangeType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testCanBeUpgraded_2()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		UnitType newType = new UnitType("", new Specification());
		UnitTypeChange.ChangeType changeType = UnitTypeChange.ChangeType.CAPTURE;

		boolean result = fixture.canBeUpgraded(newType, changeType);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean canBuildColony() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testCanBuildColony_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		boolean result = fixture.canBuildColony();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean canBuildColony() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testCanBuildColony_2()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		boolean result = fixture.canBuildColony();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean canCarryGoods() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testCanCarryGoods_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		boolean result = fixture.canCarryGoods();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean canCarryGoods() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testCanCarryGoods_2()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		boolean result = fixture.canCarryGoods();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean canCarryUnits() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testCanCarryUnits_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		boolean result = fixture.canCarryUnits();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean canCarryUnits() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testCanCarryUnits_2()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		boolean result = fixture.canCarryUnits();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean canMoveToHighSeas() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testCanMoveToHighSeas_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		boolean result = fixture.canMoveToHighSeas();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean canMoveToHighSeas() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testCanMoveToHighSeas_2()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		boolean result = fixture.canMoveToHighSeas();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the int compareTo(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testCompareTo_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		FreeColObject other = new AbstractGoods();

		int result = fixture.compareTo(other);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int compareTo(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testCompareTo_2()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		FreeColObject other = new UnitType("", new Specification());

		int result = fixture.compareTo(other);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getBaseDefence() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetBaseDefence_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		int result = fixture.getBaseDefence();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getBaseOffence() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetBaseOffence_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		int result = fixture.getBaseOffence();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the List<AbstractGoods> getConsumedGoods() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetConsumedGoods_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		List<AbstractGoods> result = fixture.getConsumedGoods();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<AbstractGoods> getConsumedGoods() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetConsumedGoods_2()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		List<AbstractGoods> result = fixture.getConsumedGoods();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<AbstractGoods> getConsumedGoods() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetConsumedGoods_3()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		List<AbstractGoods> result = fixture.getConsumedGoods();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the int getConsumptionOf(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetConsumptionOf_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		GoodsType goodsType = new GoodsType("", new Specification());

		int result = fixture.getConsumptionOf(goodsType);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getConsumptionOf(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetConsumptionOf_2()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		GoodsType goodsType = new GoodsType("", new Specification());

		int result = fixture.getConsumptionOf(goodsType);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the Role getDefaultRole() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetDefaultRole_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		Role result = fixture.getDefaultRole();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.getOffence(), 1.0);
		assertEquals(false, result.isOffensive());
		assertEquals(1, result.getMaximumCount());
		assertEquals("[Role default]", result.toFullString());
		assertEquals("default", result.getRoleSuffix());
		assertEquals(true, result.isDefaultRole());
		assertEquals(false, result.isDefensive());
		assertEquals(null, result.getExpertUnit());
		assertEquals(null, result.getDowngrade());
		assertEquals("role", result.getXMLTagName());
		assertEquals(1, result.getRequiredPopulation());
		assertEquals(false, result.needsGoodsToBuild());
		assertEquals("model.role.default", result.toString());
		assertEquals("model.role.default.name", result.getNameKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("model.role.default.description", result.getDescriptionKey());
		assertEquals("model.role.default", result.getId());
		assertEquals("default", result.getSuffix());
		assertEquals("<role id=\"model.role.default\"></role>", result.serialize());
		assertEquals("model.role.default", result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the double getDefence() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetDefence_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		double result = fixture.getDefence();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the String getDisplayRoleId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetDisplayRoleId_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		String result = fixture.getDisplayRoleId();

		// add additional test code here
		assertEquals("model.role.default", result);
	}

	/**
	 * Run the String getDisplayRoleId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetDisplayRoleId_2()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		String result = fixture.getDisplayRoleId();

		// add additional test code here
		assertEquals("model.role.default", result);
	}

	/**
	 * Run the int getEducationTurns(UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetEducationTurns_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		UnitType unitType = new UnitType("", new Specification());

		int result = fixture.getEducationTurns(unitType);

		// add additional test code here
		assertEquals(Integer.MIN_VALUE, result);
	}

	/**
	 * Run the int getEducationTurns(UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetEducationTurns_2()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		UnitType unitType = new UnitType("", new Specification());

		int result = fixture.getEducationTurns(unitType);

		// add additional test code here
		assertEquals(Integer.MIN_VALUE, result);
	}

	/**
	 * Run the UnitType getEducationUnit(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetEducationUnit_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		int maximumSkill = 1;

		UnitType result = fixture.getEducationUnit(maximumSkill);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the GoodsType getExpertProduction() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetExpertProduction_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		GoodsType result = fixture.getExpertProduction();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<Role> getExpertRoles() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetExpertRoles_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		List<Role> result = fixture.getExpertRoles();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the int getHitPoints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetHitPoints_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		int result = fixture.getHitPoints();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getLineOfSight() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetLineOfSight_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		int result = fixture.getLineOfSight();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getMaximumAttrition() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetMaximumAttrition_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		int result = fixture.getMaximumAttrition();

		// add additional test code here
		assertEquals(Integer.MAX_VALUE, result);
	}

	/**
	 * Run the int getMaximumExperience() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetMaximumExperience_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		int result = fixture.getMaximumExperience();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getMovement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetMovement_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		int result = fixture.getMovement();

		// add additional test code here
		assertEquals(3, result);
	}

	/**
	 * Run the double getOffence() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetOffence_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		double result = fixture.getOffence();

		// add additional test code here
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the int getPrice() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetPrice_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		int result = fixture.getPrice();

		// add additional test code here
		assertEquals(Integer.MIN_VALUE, result);
	}

	/**
	 * Run the int getPriority() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetPriority_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		int result = fixture.getPriority();

		// add additional test code here
		assertEquals(1000, result);
	}

	/**
	 * Run the int getRecruitProbability() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetRecruitProbability_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		int result = fixture.getRecruitProbability();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getScoreValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetScoreValue_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		int result = fixture.getScoreValue();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getSkill() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetSkill_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		int result = fixture.getSkill();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the UnitType getSkillTaught() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetSkillTaught_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		UnitType result = fixture.getSkillTaught();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the int getSpace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetSpace_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		int result = fixture.getSpace();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getSpaceTaken() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetSpaceTaken_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		int result = fixture.getSpaceTaken();

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the UnitType getTargetType(ChangeType,Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetTargetType_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		UnitTypeChange.ChangeType changeType = UnitTypeChange.ChangeType.CAPTURE;
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		UnitType result = fixture.getTargetType(changeType, player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the UnitType getTargetType(ChangeType,Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetTargetType_2()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		UnitTypeChange.ChangeType changeType = UnitTypeChange.ChangeType.CAPTURE;
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		UnitType result = fixture.getTargetType(changeType, player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<UnitTypeChange> getTypeChanges() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetTypeChanges_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		List<UnitTypeChange> result = fixture.getTypeChanges();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<UnitTypeChange> getTypeChanges() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetTypeChanges_2()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(null);

		List<UnitTypeChange> result = fixture.getTypeChanges();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the UnitTypeChange getUnitTypeChange(UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetUnitTypeChange_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		UnitType newType = new UnitType("", new Specification());

		UnitTypeChange result = fixture.getUnitTypeChange(newType);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the UnitTypeChange getUnitTypeChange(ChangeType,Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetUnitTypeChange_2()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		UnitTypeChange.ChangeType changeType = UnitTypeChange.ChangeType.CAPTURE;
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		UnitTypeChange result = fixture.getUnitTypeChange(changeType, player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<UnitType> getUnitTypesLearntInLostCity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetUnitTypesLearntInLostCity_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		List<UnitType> result = fixture.getUnitTypesLearntInLostCity();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<UnitType> getUnitTypesLearntInLostCity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetUnitTypesLearntInLostCity_2()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		List<UnitType> result = fixture.getUnitTypesLearntInLostCity();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<UnitType> getUnitTypesLearntInLostCity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetUnitTypesLearntInLostCity_3()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		List<UnitType> result = fixture.getUnitTypesLearntInLostCity();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getWorkingAsKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetWorkingAsKey_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		String result = fixture.getWorkingAsKey();

		// add additional test code here
		assertEquals(".workingAs", result);
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

		String result = UnitType.getXMLElementTagName();

		// add additional test code here
		assertEquals("unit-type", result);
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
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("unit-type", result);
	}

	/**
	 * Run the boolean hasPrice() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testHasPrice_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		boolean result = fixture.hasPrice();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasPrice() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testHasPrice_2()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		boolean result = fixture.hasPrice();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasSkill() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testHasSkill_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		boolean result = fixture.hasSkill();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean hasSkill() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testHasSkill_2()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(Integer.MIN_VALUE);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		boolean result = fixture.hasSkill();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isDefaultUnitType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testIsDefaultUnitType_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		boolean result = fixture.isDefaultUnitType();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isDefaultUnitType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testIsDefaultUnitType_2()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		boolean result = fixture.isDefaultUnitType();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isDefensive() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testIsDefensive_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		boolean result = fixture.isDefensive();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isDefensive() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testIsDefensive_2()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		boolean result = fixture.isDefensive();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isNaval() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testIsNaval_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		boolean result = fixture.isNaval();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isNaval() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testIsNaval_2()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		boolean result = fixture.isNaval();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isOffensive() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testIsOffensive_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		boolean result = fixture.isOffensive();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isOffensive() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testIsOffensive_2()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		boolean result = fixture.isOffensive();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isPerson() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testIsPerson_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		boolean result = fixture.isPerson();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isPerson() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testIsPerson_2()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		boolean result = fixture.isPerson();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isRecruitable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testIsRecruitable_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		boolean result = fixture.isRecruitable();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isRecruitable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testIsRecruitable_2()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		boolean result = fixture.isRecruitable();

		// add additional test code here
		assertEquals(false, result);
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
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
		//       at net.sf.freecol.common.model.BuildableType.readAttributes(BuildableType.java:288)
		//       at net.sf.freecol.common.model.UnitType.readAttributes(UnitType.java:801)
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
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
		//       at net.sf.freecol.common.model.BuildableType.readAttributes(BuildableType.java:288)
		//       at net.sf.freecol.common.model.UnitType.readAttributes(UnitType.java:801)
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
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
		//       at net.sf.freecol.common.model.BuildableType.readAttributes(BuildableType.java:288)
		//       at net.sf.freecol.common.model.UnitType.readAttributes(UnitType.java:801)
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
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
		//       at net.sf.freecol.common.model.BuildableType.readAttributes(BuildableType.java:288)
		//       at net.sf.freecol.common.model.UnitType.readAttributes(UnitType.java:801)
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
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
		//       at net.sf.freecol.common.model.BuildableType.readAttributes(BuildableType.java:288)
		//       at net.sf.freecol.common.model.UnitType.readAttributes(UnitType.java:801)
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
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
		//       at net.sf.freecol.common.model.BuildableType.readAttributes(BuildableType.java:288)
		//       at net.sf.freecol.common.model.UnitType.readAttributes(UnitType.java:801)
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
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
		//       at net.sf.freecol.common.model.BuildableType.readAttributes(BuildableType.java:288)
		//       at net.sf.freecol.common.model.UnitType.readAttributes(UnitType.java:801)
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
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
		//       at net.sf.freecol.common.model.BuildableType.readAttributes(BuildableType.java:288)
		//       at net.sf.freecol.common.model.UnitType.readAttributes(UnitType.java:801)
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
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
		//       at net.sf.freecol.common.model.BuildableType.readAttributes(BuildableType.java:288)
		//       at net.sf.freecol.common.model.UnitType.readAttributes(UnitType.java:801)
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
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
		//       at net.sf.freecol.common.model.BuildableType.readAttributes(BuildableType.java:288)
		//       at net.sf.freecol.common.model.UnitType.readAttributes(UnitType.java:801)
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
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
		//       at net.sf.freecol.common.model.BuildableType.readAttributes(BuildableType.java:288)
		//       at net.sf.freecol.common.model.UnitType.readAttributes(UnitType.java:801)
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
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
		//       at net.sf.freecol.common.model.BuildableType.readAttributes(BuildableType.java:288)
		//       at net.sf.freecol.common.model.UnitType.readAttributes(UnitType.java:801)
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
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
		//       at net.sf.freecol.common.model.BuildableType.readAttributes(BuildableType.java:288)
		//       at net.sf.freecol.common.model.UnitType.readAttributes(UnitType.java:801)
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
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
		//       at net.sf.freecol.common.model.BuildableType.readAttributes(BuildableType.java:288)
		//       at net.sf.freecol.common.model.UnitType.readAttributes(UnitType.java:801)
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
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
		//       at net.sf.freecol.common.model.BuildableType.readAttributes(BuildableType.java:288)
		//       at net.sf.freecol.common.model.UnitType.readAttributes(UnitType.java:801)
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
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
		//       at net.sf.freecol.common.model.BuildableType.readAttributes(BuildableType.java:288)
		//       at net.sf.freecol.common.model.UnitType.readAttributes(UnitType.java:801)
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
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.UnitType.readChild(UnitType.java:966)
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
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.UnitType.readChild(UnitType.java:966)
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
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.UnitType.readChild(UnitType.java:966)
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
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.UnitType.readChild(UnitType.java:966)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadChild_5()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.UnitType.readChild(UnitType.java:966)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadChild_6()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.UnitType.readChild(UnitType.java:966)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadChild_7()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.UnitType.readChild(UnitType.java:966)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadChild_8()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.UnitType.readChild(UnitType.java:966)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadChild_9()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(null);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.UnitType.readChild(UnitType.java:966)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadChild_10()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.UnitType.readChild(UnitType.java:966)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadChild_11()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.UnitType.readChild(UnitType.java:966)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadChild_12()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.UnitType.readChild(UnitType.java:966)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadChild_13()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.UnitType.readChild(UnitType.java:966)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadChild_14()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.UnitType.readChild(UnitType.java:966)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadChild_15()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.UnitType.readChild(UnitType.java:966)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadChild_16()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.UnitType.readChild(UnitType.java:966)
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
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:801)
		//       at net.sf.freecol.common.model.UnitType.readChildren(UnitType.java:909)
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
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:801)
		//       at net.sf.freecol.common.model.UnitType.readChildren(UnitType.java:909)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadChildren_3()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:801)
		//       at net.sf.freecol.common.model.UnitType.readChildren(UnitType.java:909)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadChildren_4()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:801)
		//       at net.sf.freecol.common.model.UnitType.readChildren(UnitType.java:909)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadChildren_5()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:801)
		//       at net.sf.freecol.common.model.UnitType.readChildren(UnitType.java:909)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadChildren_6()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:801)
		//       at net.sf.freecol.common.model.UnitType.readChildren(UnitType.java:909)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadChildren_7()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:801)
		//       at net.sf.freecol.common.model.UnitType.readChildren(UnitType.java:909)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadChildren_8()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(null);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:801)
		//       at net.sf.freecol.common.model.UnitType.readChildren(UnitType.java:909)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadChildren_9()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:801)
		//       at net.sf.freecol.common.model.UnitType.readChildren(UnitType.java:909)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadChildren_10()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:801)
		//       at net.sf.freecol.common.model.UnitType.readChildren(UnitType.java:909)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadChildren_11()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:801)
		//       at net.sf.freecol.common.model.UnitType.readChildren(UnitType.java:909)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadChildren_12()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:801)
		//       at net.sf.freecol.common.model.UnitType.readChildren(UnitType.java:909)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadChildren_13()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(null);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:801)
		//       at net.sf.freecol.common.model.UnitType.readChildren(UnitType.java:909)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadChildren_14()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:801)
		//       at net.sf.freecol.common.model.UnitType.readChildren(UnitType.java:909)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testReadChildren_15()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:801)
		//       at net.sf.freecol.common.model.UnitType.readChildren(UnitType.java:909)
	}

	/**
	 * Run the void setSkill(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testSetSkill_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		int newSkill = 1;

		fixture.setSkill(newSkill);

		// add additional test code here
	}

	/**
	 * Run the void setSpace(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testSetSpace_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		int newSpace = 1;

		fixture.setSpace(newSpace);

		// add additional test code here
	}

	/**
	 * Run the void setSpaceTaken(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testSetSpaceTaken_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		int newSpaceTaken = 1;

		fixture.setSpaceTaken(newSpaceTaken);

		// add additional test code here
	}

	/**
	 * Run the void setTypeChanges(List<UnitTypeChange>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testSetTypeChanges_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
		List<UnitTypeChange> typeChanges = new ArrayList<UnitTypeChange>();

		fixture.setTypeChanges(typeChanges);

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
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());

		String result = fixture.toString();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_1()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(Integer.MIN_VALUE);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
	public void testWriteAttributes_2()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
	public void testWriteAttributes_3()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(Integer.MIN_VALUE);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(Integer.MIN_VALUE);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(Integer.MIN_VALUE);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(Integer.MIN_VALUE);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
	public void testWriteAttributes_12()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(Integer.MIN_VALUE);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
	public void testWriteAttributes_13()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
	public void testWriteAttributes_14()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
	public void testWriteAttributes_15()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(Integer.MIN_VALUE);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
	public void testWriteAttributes_16()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(Integer.MIN_VALUE);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
	public void testWriteChildren_5()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
	public void testWriteChildren_6()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
	public void testWriteChildren_7()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
	public void testWriteChildren_8()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
	public void testWriteChildren_9()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
	public void testWriteChildren_10()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
	public void testWriteChildren_11()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
	public void testWriteChildren_12()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
	public void testWriteChildren_13()
		throws Exception {
		UnitType fixture = new UnitType("", new Specification());
		fixture.setSpace(1);
		fixture.setSkill(1);
		fixture.setSpaceTaken(1);
		fixture.setTypeChanges(new ArrayList<UnitTypeChange>());
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
		new org.junit.runner.JUnitCore().run(UnitTypeTest.class);
	}
}