package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import javax.imageio.metadata.IIOMetadataNode;
import net.sf.freecol.common.io.FreeColXMLReader;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>TradeItemTest</code> contains tests for the class <code>{@link TradeItem}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:31 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class TradeItemTest {
	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		TradeItem fixture = new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));
		Object other = new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

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
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		TradeItem fixture = new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));
		Object other = new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

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
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		TradeItem fixture = new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));
		Object other = new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

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
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		TradeItem fixture = new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));
		Object other = new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

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
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		TradeItem fixture = new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));
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
	 * Run the Colony getColony(Game) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testGetColony_1()
		throws Exception {
		TradeItem fixture = new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));
		Game game = new Game(new IIOMetadataNode(), "");

		Colony result = fixture.getColony(game);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Player getDestination() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testGetDestination_1()
		throws Exception {
		TradeItem fixture = new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		Player result = fixture.getDestination();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Game getGame() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testGetGame_1()
		throws Exception {
		TradeItem fixture = new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		Game result = fixture.getGame();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getGold() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testGetGold_1()
		throws Exception {
		TradeItem fixture = new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		int result = fixture.getGold();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the Goods getGoods() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testGetGoods_1()
		throws Exception {
		TradeItem fixture = new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		Goods result = fixture.getGoods();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Player getOther(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testGetOther_1()
		throws Exception {
		TradeItem fixture = new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		Player result = fixture.getOther(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Player getOther(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testGetOther_2()
		throws Exception {
		TradeItem fixture = new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		Player result = fixture.getOther(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Player getSource() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testGetSource_1()
		throws Exception {
		TradeItem fixture = new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		Player result = fixture.getSource();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Stance getStance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testGetStance_1()
		throws Exception {
		TradeItem fixture = new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		Stance result = fixture.getStance();

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
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testGetUnit_1()
		throws Exception {
		TradeItem fixture = new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		Unit result = fixture.getUnit();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Player getVictim() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testGetVictim_1()
		throws Exception {
		TradeItem fixture = new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		Player result = fixture.getVictim();

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
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		TradeItem fixture = new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		int result = fixture.hashCode();

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
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		TradeItem fixture = new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));
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
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		TradeItem fixture = new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));
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
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testReadAttributes_3()
		throws Exception {
		TradeItem fixture = new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));
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
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testReadAttributes_4()
		throws Exception {
		TradeItem fixture = new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setDestination(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testSetDestination_1()
		throws Exception {
		TradeItem fixture = new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));
		Player newDestination = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		fixture.setDestination(newDestination);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setGold(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testSetGold_1()
		throws Exception {
		TradeItem fixture = new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));
		int gold = 1;

		fixture.setGold(gold);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setGoods(Goods) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testSetGoods_1()
		throws Exception {
		TradeItem fixture = new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));
		Goods goods = new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		fixture.setGoods(goods);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setSource(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testSetSource_1()
		throws Exception {
		TradeItem fixture = new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));
		Player newSource = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		fixture.setSource(newSource);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setStance(Stance) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testSetStance_1()
		throws Exception {
		TradeItem fixture = new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));
		Stance stance = Stance.ALLIANCE;

		fixture.setStance(stance);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setUnit(Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testSetUnit_1()
		throws Exception {
		TradeItem fixture = new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		fixture.setUnit(unit);

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
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testWriteAttributes_1()
		throws Exception {
		TradeItem fixture = new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));
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
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testWriteAttributes_2()
		throws Exception {
		TradeItem fixture = new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));
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
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testWriteAttributes_3()
		throws Exception {
		TradeItem fixture = new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));
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
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	@Test
	public void testWriteAttributes_4()
		throws Exception {
		TradeItem fixture = new ColonyTradeItem(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));
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
	 * @generatedBy CodePro at 5/14/18 4:31 PM
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
	 * @generatedBy CodePro at 5/14/18 4:31 PM
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
	 * @generatedBy CodePro at 5/14/18 4:31 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TradeItemTest.class);
	}
}