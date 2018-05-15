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
 * The class <code>RoleTest</code> contains tests for the class <code>{@link Role}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:19 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class RoleTest {
	/**
	 * Run the Role(String,Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testRole_1()
		throws Exception {
		String id = "";
		Specification specification = new Specification();

		Role result = new Role(id, specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals("role", result.getXMLTagName());
		assertEquals(false, result.isOffensive());
		assertEquals(0.0, result.getOffence(), 1.0);
		assertEquals(1, result.getMaximumCount());
		assertEquals("[Role ]", result.toFullString());
		assertEquals(null, result.getExpertUnit());
		assertEquals(null, result.getDowngrade());
		assertEquals(false, result.isDefaultRole());
		assertEquals("", result.getRoleSuffix());
		assertEquals(false, result.isDefensive());
		assertEquals(false, result.needsGoodsToBuild());
		assertEquals(1, result.getRequiredPopulation());
		assertEquals("", result.toString());
		assertEquals(".name", result.getNameKey());
		assertEquals(false, result.isAbstractType());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<role id=\"\"></role>", result.serialize());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the void addRoleChange(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testAddRoleChange_1()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);
		String from = "";
		String capture = "";

		fixture.addRoleChange(from, capture);

		// add additional test code here
	}

	/**
	 * Run the void addRoleChange(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testAddRoleChange_2()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);
		String from = "";
		String capture = "";

		fixture.addRoleChange(from, capture);

		// add additional test code here
	}

	/**
	 * Run the int compareTo(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testCompareTo_1()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);
		FreeColObject other = new Role("", new Specification());

		int result = fixture.compareTo(other);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int compareTo(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testCompareTo_2()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);
		FreeColObject other = new Role("", new Specification());

		int result = fixture.compareTo(other);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int compareTo(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testCompareTo_3()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);
		FreeColObject other = new AbstractGoods();

		int result = fixture.compareTo(other);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the String fixRoleId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testFixRoleId_1()
		throws Exception {
		String roleId = "";

		String result = Role.fixRoleId(roleId);

		// add additional test code here
		assertEquals("model.role.", result);
	}

	/**
	 * Run the String fixRoleId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testFixRoleId_2()
		throws Exception {
		String roleId = "";

		String result = Role.fixRoleId(roleId);

		// add additional test code here
		assertEquals("model.role.", result);
	}

	/**
	 * Run the List<Role> getAvailableRoles(Player,UnitType,List<Role>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testGetAvailableRoles_1()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		UnitType type = new UnitType("", new Specification());
		List<Role> roles = new ArrayList<Role>();

		List<Role> result = Role.getAvailableRoles(player, type, roles);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Role getDowngrade() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testGetDowngrade_1()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);

		Role result = fixture.getDowngrade();

		// add additional test code here
		assertNotNull(result);
		assertEquals("role", result.getXMLTagName());
		assertEquals(false, result.isOffensive());
		assertEquals(0.0, result.getOffence(), 1.0);
		assertEquals(1, result.getMaximumCount());
		assertEquals("[Role ]", result.toFullString());
		assertEquals(null, result.getExpertUnit());
		assertEquals(null, result.getDowngrade());
		assertEquals(false, result.isDefaultRole());
		assertEquals("", result.getRoleSuffix());
		assertEquals(false, result.isDefensive());
		assertEquals(false, result.needsGoodsToBuild());
		assertEquals(1, result.getRequiredPopulation());
		assertEquals("", result.toString());
		assertEquals(".name", result.getNameKey());
		assertEquals(false, result.isAbstractType());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<role id=\"\"></role>", result.serialize());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the UnitType getExpertUnit() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testGetExpertUnit_1()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);

		UnitType result = fixture.getExpertUnit();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals(1000, result.getPriority());
		assertEquals(0, result.getSpace());
		assertEquals(0, result.getScoreValue());
		assertEquals(1, result.getSpaceTaken());
		assertEquals("unit-type", result.getXMLTagName());
		assertEquals(false, result.isNaval());
		assertEquals(0, result.getBaseOffence());
		assertEquals(1, result.getBaseDefence());
		assertEquals(false, result.isOffensive());
		assertEquals(0.0, result.getOffence(), 1.0);
		assertEquals(Integer.MIN_VALUE, result.getPrice());
		assertEquals(false, result.hasPrice());
		assertEquals(1, result.getLineOfSight());
		assertEquals(false, result.hasSkill());
		assertEquals(3, result.getMovement());
		assertEquals(Integer.MIN_VALUE, result.getSkill());
		assertEquals(false, result.isRecruitable());
		assertEquals(false, result.canCarryUnits());
		assertEquals(false, result.isPerson());
		assertEquals(null, result.getSkillTaught());
		assertEquals(1.0, result.getDefence(), 1.0);
		assertEquals(false, result.canCarryGoods());
		assertEquals(".workingAs", result.getWorkingAsKey());
		assertEquals("model.role.default", result.getDisplayRoleId());
		assertEquals(0, result.getHitPoints());
		assertEquals(false, result.isDefensive());
		assertEquals(false, result.canBuildColony());
		assertEquals(null, result.getExpertProduction());
		assertEquals(false, result.isDefaultUnitType());
		assertEquals(0, result.getRecruitProbability());
		assertEquals(0, result.getMaximumExperience());
		assertEquals(false, result.canMoveToHighSeas());
		assertEquals(Integer.MAX_VALUE, result.getMaximumAttrition());
		assertEquals(false, result.needsGoodsToBuild());
		assertEquals(1, result.getRequiredPopulation());
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
	 * Run the List<AbstractGoods> getGoodsDifference(Role,int,Role,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testGetGoodsDifference_1()
		throws Exception {
		Role from = null;
		int fromCount = 1;
		Role to = new Role("", new Specification());
		int toCount = 1;

		List<AbstractGoods> result = Role.getGoodsDifference(from, fromCount, to, toCount);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<AbstractGoods> getGoodsDifference(Role,int,Role,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testGetGoodsDifference_2()
		throws Exception {
		Role from = null;
		int fromCount = 1;
		Role to = new Role("", new Specification());
		int toCount = 1;

		List<AbstractGoods> result = Role.getGoodsDifference(from, fromCount, to, toCount);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<AbstractGoods> getGoodsDifference(Role,int,Role,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testGetGoodsDifference_3()
		throws Exception {
		Role from = null;
		int fromCount = 1;
		Role to = new Role("", new Specification());
		int toCount = 1;

		List<AbstractGoods> result = Role.getGoodsDifference(from, fromCount, to, toCount);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<AbstractGoods> getGoodsDifference(Role,int,Role,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testGetGoodsDifference_4()
		throws Exception {
		Role from = new Role("", new Specification());
		int fromCount = 1;
		Role to = new Role("", new Specification());
		int toCount = 1;

		List<AbstractGoods> result = Role.getGoodsDifference(from, fromCount, to, toCount);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<AbstractGoods> getGoodsDifference(Role,int,Role,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testGetGoodsDifference_5()
		throws Exception {
		Role from = new Role("", new Specification());
		int fromCount = 1;
		Role to = new Role("", new Specification());
		int toCount = 1;

		List<AbstractGoods> result = Role.getGoodsDifference(from, fromCount, to, toCount);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<AbstractGoods> getGoodsDifference(Role,int,Role,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testGetGoodsDifference_6()
		throws Exception {
		Role from = null;
		int fromCount = 1;
		Role to = new Role("", new Specification());
		int toCount = 1;

		List<AbstractGoods> result = Role.getGoodsDifference(from, fromCount, to, toCount);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the int getMaximumCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testGetMaximumCount_1()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);

		int result = fixture.getMaximumCount();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the double getOffence() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testGetOffence_1()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);

		double result = fixture.getOffence();

		// add additional test code here
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the List<AbstractGoods> getRequiredGoods(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testGetRequiredGoods_1()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);
		int roleCount = 2;

		List<AbstractGoods> result = fixture.getRequiredGoods(roleCount);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<AbstractGoods> getRequiredGoods(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testGetRequiredGoods_2()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);
		int roleCount = 2;

		List<AbstractGoods> result = fixture.getRequiredGoods(roleCount);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<AbstractGoods> getRequiredGoods(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testGetRequiredGoods_3()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);
		int roleCount = 1;

		List<AbstractGoods> result = fixture.getRequiredGoods(roleCount);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<AbstractGoods> getRequiredGoods(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testGetRequiredGoods_4()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);
		int roleCount = 2;

		List<AbstractGoods> result = fixture.getRequiredGoods(roleCount);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the int getRequiredGoodsPrice(Market) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testGetRequiredGoodsPrice_1()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);
		Market market = new Market(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));

		int result = fixture.getRequiredGoodsPrice(market);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the List<Role.RoleChange> getRoleChanges() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testGetRoleChanges_1()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);

		List<Role.RoleChange> result = fixture.getRoleChanges();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Role.RoleChange> getRoleChanges() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testGetRoleChanges_2()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);

		List<Role.RoleChange> result = fixture.getRoleChanges();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getRoleSuffix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testGetRoleSuffix_1()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);

		String result = fixture.getRoleSuffix();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getRoleSuffix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testGetRoleSuffix_2()
		throws Exception {
		String roleId = "";

		String result = Role.getRoleSuffix(roleId);

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

		String result = Role.getXMLElementTagName();

		// add additional test code here
		assertEquals("role", result);
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
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("role", result);
	}

	/**
	 * Run the boolean isCompatibleWith(Role) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testIsCompatibleWith_1()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);
		Role other = new Role("", new Specification());

		boolean result = fixture.isCompatibleWith(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isCompatibleWith(Role) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testIsCompatibleWith_2()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);
		Role other = new Role("", new Specification());

		boolean result = fixture.isCompatibleWith(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isCompatibleWith(Role,Role) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testIsCompatibleWith_3()
		throws Exception {
		Role role1 = null;
		Role role2 = null;

		boolean result = Role.isCompatibleWith(role1, role2);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isCompatibleWith(Role,Role) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testIsCompatibleWith_4()
		throws Exception {
		Role role1 = null;
		Role role2 = new Role("", new Specification());

		boolean result = Role.isCompatibleWith(role1, role2);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isCompatibleWith(Role,Role) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testIsCompatibleWith_5()
		throws Exception {
		Role role1 = new Role("", new Specification());
		Role role2 = null;

		boolean result = Role.isCompatibleWith(role1, role2);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isCompatibleWith(Role,Role) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testIsCompatibleWith_6()
		throws Exception {
		Role role1 = new Role("", new Specification());
		Role role2 = new Role("", new Specification());

		boolean result = Role.isCompatibleWith(role1, role2);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isCompatibleWith(Role,Role) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testIsCompatibleWith_7()
		throws Exception {
		Role role1 = new Role("", new Specification());
		role1.setDowngrade(new Role("", new Specification()));
		Role role2 = new Role("", new Specification());
		role2.setDowngrade(new Role("", new Specification()));

		boolean result = Role.isCompatibleWith(role1, role2);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isCompatibleWith(Role,Role) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testIsCompatibleWith_8()
		throws Exception {
		Role role1 = new Role("", new Specification());
		Role role2 = new Role("", new Specification());
		role2.setDowngrade(new Role("", new Specification()));

		boolean result = Role.isCompatibleWith(role1, role2);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isCompatibleWith(Role,Role) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testIsCompatibleWith_9()
		throws Exception {
		Role role1 = new Role("", new Specification());
		role1.setDowngrade(new Role("", new Specification()));
		Role role2 = new Role("", new Specification());
		role2.setDowngrade(new Role("", new Specification()));

		boolean result = Role.isCompatibleWith(role1, role2);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isDefaultRole() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testIsDefaultRole_1()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);

		boolean result = fixture.isDefaultRole();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isDefaultRole() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testIsDefaultRole_2()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);

		boolean result = fixture.isDefaultRole();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isDefaultRoleId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testIsDefaultRoleId_1()
		throws Exception {
		String roleId = "model.role.default";

		boolean result = Role.isDefaultRoleId(roleId);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isDefaultRoleId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testIsDefaultRoleId_2()
		throws Exception {
		String roleId = "";

		boolean result = Role.isDefaultRoleId(roleId);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isDefensive() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testIsDefensive_1()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);

		boolean result = fixture.isDefensive();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isDefensive() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testIsDefensive_2()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);

		boolean result = fixture.isDefensive();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isOffensive() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testIsOffensive_1()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);

		boolean result = fixture.isOffensive();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isOffensive() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testIsOffensive_2()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);

		boolean result = fixture.isOffensive();

		// add additional test code here
		assertEquals(false, result);
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
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);
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
		//       at net.sf.freecol.common.model.Role.readAttributes(Role.java:482)
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
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);
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
		//       at net.sf.freecol.common.model.Role.readAttributes(Role.java:482)
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
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);
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
		//       at net.sf.freecol.common.model.Role.readAttributes(Role.java:482)
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
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);
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
		//       at net.sf.freecol.common.model.Role.readAttributes(Role.java:482)
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
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);
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
		//       at net.sf.freecol.common.model.Role.readAttributes(Role.java:482)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testReadChild_1()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.Role.readChild(Role.java:524)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testReadChild_2()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.Role.readChild(Role.java:524)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testReadChild_3()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.Role.readChild(Role.java:524)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testReadChild_4()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.Role.readChild(Role.java:524)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testReadChildren_1()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:801)
		//       at net.sf.freecol.common.model.Role.readChildren(Role.java:512)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testReadChildren_2()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:801)
		//       at net.sf.freecol.common.model.Role.readChildren(Role.java:512)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testReadChildren_3()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:801)
		//       at net.sf.freecol.common.model.Role.readChildren(Role.java:512)
	}

	/**
	 * Run the void setDowngrade(Role) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testSetDowngrade_1()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);
		Role newDowngrade = new Role("", new Specification());

		fixture.setDowngrade(newDowngrade);

		// add additional test code here
	}

	/**
	 * Run the void setExpertUnit(UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testSetExpertUnit_1()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);
		UnitType newExpertUnit = new UnitType("", new Specification());

		fixture.setExpertUnit(newExpertUnit);

		// add additional test code here
	}

	/**
	 * Run the void setMaximumCount(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testSetMaximumCount_1()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);
		int newMaximumCount = 1;

		fixture.setMaximumCount(newMaximumCount);

		// add additional test code here
	}

	/**
	 * Run the String toFullString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testToFullString_1()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);

		String result = fixture.toFullString();

		// add additional test code here
		assertEquals("[Role ]", result);
	}

	/**
	 * Run the String toFullString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testToFullString_2()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);

		String result = fixture.toFullString();

		// add additional test code here
		assertEquals("[Role ]", result);
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
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);
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
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);
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
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);
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
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade((Role) null);
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(2);
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
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(2);
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
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade((Role) null);
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(2);
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
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit((UnitType) null);
		fixture.setMaximumCount(2);
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
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade((Role) null);
		fixture.setExpertUnit((UnitType) null);
		fixture.setMaximumCount(2);
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
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);
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
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade((Role) null);
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);
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
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit((UnitType) null);
		fixture.setMaximumCount(1);
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
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade((Role) null);
		fixture.setExpertUnit((UnitType) null);
		fixture.setMaximumCount(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testWriteChildren_1()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testWriteChildren_2()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testWriteChildren_3()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testWriteChildren_4()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testWriteChildren_5()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testWriteChildren_6()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:19 PM
	 */
	@Test
	public void testWriteChildren_7()
		throws Exception {
		Role fixture = new Role("", new Specification());
		fixture.setDowngrade(new Role("", new Specification()));
		fixture.setExpertUnit(new UnitType("", new Specification()));
		fixture.setMaximumCount(1);
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
		new org.junit.runner.JUnitCore().run(RoleTest.class);
	}
}