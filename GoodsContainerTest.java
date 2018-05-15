package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import java.util.Iterator;
import java.util.List;
import javax.imageio.metadata.IIOMetadataNode;
import net.sf.freecol.common.io.FreeColXMLReader;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>GoodsContainerTest</code> contains tests for the class <code>{@link GoodsContainer}</code>.
 *
 * @generatedBy CodePro at 5/14/18 3:27 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class GoodsContainerTest {
	/**
	 * Run the GoodsContainer(Game,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testGoodsContainer_1()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		String id = "";

		GoodsContainer result = new GoodsContainer(game, id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the GoodsContainer(Game,Location) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testGoodsContainer_2()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		Location parent = new HighSeas(new Game(new IIOMetadataNode(), ""));

		GoodsContainer result = new GoodsContainer(game, parent);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the GoodsContainer(Game,Location,Element) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testGoodsContainer_3()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		Location parent = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Element e = new IIOMetadataNode();

		GoodsContainer result = new GoodsContainer(game, parent, e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the boolean addGoods(AbstractGoods) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testAddGoods_1()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
		AbstractGoods goods = new AbstractGoods(new GoodsType("", new Specification()), 1);

		boolean result = fixture.addGoods(goods);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean addGoods(AbstractGoods) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testAddGoods_2()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
		AbstractGoods goods = new AbstractGoods(new GoodsType("", new Specification()), 1);

		boolean result = fixture.addGoods(goods);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean addGoods(GoodsType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testAddGoods_3()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
		GoodsType type = new GoodsType("", new Specification());
		int amount = 1;

		boolean result = fixture.addGoods(type, amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean addGoods(GoodsType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testAddGoods_4()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
		GoodsType type = new GoodsType("", new Specification());
		int amount = 1;

		boolean result = fixture.addGoods(type, amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean addGoods(GoodsType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testAddGoods_5()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
		GoodsType type = new GoodsType("", new Specification());
		int amount = 1;

		boolean result = fixture.addGoods(type, amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean contains(Goods) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testContains_1()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
		Goods g = new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		boolean result = fixture.contains(g);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean contains(Goods) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testContains_2()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
		Goods g = new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		boolean result = fixture.contains(g);

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
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testDisposeResources_1()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));

		fixture.disposeResources();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the boolean fireChanges() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testFireChanges_1()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));

		boolean result = fixture.fireChanges();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean fireChanges() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testFireChanges_2()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));

		boolean result = fixture.fireChanges();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean fireChanges() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testFireChanges_3()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));

		boolean result = fixture.fireChanges();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the List<Goods> getCompactGoods() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testGetCompactGoods_1()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));

		List<Goods> result = fixture.getCompactGoods();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Goods> getCompactGoods() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testGetCompactGoods_2()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));

		List<Goods> result = fixture.getCompactGoods();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Goods> getCompactGoods() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testGetCompactGoods_3()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));

		List<Goods> result = fixture.getCompactGoods();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Goods> getGoods() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testGetGoods_1()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));

		List<Goods> result = fixture.getGoods();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Goods> getGoods() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testGetGoods_2()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));

		List<Goods> result = fixture.getGoods();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Goods> getGoods() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testGetGoods_3()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));

		List<Goods> result = fixture.getGoods();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<Goods> getGoods() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testGetGoods_4()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));

		List<Goods> result = fixture.getGoods();

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
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testGetGoodsCount_1()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
		GoodsType type = new GoodsType("", new Specification());

		int result = fixture.getGoodsCount(type);

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
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testGetGoodsCount_2()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
		GoodsType type = new GoodsType("", new Specification());

		int result = fixture.getGoodsCount(type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the Iterator<Goods> getGoodsIterator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testGetGoodsIterator_1()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));

		Iterator<Goods> result = fixture.getGoodsIterator();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getOldGoodsCount(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testGetOldGoodsCount_1()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
		GoodsType type = new GoodsType("", new Specification());

		int result = fixture.getOldGoodsCount(type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getOldGoodsCount(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testGetOldGoodsCount_2()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
		GoodsType type = new GoodsType("", new Specification());

		int result = fixture.getOldGoodsCount(type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
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
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));

		Player result = fixture.getOwner();

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
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testGetOwner_2()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));

		Player result = fixture.getOwner();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
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
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));

		int result = fixture.getSpaceTaken();

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
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = GoodsContainer.getXMLElementTagName();

		// add additional test code here
		assertEquals("goodsContainer", result);
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
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));

		String result = fixture.getXMLTagName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the boolean hasChanged() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testHasChanged_1()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));

		boolean result = fixture.hasChanged();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasChanged() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testHasChanged_2()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));

		boolean result = fixture.hasChanged();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasReachedCapacity(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testHasReachedCapacity_1()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
		int amount = 1;

		boolean result = fixture.hasReachedCapacity(amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasReachedCapacity(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testHasReachedCapacity_2()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
		int amount = 1;

		boolean result = fixture.hasReachedCapacity(amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testReadChild_1()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testReadChild_2()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testReadChild_3()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testReadChild_4()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testReadChild_5()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testReadChild_6()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testReadChildren_1()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testReadChildren_2()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void removeAbove(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testRemoveAbove_1()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
		int newAmount = 0;

		fixture.removeAbove(newAmount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void removeAbove(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testRemoveAbove_2()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
		int newAmount = 1;

		fixture.removeAbove(newAmount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void removeAbove(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testRemoveAbove_3()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
		int newAmount = 1;

		fixture.removeAbove(newAmount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void removeAbove(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testRemoveAbove_4()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
		int newAmount = 1;

		fixture.removeAbove(newAmount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void removeAbove(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testRemoveAbove_5()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
		int newAmount = 1;

		fixture.removeAbove(newAmount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void removeAbove(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testRemoveAbove_6()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
		int newAmount = 1;

		fixture.removeAbove(newAmount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void removeAll() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testRemoveAll_1()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));

		fixture.removeAll();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the Goods removeGoods(AbstractGoods) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testRemoveGoods_1()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
		AbstractGoods goods = new AbstractGoods(new GoodsType("", new Specification()), 1);

		Goods result = fixture.removeGoods(goods);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Goods removeGoods(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testRemoveGoods_2()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
		GoodsType type = new GoodsType("", new Specification());

		Goods result = fixture.removeGoods(type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Goods removeGoods(GoodsType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testRemoveGoods_3()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
		GoodsType type = new GoodsType("", new Specification());
		int amount = 1;

		Goods result = fixture.removeGoods(type, amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Goods removeGoods(GoodsType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testRemoveGoods_4()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
		GoodsType type = new GoodsType("", new Specification());
		int amount = 1;

		Goods result = fixture.removeGoods(type, amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Goods removeGoods(GoodsType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testRemoveGoods_5()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
		GoodsType type = new GoodsType("", new Specification());
		int amount = 1;

		Goods result = fixture.removeGoods(type, amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the void restoreState() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testRestoreState_1()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));

		fixture.restoreState();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void saveState() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testSaveState_1()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));

		fixture.saveState();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setAmount(GoodsType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testSetAmount_1()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
		GoodsType goodsType = new GoodsType("", new Specification());
		int newAmount = 1;

		fixture.setAmount(goodsType, newAmount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setAmount(GoodsType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testSetAmount_2()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
		GoodsType goodsType = new GoodsType("", new Specification());
		int newAmount = 0;

		fixture.setAmount(goodsType, newAmount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setLocation(Location) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testSetLocation_1()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
		Location location = null;

		fixture.setLocation(location);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setLocation(Location) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testSetLocation_2()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
		Location location = new HighSeas(new Game(new IIOMetadataNode(), ""));

		fixture.setLocation(location);

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
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testSetOwner_1()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
		Player p = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		fixture.setOwner(p);

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
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));

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
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testToString_2()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testWriteChildren_1()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testWriteChildren_2()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testWriteChildren_3()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testWriteChildren_4()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
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
	 * @generatedBy CodePro at 5/14/18 3:27 PM
	 */
	@Test
	public void testWriteChildren_5()
		throws Exception {
		GoodsContainer fixture = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));
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
		new org.junit.runner.JUnitCore().run(GoodsContainerTest.class);
	}
}