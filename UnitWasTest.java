package net.sf.freecol.common.model;

import javax.imageio.metadata.IIOMetadataNode;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>UnitWasTest</code> contains tests for the class <code>{@link UnitWas}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:37 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class UnitWasTest {
	/**
	 * Run the UnitWas(Unit) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testUnitWas_1()
		throws Exception {
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setWorkType(new GoodsType("", new Specification()));
		unit.setLocationNoUpdate(new HighSeas(new Game(new IIOMetadataNode(), "")));
		unit.setRole(new Role("", new Specification()));
		unit.setRoleCount(1);
		unit.setType(new UnitType("", new Specification()));
		unit.movesLeft = 1;

		UnitWas result = new UnitWas(unit);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int compareTo(UnitWas) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testCompareTo_1()
		throws Exception {
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setWorkType(new GoodsType("", new Specification()));
		unit.setLocationNoUpdate(new HighSeas(new Game(new IIOMetadataNode(), "")));
		unit.setRole(new Role("", new Specification()));
		unit.setRoleCount(1);
		unit.setType(new UnitType("", new Specification()));
		unit.movesLeft = 1;
		UnitWas fixture = new UnitWas(unit);
		Unit unit1 = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit1.setWorkType(new GoodsType("", new Specification()));
		unit1.setLocationNoUpdate(new HighSeas(new Game(new IIOMetadataNode(), "")));
		unit1.setRole(new Role("", new Specification()));
		unit1.setRoleCount(1);
		unit1.setType(new UnitType("", new Specification()));
		unit1.movesLeft = 1;
		UnitWas uw = new UnitWas(unit1);

		int result = fixture.compareTo(uw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int compareTo(UnitWas) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testCompareTo_2()
		throws Exception {
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setWorkType(new GoodsType("", new Specification()));
		unit.setLocationNoUpdate(new HighSeas(new Game(new IIOMetadataNode(), "")));
		unit.setRole(new Role("", new Specification()));
		unit.setRoleCount(1);
		unit.setType(new UnitType("", new Specification()));
		unit.movesLeft = 1;
		UnitWas fixture = new UnitWas(unit);
		Unit unit1 = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit1.setWorkType(new GoodsType("", new Specification()));
		unit1.setLocationNoUpdate(new HighSeas(new Game(new IIOMetadataNode(), "")));
		unit1.setRole(new Role("", new Specification()));
		unit1.setRoleCount(1);
		unit1.setType(new UnitType("", new Specification()));
		unit1.movesLeft = 1;
		UnitWas uw = new UnitWas(unit1);

		int result = fixture.compareTo(uw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setWorkType(new GoodsType("", new Specification()));
		unit.setLocationNoUpdate(new HighSeas(new Game(new IIOMetadataNode(), "")));
		unit.setRole(new Role("", new Specification()));
		unit.setRoleCount(1);
		unit.setType(new UnitType("", new Specification()));
		unit.movesLeft = 1;
		UnitWas fixture = new UnitWas(unit);
		Unit unit1 = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit1.setWorkType(new GoodsType("", new Specification()));
		unit1.setLocationNoUpdate(new HighSeas(new Game(new IIOMetadataNode(), "")));
		unit1.setRole(new Role("", new Specification()));
		unit1.setRoleCount(1);
		unit1.setType(new UnitType("", new Specification()));
		unit1.movesLeft = 1;
		Object other = new UnitWas(unit1);

		boolean result = fixture.equals(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setWorkType(new GoodsType("", new Specification()));
		unit.setLocationNoUpdate(new HighSeas(new Game(new IIOMetadataNode(), "")));
		unit.setRole(new Role("", new Specification()));
		unit.setRoleCount(1);
		unit.setType(new UnitType("", new Specification()));
		unit.movesLeft = 1;
		UnitWas fixture = new UnitWas(unit);
		Unit unit1 = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit1.setWorkType(new GoodsType("", new Specification()));
		unit1.setLocationNoUpdate(new HighSeas(new Game(new IIOMetadataNode(), "")));
		unit1.setRole(new Role("", new Specification()));
		unit1.setRoleCount(1);
		unit1.setType(new UnitType("", new Specification()));
		unit1.movesLeft = 1;
		Object other = new UnitWas(unit1);

		boolean result = fixture.equals(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setWorkType(new GoodsType("", new Specification()));
		unit.setLocationNoUpdate(new HighSeas(new Game(new IIOMetadataNode(), "")));
		unit.setRole(new Role("", new Specification()));
		unit.setRoleCount(1);
		unit.setType(new UnitType("", new Specification()));
		unit.movesLeft = 1;
		UnitWas fixture = new UnitWas(unit);
		Object other = new Object();

		boolean result = fixture.equals(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setWorkType(new GoodsType("", new Specification()));
		unit.setLocationNoUpdate(new HighSeas(new Game(new IIOMetadataNode(), "")));
		unit.setRole(new Role("", new Specification()));
		unit.setRoleCount(1);
		unit.setType(new UnitType("", new Specification()));
		unit.movesLeft = 1;
		UnitWas fixture = new UnitWas(unit);
		Object other = new Object();

		boolean result = fixture.equals(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the Location getLocation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetLocation_1()
		throws Exception {
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setWorkType(new GoodsType("", new Specification()));
		unit.setLocationNoUpdate(new HighSeas(new Game(new IIOMetadataNode(), "")));
		unit.setRole(new Role("", new Specification()));
		unit.setRoleCount(1);
		unit.setType(new UnitType("", new Specification()));
		unit.movesLeft = 1;
		UnitWas fixture = new UnitWas(unit);

		Location result = fixture.getLocation();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Unit getUnit() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetUnit_1()
		throws Exception {
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setWorkType(new GoodsType("", new Specification()));
		unit.setLocationNoUpdate(new HighSeas(new Game(new IIOMetadataNode(), "")));
		unit.setRole(new Role("", new Specification()));
		unit.setRoleCount(1);
		unit.setType(new UnitType("", new Specification()));
		unit.movesLeft = 1;
		UnitWas fixture = new UnitWas(unit);

		Unit result = fixture.getUnit();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the GoodsType getWorkType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testGetWorkType_1()
		throws Exception {
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setWorkType(new GoodsType("", new Specification()));
		unit.setLocationNoUpdate(new HighSeas(new Game(new IIOMetadataNode(), "")));
		unit.setRole(new Role("", new Specification()));
		unit.setRoleCount(1);
		unit.setType(new UnitType("", new Specification()));
		unit.movesLeft = 1;
		UnitWas fixture = new UnitWas(unit);

		GoodsType result = fixture.getWorkType();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:37 PM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setWorkType(new GoodsType("", new Specification()));
		unit.setLocationNoUpdate(new HighSeas(new Game(new IIOMetadataNode(), "")));
		unit.setRole(new Role("", new Specification()));
		unit.setRoleCount(1);
		unit.setType(new UnitType("", new Specification()));
		unit.movesLeft = 1;
		UnitWas fixture = new UnitWas(unit);

		int result = fixture.hashCode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
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
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setWorkType(new GoodsType("", new Specification()));
		unit.setLocationNoUpdate((Location) null);
		unit.setRole(new Role("", new Specification()));
		unit.setRoleCount(0);
		unit.setType(new UnitType("", new Specification()));
		unit.movesLeft = 1;
		UnitWas fixture = new UnitWas(unit);

		String result = fixture.toString();

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
		new org.junit.runner.JUnitCore().run(UnitWasTest.class);
	}
}