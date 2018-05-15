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
 * The class <code>TradeRouteTest</code> contains tests for the class <code>{@link TradeRoute}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:32 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class TradeRouteTest {
	/**
	 * Run the TradeRoute(Game,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testTradeRoute_1()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		String id = "";

		TradeRoute result = new TradeRoute(game, id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the TradeRoute(Game,Element) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testTradeRoute_2()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		Element e = new IIOMetadataNode();

		TradeRoute result = new TradeRoute(game, e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the TradeRoute(Game,String,Player) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testTradeRoute_3()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		String name = "";
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		TradeRoute result = new TradeRoute(game, name, player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the void addStop(TradeRouteStop) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testAddStop_1()
		throws Exception {
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));
		TradeRouteStop stop = new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));

		fixture.addStop(stop);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void clearStops() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testClearStops_1()
		throws Exception {
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);

		fixture.clearStops();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the List<Unit> getAssignedUnits() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testGetAssignedUnits_1()
		throws Exception {
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));

		List<Unit> result = fixture.getAssignedUnits();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getIndex(TradeRouteStop) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testGetIndex_1()
		throws Exception {
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));
		TradeRouteStop stop = new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));

		int result = fixture.getIndex(stop);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getIndex(TradeRouteStop) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testGetIndex_2()
		throws Exception {
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));
		TradeRouteStop stop = new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));

		int result = fixture.getIndex(stop);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getIndex(TradeRouteStop) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testGetIndex_3()
		throws Exception {
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));
		TradeRouteStop stop = new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));

		int result = fixture.getIndex(stop);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));

		String result = fixture.getName();

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
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testGetOwner_1()
		throws Exception {
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));

		Player result = fixture.getOwner();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<TradeRouteStop> getStopSublist(TradeRouteStop,TradeRouteStop) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testGetStopSublist_1()
		throws Exception {
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));
		TradeRouteStop start = new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
		TradeRouteStop end = new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));

		List<TradeRouteStop> result = fixture.getStopSublist(start, end);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<TradeRouteStop> getStopSublist(TradeRouteStop,TradeRouteStop) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testGetStopSublist_2()
		throws Exception {
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));
		TradeRouteStop start = new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
		TradeRouteStop end = new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));

		List<TradeRouteStop> result = fixture.getStopSublist(start, end);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<TradeRouteStop> getStopSublist(TradeRouteStop,TradeRouteStop) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testGetStopSublist_3()
		throws Exception {
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));
		TradeRouteStop start = new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
		TradeRouteStop end = new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));

		List<TradeRouteStop> result = fixture.getStopSublist(start, end);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<TradeRouteStop> getStopSublist(TradeRouteStop,TradeRouteStop) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testGetStopSublist_4()
		throws Exception {
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));
		TradeRouteStop start = new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
		TradeRouteStop end = new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));

		List<TradeRouteStop> result = fixture.getStopSublist(start, end);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<TradeRouteStop> getStopSublist(TradeRouteStop,TradeRouteStop) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testGetStopSublist_5()
		throws Exception {
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));
		TradeRouteStop start = new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
		TradeRouteStop end = new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));

		List<TradeRouteStop> result = fixture.getStopSublist(start, end);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<TradeRouteStop> getStops() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testGetStops_1()
		throws Exception {
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));

		List<TradeRouteStop> result = fixture.getStops();

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

		String result = TradeRoute.getXMLElementTagName();

		// add additional test code here
		assertEquals("tradeRoute", result);
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
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));

		String result = fixture.getXMLTagName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the boolean isSilent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testIsSilent_1()
		throws Exception {
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));

		boolean result = fixture.isSilent();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isSilent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testIsSilent_2()
		throws Exception {
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(false);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));

		boolean result = fixture.isSilent();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isStopValid(Player,TradeRouteStop) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testIsStopValid_1()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		TradeRouteStop stop = new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));

		boolean result = TradeRoute.isStopValid(player, stop);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isStopValid(Player,TradeRouteStop) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testIsStopValid_2()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		TradeRouteStop stop = null;

		boolean result = TradeRoute.isStopValid(player, stop);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isStopValid(Player,TradeRouteStop) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testIsStopValid_3()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		TradeRouteStop stop = new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));

		boolean result = TradeRoute.isStopValid(player, stop);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isStopValid(Unit,TradeRouteStop) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testIsStopValid_4()
		throws Exception {
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setOwner(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		TradeRouteStop stop = new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));

		boolean result = TradeRoute.isStopValid(unit, stop);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isStopValid(Unit,TradeRouteStop) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testIsStopValid_5()
		throws Exception {
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setOwner(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		TradeRouteStop stop = new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));

		boolean result = TradeRoute.isStopValid(unit, stop);

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
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));
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
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));
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
	public void testReadAttributes_3()
		throws Exception {
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));
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
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));
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
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));
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
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));
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
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));
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
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
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
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void removeStop(TradeRouteStop) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testRemoveStop_1()
		throws Exception {
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));
		TradeRouteStop stop = new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));

		fixture.removeStop(stop);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));
		String newName = "";

		fixture.setName(newName);

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
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testSetOwner_1()
		throws Exception {
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));
		Player newOwner = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		fixture.setOwner(newOwner);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setSilent(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testSetSilent_1()
		throws Exception {
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));
		boolean silent = true;

		fixture.setSilent(silent);

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
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", (Player) null);
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));

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
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the void updateFrom(TradeRoute) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testUpdateFrom_1()
		throws Exception {
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		TradeRoute other = new TradeRoute(new Game(new IIOMetadataNode(), ""), "");
		other.setSilent(true);

		fixture.updateFrom(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void updateFrom(TradeRoute) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testUpdateFrom_2()
		throws Exception {
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		TradeRoute other = new TradeRoute(new Game(new IIOMetadataNode(), ""), "");
		other.setSilent(true);

		fixture.updateFrom(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the StringTemplate verify() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testVerify_1()
		throws Exception {
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", (Player) null);
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));

		StringTemplate result = fixture.verify();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate verify() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testVerify_2()
		throws Exception {
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));

		StringTemplate result = fixture.verify();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate verify() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testVerify_3()
		throws Exception {
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));

		StringTemplate result = fixture.verify();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate verify() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testVerify_4()
		throws Exception {
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));

		StringTemplate result = fixture.verify();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate verify() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testVerify_5()
		throws Exception {
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));

		StringTemplate result = fixture.verify();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate verify() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testVerify_6()
		throws Exception {
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));

		StringTemplate result = fixture.verify();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate verify() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:32 PM
	 */
	@Test
	public void testVerify_7()
		throws Exception {
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));

		StringTemplate result = fixture.verify();

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
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));
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
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));
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
	public void testWriteAttributes_3()
		throws Exception {
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));
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
	public void testWriteAttributes_4()
		throws Exception {
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));
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
	public void testWriteAttributes_5()
		throws Exception {
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));
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
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));
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
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));
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
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));
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
		TradeRoute fixture = new TradeRoute(new Game(new IIOMetadataNode(), ""), "", new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setSilent(true);
		fixture.addStop(new TradeRouteStop(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), ""))));
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
		new org.junit.runner.JUnitCore().run(TradeRouteTest.class);
	}
}