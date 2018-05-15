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
 * The class <code>GoodsTest</code> contains tests for the class <code>{@link Goods}</code>.
 *
 * @generatedBy CodePro at 5/14/18 3:27 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class GoodsTest {
	/**
	 * Run the Goods(Game,FreeColXMLReader) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testGoods_1()
		throws Exception {
		Game game = new Game(new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		Goods result = new Goods(game, xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Goods.<init>(Goods.java:101)
		assertNotNull(result);
	}

	/**
	 * Run the Goods(Game,FreeColXMLReader) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testGoods_2()
		throws Exception {
		Game game = new Game(new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		Goods result = new Goods(game, xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.Goods.<init>(Goods.java:101)
		assertNotNull(result);
	}

	/**
	 * Run the Goods(Game,Element) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testGoods_3()
		throws Exception {
		Game game = new Game(new Specification());
		Element e = new IIOMetadataNode();

		Goods result = new Goods(game, e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Goods.<init>(Goods.java:113)
		assertNotNull(result);
	}

	/**
	 * Run the Goods(Game,Location,GoodsType,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testGoods_4()
		throws Exception {
		Game game = null;
		Location location = new HighSeas(new Game(new IIOMetadataNode(), ""));
		GoodsType type = new GoodsType("", new Specification());
		int amount = 1;

		Goods result = new Goods(game, location, type, amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Goods(Game,Location,GoodsType,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testGoods_5()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		Location location = new HighSeas(new Game(new IIOMetadataNode(), ""));
		GoodsType type = null;
		int amount = 1;

		Goods result = new Goods(game, location, type, amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Goods(Game,Location,GoodsType,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testGoods_6()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		Location location = new HighSeas(new Game(new IIOMetadataNode(), ""));
		GoodsType type = new GoodsType("", new Specification());
		int amount = 1;

		Goods result = new Goods(game, location, type, amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Goods(Game,Location,GoodsType,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testGoods_7()
		throws Exception {
		Game game = new Game(new Specification());
		Location location = null;
		GoodsType type = new GoodsType("", new Specification());
		int amount = 1;

		Goods result = new Goods(game, location, type, amount);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getLocation());
		assertEquals(null, result.getOwner());
		assertEquals(false, result.isInEurope());
		assertEquals("goods", result.getXMLTagName());
		assertEquals(1, result.getSpaceTaken());
		assertEquals(null, result.getTile());
		assertEquals("1 ", result.toString());
		assertEquals(1, result.getAmount());
		assertEquals(".name", result.getNameKey());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<goods id=\"\" type=\"\" amount=\"1\"></goods>", result.serialize());
		assertEquals(null, result.getFeatureContainer());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the Goods(Game,Location,GoodsType,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testGoods_8()
		throws Exception {
		Game game = new Game(new Specification());
		Location location = new HighSeas(new Game(new IIOMetadataNode(), ""));
		GoodsType type = new GoodsType("", new Specification());
		int amount = 1;

		Goods result = new Goods(game, location, type, amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the void adjustAmount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testAdjustAmount_1()
		throws Exception {
		Goods fixture = new Goods(new Game(new Specification()), new IIOMetadataNode());
		fixture.setLocation((Location) null);

		fixture.adjustAmount();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Goods.<init>(Goods.java:113)
	}

	/**
	 * Run the void adjustAmount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testAdjustAmount_2()
		throws Exception {
		Goods fixture = new Goods(new Game(new Specification()), new IIOMetadataNode());
		fixture.setLocation(new HighSeas(new Game(new IIOMetadataNode(), "")));

		fixture.adjustAmount();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Goods.<init>(Goods.java:113)
	}

	/**
	 * Run the void adjustAmount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testAdjustAmount_3()
		throws Exception {
		Goods fixture = new Goods(new Game(new Specification()), new IIOMetadataNode());
		fixture.setLocation(new HighSeas(new Game(new IIOMetadataNode(), "")));

		fixture.adjustAmount();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Goods.<init>(Goods.java:113)
	}

	/**
	 * Run the void adjustAmount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testAdjustAmount_4()
		throws Exception {
		Goods fixture = new Goods(new Game(new Specification()), new IIOMetadataNode());
		fixture.setLocation(new HighSeas(new Game(new IIOMetadataNode(), "")));

		fixture.adjustAmount();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Goods.<init>(Goods.java:113)
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		Goods fixture = new Goods(new Game(new Specification()), new IIOMetadataNode());
		fixture.setLocation(new HighSeas(new Game(new IIOMetadataNode(), "")));
		Object o = new Goods(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")), new GoodsType("", new Specification()), 1);

		boolean result = fixture.equals(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Goods.<init>(Goods.java:113)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		Goods fixture = new Goods(new Game(new Specification()), new IIOMetadataNode());
		fixture.setLocation(new HighSeas(new Game(new IIOMetadataNode(), "")));
		Object o = new Goods(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")), new GoodsType("", new Specification()), 1);

		boolean result = fixture.equals(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Goods.<init>(Goods.java:113)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		Goods fixture = new Goods(new Game(new Specification()), new IIOMetadataNode());
		fixture.setLocation(new HighSeas(new Game(new IIOMetadataNode(), "")));
		Object o = new Goods(new Game(new Specification()), new HighSeas(new Game(new IIOMetadataNode(), "")), new GoodsType("", new Specification()), 1);

		boolean result = fixture.equals(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Goods.<init>(Goods.java:113)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		Goods fixture = new Goods(new Game(new Specification()), new IIOMetadataNode());
		fixture.setLocation(new HighSeas(new Game(new IIOMetadataNode(), "")));
		Object o = new Object();

		boolean result = fixture.equals(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Goods.<init>(Goods.java:113)
		assertTrue(result);
	}

	/**
	 * Run the Game getGame() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testGetGame_1()
		throws Exception {
		Goods fixture = new Goods(new Game(new Specification()), new IIOMetadataNode());
		fixture.setLocation(new HighSeas(new Game(new IIOMetadataNode(), "")));

		Game result = fixture.getGame();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Goods.<init>(Goods.java:113)
		assertNotNull(result);
	}

	/**
	 * Run the Location getLocation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testGetLocation_1()
		throws Exception {
		Goods fixture = new Goods(new Game(new Specification()), new IIOMetadataNode());
		fixture.setLocation(new HighSeas(new Game(new IIOMetadataNode(), "")));

		Location result = fixture.getLocation();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Goods.<init>(Goods.java:113)
		assertNotNull(result);
	}

	/**
	 * Run the Player getOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testGetOwner_1()
		throws Exception {
		Goods fixture = new Goods(new Game(new Specification()), new IIOMetadataNode());
		fixture.setLocation(new HighSeas(new Game(new IIOMetadataNode(), "")));

		Player result = fixture.getOwner();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Goods.<init>(Goods.java:113)
		assertNotNull(result);
	}

	/**
	 * Run the Player getOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testGetOwner_2()
		throws Exception {
		Goods fixture = new Goods(new Game(new Specification()), new IIOMetadataNode());
		fixture.setLocation(new HighSeas(new Game(new IIOMetadataNode(), "")));

		Player result = fixture.getOwner();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Goods.<init>(Goods.java:113)
		assertNotNull(result);
	}

	/**
	 * Run the int getSpaceTaken() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testGetSpaceTaken_1()
		throws Exception {
		Goods fixture = new Goods(new Game(new Specification()), new IIOMetadataNode());
		fixture.setLocation(new HighSeas(new Game(new IIOMetadataNode(), "")));

		int result = fixture.getSpaceTaken();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Goods.<init>(Goods.java:113)
		assertEquals(0, result);
	}

	/**
	 * Run the Tile getTile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testGetTile_1()
		throws Exception {
		Goods fixture = new Goods(new Game(new Specification()), new IIOMetadataNode());
		fixture.setLocation(new HighSeas(new Game(new IIOMetadataNode(), "")));

		Tile result = fixture.getTile();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Goods.<init>(Goods.java:113)
		assertNotNull(result);
	}

	/**
	 * Run the Tile getTile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testGetTile_2()
		throws Exception {
		Goods fixture = new Goods(new Game(new Specification()), new IIOMetadataNode());
		fixture.setLocation((Location) null);

		Tile result = fixture.getTile();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Goods.<init>(Goods.java:113)
		assertNotNull(result);
	}

	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = Goods.getXMLElementTagName();

		// add additional test code here
		assertEquals("goods", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		Goods fixture = new Goods(new Game(new Specification()), new IIOMetadataNode());
		fixture.setLocation(new HighSeas(new Game(new IIOMetadataNode(), "")));

		String result = fixture.getXMLTagName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Goods.<init>(Goods.java:113)
		assertNotNull(result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		Goods fixture = new Goods(new Game(new Specification()), new IIOMetadataNode());
		fixture.setLocation(new HighSeas(new Game(new IIOMetadataNode(), "")));

		int result = fixture.hashCode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Goods.<init>(Goods.java:113)
		assertEquals(0, result);
	}

	/**
	 * Run the boolean isInEurope() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testIsInEurope_1()
		throws Exception {
		Goods fixture = new Goods(new Game(new Specification()), new IIOMetadataNode());
		fixture.setLocation(new HighSeas(new Game(new IIOMetadataNode(), "")));

		boolean result = fixture.isInEurope();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Goods.<init>(Goods.java:113)
		assertTrue(result);
	}

	/**
	 * Run the boolean isInEurope() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testIsInEurope_2()
		throws Exception {
		Goods fixture = new Goods(new Game(new Specification()), new IIOMetadataNode());
		fixture.setLocation(new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));

		boolean result = fixture.isInEurope();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Goods.<init>(Goods.java:113)
		assertTrue(result);
	}

	/**
	 * Run the boolean isInEurope() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testIsInEurope_3()
		throws Exception {
		Goods fixture = new Goods(new Game(new Specification()), new IIOMetadataNode());
		fixture.setLocation(new HighSeas(new Game(new IIOMetadataNode(), "")));

		boolean result = fixture.isInEurope();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Goods.<init>(Goods.java:113)
		assertTrue(result);
	}

	/**
	 * Run the boolean isInEurope() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testIsInEurope_4()
		throws Exception {
		Goods fixture = new Goods(new Game(new Specification()), new IIOMetadataNode());
		fixture.setLocation(new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));

		boolean result = fixture.isInEurope();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Goods.<init>(Goods.java:113)
		assertTrue(result);
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		Goods fixture = new Goods(new Game(new Specification()), new IIOMetadataNode());
		fixture.setLocation(new HighSeas(new Game(new IIOMetadataNode(), "")));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Goods.<init>(Goods.java:113)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		Goods fixture = new Goods(new Game(new Specification()), new IIOMetadataNode());
		fixture.setLocation(new HighSeas(new Game(new IIOMetadataNode(), "")));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Goods.<init>(Goods.java:113)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testReadAttributes_3()
		throws Exception {
		Goods fixture = new Goods(new Game(new Specification()), new IIOMetadataNode());
		fixture.setLocation(new HighSeas(new Game(new IIOMetadataNode(), "")));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Goods.<init>(Goods.java:113)
	}

	/**
	 * Run the boolean setLocation(Location) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testSetLocation_1()
		throws Exception {
		Goods fixture = new Goods(new Game(new Specification()), new IIOMetadataNode());
		fixture.setLocation(new HighSeas(new Game(new IIOMetadataNode(), "")));
		Location location = new HighSeas(new Game(new IIOMetadataNode(), ""));

		boolean result = fixture.setLocation(location);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Goods.<init>(Goods.java:113)
		assertTrue(result);
	}

	/**
	 * Run the void setOwner(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testSetOwner_1()
		throws Exception {
		Goods fixture = new Goods(new Game(new Specification()), new IIOMetadataNode());
		fixture.setLocation(new HighSeas(new Game(new IIOMetadataNode(), "")));
		Player p = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		fixture.setOwner(p);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Goods.<init>(Goods.java:113)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testWriteAttributes_1()
		throws Exception {
		Goods fixture = new Goods(new Game(new Specification()), new IIOMetadataNode());
		fixture.setLocation(new HighSeas(new Game(new IIOMetadataNode(), "")));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Goods.<init>(Goods.java:113)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testWriteAttributes_2()
		throws Exception {
		Goods fixture = new Goods(new Game(new Specification()), new IIOMetadataNode());
		fixture.setLocation(new HighSeas(new Game(new IIOMetadataNode(), "")));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Goods.<init>(Goods.java:113)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testWriteAttributes_3()
		throws Exception {
		Goods fixture = new Goods(new Game(new Specification()), new IIOMetadataNode());
		fixture.setLocation(new HighSeas(new Game(new IIOMetadataNode(), "")));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Goods.<init>(Goods.java:113)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testWriteAttributes_4()
		throws Exception {
		Goods fixture = new Goods(new Game(new Specification()), new IIOMetadataNode());
		fixture.setLocation((Location) null);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Goods.<init>(Goods.java:113)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
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
	 * @generatedBy CodePro at 5/14/18 3:27 PM
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
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(GoodsTest.class);
	}
}