package net.sf.freecol.common.model;

import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ProductionInfoTest</code> contains tests for the class <code>{@link ProductionInfo}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:17 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class ProductionInfoTest {
	/**
	 * Run the ProductionInfo() constructor test.
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testProductionInfo_1()
		throws Exception {
		ProductionInfo result = new ProductionInfo();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void addConsumption(AbstractGoods) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testAddConsumption_1()
		throws Exception {
		ProductionInfo fixture = new ProductionInfo();
		fixture.setConsumption(new ArrayList<AbstractGoods>());
		fixture.setMaximumConsumption(new ArrayList<AbstractGoods>());
		fixture.setProduction(new ArrayList<AbstractGoods>());
		fixture.setMaximumProduction(new ArrayList<AbstractGoods>());
		AbstractGoods goods = new AbstractGoods();

		fixture.addConsumption(goods);

		// add additional test code here
	}

	/**
	 * Run the void addMaximumConsumption(AbstractGoods) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testAddMaximumConsumption_1()
		throws Exception {
		ProductionInfo fixture = new ProductionInfo();
		fixture.setConsumption(new ArrayList<AbstractGoods>());
		fixture.setMaximumConsumption(new ArrayList<AbstractGoods>());
		fixture.setProduction(new ArrayList<AbstractGoods>());
		fixture.setMaximumProduction(new ArrayList<AbstractGoods>());
		AbstractGoods goods = new AbstractGoods();

		fixture.addMaximumConsumption(goods);

		// add additional test code here
	}

	/**
	 * Run the void addMaximumProduction(AbstractGoods) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testAddMaximumProduction_1()
		throws Exception {
		ProductionInfo fixture = new ProductionInfo();
		fixture.setConsumption(new ArrayList<AbstractGoods>());
		fixture.setMaximumConsumption(new ArrayList<AbstractGoods>());
		fixture.setProduction(new ArrayList<AbstractGoods>());
		fixture.setMaximumProduction(new ArrayList<AbstractGoods>());
		AbstractGoods goods = new AbstractGoods();

		fixture.addMaximumProduction(goods);

		// add additional test code here
	}

	/**
	 * Run the void addProduction(List<AbstractGoods>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testAddProduction_1()
		throws Exception {
		ProductionInfo fixture = new ProductionInfo();
		fixture.setConsumption(new ArrayList<AbstractGoods>());
		fixture.setMaximumConsumption(new ArrayList<AbstractGoods>());
		fixture.setProduction(new ArrayList<AbstractGoods>());
		fixture.setMaximumProduction(new ArrayList<AbstractGoods>());
		List<AbstractGoods> goods = new ArrayList<AbstractGoods>();

		fixture.addProduction(goods);

		// add additional test code here
	}

	/**
	 * Run the void addProduction(AbstractGoods) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testAddProduction_2()
		throws Exception {
		ProductionInfo fixture = new ProductionInfo();
		fixture.setConsumption(new ArrayList<AbstractGoods>());
		fixture.setMaximumConsumption(new ArrayList<AbstractGoods>());
		fixture.setProduction(new ArrayList<AbstractGoods>());
		fixture.setMaximumProduction(new ArrayList<AbstractGoods>());
		AbstractGoods goods = new AbstractGoods();

		fixture.addProduction(goods);

		// add additional test code here
	}

	/**
	 * Run the List<AbstractGoods> getConsumption() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGetConsumption_1()
		throws Exception {
		ProductionInfo fixture = new ProductionInfo();
		fixture.setConsumption(new ArrayList<AbstractGoods>());
		fixture.setMaximumConsumption(new ArrayList<AbstractGoods>());
		fixture.setProduction(new ArrayList<AbstractGoods>());
		fixture.setMaximumProduction(new ArrayList<AbstractGoods>());

		List<AbstractGoods> result = fixture.getConsumption();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<AbstractGoods> getConsumptionDeficit() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGetConsumptionDeficit_1()
		throws Exception {
		ProductionInfo fixture = new ProductionInfo();
		fixture.setConsumption(new ArrayList<AbstractGoods>());
		fixture.setMaximumConsumption(new ArrayList<AbstractGoods>());
		fixture.setProduction(new ArrayList<AbstractGoods>());
		fixture.setMaximumProduction(new ArrayList<AbstractGoods>());

		List<AbstractGoods> result = fixture.getConsumptionDeficit();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<AbstractGoods> getConsumptionDeficit() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGetConsumptionDeficit_2()
		throws Exception {
		ProductionInfo fixture = new ProductionInfo();
		fixture.setConsumption(new ArrayList<AbstractGoods>());
		fixture.setMaximumConsumption(new ArrayList<AbstractGoods>());
		fixture.setProduction(new ArrayList<AbstractGoods>());
		fixture.setMaximumProduction(new ArrayList<AbstractGoods>());

		List<AbstractGoods> result = fixture.getConsumptionDeficit();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<AbstractGoods> getConsumptionDeficit() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGetConsumptionDeficit_3()
		throws Exception {
		ProductionInfo fixture = new ProductionInfo();
		fixture.setConsumption(new ArrayList<AbstractGoods>());
		fixture.setMaximumConsumption(new ArrayList<AbstractGoods>());
		fixture.setProduction(new ArrayList<AbstractGoods>());
		fixture.setMaximumProduction(new ArrayList<AbstractGoods>());

		List<AbstractGoods> result = fixture.getConsumptionDeficit();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<AbstractGoods> getConsumptionDeficit() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGetConsumptionDeficit_4()
		throws Exception {
		ProductionInfo fixture = new ProductionInfo();
		fixture.setConsumption(new ArrayList<AbstractGoods>());
		fixture.setMaximumConsumption(new ArrayList<AbstractGoods>());
		fixture.setProduction(new ArrayList<AbstractGoods>());
		fixture.setMaximumProduction(new ArrayList<AbstractGoods>());

		List<AbstractGoods> result = fixture.getConsumptionDeficit();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<AbstractGoods> getConsumptionDeficit() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGetConsumptionDeficit_5()
		throws Exception {
		ProductionInfo fixture = new ProductionInfo();
		fixture.setConsumption(new ArrayList<AbstractGoods>());
		fixture.setMaximumConsumption(new ArrayList<AbstractGoods>());
		fixture.setProduction(new ArrayList<AbstractGoods>());
		fixture.setMaximumProduction(new ArrayList<AbstractGoods>());

		List<AbstractGoods> result = fixture.getConsumptionDeficit();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<AbstractGoods> getMaximumConsumption() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGetMaximumConsumption_1()
		throws Exception {
		ProductionInfo fixture = new ProductionInfo();
		fixture.setConsumption(new ArrayList<AbstractGoods>());
		fixture.setMaximumConsumption(new ArrayList<AbstractGoods>());
		fixture.setProduction(new ArrayList<AbstractGoods>());
		fixture.setMaximumProduction(new ArrayList<AbstractGoods>());

		List<AbstractGoods> result = fixture.getMaximumConsumption();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<AbstractGoods> getMaximumProduction() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGetMaximumProduction_1()
		throws Exception {
		ProductionInfo fixture = new ProductionInfo();
		fixture.setConsumption(new ArrayList<AbstractGoods>());
		fixture.setMaximumConsumption(new ArrayList<AbstractGoods>());
		fixture.setProduction(new ArrayList<AbstractGoods>());
		fixture.setMaximumProduction(new ArrayList<AbstractGoods>());

		List<AbstractGoods> result = fixture.getMaximumProduction();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<AbstractGoods> getProduction() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGetProduction_1()
		throws Exception {
		ProductionInfo fixture = new ProductionInfo();
		fixture.setConsumption(new ArrayList<AbstractGoods>());
		fixture.setMaximumConsumption(new ArrayList<AbstractGoods>());
		fixture.setProduction(new ArrayList<AbstractGoods>());
		fixture.setMaximumProduction(new ArrayList<AbstractGoods>());

		List<AbstractGoods> result = fixture.getProduction();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<AbstractGoods> getProductionDeficit() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGetProductionDeficit_1()
		throws Exception {
		ProductionInfo fixture = new ProductionInfo();
		fixture.setConsumption(new ArrayList<AbstractGoods>());
		fixture.setMaximumConsumption(new ArrayList<AbstractGoods>());
		fixture.setProduction(new ArrayList<AbstractGoods>());
		fixture.setMaximumProduction(new ArrayList<AbstractGoods>());

		List<AbstractGoods> result = fixture.getProductionDeficit();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<AbstractGoods> getProductionDeficit() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGetProductionDeficit_2()
		throws Exception {
		ProductionInfo fixture = new ProductionInfo();
		fixture.setConsumption(new ArrayList<AbstractGoods>());
		fixture.setMaximumConsumption(new ArrayList<AbstractGoods>());
		fixture.setProduction(new ArrayList<AbstractGoods>());
		fixture.setMaximumProduction(new ArrayList<AbstractGoods>());

		List<AbstractGoods> result = fixture.getProductionDeficit();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<AbstractGoods> getProductionDeficit() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGetProductionDeficit_3()
		throws Exception {
		ProductionInfo fixture = new ProductionInfo();
		fixture.setConsumption(new ArrayList<AbstractGoods>());
		fixture.setMaximumConsumption(new ArrayList<AbstractGoods>());
		fixture.setProduction(new ArrayList<AbstractGoods>());
		fixture.setMaximumProduction(new ArrayList<AbstractGoods>());

		List<AbstractGoods> result = fixture.getProductionDeficit();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<AbstractGoods> getProductionDeficit() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGetProductionDeficit_4()
		throws Exception {
		ProductionInfo fixture = new ProductionInfo();
		fixture.setConsumption(new ArrayList<AbstractGoods>());
		fixture.setMaximumConsumption(new ArrayList<AbstractGoods>());
		fixture.setProduction(new ArrayList<AbstractGoods>());
		fixture.setMaximumProduction(new ArrayList<AbstractGoods>());

		List<AbstractGoods> result = fixture.getProductionDeficit();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<AbstractGoods> getProductionDeficit() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGetProductionDeficit_5()
		throws Exception {
		ProductionInfo fixture = new ProductionInfo();
		fixture.setConsumption(new ArrayList<AbstractGoods>());
		fixture.setMaximumConsumption(new ArrayList<AbstractGoods>());
		fixture.setProduction(new ArrayList<AbstractGoods>());
		fixture.setMaximumProduction(new ArrayList<AbstractGoods>());

		List<AbstractGoods> result = fixture.getProductionDeficit();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the boolean hasMaximumProduction() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testHasMaximumProduction_1()
		throws Exception {
		ProductionInfo fixture = new ProductionInfo();
		fixture.setConsumption(new ArrayList<AbstractGoods>());
		fixture.setMaximumConsumption(new ArrayList<AbstractGoods>());
		fixture.setProduction(new ArrayList<AbstractGoods>());
		fixture.setMaximumProduction(new ArrayList<AbstractGoods>());

		boolean result = fixture.hasMaximumProduction();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean hasMaximumProduction() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testHasMaximumProduction_2()
		throws Exception {
		ProductionInfo fixture = new ProductionInfo();
		fixture.setConsumption(new ArrayList<AbstractGoods>());
		fixture.setMaximumConsumption(new ArrayList<AbstractGoods>());
		fixture.setProduction(new ArrayList<AbstractGoods>());
		fixture.setMaximumProduction(new ArrayList<AbstractGoods>());

		boolean result = fixture.hasMaximumProduction();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean hasMaximumProduction() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testHasMaximumProduction_3()
		throws Exception {
		ProductionInfo fixture = new ProductionInfo();
		fixture.setConsumption(new ArrayList<AbstractGoods>());
		fixture.setMaximumConsumption(new ArrayList<AbstractGoods>());
		fixture.setProduction(new ArrayList<AbstractGoods>());
		fixture.setMaximumProduction(new ArrayList<AbstractGoods>());

		boolean result = fixture.hasMaximumProduction();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean hasMaximumProduction() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testHasMaximumProduction_4()
		throws Exception {
		ProductionInfo fixture = new ProductionInfo();
		fixture.setConsumption(new ArrayList<AbstractGoods>());
		fixture.setMaximumConsumption(new ArrayList<AbstractGoods>());
		fixture.setProduction(new ArrayList<AbstractGoods>());
		fixture.setMaximumProduction(new ArrayList<AbstractGoods>());

		boolean result = fixture.hasMaximumProduction();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean hasMaximumProduction() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testHasMaximumProduction_5()
		throws Exception {
		ProductionInfo fixture = new ProductionInfo();
		fixture.setConsumption(new ArrayList<AbstractGoods>());
		fixture.setMaximumConsumption(new ArrayList<AbstractGoods>());
		fixture.setProduction(new ArrayList<AbstractGoods>());
		fixture.setMaximumProduction(new ArrayList<AbstractGoods>());

		boolean result = fixture.hasMaximumProduction();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the void setConsumption(List<AbstractGoods>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testSetConsumption_1()
		throws Exception {
		ProductionInfo fixture = new ProductionInfo();
		fixture.setConsumption(new ArrayList<AbstractGoods>());
		fixture.setMaximumConsumption(new ArrayList<AbstractGoods>());
		fixture.setProduction(new ArrayList<AbstractGoods>());
		fixture.setMaximumProduction(new ArrayList<AbstractGoods>());
		List<AbstractGoods> newConsumption = new ArrayList<AbstractGoods>();

		fixture.setConsumption(newConsumption);

		// add additional test code here
	}

	/**
	 * Run the void setMaximumConsumption(List<AbstractGoods>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testSetMaximumConsumption_1()
		throws Exception {
		ProductionInfo fixture = new ProductionInfo();
		fixture.setConsumption(new ArrayList<AbstractGoods>());
		fixture.setMaximumConsumption(new ArrayList<AbstractGoods>());
		fixture.setProduction(new ArrayList<AbstractGoods>());
		fixture.setMaximumProduction(new ArrayList<AbstractGoods>());
		List<AbstractGoods> newMaximumConsumption = new ArrayList<AbstractGoods>();

		fixture.setMaximumConsumption(newMaximumConsumption);

		// add additional test code here
	}

	/**
	 * Run the void setMaximumProduction(List<AbstractGoods>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testSetMaximumProduction_1()
		throws Exception {
		ProductionInfo fixture = new ProductionInfo();
		fixture.setConsumption(new ArrayList<AbstractGoods>());
		fixture.setMaximumConsumption(new ArrayList<AbstractGoods>());
		fixture.setProduction(new ArrayList<AbstractGoods>());
		fixture.setMaximumProduction(new ArrayList<AbstractGoods>());
		List<AbstractGoods> newMaximumProduction = new ArrayList<AbstractGoods>();

		fixture.setMaximumProduction(newMaximumProduction);

		// add additional test code here
	}

	/**
	 * Run the void setProduction(List<AbstractGoods>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testSetProduction_1()
		throws Exception {
		ProductionInfo fixture = new ProductionInfo();
		fixture.setConsumption(new ArrayList<AbstractGoods>());
		fixture.setMaximumConsumption(new ArrayList<AbstractGoods>());
		fixture.setProduction(new ArrayList<AbstractGoods>());
		fixture.setMaximumProduction(new ArrayList<AbstractGoods>());
		List<AbstractGoods> newProduction = new ArrayList<AbstractGoods>();

		fixture.setProduction(newProduction);

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
		ProductionInfo fixture = new ProductionInfo();
		fixture.setConsumption(new ArrayList<AbstractGoods>());
		fixture.setMaximumConsumption(new ArrayList<AbstractGoods>());
		fixture.setProduction(new ArrayList<AbstractGoods>());
		fixture.setMaximumProduction(new ArrayList<AbstractGoods>());

		String result = fixture.toString();

		// add additional test code here
		assertEquals("", result);
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
		new org.junit.runner.JUnitCore().run(ProductionInfoTest.class);
	}
}