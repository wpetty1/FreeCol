package net.sf.freecol.common.model;

import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ProductionMapTest</code> contains tests for the class <code>{@link ProductionMap}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:17 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class ProductionMapTest {
	/**
	 * Run the ProductionMap() constructor test.
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testProductionMap_1()
		throws Exception {
		ProductionMap result = new ProductionMap();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void add(List<AbstractGoods>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testAdd_1()
		throws Exception {
		ProductionMap fixture = new ProductionMap();
		List<AbstractGoods> goods = new ArrayList<AbstractGoods>();

		fixture.add(goods);

		// add additional test code here
	}

	/**
	 * Run the void add(List<AbstractGoods>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testAdd_2()
		throws Exception {
		ProductionMap fixture = new ProductionMap();
		List<AbstractGoods> goods = new ArrayList<AbstractGoods>();

		fixture.add(goods);

		// add additional test code here
	}

	/**
	 * Run the void add(AbstractGoods) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testAdd_3()
		throws Exception {
		ProductionMap fixture = new ProductionMap();
		AbstractGoods goods = new AbstractGoods(new GoodsType("", new Specification()), 1);

		fixture.add(goods);

		// add additional test code here
	}

	/**
	 * Run the void add(AbstractGoods) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testAdd_4()
		throws Exception {
		ProductionMap fixture = new ProductionMap();
		AbstractGoods goods = new AbstractGoods(new GoodsType("", new Specification()), 1);

		fixture.add(goods);

		// add additional test code here
	}

	/**
	 * Run the void add(AbstractGoods) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testAdd_5()
		throws Exception {
		ProductionMap fixture = new ProductionMap();
		AbstractGoods goods = new AbstractGoods(new GoodsType("", new Specification()), 1);

		fixture.add(goods);

		// add additional test code here
	}

	/**
	 * Run the void add(AbstractGoods) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testAdd_6()
		throws Exception {
		ProductionMap fixture = new ProductionMap();
		AbstractGoods goods = new AbstractGoods(new GoodsType("", new Specification()), 1);

		fixture.add(goods);

		// add additional test code here
	}

	/**
	 * Run the void add(AbstractGoods) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testAdd_7()
		throws Exception {
		ProductionMap fixture = new ProductionMap();
		AbstractGoods goods = new AbstractGoods(new GoodsType("", new Specification()), 1);

		fixture.add(goods);

		// add additional test code here
	}

	/**
	 * Run the void add(AbstractGoods) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testAdd_8()
		throws Exception {
		ProductionMap fixture = new ProductionMap();
		AbstractGoods goods = new AbstractGoods(new GoodsType("", new Specification()), 1);

		fixture.add(goods);

		// add additional test code here
	}

	/**
	 * Run the AbstractGoods get(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGet_1()
		throws Exception {
		ProductionMap fixture = new ProductionMap();
		GoodsType type = new GoodsType("", new Specification());

		AbstractGoods result = fixture.get(type);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0 ", result.toString());
		assertEquals(".name", result.getNameKey());
		assertEquals("abstractGoods", result.getXMLTagName());
		assertEquals(0, result.getAmount());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("<abstractGoods id=\"\" type=\"\" amount=\"0\"></abstractGoods>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the AbstractGoods get(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGet_2()
		throws Exception {
		ProductionMap fixture = new ProductionMap();
		GoodsType type = new GoodsType("", new Specification());

		AbstractGoods result = fixture.get(type);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0 ", result.toString());
		assertEquals(".name", result.getNameKey());
		assertEquals("abstractGoods", result.getXMLTagName());
		assertEquals(0, result.getAmount());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("<abstractGoods id=\"\" type=\"\" amount=\"0\"></abstractGoods>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the AbstractGoods get(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGet_3()
		throws Exception {
		ProductionMap fixture = new ProductionMap();
		GoodsType type = new GoodsType("", new Specification());

		AbstractGoods result = fixture.get(type);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0 ", result.toString());
		assertEquals(".name", result.getNameKey());
		assertEquals("abstractGoods", result.getXMLTagName());
		assertEquals(0, result.getAmount());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("<abstractGoods id=\"\" type=\"\" amount=\"0\"></abstractGoods>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the void remove(List<AbstractGoods>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testRemove_1()
		throws Exception {
		ProductionMap fixture = new ProductionMap();
		List<AbstractGoods> goods = new ArrayList<AbstractGoods>();

		fixture.remove(goods);

		// add additional test code here
	}

	/**
	 * Run the void remove(List<AbstractGoods>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testRemove_2()
		throws Exception {
		ProductionMap fixture = new ProductionMap();
		List<AbstractGoods> goods = new ArrayList<AbstractGoods>();

		fixture.remove(goods);

		// add additional test code here
	}

	/**
	 * Run the void remove(AbstractGoods) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testRemove_3()
		throws Exception {
		ProductionMap fixture = new ProductionMap();
		AbstractGoods goods = new AbstractGoods(new GoodsType("", new Specification()), 1);

		fixture.remove(goods);

		// add additional test code here
	}

	/**
	 * Run the void remove(AbstractGoods) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testRemove_4()
		throws Exception {
		ProductionMap fixture = new ProductionMap();
		AbstractGoods goods = new AbstractGoods(new GoodsType("", new Specification()), 1);

		fixture.remove(goods);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		ProductionMap fixture = new ProductionMap();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[ ]", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testToString_2()
		throws Exception {
		ProductionMap fixture = new ProductionMap();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[ ]", result);
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
		new org.junit.runner.JUnitCore().run(ProductionMapTest.class);
	}
}