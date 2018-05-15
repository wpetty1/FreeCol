package net.sf.freecol.common.model;

import java.util.List;
import java.util.Random;
import java.util.Set;
import javax.imageio.metadata.IIOMetadataNode;
import org.junit.*;
import net.sf.freecol.common.util.LogBuilder;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>SimpleCombatModelTest</code> contains tests for the class <code>{@link SimpleCombatModel}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:24 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class SimpleCombatModelTest {
	/**
	 * Run the SimpleCombatModel() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:24 PM
	 */
	@Test
	public void testSimpleCombatModel_1()
		throws Exception {

		SimpleCombatModel result = new SimpleCombatModel();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CombatModel.CombatOdds calculateCombatOdds(FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:24 PM
	 */
	@Test
	public void testCalculateCombatOdds_1()
		throws Exception {
		SimpleCombatModel fixture = new SimpleCombatModel();
		FreeColGameObject attacker = new Region(new Game(new IIOMetadataNode(), ""));
		FreeColGameObject defender = new Region(new Game(new IIOMetadataNode(), ""));

		CombatModel.CombatOdds result = fixture.calculateCombatOdds(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<CombatModel.CombatResult> generateAttackResult(Random,FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:24 PM
	 */
	@Test
	public void testGenerateAttackResult_1()
		throws Exception {
		SimpleCombatModel fixture = new SimpleCombatModel();
		Random random = new Random();
		FreeColGameObject attacker = new Region(new Game(new IIOMetadataNode(), ""));
		FreeColGameObject defender = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		List<CombatModel.CombatResult> result = fixture.generateAttackResult(random, attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<CombatModel.CombatResult> generateAttackResult(Random,FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:24 PM
	 */
	@Test
	public void testGenerateAttackResult_2()
		throws Exception {
		SimpleCombatModel fixture = new SimpleCombatModel();
		Random random = new Random();
		FreeColGameObject attacker = new Region(new Game(new IIOMetadataNode(), ""));
		FreeColGameObject defender = new Region(new Game(new IIOMetadataNode(), ""));

		List<CombatModel.CombatResult> result = fixture.generateAttackResult(random, attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<CombatModel.CombatResult> generateAttackResult(Random,FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:24 PM
	 */
	@Test
	public void testGenerateAttackResult_3()
		throws Exception {
		SimpleCombatModel fixture = new SimpleCombatModel();
		Random random = new Random();
		FreeColGameObject attacker = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		FreeColGameObject defender = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		List<CombatModel.CombatResult> result = fixture.generateAttackResult(random, attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<CombatModel.CombatResult> generateAttackResult(Random,FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:24 PM
	 */
	@Test
	public void testGenerateAttackResult_4()
		throws Exception {
		SimpleCombatModel fixture = new SimpleCombatModel();
		Random random = new Random();
		FreeColGameObject attacker = new Region(new Game(new IIOMetadataNode(), ""));
		FreeColGameObject defender = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		List<CombatModel.CombatResult> result = fixture.generateAttackResult(random, attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<CombatModel.CombatResult> generateAttackResult(Random,FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:24 PM
	 */
	@Test
	public void testGenerateAttackResult_5()
		throws Exception {
		SimpleCombatModel fixture = new SimpleCombatModel();
		Random random = new Random();
		FreeColGameObject attacker = new Region(new Game(new IIOMetadataNode(), ""));
		FreeColGameObject defender = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		List<CombatModel.CombatResult> result = fixture.generateAttackResult(random, attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<CombatModel.CombatResult> generateAttackResult(Random,FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:24 PM
	 */
	@Test
	public void testGenerateAttackResult_6()
		throws Exception {
		SimpleCombatModel fixture = new SimpleCombatModel();
		Random random = new Random();
		FreeColGameObject attacker = new Region(new Game(new IIOMetadataNode(), ""));
		FreeColGameObject defender = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		List<CombatModel.CombatResult> result = fixture.generateAttackResult(random, attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<CombatModel.CombatResult> generateAttackResult(Random,FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:24 PM
	 */
	@Test
	public void testGenerateAttackResult_7()
		throws Exception {
		SimpleCombatModel fixture = new SimpleCombatModel();
		Random random = new Random();
		FreeColGameObject attacker = new Region(new Game(new IIOMetadataNode(), ""));
		FreeColGameObject defender = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		List<CombatModel.CombatResult> result = fixture.generateAttackResult(random, attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<CombatModel.CombatResult> generateAttackResult(Random,FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:24 PM
	 */
	@Test
	public void testGenerateAttackResult_8()
		throws Exception {
		SimpleCombatModel fixture = new SimpleCombatModel();
		Random random = new Random();
		FreeColGameObject attacker = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		FreeColGameObject defender = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		List<CombatModel.CombatResult> result = fixture.generateAttackResult(random, attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<CombatModel.CombatResult> generateAttackResult(Random,FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:24 PM
	 */
	@Test
	public void testGenerateAttackResult_9()
		throws Exception {
		SimpleCombatModel fixture = new SimpleCombatModel();
		Random random = new Random();
		FreeColGameObject attacker = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		FreeColGameObject defender = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		List<CombatModel.CombatResult> result = fixture.generateAttackResult(random, attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<CombatModel.CombatResult> generateAttackResult(Random,FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:24 PM
	 */
	@Test
	public void testGenerateAttackResult_10()
		throws Exception {
		SimpleCombatModel fixture = new SimpleCombatModel();
		Random random = new Random();
		FreeColGameObject attacker = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		FreeColGameObject defender = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		List<CombatModel.CombatResult> result = fixture.generateAttackResult(random, attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<CombatModel.CombatResult> generateAttackResult(Random,FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:24 PM
	 */
	@Test
	public void testGenerateAttackResult_11()
		throws Exception {
		SimpleCombatModel fixture = new SimpleCombatModel();
		Random random = new Random();
		FreeColGameObject attacker = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		FreeColGameObject defender = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		List<CombatModel.CombatResult> result = fixture.generateAttackResult(random, attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the double getDefencePower(FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:24 PM
	 */
	@Test
	public void testGetDefencePower_1()
		throws Exception {
		SimpleCombatModel fixture = new SimpleCombatModel();
		FreeColGameObject attacker = new Region(new Game(new IIOMetadataNode(), ""));
		FreeColGameObject defender = new Colony(new Game(new IIOMetadataNode(), ""), "");

		double result = fixture.getDefencePower(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double getDefencePower(FreeColGameObject,FreeColGameObject,LogBuilder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:24 PM
	 */
	@Test
	public void testGetDefencePower_2()
		throws Exception {
		SimpleCombatModel fixture = new SimpleCombatModel();
		FreeColGameObject attacker = new Region(new Game(new IIOMetadataNode(), ""));
		FreeColGameObject defender = new Region(new Game(new IIOMetadataNode(), ""));
		LogBuilder lb = new LogBuilder(1);

		double result = fixture.getDefencePower(attacker, defender, lb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double getDefencePower(FreeColGameObject,FreeColGameObject,LogBuilder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:24 PM
	 */
	@Test
	public void testGetDefencePower_3()
		throws Exception {
		SimpleCombatModel fixture = new SimpleCombatModel();
		FreeColGameObject attacker = new Region(new Game(new IIOMetadataNode(), ""));
		FreeColGameObject defender = new Colony(new Game(new IIOMetadataNode(), ""), "");
		LogBuilder lb = new LogBuilder(1);

		double result = fixture.getDefencePower(attacker, defender, lb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double getDefencePower(FreeColGameObject,FreeColGameObject,LogBuilder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:24 PM
	 */
	@Test
	public void testGetDefencePower_4()
		throws Exception {
		SimpleCombatModel fixture = new SimpleCombatModel();
		FreeColGameObject attacker = new Region(new Game(new IIOMetadataNode(), ""));
		FreeColGameObject defender = new Colony(new Game(new IIOMetadataNode(), ""), "");
		LogBuilder lb = new LogBuilder(1);

		double result = fixture.getDefencePower(attacker, defender, lb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double getDefencePower(FreeColGameObject,FreeColGameObject,LogBuilder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:24 PM
	 */
	@Test
	public void testGetDefencePower_5()
		throws Exception {
		SimpleCombatModel fixture = new SimpleCombatModel();
		FreeColGameObject attacker = new Region(new Game(new IIOMetadataNode(), ""));
		FreeColGameObject defender = new Colony(new Game(new IIOMetadataNode(), ""), "");
		LogBuilder lb = null;

		double result = fixture.getDefencePower(attacker, defender, lb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double getDefencePower(FreeColGameObject,FreeColGameObject,LogBuilder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:24 PM
	 */
	@Test
	public void testGetDefencePower_6()
		throws Exception {
		SimpleCombatModel fixture = new SimpleCombatModel();
		FreeColGameObject attacker = new Region(new Game(new IIOMetadataNode(), ""));
		FreeColGameObject defender = new Colony(new Game(new IIOMetadataNode(), ""), "");
		LogBuilder lb = null;

		double result = fixture.getDefencePower(attacker, defender, lb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the Set<Modifier> getDefensiveModifiers(FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:24 PM
	 */
	@Test
	public void testGetDefensiveModifiers_1()
		throws Exception {
		SimpleCombatModel fixture = new SimpleCombatModel();
		FreeColGameObject attacker = new Region(new Game(new IIOMetadataNode(), ""));
		FreeColGameObject defender = new Region(new Game(new IIOMetadataNode(), ""));

		Set<Modifier> result = fixture.getDefensiveModifiers(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Set<Modifier> getDefensiveModifiers(FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:24 PM
	 */
	@Test
	public void testGetDefensiveModifiers_2()
		throws Exception {
		SimpleCombatModel fixture = new SimpleCombatModel();
		FreeColGameObject attacker = new Region(new Game(new IIOMetadataNode(), ""));
		Unit defender = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		defender.setType(new UnitType("", new Specification()));

		Set<Modifier> result = fixture.getDefensiveModifiers(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Set<Modifier> getDefensiveModifiers(FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:24 PM
	 */
	@Test
	public void testGetDefensiveModifiers_3()
		throws Exception {
		SimpleCombatModel fixture = new SimpleCombatModel();
		FreeColGameObject attacker = new Region(new Game(new IIOMetadataNode(), ""));
		Colony defender = new Colony(new Game(new IIOMetadataNode(), ""), "");
		defender.tile = new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1);

		Set<Modifier> result = fixture.getDefensiveModifiers(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Set<Modifier> getDefensiveModifiers(FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:24 PM
	 */
	@Test
	public void testGetDefensiveModifiers_4()
		throws Exception {
		SimpleCombatModel fixture = new SimpleCombatModel();
		FreeColGameObject attacker = new Region(new Game(new IIOMetadataNode(), ""));
		Unit defender = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		defender.setType(new UnitType("", new Specification()));

		Set<Modifier> result = fixture.getDefensiveModifiers(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Set<Modifier> getDefensiveModifiers(FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:24 PM
	 */
	@Test
	public void testGetDefensiveModifiers_5()
		throws Exception {
		SimpleCombatModel fixture = new SimpleCombatModel();
		FreeColGameObject attacker = new Region(new Game(new IIOMetadataNode(), ""));
		Unit defender = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		defender.setType(new UnitType("", new Specification()));

		Set<Modifier> result = fixture.getDefensiveModifiers(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the double getOffencePower(FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:24 PM
	 */
	@Test
	public void testGetOffencePower_1()
		throws Exception {
		SimpleCombatModel fixture = new SimpleCombatModel();
		FreeColGameObject attacker = new Region(new Game(new IIOMetadataNode(), ""));
		FreeColGameObject defender = new Region(new Game(new IIOMetadataNode(), ""));

		double result = fixture.getOffencePower(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the Set<Modifier> getOffensiveModifiers(FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:24 PM
	 */
	@Test
	public void testGetOffensiveModifiers_1()
		throws Exception {
		SimpleCombatModel fixture = new SimpleCombatModel();
		FreeColGameObject attacker = null;
		FreeColGameObject defender = new Region(new Game(new IIOMetadataNode(), ""));

		Set<Modifier> result = fixture.getOffensiveModifiers(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Set<Modifier> getOffensiveModifiers(FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:24 PM
	 */
	@Test
	public void testGetOffensiveModifiers_2()
		throws Exception {
		SimpleCombatModel fixture = new SimpleCombatModel();
		FreeColGameObject attacker = new Region(new Game(new IIOMetadataNode(), ""));
		FreeColGameObject defender = new Region(new Game(new IIOMetadataNode(), ""));

		Set<Modifier> result = fixture.getOffensiveModifiers(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Set<Modifier> getOffensiveModifiers(FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:24 PM
	 */
	@Test
	public void testGetOffensiveModifiers_3()
		throws Exception {
		SimpleCombatModel fixture = new SimpleCombatModel();
		FreeColGameObject attacker = new Region(new Game(new IIOMetadataNode(), ""));
		FreeColGameObject defender = new Region(new Game(new IIOMetadataNode(), ""));

		Set<Modifier> result = fixture.getOffensiveModifiers(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Set<Modifier> getOffensiveModifiers(FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:24 PM
	 */
	@Test
	public void testGetOffensiveModifiers_4()
		throws Exception {
		SimpleCombatModel fixture = new SimpleCombatModel();
		Unit attacker = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		attacker.setType(new UnitType("", new Specification()));
		FreeColGameObject defender = new Region(new Game(new IIOMetadataNode(), ""));

		Set<Modifier> result = fixture.getOffensiveModifiers(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Set<Modifier> getOffensiveModifiers(FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:24 PM
	 */
	@Test
	public void testGetOffensiveModifiers_5()
		throws Exception {
		SimpleCombatModel fixture = new SimpleCombatModel();
		Unit attacker = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		attacker.setType(new UnitType("", new Specification()));
		FreeColGameObject defender = new Region(new Game(new IIOMetadataNode(), ""));

		Set<Modifier> result = fixture.getOffensiveModifiers(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Set<Modifier> getOffensiveModifiers(FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:24 PM
	 */
	@Test
	public void testGetOffensiveModifiers_6()
		throws Exception {
		SimpleCombatModel fixture = new SimpleCombatModel();
		Unit attacker = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		attacker.setType(new UnitType("", new Specification()));
		FreeColGameObject defender = new Region(new Game(new IIOMetadataNode(), ""));

		Set<Modifier> result = fixture.getOffensiveModifiers(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/18 4:24 PM
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
	 * @generatedBy CodePro at 5/14/18 4:24 PM
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
	 * @generatedBy CodePro at 5/14/18 4:24 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SimpleCombatModelTest.class);
	}
}