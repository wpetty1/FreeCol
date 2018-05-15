package net.sf.freecol.common.model;

import java.util.Comparator;
import javax.imageio.metadata.IIOMetadataNode;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>CombatModelTest</code> contains tests for the class <code>{@link CombatModel}</code>.
 *
 * @generatedBy CodePro at 5/14/18 3:12 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class CombatModelTest {
	/**
	 * Run the boolean combatIsAmphibious(FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:12 PM
	 */
	@Test
	public void testCombatIsAmphibious_1()
		throws Exception {
		CombatModel fixture = new SimpleCombatModel();
		FreeColGameObject attacker = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		FreeColGameObject defender = new Region(new Game(new IIOMetadataNode(), ""));

		boolean result = fixture.combatIsAmphibious(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean combatIsAmphibious(FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:12 PM
	 */
	@Test
	public void testCombatIsAmphibious_2()
		throws Exception {
		CombatModel fixture = new SimpleCombatModel();
		FreeColGameObject attacker = new Region(new Game(new IIOMetadataNode(), ""));
		FreeColGameObject defender = new Region(new Game(new IIOMetadataNode(), ""));

		boolean result = fixture.combatIsAmphibious(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean combatIsAmphibious(FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:12 PM
	 */
	@Test
	public void testCombatIsAmphibious_3()
		throws Exception {
		CombatModel fixture = new SimpleCombatModel();
		FreeColGameObject attacker = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		FreeColGameObject defender = new Region(new Game(new IIOMetadataNode(), ""));

		boolean result = fixture.combatIsAmphibious(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean combatIsAmphibious(FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:12 PM
	 */
	@Test
	public void testCombatIsAmphibious_4()
		throws Exception {
		CombatModel fixture = new SimpleCombatModel();
		FreeColGameObject attacker = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		FreeColGameObject defender = new Region(new Game(new IIOMetadataNode(), ""));

		boolean result = fixture.combatIsAmphibious(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean combatIsAmphibious(FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:12 PM
	 */
	@Test
	public void testCombatIsAmphibious_5()
		throws Exception {
		CombatModel fixture = new SimpleCombatModel();
		FreeColGameObject attacker = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		FreeColGameObject defender = new Region(new Game(new IIOMetadataNode(), ""));

		boolean result = fixture.combatIsAmphibious(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean combatIsAmphibious(FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:12 PM
	 */
	@Test
	public void testCombatIsAmphibious_6()
		throws Exception {
		CombatModel fixture = new SimpleCombatModel();
		FreeColGameObject attacker = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		FreeColGameObject defender = new Region(new Game(new IIOMetadataNode(), ""));

		boolean result = fixture.combatIsAmphibious(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean combatIsAmphibious(FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:12 PM
	 */
	@Test
	public void testCombatIsAmphibious_7()
		throws Exception {
		CombatModel fixture = new SimpleCombatModel();
		FreeColGameObject attacker = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		FreeColGameObject defender = new Region(new Game(new IIOMetadataNode(), ""));

		boolean result = fixture.combatIsAmphibious(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean combatIsAttack(FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:12 PM
	 */
	@Test
	public void testCombatIsAttack_1()
		throws Exception {
		CombatModel fixture = new SimpleCombatModel();
		FreeColGameObject attacker = new Region(new Game(new IIOMetadataNode(), ""));
		FreeColGameObject defender = new Region(new Game(new IIOMetadataNode(), ""));

		boolean result = fixture.combatIsAttack(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean combatIsAttack(FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:12 PM
	 */
	@Test
	public void testCombatIsAttack_2()
		throws Exception {
		CombatModel fixture = new SimpleCombatModel();
		FreeColGameObject attacker = new Region(new Game(new IIOMetadataNode(), ""));
		FreeColGameObject defender = new Region(new Game(new IIOMetadataNode(), ""));

		boolean result = fixture.combatIsAttack(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean combatIsAttack(FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:12 PM
	 */
	@Test
	public void testCombatIsAttack_3()
		throws Exception {
		CombatModel fixture = new SimpleCombatModel();
		FreeColGameObject attacker = new Region(new Game(new IIOMetadataNode(), ""));
		FreeColGameObject defender = new Region(new Game(new IIOMetadataNode(), ""));

		boolean result = fixture.combatIsAttack(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean combatIsAttackMeasurement(FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:12 PM
	 */
	@Test
	public void testCombatIsAttackMeasurement_1()
		throws Exception {
		CombatModel fixture = new SimpleCombatModel();
		FreeColGameObject attacker = new Region(new Game(new IIOMetadataNode(), ""));
		FreeColGameObject defender = null;

		boolean result = fixture.combatIsAttackMeasurement(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean combatIsAttackMeasurement(FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:12 PM
	 */
	@Test
	public void testCombatIsAttackMeasurement_2()
		throws Exception {
		CombatModel fixture = new SimpleCombatModel();
		FreeColGameObject attacker = new Region(new Game(new IIOMetadataNode(), ""));
		FreeColGameObject defender = new Region(new Game(new IIOMetadataNode(), ""));

		boolean result = fixture.combatIsAttackMeasurement(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean combatIsAttackMeasurement(FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:12 PM
	 */
	@Test
	public void testCombatIsAttackMeasurement_3()
		throws Exception {
		CombatModel fixture = new SimpleCombatModel();
		FreeColGameObject attacker = new Region(new Game(new IIOMetadataNode(), ""));
		FreeColGameObject defender = new Region(new Game(new IIOMetadataNode(), ""));

		boolean result = fixture.combatIsAttackMeasurement(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean combatIsBombard(FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:12 PM
	 */
	@Test
	public void testCombatIsBombard_1()
		throws Exception {
		CombatModel fixture = new SimpleCombatModel();
		FreeColGameObject attacker = new Region(new Game(new IIOMetadataNode(), ""));
		FreeColGameObject defender = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		boolean result = fixture.combatIsBombard(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean combatIsBombard(FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:12 PM
	 */
	@Test
	public void testCombatIsBombard_2()
		throws Exception {
		CombatModel fixture = new SimpleCombatModel();
		FreeColGameObject attacker = new Region(new Game(new IIOMetadataNode(), ""));
		FreeColGameObject defender = new Region(new Game(new IIOMetadataNode(), ""));

		boolean result = fixture.combatIsBombard(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean combatIsBombard(FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:12 PM
	 */
	@Test
	public void testCombatIsBombard_3()
		throws Exception {
		CombatModel fixture = new SimpleCombatModel();
		FreeColGameObject attacker = new Region(new Game(new IIOMetadataNode(), ""));
		FreeColGameObject defender = new Region(new Game(new IIOMetadataNode(), ""));

		boolean result = fixture.combatIsBombard(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean combatIsBombard(FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:12 PM
	 */
	@Test
	public void testCombatIsBombard_4()
		throws Exception {
		CombatModel fixture = new SimpleCombatModel();
		FreeColGameObject attacker = new Region(new Game(new IIOMetadataNode(), ""));
		FreeColGameObject defender = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		boolean result = fixture.combatIsBombard(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean combatIsDefenceMeasurement(FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:12 PM
	 */
	@Test
	public void testCombatIsDefenceMeasurement_1()
		throws Exception {
		CombatModel fixture = new SimpleCombatModel();
		FreeColGameObject attacker = null;
		FreeColGameObject defender = new Region(new Game(new IIOMetadataNode(), ""));

		boolean result = fixture.combatIsDefenceMeasurement(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean combatIsDefenceMeasurement(FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:12 PM
	 */
	@Test
	public void testCombatIsDefenceMeasurement_2()
		throws Exception {
		CombatModel fixture = new SimpleCombatModel();
		FreeColGameObject attacker = new Region(new Game(new IIOMetadataNode(), ""));
		FreeColGameObject defender = new Region(new Game(new IIOMetadataNode(), ""));

		boolean result = fixture.combatIsDefenceMeasurement(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean combatIsDefenceMeasurement(FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:12 PM
	 */
	@Test
	public void testCombatIsDefenceMeasurement_3()
		throws Exception {
		CombatModel fixture = new SimpleCombatModel();
		FreeColGameObject attacker = null;
		FreeColGameObject defender = new Region(new Game(new IIOMetadataNode(), ""));

		boolean result = fixture.combatIsDefenceMeasurement(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean combatIsSettlementAttack(FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:12 PM
	 */
	@Test
	public void testCombatIsSettlementAttack_1()
		throws Exception {
		CombatModel fixture = new SimpleCombatModel();
		FreeColGameObject attacker = new Region(new Game(new IIOMetadataNode(), ""));
		FreeColGameObject defender = new Region(new Game(new IIOMetadataNode(), ""));

		boolean result = fixture.combatIsSettlementAttack(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean combatIsSettlementAttack(FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:12 PM
	 */
	@Test
	public void testCombatIsSettlementAttack_2()
		throws Exception {
		CombatModel fixture = new SimpleCombatModel();
		FreeColGameObject attacker = new Region(new Game(new IIOMetadataNode(), ""));
		FreeColGameObject defender = new Region(new Game(new IIOMetadataNode(), ""));

		boolean result = fixture.combatIsSettlementAttack(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean combatIsSettlementAttack(FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:12 PM
	 */
	@Test
	public void testCombatIsSettlementAttack_3()
		throws Exception {
		CombatModel fixture = new SimpleCombatModel();
		FreeColGameObject attacker = new Region(new Game(new IIOMetadataNode(), ""));
		FreeColGameObject defender = new Region(new Game(new IIOMetadataNode(), ""));

		boolean result = fixture.combatIsSettlementAttack(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean combatIsWarOfIndependence(FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:12 PM
	 */
	@Test
	public void testCombatIsWarOfIndependence_1()
		throws Exception {
		CombatModel fixture = new SimpleCombatModel();
		Unit attacker = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		attacker.setOwner(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		FreeColGameObject defender = new Region(new Game(new IIOMetadataNode(), ""));

		boolean result = fixture.combatIsWarOfIndependence(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean combatIsWarOfIndependence(FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:12 PM
	 */
	@Test
	public void testCombatIsWarOfIndependence_2()
		throws Exception {
		CombatModel fixture = new SimpleCombatModel();
		Unit attacker = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		attacker.setOwner(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		FreeColGameObject defender = new Region(new Game(new IIOMetadataNode(), ""));

		boolean result = fixture.combatIsWarOfIndependence(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean combatIsWarOfIndependence(FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:12 PM
	 */
	@Test
	public void testCombatIsWarOfIndependence_3()
		throws Exception {
		CombatModel fixture = new SimpleCombatModel();
		Unit attacker = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		attacker.setOwner(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		FreeColGameObject defender = new Region(new Game(new IIOMetadataNode(), ""));

		boolean result = fixture.combatIsWarOfIndependence(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean combatIsWarOfIndependence(FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:12 PM
	 */
	@Test
	public void testCombatIsWarOfIndependence_4()
		throws Exception {
		CombatModel fixture = new SimpleCombatModel();
		Unit attacker = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		attacker.setOwner(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		FreeColGameObject defender = new Region(new Game(new IIOMetadataNode(), ""));

		boolean result = fixture.combatIsWarOfIndependence(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean combatIsWarOfIndependence(FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:12 PM
	 */
	@Test
	public void testCombatIsWarOfIndependence_5()
		throws Exception {
		CombatModel fixture = new SimpleCombatModel();
		FreeColGameObject attacker = new Region(new Game(new IIOMetadataNode(), ""));
		FreeColGameObject defender = new Region(new Game(new IIOMetadataNode(), ""));

		boolean result = fixture.combatIsWarOfIndependence(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean combatIsWarOfIndependence(FreeColGameObject,FreeColGameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:12 PM
	 */
	@Test
	public void testCombatIsWarOfIndependence_6()
		throws Exception {
		CombatModel fixture = new SimpleCombatModel();
		FreeColGameObject attacker = new Region(new Game(new IIOMetadataNode(), ""));
		FreeColGameObject defender = new Region(new Game(new IIOMetadataNode(), ""));

		boolean result = fixture.combatIsWarOfIndependence(attacker, defender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the Comparator<Unit> getMilitaryStrengthComparator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:12 PM
	 */
	@Test
	public void testGetMilitaryStrengthComparator_1()
		throws Exception {
		CombatModel fixture = new SimpleCombatModel();

		Comparator<Unit> result = fixture.getMilitaryStrengthComparator();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/18 3:12 PM
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
	 * @generatedBy CodePro at 5/14/18 3:12 PM
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
	 * @generatedBy CodePro at 5/14/18 3:12 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CombatModelTest.class);
	}
}