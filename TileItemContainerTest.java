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
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>TileItemContainerTest</code> contains tests for the class <code>{@link TileItemContainer}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:30 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class TileItemContainerTest {
	/**
	 * Run the TileItemContainer(Game,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testTileItemContainer_1()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		String id = "";

		TileItemContainer result = new TileItemContainer(game, id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the TileItemContainer(Game,Tile) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testTileItemContainer_2()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		Tile tile = null;

		TileItemContainer result = new TileItemContainer(game, tile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the TileItemContainer(Game,Tile) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testTileItemContainer_3()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		TileItemContainer result = new TileItemContainer(game, tile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the TileItemContainer(Game,Tile,TileItemContainer,Layer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testTileItemContainer_4()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		TileItemContainer template = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		Map.Layer layer = Map.Layer.ALL;

		TileItemContainer result = new TileItemContainer(game, tile, template, layer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the TileItemContainer(Game,Tile,TileItemContainer,Layer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testTileItemContainer_5()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		TileItemContainer template = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		Map.Layer layer = Map.Layer.ALL;

		TileItemContainer result = new TileItemContainer(game, tile, template, layer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the TileItemContainer(Game,Tile,TileItemContainer,Layer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testTileItemContainer_6()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		TileItemContainer template = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		Map.Layer layer = Map.Layer.ALL;

		TileItemContainer result = new TileItemContainer(game, tile, template, layer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the TileItemContainer(Game,Tile,TileItemContainer,Layer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testTileItemContainer_7()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		TileItemContainer template = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		Map.Layer layer = Map.Layer.ALL;

		TileItemContainer result = new TileItemContainer(game, tile, template, layer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the TileItemContainer(Game,Tile,TileItemContainer,Layer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testTileItemContainer_8()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		TileItemContainer template = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		Map.Layer layer = Map.Layer.ALL;

		TileItemContainer result = new TileItemContainer(game, tile, template, layer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the TileItemContainer(Game,Tile,TileItemContainer,Layer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testTileItemContainer_9()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		TileItemContainer template = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		Map.Layer layer = Map.Layer.ALL;

		TileItemContainer result = new TileItemContainer(game, tile, template, layer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the TileItemContainer(Game,Tile,TileItemContainer,Layer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testTileItemContainer_10()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		TileItemContainer template = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		Map.Layer layer = Map.Layer.ALL;

		TileItemContainer result = new TileItemContainer(game, tile, template, layer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the TileItemContainer(Game,Tile,TileItemContainer,Layer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testTileItemContainer_11()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		TileItemContainer template = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		Map.Layer layer = Map.Layer.ALL;

		TileItemContainer result = new TileItemContainer(game, tile, template, layer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the TileItemContainer(Game,Tile,TileItemContainer,Layer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testTileItemContainer_12()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		TileItemContainer template = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		Map.Layer layer = Map.Layer.ALL;

		TileItemContainer result = new TileItemContainer(game, tile, template, layer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the TileItem addTileItem(TileItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testAddTileItem_1()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
		TileItem item = null;

		TileItem result = fixture.addTileItem(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the TileItem addTileItem(TileItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testAddTileItem_2()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
		TileImprovement item = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		item.setMagnitude(1);

		TileItem result = fixture.addTileItem(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the TileItem addTileItem(TileItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testAddTileItem_3()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
		TileImprovement item = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));
		item.setMagnitude(1);

		TileItem result = fixture.addTileItem(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the TileItem addTileItem(TileItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testAddTileItem_4()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
		TileItem item = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));

		TileItem result = fixture.addTileItem(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the TileItem addTileItem(TileItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testAddTileItem_5()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
		TileItem item = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		TileItem result = fixture.addTileItem(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the TileItem addTileItem(TileItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testAddTileItem_6()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
		TileItem item = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		TileItem result = fixture.addTileItem(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the TileItem addTileItem(TileItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testAddTileItem_7()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		TileItem item = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		TileItem result = fixture.addTileItem(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the TileItem addTileItem(TileItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testAddTileItem_8()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
		TileItem item = new TileImprovement(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1), new TileImprovementType("", new Specification()));

		TileItem result = fixture.addTileItem(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the boolean canProduce(GoodsType,UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testCanProduce_1()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
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
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testCanProduce_2()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
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
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testCheckIntegrity_1()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
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
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testCheckIntegrity_2()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
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
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testCheckIntegrity_3()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
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
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testCheckIntegrity_4()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
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
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testCheckIntegrity_5()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
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
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testCheckIntegrity_6()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
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
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testCheckIntegrity_7()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
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
	 * Run the boolean contains(TileItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testContains_1()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
		TileItem t = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		boolean result = fixture.contains(t);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean contains(TileItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testContains_2()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
		TileItem t = new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		boolean result = fixture.contains(t);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the void copyFrom(TileItemContainer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testCopyFrom_1()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
		TileItemContainer tic = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		fixture.copyFrom(tic);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void copyFrom(TileItemContainer,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testCopyFrom_2()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
		TileItemContainer tic = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		boolean importResources = true;

		fixture.copyFrom(tic, importResources);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void copyFrom(TileItemContainer,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testCopyFrom_3()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		TileItemContainer tic = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		boolean importResources = true;
		boolean copyOnlyNatural = true;

		fixture.copyFrom(tic, importResources, copyOnlyNatural);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void copyFrom(TileItemContainer,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testCopyFrom_4()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		TileItemContainer tic = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		boolean importResources = true;
		boolean copyOnlyNatural = true;

		fixture.copyFrom(tic, importResources, copyOnlyNatural);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void copyFrom(TileItemContainer,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testCopyFrom_5()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		TileItemContainer tic = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		boolean importResources = true;
		boolean copyOnlyNatural = true;

		fixture.copyFrom(tic, importResources, copyOnlyNatural);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void copyFrom(TileItemContainer,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testCopyFrom_6()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		TileItemContainer tic = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		boolean importResources = true;
		boolean copyOnlyNatural = true;

		fixture.copyFrom(tic, importResources, copyOnlyNatural);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void copyFrom(TileItemContainer,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testCopyFrom_7()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		TileItemContainer tic = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		boolean importResources = true;
		boolean copyOnlyNatural = true;

		fixture.copyFrom(tic, importResources, copyOnlyNatural);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void copyFrom(TileItemContainer,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testCopyFrom_8()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		TileItemContainer tic = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		boolean importResources = true;
		boolean copyOnlyNatural = true;

		fixture.copyFrom(tic, importResources, copyOnlyNatural);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void copyFrom(TileItemContainer,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testCopyFrom_9()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		TileItemContainer tic = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		boolean importResources = true;
		boolean copyOnlyNatural = true;

		fixture.copyFrom(tic, importResources, copyOnlyNatural);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void copyFrom(TileItemContainer,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testCopyFrom_10()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		TileItemContainer tic = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		boolean importResources = true;
		boolean copyOnlyNatural = true;

		fixture.copyFrom(tic, importResources, copyOnlyNatural);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void copyFrom(TileItemContainer,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testCopyFrom_11()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		TileItemContainer tic = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		boolean importResources = true;
		boolean copyOnlyNatural = true;

		fixture.copyFrom(tic, importResources, copyOnlyNatural);

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
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testDisposeResources_1()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		fixture.disposeResources();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the List<TileImprovement> getCompletedImprovements() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetCompletedImprovements_1()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));

		List<TileImprovement> result = fixture.getCompletedImprovements();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the TileImprovement getImprovement(TileImprovementType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetImprovement_1()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
		TileImprovementType type = new TileImprovementType("", new Specification());

		TileImprovement result = fixture.getImprovement(type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<TileImprovement> getImprovements() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetImprovements_1()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));

		List<TileImprovement> result = fixture.getImprovements();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the LostCityRumour getLostCityRumour() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetLostCityRumour_1()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));

		LostCityRumour result = fixture.getLostCityRumour();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getMoveCost(Tile,Tile,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetMoveCost_1()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
		Tile fromTile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		Tile targetTile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		int basicMoveCost = 1;

		int result = fixture.getMoveCost(fromTile, targetTile, basicMoveCost);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getMoveCost(Tile,Tile,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetMoveCost_2()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
		Tile fromTile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		Tile targetTile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		int basicMoveCost = 1;

		int result = fixture.getMoveCost(fromTile, targetTile, basicMoveCost);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getMoveCost(Tile,Tile,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetMoveCost_3()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
		Tile fromTile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		Tile targetTile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		int basicMoveCost = 1;

		int result = fixture.getMoveCost(fromTile, targetTile, basicMoveCost);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getMoveCost(Tile,Tile,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetMoveCost_4()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
		Tile fromTile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		Tile targetTile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		int basicMoveCost = 1;

		int result = fixture.getMoveCost(fromTile, targetTile, basicMoveCost);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getMoveCost(Tile,Tile,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetMoveCost_5()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
		Tile fromTile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		Tile targetTile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		int basicMoveCost = 1;

		int result = fixture.getMoveCost(fromTile, targetTile, basicMoveCost);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the List<Modifier> getProductionModifiers(GoodsType,UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetProductionModifiers_1()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
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
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetProductionModifiers_2()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
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
	 * Run the Resource getResource() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetResource_1()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));

		Resource result = fixture.getResource();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the TileImprovement getRiver() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetRiver_1()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));

		TileImprovement result = fixture.getRiver();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the TileImprovement getRoad() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetRoad_1()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));

		TileImprovement result = fixture.getRoad();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Tile getTile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetTile_1()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));

		Tile result = fixture.getTile();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<TileItem> getTileItems() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetTileItems_1()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));

		List<TileItem> result = fixture.getTileItems();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getTotalBonusPotential(GoodsType,UnitType,int,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetTotalBonusPotential_1()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = new UnitType("", new Specification());
		int potential = 1;
		boolean onlyNatural = true;

		int result = fixture.getTotalBonusPotential(goodsType, unitType, potential, onlyNatural);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getTotalBonusPotential(GoodsType,UnitType,int,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetTotalBonusPotential_2()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = new UnitType("", new Specification());
		int potential = 1;
		boolean onlyNatural = true;

		int result = fixture.getTotalBonusPotential(goodsType, unitType, potential, onlyNatural);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getTotalBonusPotential(GoodsType,UnitType,int,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetTotalBonusPotential_3()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = new UnitType("", new Specification());
		int potential = 1;
		boolean onlyNatural = true;

		int result = fixture.getTotalBonusPotential(goodsType, unitType, potential, onlyNatural);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getTotalBonusPotential(GoodsType,UnitType,int,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetTotalBonusPotential_4()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = new UnitType("", new Specification());
		int potential = 1;
		boolean onlyNatural = true;

		int result = fixture.getTotalBonusPotential(goodsType, unitType, potential, onlyNatural);

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
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = TileItemContainer.getXMLElementTagName();

		// add additional test code here
		assertEquals("tileItemContainer", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));

		String result = fixture.getXMLTagName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the boolean hasImprovement(TileImprovementType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testHasImprovement_1()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
		TileImprovementType type = new TileImprovementType("", new Specification());

		boolean result = fixture.hasImprovement(type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasImprovement(TileImprovementType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testHasImprovement_2()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
		TileImprovementType type = new TileImprovementType("", new Specification());

		boolean result = fixture.hasImprovement(type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasImprovement(TileImprovementType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testHasImprovement_3()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
		TileImprovementType type = new TileImprovementType("", new Specification());

		boolean result = fixture.hasImprovement(type);

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
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
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
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
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
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testReadAttributes_3()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
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
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testReadChild_1()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
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
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testReadChild_2()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
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
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testReadChild_3()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
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
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testReadChild_4()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
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
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testReadChild_5()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
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
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testReadChild_6()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
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
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testReadChild_7()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
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
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testReadChild_8()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
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
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testReadChild_9()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
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
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testReadChild_10()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
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
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testReadChildren_1()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
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
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testReadChildren_2()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void removeAll(Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testRemoveAll_1()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
		Class<TileItem> c = TileItem.class;

		fixture.removeAll(c);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void removeAll(Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testRemoveAll_2()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		Class<TileItem> c = TileItem.class;

		fixture.removeAll(c);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void removeAll(Class<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testRemoveAll_3()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		Class<TileItem> c = TileItem.class;

		fixture.removeAll(c);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void removeIncompatibleImprovements() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testRemoveIncompatibleImprovements_1()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));

		fixture.removeIncompatibleImprovements();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void removeIncompatibleImprovements() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testRemoveIncompatibleImprovements_2()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		fixture.removeIncompatibleImprovements();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void removeIncompatibleImprovements() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testRemoveIncompatibleImprovements_3()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		fixture.removeIncompatibleImprovements();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void removeIncompatibleImprovements() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testRemoveIncompatibleImprovements_4()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));

		fixture.removeIncompatibleImprovements();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void removeIncompatibleImprovements() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testRemoveIncompatibleImprovements_5()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		fixture.removeIncompatibleImprovements();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void removeIncompatibleImprovements() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testRemoveIncompatibleImprovements_6()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));

		fixture.removeIncompatibleImprovements();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the TileItem removeTileItem(T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testRemoveTileItem_1()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));

		TileItem result = fixture.removeTileItem(new LostCityRumour(new Game(new IIOMetadataNode(""), ""), new Tile(new Game(new IIOMetadataNode(""), ""), "")));

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the TileItem removeTileItem(T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testRemoveTileItem_2()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));

		TileItem result = fixture.removeTileItem(new LostCityRumour(new Game(new IIOMetadataNode(""), ""), new Tile(new Game(new IIOMetadataNode(""), ""), "")));

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the void setTileItems(List<TileItem>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testSetTileItems_1()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		List<TileItem> newTileItems = new ArrayList<TileItem>();

		fixture.setTileItems(newTileItems);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setTileItems(List<TileItem>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testSetTileItems_2()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		List<TileItem> newTileItems = null;

		fixture.setTileItems(newTileItems);

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
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));

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
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testToString_2()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));

		String result = fixture.toString();

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
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testWriteAttributes_1()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
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
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testWriteAttributes_2()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
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
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testWriteAttributes_3()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
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
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testWriteChildren_1()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
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
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testWriteChildren_2()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
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
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testWriteChildren_3()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
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
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testWriteChildren_4()
		throws Exception {
		TileItemContainer fixture = new TileItemContainer(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), ""));
		fixture.addTileItem(new LostCityRumour(new Game(new IIOMetadataNode(), ""), new Tile(new Game(new IIOMetadataNode(), ""), "")));
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
	 * @generatedBy CodePro at 5/14/18 4:30 PM
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
	 * @generatedBy CodePro at 5/14/18 4:30 PM
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
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TileItemContainerTest.class);
	}
}