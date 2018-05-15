package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.sf.freecol.common.io.FreeColXMLReader;
import javax.imageio.metadata.IIOMetadataNode;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>GoodsLocationTest</code> contains tests for the class <code>{@link GoodsLocation}</code>.
 *
 * @generatedBy CodePro at 5/14/18 3:28 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class GoodsLocationTest {
	/**
	 * Run the boolean add(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testAdd_1()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");
		Locatable locatable = new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		boolean result = fixture.add(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean add(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testAdd_2()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");
		Locatable locatable = new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		boolean result = fixture.add(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean add(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testAdd_3()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");
		Locatable locatable = new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		boolean result = fixture.add(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean add(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testAdd_4()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");
		Locatable locatable = new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		boolean result = fixture.add(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean addGoods(List<AbstractGoods>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testAddGoods_1()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");
		List<AbstractGoods> goods = new ArrayList<AbstractGoods>();

		boolean result = fixture.addGoods(goods);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean addGoods(List<AbstractGoods>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testAddGoods_2()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");
		List<AbstractGoods> goods = new ArrayList<AbstractGoods>();

		boolean result = fixture.addGoods(goods);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean addGoods(List<AbstractGoods>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testAddGoods_3()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");
		List<AbstractGoods> goods = new ArrayList<AbstractGoods>();

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
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testAddGoods_4()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testAddGoods_5()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testAddGoods_6()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testAddGoods_7()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");
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
	 * Run the boolean contains(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testContains_1()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");
		Locatable locatable = new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		boolean result = fixture.contains(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean contains(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testContains_2()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");
		Locatable locatable = new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		boolean result = fixture.contains(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean contains(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testContains_3()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");
		Locatable locatable = new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		boolean result = fixture.contains(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean contains(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testContains_4()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");
		Locatable locatable = new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		boolean result = fixture.contains(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean containsGoods(List<AbstractGoods>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testContainsGoods_1()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");
		List<AbstractGoods> goods = new ArrayList<AbstractGoods>();

		boolean result = fixture.containsGoods(goods);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean containsGoods(List<AbstractGoods>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testContainsGoods_2()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");
		List<AbstractGoods> goods = new ArrayList<AbstractGoods>();

		boolean result = fixture.containsGoods(goods);

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
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testGetCompactGoods_1()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");

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
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testGetCompactGoods_2()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");

		List<Goods> result = fixture.getCompactGoods();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<FreeColGameObject> getDisposeList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testGetDisposeList_1()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");

		List<FreeColGameObject> result = fixture.getDisposeList();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<FreeColGameObject> getDisposeList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testGetDisposeList_2()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");

		List<FreeColGameObject> result = fixture.getDisposeList();

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
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testGetGoods_1()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");

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
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testGetGoods_2()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");

		List<Goods> result = fixture.getGoods();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the GoodsContainer getGoodsContainer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testGetGoodsContainer_1()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");

		GoodsContainer result = fixture.getGoodsContainer();

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
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testGetGoodsCount_1()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testGetGoodsCount_2()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testGetGoodsIterator_1()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");

		Iterator<Goods> result = fixture.getGoodsIterator();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Iterator<Goods> getGoodsIterator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testGetGoodsIterator_2()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");

		Iterator<Goods> result = fixture.getGoodsIterator();

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
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testGetNoAddReason_1()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testGetNoAddReason_2()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testGetNoAddReason_3()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");
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
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testReadChild_1()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testReadChild_2()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testReadChild_3()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testReadChild_4()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testReadChildren_1()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testReadChildren_2()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testReadChildren_3()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the boolean remove(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testRemove_1()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");
		Locatable locatable = new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		boolean result = fixture.remove(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean remove(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testRemove_2()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");
		Locatable locatable = new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		boolean result = fixture.remove(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean remove(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testRemove_3()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");
		Locatable locatable = new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		boolean result = fixture.remove(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean remove(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testRemove_4()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");
		Locatable locatable = new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		boolean result = fixture.remove(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the Goods removeGoods(AbstractGoods) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testRemoveGoods_1()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testRemoveGoods_2()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testRemoveGoods_3()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testRemoveGoods_4()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");
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
	 * Run the void setGoodsContainer(GoodsContainer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testSetGoodsContainer_1()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");
		GoodsContainer goodsContainer = new GoodsContainer(new Game(new IIOMetadataNode(), ""), new HighSeas(new Game(new IIOMetadataNode(), "")));

		fixture.setGoodsContainer(goodsContainer);

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
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testWriteChildren_1()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testWriteChildren_2()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testWriteChildren_3()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testWriteChildren_4()
		throws Exception {
		GoodsLocation fixture = new Colony(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/14/18 3:28 PM
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
	 * @generatedBy CodePro at 5/14/18 3:28 PM
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
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(GoodsLocationTest.class);
	}
}