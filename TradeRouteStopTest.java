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
 * The class <code>TradeRouteStopTest</code> contains tests for the class <code>{@link TradeRouteStop}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:32 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class TradeRouteStopTest {
	/**
	 * Run the TradeRouteStop(TradeRouteStop) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testTradeRouteStop_1()
		throws Exception {
		TradeRouteStop other = new TradeRouteStop(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")));
		other.addCargo(new GoodsType("", new Specification()));

		TradeRouteStop result = new TradeRouteStop(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the TradeRouteStop(Game,FreeColXMLReader) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testTradeRouteStop_2()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		TradeRouteStop result = new TradeRouteStop(game, xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the TradeRouteStop(Game,FreeColXMLReader) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testTradeRouteStop_3()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		TradeRouteStop result = new TradeRouteStop(game, xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the TradeRouteStop(Game,Location) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testTradeRouteStop_4()
		throws Exception {
		Game game = new Game(new Specification());
		Location location = new HighSeas(new Game(new IIOMetadataNode(), ""));

		TradeRouteStop result = new TradeRouteStop(game, location);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the void addCargo(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testAddCargo_1()
		throws Exception {
		TradeRouteStop fixture = new TradeRouteStop(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")));
		fixture.addCargo(new GoodsType("", new Specification()));
		GoodsType newCargo = new GoodsType("", new Specification());

		fixture.addCargo(newCargo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the List<GoodsType> getCargo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testGetCargo_1()
		throws Exception {
		TradeRouteStop fixture = new TradeRouteStop(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")));
		fixture.addCargo(new GoodsType("", new Specification()));

		List<GoodsType> result = fixture.getCargo();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<AbstractGoods> getCompactCargo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testGetCompactCargo_1()
		throws Exception {
		TradeRouteStop fixture = new TradeRouteStop(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")));
		fixture.addCargo(new GoodsType("", new Specification()));

		List<AbstractGoods> result = fixture.getCompactCargo();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<AbstractGoods> getCompactCargo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testGetCompactCargo_2()
		throws Exception {
		TradeRouteStop fixture = new TradeRouteStop(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")));
		fixture.addCargo(new GoodsType("", new Specification()));

		List<AbstractGoods> result = fixture.getCompactCargo();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<AbstractGoods> getCompactCargo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testGetCompactCargo_3()
		throws Exception {
		TradeRouteStop fixture = new TradeRouteStop(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")));
		fixture.addCargo(new GoodsType("", new Specification()));

		List<AbstractGoods> result = fixture.getCompactCargo();

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
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testGetExportAmount_1()
		throws Exception {
		TradeRouteStop fixture = new TradeRouteStop(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")));
		fixture.addCargo(new GoodsType("", new Specification()));
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
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testGetExportAmount_2()
		throws Exception {
		TradeRouteStop fixture = new TradeRouteStop(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")));
		fixture.addCargo(new GoodsType("", new Specification()));
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
	 * Run the int getGoodsCount(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testGetGoodsCount_1()
		throws Exception {
		TradeRouteStop fixture = new TradeRouteStop(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")));
		fixture.addCargo(new GoodsType("", new Specification()));
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
	 * Run the int getGoodsCount(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testGetGoodsCount_2()
		throws Exception {
		TradeRouteStop fixture = new TradeRouteStop(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")));
		fixture.addCargo(new GoodsType("", new Specification()));
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
	 * Run the int getImportAmount(GoodsType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testGetImportAmount_1()
		throws Exception {
		TradeRouteStop fixture = new TradeRouteStop(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")));
		fixture.addCargo(new GoodsType("", new Specification()));
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
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testGetImportAmount_2()
		throws Exception {
		TradeRouteStop fixture = new TradeRouteStop(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")));
		fixture.addCargo(new GoodsType("", new Specification()));
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
	 * Run the StringTemplate getLabelFor(String,Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testGetLabelFor_1()
		throws Exception {
		TradeRouteStop fixture = new TradeRouteStop(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")));
		fixture.addCargo(new GoodsType("", new Specification()));
		String key = "";
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		StringTemplate result = fixture.getLabelFor(key, player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Location getLocation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testGetLocation_1()
		throws Exception {
		TradeRouteStop fixture = new TradeRouteStop(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")));
		fixture.addCargo(new GoodsType("", new Specification()));

		Location result = fixture.getLocation();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the TradeLocation getTradeLocation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testGetTradeLocation_1()
		throws Exception {
		TradeRouteStop fixture = new TradeRouteStop(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")));
		fixture.addCargo(new GoodsType("", new Specification()));

		TradeLocation result = fixture.getTradeLocation();

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
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = TradeRouteStop.getXMLElementTagName();

		// add additional test code here
		assertEquals("tradeRouteStop", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		TradeRouteStop fixture = new TradeRouteStop(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")));
		fixture.addCargo(new GoodsType("", new Specification()));

		String result = fixture.getXMLTagName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the boolean hasWork(Unit,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testHasWork_1()
		throws Exception {
		TradeRouteStop fixture = new TradeRouteStop(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")));
		fixture.addCargo(new GoodsType("", new Specification()));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		int turns = 1;

		boolean result = fixture.hasWork(unit, turns);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasWork(Unit,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testHasWork_2()
		throws Exception {
		TradeRouteStop fixture = new TradeRouteStop(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")));
		fixture.addCargo(new GoodsType("", new Specification()));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		int turns = 1;

		boolean result = fixture.hasWork(unit, turns);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasWork(Unit,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testHasWork_3()
		throws Exception {
		TradeRouteStop fixture = new TradeRouteStop(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")));
		fixture.addCargo(new GoodsType("", new Specification()));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		int turns = 1;

		boolean result = fixture.hasWork(unit, turns);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the StringTemplate invalidStopLabel(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testInvalidStopLabel_1()
		throws Exception {
		TradeRouteStop fixture = new TradeRouteStop(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")));
		fixture.addCargo(new GoodsType("", new Specification()));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		StringTemplate result = fixture.invalidStopLabel(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the boolean isValid(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testIsValid_1()
		throws Exception {
		TradeRouteStop fixture = new TradeRouteStop(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")));
		fixture.addCargo(new GoodsType("", new Specification()));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		boolean result = fixture.isValid(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isValid(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testIsValid_2()
		throws Exception {
		TradeRouteStop fixture = new TradeRouteStop(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")));
		fixture.addCargo(new GoodsType("", new Specification()));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		boolean result = fixture.isValid(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isValid(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testIsValid_3()
		throws Exception {
		TradeRouteStop fixture = new TradeRouteStop(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")));
		fixture.addCargo(new GoodsType("", new Specification()));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		boolean result = fixture.isValid(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isValid(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testIsValid_4()
		throws Exception {
		TradeRouteStop fixture = new TradeRouteStop(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")));
		fixture.addCargo(new GoodsType("", new Specification()));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		boolean result = fixture.isValid(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isValid(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testIsValid_5()
		throws Exception {
		TradeRouteStop fixture = new TradeRouteStop(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")));
		fixture.addCargo(new GoodsType("", new Specification()));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		boolean result = fixture.isValid(player);

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
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		TradeRouteStop fixture = new TradeRouteStop(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")));
		fixture.addCargo(new GoodsType("", new Specification()));
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
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		TradeRouteStop fixture = new TradeRouteStop(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")));
		fixture.addCargo(new GoodsType("", new Specification()));
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
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testReadChild_1()
		throws Exception {
		TradeRouteStop fixture = new TradeRouteStop(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")));
		fixture.addCargo(new GoodsType("", new Specification()));
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
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testReadChild_2()
		throws Exception {
		TradeRouteStop fixture = new TradeRouteStop(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")));
		fixture.addCargo(new GoodsType("", new Specification()));
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
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testReadChild_3()
		throws Exception {
		TradeRouteStop fixture = new TradeRouteStop(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")));
		fixture.addCargo(new GoodsType("", new Specification()));
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
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testReadChild_4()
		throws Exception {
		TradeRouteStop fixture = new TradeRouteStop(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")));
		fixture.addCargo(new GoodsType("", new Specification()));
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
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testReadChildren_1()
		throws Exception {
		TradeRouteStop fixture = new TradeRouteStop(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testReadChildren_2()
		throws Exception {
		TradeRouteStop fixture = new TradeRouteStop(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setCargo(List<GoodsType>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testSetCargo_1()
		throws Exception {
		TradeRouteStop fixture = new TradeRouteStop(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")));
		List<GoodsType> newCargo = new ArrayList<GoodsType>();

		fixture.setCargo(newCargo);

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
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		TradeRouteStop fixture = new TradeRouteStop(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")));
		fixture.addCargo(new GoodsType("", new Specification()));

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
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testToString_2()
		throws Exception {
		TradeRouteStop fixture = new TradeRouteStop(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")));
		fixture.addCargo(new GoodsType("", new Specification()));

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
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testWriteAttributes_1()
		throws Exception {
		TradeRouteStop fixture = new TradeRouteStop(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")));
		fixture.addCargo(new GoodsType("", new Specification()));
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
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testWriteAttributes_2()
		throws Exception {
		TradeRouteStop fixture = new TradeRouteStop(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")));
		fixture.addCargo(new GoodsType("", new Specification()));
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
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testWriteChildren_1()
		throws Exception {
		TradeRouteStop fixture = new TradeRouteStop(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")));
		fixture.addCargo(new GoodsType("", new Specification()));
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
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testWriteChildren_2()
		throws Exception {
		TradeRouteStop fixture = new TradeRouteStop(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")));
		fixture.addCargo(new GoodsType("", new Specification()));
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
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testWriteChildren_3()
		throws Exception {
		TradeRouteStop fixture = new TradeRouteStop(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")));
		fixture.addCargo(new GoodsType("", new Specification()));
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
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testWriteChildren_4()
		throws Exception {
		TradeRouteStop fixture = new TradeRouteStop(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")));
		fixture.addCargo(new GoodsType("", new Specification()));
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
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testWriteChildren_5()
		throws Exception {
		TradeRouteStop fixture = new TradeRouteStop(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")));
		fixture.addCargo(new GoodsType("", new Specification()));
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
	 * @generatedBy CodePro at 5/14/18 4:32 PM
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
	 * @generatedBy CodePro at 5/14/18 4:32 PM
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
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TradeRouteStopTest.class);
	}
}