package net.sf.freecol.common.model;

import java.util.ArrayList;
import java.util.List;
import javax.imageio.metadata.IIOMetadataNode;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>MarketWasTest</code> contains tests for the class <code>{@link MarketWas}</code>.
 *
 * @generatedBy CodePro at 5/14/18 3:51 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class MarketWasTest {
	/**
	 * Run the MarketWas(Player) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testMarketWas_1()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setTax(1);
		player.market = new Market(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));

		MarketWas result = new MarketWas(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the MarketWas(Player) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testMarketWas_2()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setTax(1);
		player.market = new Market(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));

		MarketWas result = new MarketWas(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the void fireChanges(List<AbstractGoods>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testFireChanges_1()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setTax(1);
		player.market = new Market(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		MarketWas fixture = new MarketWas(player);
		List<AbstractGoods> req = new ArrayList<AbstractGoods>();

		fixture.fireChanges(req);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void fireChanges(List<AbstractGoods>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testFireChanges_2()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setTax(1);
		player.market = new Market(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		MarketWas fixture = new MarketWas(player);
		List<AbstractGoods> req = new ArrayList<AbstractGoods>();

		fixture.fireChanges(req);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void fireChanges(GoodsType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testFireChanges_3()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setTax(1);
		player.market = new Market(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		MarketWas fixture = new MarketWas(player);
		GoodsType type = new GoodsType("", new Specification());
		int amount = 1;

		fixture.fireChanges(type, amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void fireChanges(GoodsType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testFireChanges_4()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setTax(1);
		player.market = new Market(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		MarketWas fixture = new MarketWas(player);
		GoodsType type = new GoodsType("", new Specification());
		int amount = 1;

		fixture.fireChanges(type, amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void fireChanges(GoodsType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testFireChanges_5()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setTax(1);
		player.market = new Market(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		MarketWas fixture = new MarketWas(player);
		GoodsType type = new GoodsType("", new Specification());
		int amount = 1;

		fixture.fireChanges(type, amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void fireChanges(GoodsType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testFireChanges_6()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setTax(1);
		player.market = new Market(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		MarketWas fixture = new MarketWas(player);
		GoodsType type = new GoodsType("", new Specification());
		int amount = 1;

		fixture.fireChanges(type, amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void fireChanges(GoodsType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testFireChanges_7()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setTax(1);
		player.market = new Market(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		MarketWas fixture = new MarketWas(player);
		GoodsType type = new GoodsType("", new Specification());
		int amount = 1;

		fixture.fireChanges(type, amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void fireChanges(GoodsType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testFireChanges_8()
		throws Exception {
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.setTax(1);
		player.market = new Market(new Game(new IIOMetadataNode(), ""), new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		MarketWas fixture = new MarketWas(player);
		GoodsType type = new GoodsType("", new Specification());
		int amount = 1;

		fixture.fireChanges(type, amount);

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
	 * @generatedBy CodePro at 5/14/18 3:51 PM
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
	 * @generatedBy CodePro at 5/14/18 3:51 PM
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
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MarketWasTest.class);
	}
}