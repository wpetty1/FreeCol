package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;
import net.sf.freecol.common.io.FreeColXMLWriter;
import javax.imageio.metadata.IIOMetadataNode;
import net.sf.freecol.common.io.FreeColXMLReader;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>ColonyTileTest</code> contains tests for the class <code>{@link ColonyTile}</code>.
 *
 * @generatedBy CodePro at 5/14/18 3:11 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class ColonyTileTest {
	/**
	 * Run the ColonyTile(Game,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testColonyTile_1()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		String id = "";

		ColonyTile result = new ColonyTile(game, id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the ColonyTile(Game,Colony,Tile) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testColonyTile_2()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		Colony colony = new Colony(new Game(new IIOMetadataNode(), ""), "");
		Tile workTile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		ColonyTile result = new ColonyTile(game, colony, workTile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the boolean canAutoProduce() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testCanAutoProduce_1()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		boolean result = fixture.canAutoProduce();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean canAutoProduce() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testCanAutoProduce_2()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		boolean result = fixture.canAutoProduce();

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
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testCanProduce_1()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testCanProduce_2()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), (Tile) null);
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
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testCanProduce_3()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * Run the int evaluateFor(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testEvaluateFor_1()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		int result = fixture.evaluateFor(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the List<ProductionType> getAvailableProductionTypes(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetAvailableProductionTypes_1()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		boolean unattended = true;

		List<ProductionType> result = fixture.getAvailableProductionTypes(unattended);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<ProductionType> getAvailableProductionTypes(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetAvailableProductionTypes_2()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), (Tile) null);
		boolean unattended = true;

		List<ProductionType> result = fixture.getAvailableProductionTypes(unattended);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<ProductionType> getAvailableProductionTypes(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetAvailableProductionTypes_3()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		boolean unattended = true;

		List<ProductionType> result = fixture.getAvailableProductionTypes(unattended);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<ProductionType> getAvailableProductionTypes(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetAvailableProductionTypes_4()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		boolean unattended = true;

		List<ProductionType> result = fixture.getAvailableProductionTypes(unattended);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getBaseProduction(ProductionType,GoodsType,UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetBaseProduction_1()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		ProductionType productionType = new ProductionType(new Specification());
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = new UnitType("", new Specification());

		int result = fixture.getBaseProduction(productionType, goodsType, unitType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getBaseProduction(ProductionType,GoodsType,UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetBaseProduction_2()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), (Tile) null);
		ProductionType productionType = new ProductionType(new Specification());
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = new UnitType("", new Specification());

		int result = fixture.getBaseProduction(productionType, goodsType, unitType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the ProductionInfo getBasicProductionInfo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetBasicProductionInfo_1()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		ProductionInfo result = fixture.getBasicProductionInfo();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the ProductionInfo getBasicProductionInfo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetBasicProductionInfo_2()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		ProductionInfo result = fixture.getBasicProductionInfo();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the ProductionInfo getBasicProductionInfo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetBasicProductionInfo_3()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		ProductionInfo result = fixture.getBasicProductionInfo();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the ProductionInfo getBasicProductionInfo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetBasicProductionInfo_4()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		ProductionInfo result = fixture.getBasicProductionInfo();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the ProductionInfo getBasicProductionInfo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetBasicProductionInfo_5()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		ProductionInfo result = fixture.getBasicProductionInfo();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the ProductionInfo getBasicProductionInfo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetBasicProductionInfo_6()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		ProductionInfo result = fixture.getBasicProductionInfo();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate getClaimTemplate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetClaimTemplate_1()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		StringTemplate result = fixture.getClaimTemplate();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate getClaimTemplate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetClaimTemplate_2()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		StringTemplate result = fixture.getClaimTemplate();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate getLabel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetLabel_1()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		StringTemplate result = fixture.getLabel();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate getLabel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetLabel_2()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), (Tile) null);

		StringTemplate result = fixture.getLabel();

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
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetLocationLabel_1()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		StringTemplate result = fixture.getLocationLabel();

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
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetLocationLabel_2()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), (Tile) null);

		StringTemplate result = fixture.getLocationLabel();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the UnitLocation.NoAddReason getNoAddReason(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetNoAddReason_1()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		Locatable locatable = new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		UnitLocation.NoAddReason result = fixture.getNoAddReason(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the UnitLocation.NoAddReason getNoAddReason(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetNoAddReason_2()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		Locatable locatable = new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		UnitLocation.NoAddReason result = fixture.getNoAddReason(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the UnitLocation.NoAddReason getNoWorkReason() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetNoWorkReason_1()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		UnitLocation.NoAddReason result = fixture.getNoWorkReason();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the UnitLocation.NoAddReason getNoWorkReason() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetNoWorkReason_2()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		UnitLocation.NoAddReason result = fixture.getNoWorkReason();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the UnitLocation.NoAddReason getNoWorkReason() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetNoWorkReason_3()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		UnitLocation.NoAddReason result = fixture.getNoWorkReason();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the UnitLocation.NoAddReason getNoWorkReason() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetNoWorkReason_4()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		UnitLocation.NoAddReason result = fixture.getNoWorkReason();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the UnitLocation.NoAddReason getNoWorkReason() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetNoWorkReason_5()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		UnitLocation.NoAddReason result = fixture.getNoWorkReason();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the UnitLocation.NoAddReason getNoWorkReason() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetNoWorkReason_6()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		UnitLocation.NoAddReason result = fixture.getNoWorkReason();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the UnitLocation.NoAddReason getNoWorkReason() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetNoWorkReason_7()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		UnitLocation.NoAddReason result = fixture.getNoWorkReason();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the UnitLocation.NoAddReason getNoWorkReason() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetNoWorkReason_8()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		UnitLocation.NoAddReason result = fixture.getNoWorkReason();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the UnitLocation.NoAddReason getNoWorkReason() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetNoWorkReason_9()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		UnitLocation.NoAddReason result = fixture.getNoWorkReason();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the UnitLocation.NoAddReason getNoWorkReason() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetNoWorkReason_10()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		UnitLocation.NoAddReason result = fixture.getNoWorkReason();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the UnitLocation.NoAddReason getNoWorkReason() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetNoWorkReason_11()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		UnitLocation.NoAddReason result = fixture.getNoWorkReason();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the UnitLocation.NoAddReason getNoWorkReason() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetNoWorkReason_12()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		UnitLocation.NoAddReason result = fixture.getNoWorkReason();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the UnitLocation.NoAddReason getNoWorkReason() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetNoWorkReason_13()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		UnitLocation.NoAddReason result = fixture.getNoWorkReason();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the UnitLocation.NoAddReason getNoWorkReason() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetNoWorkReason_14()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		UnitLocation.NoAddReason result = fixture.getNoWorkReason();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Unit getOccupyingUnit() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetOccupyingUnit_1()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		Unit result = fixture.getOccupyingUnit();

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
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetProductionModifiers_1()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetProductionModifiers_2()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetProductionModifiers_3()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetProductionModifiers_4()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = null;

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
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetProductionModifiers_5()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = null;

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
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetProductionModifiers_6()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = null;

		List<Modifier> result = fixture.getProductionModifiers(goodsType, unitType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getUnitCapacity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetUnitCapacity_1()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		int result = fixture.getUnitCapacity();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getUnitCapacity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetUnitCapacity_2()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		int result = fixture.getUnitCapacity();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the Tile getWorkTile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetWorkTile_1()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		Tile result = fixture.getWorkTile();

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
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = ColonyTile.getXMLElementTagName();

		// add additional test code here
		assertEquals("colonyTile", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		String result = fixture.getXMLTagName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int improvedBy(TileImprovementType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testImprovedBy_1()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), (Tile) null);
		TileImprovementType ti = new TileImprovementType("", new Specification());

		int result = fixture.improvedBy(ti);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int improvedBy(TileImprovementType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testImprovedBy_2()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		TileImprovementType ti = new TileImprovementType("", new Specification());

		int result = fixture.improvedBy(ti);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int improvedBy(TileImprovementType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testImprovedBy_3()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		TileImprovementType ti = new TileImprovementType("", new Specification());

		int result = fixture.improvedBy(ti);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int improvedBy(TileImprovementType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testImprovedBy_4()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		TileImprovementType ti = new TileImprovementType("", new Specification());

		int result = fixture.improvedBy(ti);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int improvedBy(TileImprovementType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testImprovedBy_5()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		TileImprovementType ti = new TileImprovementType("", new Specification());

		int result = fixture.improvedBy(ti);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int improvedBy(TileImprovementType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testImprovedBy_6()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		TileImprovementType ti = new TileImprovementType("", new Specification());

		int result = fixture.improvedBy(ti);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int improvedBy(TileImprovementType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testImprovedBy_7()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		TileImprovementType ti = new TileImprovementType("", new Specification());

		int result = fixture.improvedBy(ti);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int improvedBy(TileImprovementType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testImprovedBy_8()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		TileImprovementType ti = new TileImprovementType("", new Specification());

		int result = fixture.improvedBy(ti);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int improvedBy(TileImprovementType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testImprovedBy_9()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		TileImprovementType ti = new TileImprovementType("", new Specification());

		int result = fixture.improvedBy(ti);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int improvedBy(TileImprovementType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testImprovedBy_10()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		TileImprovementType ti = new TileImprovementType("", new Specification());

		int result = fixture.improvedBy(ti);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int improvedBy(TileImprovementType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testImprovedBy_11()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		TileImprovementType ti = new TileImprovementType("", new Specification());

		int result = fixture.improvedBy(ti);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int improvedBy(TileImprovementType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testImprovedBy_12()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		TileImprovementType ti = new TileImprovementType("", new Specification());

		int result = fixture.improvedBy(ti);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int improvedBy(TileImprovementType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testImprovedBy_13()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		TileImprovementType ti = new TileImprovementType("", new Specification());

		int result = fixture.improvedBy(ti);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int improvedBy(TileImprovementType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testImprovedBy_14()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		TileImprovementType ti = new TileImprovementType("", new Specification());

		int result = fixture.improvedBy(ti);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int improvedBy(TileImprovementType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testImprovedBy_15()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		TileImprovementType ti = new TileImprovementType("", new Specification());

		int result = fixture.improvedBy(ti);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int improvedBy(TileImprovementType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testImprovedBy_16()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		TileImprovementType ti = new TileImprovementType("", new Specification());

		int result = fixture.improvedBy(ti);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the boolean isAvailable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testIsAvailable_1()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		boolean result = fixture.isAvailable();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isAvailable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testIsAvailable_2()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		boolean result = fixture.isAvailable();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isAvailable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testIsAvailable_3()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		boolean result = fixture.isAvailable();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isColonyCenterTile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testIsColonyCenterTile_1()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		boolean result = fixture.isColonyCenterTile();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isColonyCenterTile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testIsColonyCenterTile_2()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		boolean result = fixture.isColonyCenterTile();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isCurrent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testIsCurrent_1()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		boolean result = fixture.isCurrent();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isCurrent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testIsCurrent_2()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		boolean result = fixture.isCurrent();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isOccupied() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testIsOccupied_1()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		boolean result = fixture.isOccupied();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isOccupied() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testIsOccupied_2()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		boolean result = fixture.isOccupied();

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
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testReadAttributes_3()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setWorkTile(Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testSetWorkTile_1()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		Tile workTile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		fixture.setWorkTile(workTile);

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
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testToShortString_1()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

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
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

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
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testUp_1()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

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
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testWriteAttributes_1()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testWriteAttributes_2()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	@Test
	public void testWriteAttributes_3()
		throws Exception {
		ColonyTile fixture = new ColonyTile(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 3:11 PM
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
	 * @generatedBy CodePro at 5/14/18 3:11 PM
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
	 * @generatedBy CodePro at 5/14/18 3:11 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ColonyTileTest.class);
	}
}