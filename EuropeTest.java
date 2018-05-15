package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import net.sf.freecol.common.io.FreeColXMLReader;
import javax.imageio.metadata.IIOMetadataNode;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>EuropeTest</code> contains tests for the class <code>{@link Europe}</code>.
 *
 * @generatedBy CodePro at 5/14/18 3:16 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class EuropeTest {
	/**
	 * Run the Europe(Game,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testEurope_1()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		String id = "";

		Europe result = new Europe(game, id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Europe(Game,Player) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testEurope_2()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		Player owner = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		Europe result = new Europe(game, owner);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the boolean add(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testAdd_1()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		Locatable locatable = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		boolean result = fixture.add(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean add(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testAdd_2()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		Locatable locatable = new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		boolean result = fixture.add(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean add(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testAdd_3()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		Locatable locatable = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		boolean result = fixture.add(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean add(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testAdd_4()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		Locatable locatable = new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		boolean result = fixture.add(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRecruitable(UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testAddRecruitable_1()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		UnitType unitType = new UnitType("", new Specification());

		boolean result = fixture.addRecruitable(unitType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean addRecruitable(UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testAddRecruitable_2()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		UnitType unitType = new UnitType("", new Specification());

		boolean result = fixture.addRecruitable(unitType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean canAdd(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testCanAdd_1()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		Locatable locatable = new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		boolean result = fixture.canAdd(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean canAdd(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testCanAdd_2()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		Locatable locatable = new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		boolean result = fixture.canAdd(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean canAdd(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testCanAdd_3()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		Locatable locatable = new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		boolean result = fixture.canAdd(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the void disposeResources() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testDisposeResources_1()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;

		fixture.disposeResources();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void disposeResources() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testDisposeResources_2()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;

		fixture.disposeResources();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void disposeResources() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testDisposeResources_3()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), (Player) null);
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;

		fixture.disposeResources();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the boolean equipForRole(Unit,Role,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test(expected = java.lang.RuntimeException.class)
	public void testEquipForRole_1()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Role role = new Role("", new Specification());
		int roleCount = 1;

		boolean result = fixture.equipForRole(unit, role, roleCount);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the Set<Ability> getAbilities(String,FreeColGameObjectType,Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testGetAbilities_1()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		String id = null;
		FreeColGameObjectType fcgot = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());
		Turn turn = new Turn(1);

		Set<Ability> result = fixture.getAbilities(id, fcgot, turn);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Set<Ability> getAbilities(String,FreeColGameObjectType,Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testGetAbilities_2()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		String id = "model.ability.dressMissionary";
		FreeColGameObjectType fcgot = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());
		Turn turn = new Turn(1);

		Set<Ability> result = fixture.getAbilities(id, fcgot, turn);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Set<Ability> getAbilities(String,FreeColGameObjectType,Turn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testGetAbilities_3()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		String id = "";
		FreeColGameObjectType fcgot = new Effect(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())), new Specification());
		Turn turn = new Turn(1);

		Set<Ability> result = fixture.getAbilities(id, fcgot, turn);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getExportAmount(GoodsType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testGetExportAmount_1()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		GoodsType goodsType = new GoodsType("", new Specification());
		int turns = 1;

		int result = fixture.getExportAmount(goodsType, turns);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getExportAmount(GoodsType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testGetExportAmount_2()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		GoodsType goodsType = new GoodsType("", new Specification());
		int turns = 1;

		int result = fixture.getExportAmount(goodsType, turns);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the FeatureContainer getFeatureContainer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testGetFeatureContainer_1()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;

		FeatureContainer result = fixture.getFeatureContainer();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getGoodsCount(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testGetGoodsCount_1()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		GoodsType goodsType = new GoodsType("", new Specification());

		int result = fixture.getGoodsCount(goodsType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getImmigration(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testGetImmigration_1()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		int production = 1;

		int result = fixture.getImmigration(production);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getImmigration(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testGetImmigration_2()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		int production = 1;

		int result = fixture.getImmigration(production);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getImmigration(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testGetImmigration_3()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		int production = 1;

		int result = fixture.getImmigration(production);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getImportAmount(GoodsType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testGetImportAmount_1()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		GoodsType goodsType = new GoodsType("", new Specification());
		int turns = 1;

		int result = fixture.getImportAmount(goodsType, turns);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getImportAmount(GoodsType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testGetImportAmount_2()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		GoodsType goodsType = new GoodsType("", new Specification());
		int turns = 1;

		int result = fixture.getImportAmount(goodsType, turns);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the FreeColGameObject getLinkTarget(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testGetLinkTarget_1()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		FreeColGameObject result = fixture.getLinkTarget(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColGameObject getLinkTarget(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testGetLinkTarget_2()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		FreeColGameObject result = fixture.getLinkTarget(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate getLocationLabel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testGetLocationLabel_1()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;

		StringTemplate result = fixture.getLocationLabel();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getNameKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testGetNameKey_1()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;

		String result = fixture.getNameKey();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Player getOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testGetOwner_1()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;

		Player result = fixture.getOwner();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getRank() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testGetRank_1()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;

		int result = fixture.getRank();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getRecruitPrice() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testGetRecruitPrice_1()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;

		int result = fixture.getRecruitPrice();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getRecruitPrice() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testGetRecruitPrice_2()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;

		int result = fixture.getRecruitPrice();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the List<UnitType> getRecruitables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testGetRecruitables_1()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;

		List<UnitType> result = fixture.getRecruitables();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getUnitPrice(UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testGetUnitPrice_1()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		UnitType unitType = new UnitType("", new Specification());

		int result = fixture.getUnitPrice(unitType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getUnitPrice(UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testGetUnitPrice_2()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		UnitType unitType = new UnitType("", new Specification());

		int result = fixture.getUnitPrice(unitType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = Europe.getXMLElementTagName();

		// add additional test code here
		assertEquals("europe", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;

		String result = fixture.getXMLTagName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int priceGoods(List<AbstractGoods>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testPriceGoods_1()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		List<AbstractGoods> goods = new ArrayList<AbstractGoods>();

		int result = fixture.priceGoods(goods);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int priceGoods(List<AbstractGoods>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testPriceGoods_2()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		List<AbstractGoods> goods = new ArrayList<AbstractGoods>();

		int result = fixture.priceGoods(goods);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int priceGoods(List<AbstractGoods>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testPriceGoods_3()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		List<AbstractGoods> goods = new ArrayList<AbstractGoods>();

		int result = fixture.priceGoods(goods);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int priceGoods(List<AbstractGoods>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testPriceGoods_4()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		List<AbstractGoods> goods = new ArrayList<AbstractGoods>();

		int result = fixture.priceGoods(goods);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testReadAttributes_3()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testReadAttributes_4()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testReadAttributes_5()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testReadChild_1()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testReadChild_2()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testReadChild_3()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testReadChild_4()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testReadChild_5()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testReadChild_6()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testReadChild_7()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testReadChild_8()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testReadChild_9()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testReadChild_10()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testReadChild_11()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testReadChild_12()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testReadChild_13()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testReadChild_14()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testReadChild_15()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testReadChild_16()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testReadChildren_1()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.recruitPrice = 1;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testReadChildren_2()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.recruitPrice = 1;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testReadChildren_3()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testReadChildren_4()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.recruitPrice = 1;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testReadChildren_5()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testReadChildren_6()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.recruitPrice = 1;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testReadChildren_7()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setOwner(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testSetOwner_1()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		Player p = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		fixture.setOwner(p);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the String toShortString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testToShortString_1()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;

		String result = fixture.toShortString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Location up() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testUp_1()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;

		Location result = fixture.up();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testWriteAttributes_1()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testWriteAttributes_2()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testWriteAttributes_3()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testWriteAttributes_4()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testWriteAttributes_5()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testWriteAttributes_6()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testWriteChildren_1()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testWriteChildren_2()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testWriteChildren_3()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testWriteChildren_4()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testWriteChildren_5()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testWriteChildren_6()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testWriteChildren_7()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testWriteChildren_8()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testWriteChildren_9()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testWriteChildren_10()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testWriteChildren_11()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testWriteChildren_12()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testWriteChildren_13()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testWriteChildren_14()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testWriteChildren_15()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	@Test
	public void testWriteChildren_16()
		throws Exception {
		Europe fixture = new Europe(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.recruitLowerCap = 1;
		fixture.addRecruitable(new UnitType("", new Specification()));
		fixture.recruitPrice = 1;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/18 3:16 PM
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
	 * @generatedBy CodePro at 5/14/18 3:16 PM
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
	 * @generatedBy CodePro at 5/14/18 3:16 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(EuropeTest.class);
	}
}