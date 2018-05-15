package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import java.util.List;
import java.util.Random;
import javax.imageio.metadata.IIOMetadataNode;
import net.sf.freecol.common.io.FreeColXMLReader;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>LostCityRumourTest</code> contains tests for the class <code>{@link LostCityRumour}</code>.
 *
 * @generatedBy CodePro at 5/14/18 3:45 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class LostCityRumourTest {
	/**
	 * Run the LostCityRumour(Game,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	@Test
	public void testLostCityRumour_1()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		String id = "";

		LostCityRumour result = new LostCityRumour(game, id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the LostCityRumour(Game,Tile) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	@Test
	public void testLostCityRumour_2()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		LostCityRumour result = new LostCityRumour(game, tile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the LostCityRumour(Game,Tile,RumourType,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	@Test
	public void testLostCityRumour_3()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		LostCityRumour.RumourType type = LostCityRumour.RumourType.BURIAL_GROUND;
		String name = "";

		LostCityRumour result = new LostCityRumour(game, tile, type, name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int applyBonus(GoodsType,UnitType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	@Test
	public void testApplyBonus_1()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), LostCityRumour.RumourType.BURIAL_GROUND, "");
		fixture.setTile(new Tile(new Game(new IIOMetadataNode(), ""), ""));
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = new UnitType("", new Specification());
		int potential = 1;

		int result = fixture.applyBonus(goodsType, unitType, potential);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the boolean canProduce(GoodsType,UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	@Test
	public void testCanProduce_1()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), LostCityRumour.RumourType.BURIAL_GROUND, "");
		fixture.setTile(new Tile(new Game(new IIOMetadataNode(), ""), ""));
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = new UnitType("", new Specification());

		boolean result = fixture.canProduce(goodsType, unitType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the int checkIntegrity(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	@Test
	public void testCheckIntegrity_1()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), LostCityRumour.RumourType.BURIAL_GROUND, "");
		fixture.setTile(new Tile(new Game(new IIOMetadataNode(), ""), ""));
		boolean fix = true;

		int result = fixture.checkIntegrity(fix);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int checkIntegrity(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	@Test
	public void testCheckIntegrity_2()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), LostCityRumour.RumourType.BURIAL_GROUND, "");
		fixture.setTile(new Tile(new Game(new IIOMetadataNode(), ""), ""));
		boolean fix = true;

		int result = fixture.checkIntegrity(fix);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the LostCityRumour.RumourType chooseType(Unit,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	@Test
	public void testChooseType_1()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), LostCityRumour.RumourType.BURIAL_GROUND, "");
		fixture.setTile(new Tile(new Game(new IIOMetadataNode(), ""), ""));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setType(new UnitType("", new Specification()));
		unit.setOwner(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		Random random = new Random();

		LostCityRumour.RumourType result = fixture.chooseType(unit, random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the LostCityRumour.RumourType chooseType(Unit,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	@Test
	public void testChooseType_2()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), LostCityRumour.RumourType.BURIAL_GROUND, "");
		fixture.setTile(new Tile(new Game(new IIOMetadataNode(), ""), ""));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setType(new UnitType("", new Specification()));
		unit.setOwner(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		Random random = new Random();

		LostCityRumour.RumourType result = fixture.chooseType(unit, random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the LostCityRumour.RumourType chooseType(Unit,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	@Test
	public void testChooseType_3()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), LostCityRumour.RumourType.BURIAL_GROUND, "");
		fixture.setTile(new Tile(new Game(new IIOMetadataNode(), ""), ""));
		Unit unit = null;
		Random random = new Random();

		LostCityRumour.RumourType result = fixture.chooseType(unit, random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), LostCityRumour.RumourType.BURIAL_GROUND, "");
		fixture.setTile(new Tile(new Game(new IIOMetadataNode(), ""), ""));

		String result = fixture.getName();

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
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	@Test
	public void testGetNameKey_1()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), LostCityRumour.RumourType.BURIAL_GROUND, "");
		fixture.setTile(new Tile(new Game(new IIOMetadataNode(), ""), ""));

		String result = fixture.getNameKey();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the ModelMessage getNothingMessage(Player,boolean,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	@Test
	public void testGetNothingMessage_1()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), LostCityRumour.RumourType.BURIAL_GROUND, "");
		fixture.setTile(new Tile(new Game(new IIOMetadataNode(), ""), ""));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		boolean mounds = true;
		Random random = new Random();

		ModelMessage result = fixture.getNothingMessage(player, mounds, random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the ModelMessage getNothingMessage(Player,boolean,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	@Test
	public void testGetNothingMessage_2()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), LostCityRumour.RumourType.BURIAL_GROUND, "");
		fixture.setTile(new Tile(new Game(new IIOMetadataNode(), ""), ""));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		boolean mounds = true;
		Random random = new Random();

		ModelMessage result = fixture.getNothingMessage(player, mounds, random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the ModelMessage getNothingMessage(Player,boolean,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	@Test
	public void testGetNothingMessage_3()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), LostCityRumour.RumourType.BURIAL_GROUND, "");
		fixture.setTile(new Tile(new Game(new IIOMetadataNode(), ""), ""));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		boolean mounds = false;
		Random random = new Random();

		ModelMessage result = fixture.getNothingMessage(player, mounds, random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the ModelMessage getNothingMessage(Player,boolean,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	@Test
	public void testGetNothingMessage_4()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), LostCityRumour.RumourType.BURIAL_GROUND, "");
		fixture.setTile(new Tile(new Game(new IIOMetadataNode(), ""), ""));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		boolean mounds = false;
		Random random = new Random();

		ModelMessage result = fixture.getNothingMessage(player, mounds, random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the ModelMessage getNothingMessage(Player,boolean,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	@Test
	public void testGetNothingMessage_5()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), LostCityRumour.RumourType.BURIAL_GROUND, "");
		fixture.setTile(new Tile(new Game(new IIOMetadataNode(), ""), ""));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		boolean mounds = false;
		Random random = new Random();

		ModelMessage result = fixture.getNothingMessage(player, mounds, random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Modifier> getProductionModifiers(GoodsType,UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	@Test
	public void testGetProductionModifiers_1()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), LostCityRumour.RumourType.BURIAL_GROUND, "");
		fixture.setTile(new Tile(new Game(new IIOMetadataNode(), ""), ""));
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = new UnitType("", new Specification());

		List<Modifier> result = fixture.getProductionModifiers(goodsType, unitType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the LostCityRumour.RumourType getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	@Test
	public void testGetType_1()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), LostCityRumour.RumourType.BURIAL_GROUND, "");
		fixture.setTile(new Tile(new Game(new IIOMetadataNode(), ""), ""));

		LostCityRumour.RumourType result = fixture.getType();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = LostCityRumour.getXMLElementTagName();

		// add additional test code here
		assertEquals("lostCityRumour", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), LostCityRumour.RumourType.BURIAL_GROUND, "");
		fixture.setTile(new Tile(new Game(new IIOMetadataNode(), ""), ""));

		String result = fixture.getXMLTagName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getZIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	@Test
	public void testGetZIndex_1()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), LostCityRumour.RumourType.BURIAL_GROUND, "");
		fixture.setTile(new Tile(new Game(new IIOMetadataNode(), ""), ""));

		int result = fixture.getZIndex();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the boolean isComplete() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	@Test
	public void testIsComplete_1()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), LostCityRumour.RumourType.BURIAL_GROUND, "");
		fixture.setTile(new Tile(new Game(new IIOMetadataNode(), ""), ""));

		boolean result = fixture.isComplete();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isNatural() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	@Test
	public void testIsNatural_1()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), LostCityRumour.RumourType.BURIAL_GROUND, "");
		fixture.setTile(new Tile(new Game(new IIOMetadataNode(), ""), ""));

		boolean result = fixture.isNatural();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isTileTypeAllowed(TileType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	@Test
	public void testIsTileTypeAllowed_1()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), LostCityRumour.RumourType.BURIAL_GROUND, "");
		fixture.setTile(new Tile(new Game(new IIOMetadataNode(), ""), ""));
		TileType tileType = new TileType("", new Specification());

		boolean result = fixture.isTileTypeAllowed(tileType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isTileTypeAllowed(TileType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	@Test
	public void testIsTileTypeAllowed_2()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), LostCityRumour.RumourType.BURIAL_GROUND, "");
		fixture.setTile(new Tile(new Game(new IIOMetadataNode(), ""), ""));
		TileType tileType = new TileType("", new Specification());

		boolean result = fixture.isTileTypeAllowed(tileType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), LostCityRumour.RumourType.BURIAL_GROUND, "");
		fixture.setTile(new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), LostCityRumour.RumourType.BURIAL_GROUND, "");
		fixture.setTile(new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	@Test
	public void testReadAttributes_3()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), LostCityRumour.RumourType.BURIAL_GROUND, "");
		fixture.setTile(new Tile(new Game(new IIOMetadataNode(), ""), ""));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setTile(Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	@Test
	public void testSetTile_1()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), LostCityRumour.RumourType.BURIAL_GROUND, "");
		fixture.setTile(new Tile(new Game(new IIOMetadataNode(), ""), ""));
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		fixture.setTile(tile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setType(RumourType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	@Test
	public void testSetType_1()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), LostCityRumour.RumourType.BURIAL_GROUND, "");
		fixture.setTile(new Tile(new Game(new IIOMetadataNode(), ""), ""));
		LostCityRumour.RumourType newType = LostCityRumour.RumourType.BURIAL_GROUND;

		fixture.setType(newType);

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
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	@Test
	public void testWriteAttributes_1()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), LostCityRumour.RumourType.BURIAL_GROUND, "");
		fixture.setTile(new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	@Test
	public void testWriteAttributes_2()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), LostCityRumour.RumourType.BURIAL_GROUND, "");
		fixture.setTile(new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	@Test
	public void testWriteAttributes_3()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), LostCityRumour.RumourType.BURIAL_GROUND, "");
		fixture.setTile(new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	@Test
	public void testWriteAttributes_4()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), (LostCityRumour.RumourType) null, "");
		fixture.setTile(new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	@Test
	public void testWriteAttributes_5()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), LostCityRumour.RumourType.BURIAL_GROUND, "");
		fixture.setTile(new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	@Test
	public void testWriteAttributes_6()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), (LostCityRumour.RumourType) null, "");
		fixture.setTile(new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	@Test
	public void testWriteAttributes_7()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), LostCityRumour.RumourType.BURIAL_GROUND, (String) null);
		fixture.setTile(new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	@Test
	public void testWriteAttributes_8()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), (LostCityRumour.RumourType) null, (String) null);
		fixture.setTile(new Tile(new Game(new IIOMetadataNode(), ""), ""));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

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
	 * @generatedBy CodePro at 5/14/18 3:45 PM
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
	 * @generatedBy CodePro at 5/14/18 3:45 PM
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
	 * @generatedBy CodePro at 5/14/18 3:45 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(LostCityRumourTest.class);
	}
}