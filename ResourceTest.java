package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import java.util.List;
import javax.imageio.metadata.IIOMetadataNode;
import net.sf.freecol.common.io.FreeColXMLReader;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>ResourceTest</code> contains tests for the class <code>{@link Resource}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:18 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class ResourceTest {
	/**
	 * Run the Resource(Game,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testResource_1()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		String id = "";

		Resource result = new Resource(game, id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Resource(Game,Tile,ResourceType) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testResource_2()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		ResourceType type = new ResourceType("", new Specification());

		Resource result = new Resource(game, tile, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Resource(Game,Tile,ResourceType,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testResource_3()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		ResourceType type = null;
		int quantity = 1;

		Resource result = new Resource(game, tile, type, quantity);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Resource(Game,Tile,ResourceType,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testResource_4()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		ResourceType type = new ResourceType("", new Specification());
		int quantity = 1;

		Resource result = new Resource(game, tile, type, quantity);

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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testApplyBonus_1()
		throws Exception {
		Resource fixture = new Resource(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), new ResourceType("", new Specification()), 1);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * Run the int applyBonus(GoodsType,UnitType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testApplyBonus_2()
		throws Exception {
		Resource fixture = new Resource(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), new ResourceType("", new Specification()), -1);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * Run the int applyBonus(GoodsType,UnitType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testApplyBonus_3()
		throws Exception {
		Resource fixture = new Resource(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), new ResourceType("", new Specification()), 1);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testCanProduce_1()
		throws Exception {
		Resource fixture = new Resource(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), new ResourceType("", new Specification()), 1);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		GoodsType goodsType = null;
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
	 * Run the boolean canProduce(GoodsType,UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testCanProduce_2()
		throws Exception {
		Resource fixture = new Resource(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), new ResourceType("", new Specification()), 1);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * Run the boolean canProduce(GoodsType,UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testCanProduce_3()
		throws Exception {
		Resource fixture = new Resource(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), new ResourceType("", new Specification()), 1);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testCheckIntegrity_1()
		throws Exception {
		Resource fixture = new Resource(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), new ResourceType("", new Specification()), 1);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testCheckIntegrity_2()
		throws Exception {
		Resource fixture = new Resource(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), new ResourceType("", new Specification()), 1);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * Run the GoodsType getBestGoodsType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testGetBestGoodsType_1()
		throws Exception {
		Resource fixture = new Resource(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), new ResourceType("", new Specification()), 1);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		GoodsType result = fixture.getBestGoodsType();

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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testGetNameKey_1()
		throws Exception {
		Resource fixture = new Resource(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), new ResourceType("", new Specification()), 1);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		String result = fixture.getNameKey();

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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testGetProductionModifiers_1()
		throws Exception {
		Resource fixture = new Resource(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), new ResourceType("", new Specification()), 1);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * Run the List<Modifier> getProductionModifiers(GoodsType,UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testGetProductionModifiers_2()
		throws Exception {
		Resource fixture = new Resource(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), new ResourceType("", new Specification()), 1);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		GoodsType goodsType = null;
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
	 * Run the int getQuantity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testGetQuantity_1()
		throws Exception {
		Resource fixture = new Resource(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), new ResourceType("", new Specification()), 1);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		int result = fixture.getQuantity();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the ResourceType getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testGetType_1()
		throws Exception {
		Resource fixture = new Resource(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), new ResourceType("", new Specification()), 1);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		ResourceType result = fixture.getType();

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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = Resource.getXMLElementTagName();

		// add additional test code here
		assertEquals("resource", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		Resource fixture = new Resource(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), new ResourceType("", new Specification()), 1);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testGetZIndex_1()
		throws Exception {
		Resource fixture = new Resource(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), new ResourceType("", new Specification()), 1);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testIsComplete_1()
		throws Exception {
		Resource fixture = new Resource(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), new ResourceType("", new Specification()), 1);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testIsNatural_1()
		throws Exception {
		Resource fixture = new Resource(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), new ResourceType("", new Specification()), 1);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testIsTileTypeAllowed_1()
		throws Exception {
		Resource fixture = new Resource(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), new ResourceType("", new Specification()), 1);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testIsTileTypeAllowed_2()
		throws Exception {
		Resource fixture = new Resource(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), new ResourceType("", new Specification()), 1);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * Run the boolean isUnlimited() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testIsUnlimited_1()
		throws Exception {
		Resource fixture = new Resource(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), new ResourceType("", new Specification()), -1);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		boolean result = fixture.isUnlimited();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isUnlimited() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testIsUnlimited_2()
		throws Exception {
		Resource fixture = new Resource(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), new ResourceType("", new Specification()), 1);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		boolean result = fixture.isUnlimited();

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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		Resource fixture = new Resource(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), new ResourceType("", new Specification()), 1);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		Resource fixture = new Resource(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), new ResourceType("", new Specification()), 1);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testReadAttributes_3()
		throws Exception {
		Resource fixture = new Resource(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), new ResourceType("", new Specification()), 1);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setQuantity(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testSetQuantity_1()
		throws Exception {
		Resource fixture = new Resource(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), new ResourceType("", new Specification()), 1);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		int newQuantity = 1;

		fixture.setQuantity(newQuantity);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Resource fixture = new Resource(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), new ResourceType("", new Specification()), 1);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		String result = fixture.toString();

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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testToString_2()
		throws Exception {
		Resource fixture = new Resource(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), new ResourceType("", new Specification()), -1);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int useQuantity(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testUseQuantity_1()
		throws Exception {
		Resource fixture = new Resource(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), new ResourceType("", new Specification()), 1);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		int usedQuantity = 1;

		int result = fixture.useQuantity(usedQuantity);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int useQuantity(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testUseQuantity_2()
		throws Exception {
		Resource fixture = new Resource(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), new ResourceType("", new Specification()), 1);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		int usedQuantity = 1;

		int result = fixture.useQuantity(usedQuantity);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int useQuantity(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testUseQuantity_3()
		throws Exception {
		Resource fixture = new Resource(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), new ResourceType("", new Specification()), -1);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		int usedQuantity = 1;

		int result = fixture.useQuantity(usedQuantity);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int useQuantity(GoodsType,UnitType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testUseQuantity_4()
		throws Exception {
		Resource fixture = new Resource(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), new ResourceType("", new Specification()), 1);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = new UnitType("", new Specification());
		int potential = 1;

		int result = fixture.useQuantity(goodsType, unitType, potential);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testWriteAttributes_1()
		throws Exception {
		Resource fixture = new Resource(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), new ResourceType("", new Specification()), 1);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testWriteAttributes_2()
		throws Exception {
		Resource fixture = new Resource(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), new ResourceType("", new Specification()), 1);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testWriteAttributes_3()
		throws Exception {
		Resource fixture = new Resource(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), new ResourceType("", new Specification()), 1);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testWriteAttributes_4()
		throws Exception {
		Resource fixture = new Resource(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), new ResourceType("", new Specification()), 1);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	@Test
	public void testWriteAttributes_5()
		throws Exception {
		Resource fixture = new Resource(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""), new ResourceType("", new Specification()), 1);
		fixture.tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
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
	 * @generatedBy CodePro at 5/14/18 4:18 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ResourceTest.class);
	}
}