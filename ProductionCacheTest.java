package net.sf.freecol.common.model;

import javax.imageio.metadata.IIOMetadataNode;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>ProductionCacheTest</code> contains tests for the class <code>{@link ProductionCache}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:17 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class ProductionCacheTest {
	/**
	 * Run the ProductionCache(Colony) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testProductionCache_1()
		throws Exception {
		Colony colony = new Colony(new Game(new IIOMetadataNode(), ""), "");

		ProductionCache result = new ProductionCache(colony);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getNetProductionOf(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGetNetProductionOf_1()
		throws Exception {
		ProductionCache fixture = new ProductionCache(new Colony(new Game(new IIOMetadataNode(), ""), ""));
		GoodsType type = new GoodsType("", new Specification());

		int result = fixture.getNetProductionOf(type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the ProductionInfo getProductionInfo(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGetProductionInfo_1()
		throws Exception {
		ProductionCache fixture = new ProductionCache(new Colony(new Game(new IIOMetadataNode(), ""), ""));
		Object object = new Object();

		ProductionInfo result = fixture.getProductionInfo(object);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the TypeCountMap<GoodsType> getProductionMap() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGetProductionMap_1()
		throws Exception {
		ProductionCache fixture = new ProductionCache(new Colony(new Game(new IIOMetadataNode(), ""), ""));

		TypeCountMap<GoodsType> result = fixture.getProductionMap();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the void invalidate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testInvalidate_1()
		throws Exception {
		ProductionCache fixture = new ProductionCache(new Colony(new Game(new IIOMetadataNode(), ""), ""));

		fixture.invalidate();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void invalidate(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testInvalidate_2()
		throws Exception {
		ProductionCache fixture = new ProductionCache(new Colony(new Game(new IIOMetadataNode(), ""), ""));
		GoodsType goodsType = new GoodsType("", new Specification());

		fixture.invalidate(goodsType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void invalidate(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testInvalidate_3()
		throws Exception {
		ProductionCache fixture = new ProductionCache(new Colony(new Game(new IIOMetadataNode(), ""), ""));
		GoodsType goodsType = new GoodsType("", new Specification());

		fixture.invalidate(goodsType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the boolean isConsuming(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testIsConsuming_1()
		throws Exception {
		ProductionCache fixture = new ProductionCache(new Colony(new Game(new IIOMetadataNode(), ""), ""));
		GoodsType goodsType = new GoodsType("", new Specification());

		boolean result = fixture.isConsuming(goodsType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isConsuming(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testIsConsuming_2()
		throws Exception {
		ProductionCache fixture = new ProductionCache(new Colony(new Game(new IIOMetadataNode(), ""), ""));
		GoodsType goodsType = new GoodsType("", new Specification());

		boolean result = fixture.isConsuming(goodsType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isProducing(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testIsProducing_1()
		throws Exception {
		ProductionCache fixture = new ProductionCache(new Colony(new Game(new IIOMetadataNode(), ""), ""));
		GoodsType goodsType = new GoodsType("", new Specification());

		boolean result = fixture.isProducing(goodsType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isProducing(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testIsProducing_2()
		throws Exception {
		ProductionCache fixture = new ProductionCache(new Colony(new Game(new IIOMetadataNode(), ""), ""));
		GoodsType goodsType = new GoodsType("", new Specification());

		boolean result = fixture.isProducing(goodsType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
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
	 * @generatedBy CodePro at 5/14/18 4:17 PM
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
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ProductionCacheTest.class);
	}
}