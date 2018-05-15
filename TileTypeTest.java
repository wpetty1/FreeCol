package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import java.util.List;
import javax.xml.stream.XMLStreamException;
import net.sf.freecol.common.io.FreeColXMLReader;
import org.junit.*;
import net.sf.freecol.common.util.RandomChoice;
import static org.junit.Assert.*;

/**
 * The class <code>TileTypeTest</code> contains tests for the class <code>{@link TileType}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:30 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class TileTypeTest {
	/**
	 * Run the TileType(String,Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testTileType_1()
		throws Exception {
		String id = "";
		Specification specification = new Specification();

		TileType result = new TileType(id, specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals(-1, result.getIndex());
		assertEquals(0, result.getBasicWorkTurns());
		assertEquals(false, result.isDirectlyHighSeasConnected());
		assertEquals("tile-type", result.getXMLTagName());
		assertEquals(false, result.isWater());
		assertEquals(false, result.canSettle());
		assertEquals(false, result.isElevation());
		assertEquals(false, result.isForested());
		assertEquals(false, result.isHighSeasConnected());
		assertEquals(0, result.getBasicMoveCost());
		assertEquals("", result.toString());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(".name", result.getNameKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals("<tile-type id=\"\" basic-move-cost=\"0\" basic-work-turns=\"0\" is-forest=\"false\" is-water=\"false\" is-elevation=\"false\" is-connected=\"false\" can-settle=\"false\"><gen humidity-minimum=\"0\" humidity-maximum=\"0\" temperature-minimum=\"0\" temperature-maximum=\"0\" altitude-minimum=\"0\" altitude-maximum=\"0\"></gen></tile-type>", result.serialize());
	}

	/**
	 * Run the boolean canHaveResourceType(ResourceType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testCanHaveResourceType_1()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		ResourceType resourceType = new ResourceType("", new Specification());

		boolean result = fixture.canHaveResourceType(resourceType);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean canHaveResourceType(ResourceType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testCanHaveResourceType_2()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		ResourceType resourceType = new ResourceType("", new Specification());

		boolean result = fixture.canHaveResourceType(resourceType);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean canProduce(GoodsType,UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testCanProduce_1()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = new UnitType("", new Specification());

		boolean result = fixture.canProduce(goodsType, unitType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Missing AbstractOption: model.option.tileProduction
		//       at net.sf.freecol.common.model.Specification.getOption(Specification.java:986)
		//       at net.sf.freecol.common.model.Specification.getStringOption(Specification.java:1080)
		//       at net.sf.freecol.common.model.Specification.getString(Specification.java:1131)
		//       at net.sf.freecol.common.model.TileType.getAvailableProductionTypes(TileType.java:290)
		//       at net.sf.freecol.common.model.TileType.canProduce(TileType.java:331)
		assertTrue(result);
	}

	/**
	 * Run the boolean canProduce(GoodsType,UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testCanProduce_2()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		GoodsType goodsType = null;
		UnitType unitType = new UnitType("", new Specification());

		boolean result = fixture.canProduce(goodsType, unitType);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean canProduce(GoodsType,UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testCanProduce_3()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = new UnitType("", new Specification());

		boolean result = fixture.canProduce(goodsType, unitType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Missing AbstractOption: model.option.tileProduction
		//       at net.sf.freecol.common.model.Specification.getOption(Specification.java:986)
		//       at net.sf.freecol.common.model.Specification.getStringOption(Specification.java:1080)
		//       at net.sf.freecol.common.model.Specification.getString(Specification.java:1131)
		//       at net.sf.freecol.common.model.TileType.getAvailableProductionTypes(TileType.java:290)
		//       at net.sf.freecol.common.model.TileType.canProduce(TileType.java:331)
		assertTrue(result);
	}

	/**
	 * Run the boolean canSettle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testCanSettle_1()
		throws Exception {
		TileType fixture = new TileType("", new Specification());

		boolean result = fixture.canSettle();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean canSettle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testCanSettle_2()
		throws Exception {
		TileType fixture = new TileType("", new Specification());

		boolean result = fixture.canSettle();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the List<ProductionType> getAvailableProductionTypes(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetAvailableProductionTypes_1()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		boolean unattended = true;

		List<ProductionType> result = fixture.getAvailableProductionTypes(unattended);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Missing AbstractOption: model.option.tileProduction
		//       at net.sf.freecol.common.model.Specification.getOption(Specification.java:986)
		//       at net.sf.freecol.common.model.Specification.getStringOption(Specification.java:1080)
		//       at net.sf.freecol.common.model.Specification.getString(Specification.java:1131)
		//       at net.sf.freecol.common.model.TileType.getAvailableProductionTypes(TileType.java:290)
		assertNotNull(result);
	}

	/**
	 * Run the List<ProductionType> getAvailableProductionTypes(boolean,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetAvailableProductionTypes_2()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		boolean unattended = true;
		String level = "";

		List<ProductionType> result = fixture.getAvailableProductionTypes(unattended, level);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<ProductionType> getAvailableProductionTypes(boolean,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetAvailableProductionTypes_3()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		boolean unattended = true;
		String level = "";

		List<ProductionType> result = fixture.getAvailableProductionTypes(unattended, level);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<ProductionType> getAvailableProductionTypes(boolean,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetAvailableProductionTypes_4()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		boolean unattended = true;
		String level = "";

		List<ProductionType> result = fixture.getAvailableProductionTypes(unattended, level);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<ProductionType> getAvailableProductionTypes(boolean,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetAvailableProductionTypes_5()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		boolean unattended = true;
		String level = "";

		List<ProductionType> result = fixture.getAvailableProductionTypes(unattended, level);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<ProductionType> getAvailableProductionTypes(boolean,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetAvailableProductionTypes_6()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		boolean unattended = true;
		String level = "";

		List<ProductionType> result = fixture.getAvailableProductionTypes(unattended, level);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the int getBaseProduction(ProductionType,GoodsType,UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetBaseProduction_1()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		ProductionType productionType = new ProductionType(new Specification());
		GoodsType goodsType = null;
		UnitType unitType = new UnitType("", new Specification());

		int result = fixture.getBaseProduction(productionType, goodsType, unitType);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getBaseProduction(ProductionType,GoodsType,UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetBaseProduction_2()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		ProductionType productionType = null;
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = new UnitType("", new Specification());

		int result = fixture.getBaseProduction(productionType, goodsType, unitType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Missing AbstractOption: model.option.tileProduction
		//       at net.sf.freecol.common.model.Specification.getOption(Specification.java:986)
		//       at net.sf.freecol.common.model.Specification.getStringOption(Specification.java:1080)
		//       at net.sf.freecol.common.model.Specification.getString(Specification.java:1131)
		//       at net.sf.freecol.common.model.TileType.getAvailableProductionTypes(TileType.java:290)
		//       at net.sf.freecol.common.model.TileType.getBaseProduction(TileType.java:350)
		assertEquals(0, result);
	}

	/**
	 * Run the int getBaseProduction(ProductionType,GoodsType,UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetBaseProduction_3()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		ProductionType productionType = new ProductionType(new Specification());
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = new UnitType("", new Specification());

		int result = fixture.getBaseProduction(productionType, goodsType, unitType);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getBaseProduction(ProductionType,GoodsType,UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetBaseProduction_4()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		ProductionType productionType = null;
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = new UnitType("", new Specification());

		int result = fixture.getBaseProduction(productionType, goodsType, unitType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Missing AbstractOption: model.option.tileProduction
		//       at net.sf.freecol.common.model.Specification.getOption(Specification.java:986)
		//       at net.sf.freecol.common.model.Specification.getStringOption(Specification.java:1080)
		//       at net.sf.freecol.common.model.Specification.getString(Specification.java:1131)
		//       at net.sf.freecol.common.model.TileType.getAvailableProductionTypes(TileType.java:290)
		//       at net.sf.freecol.common.model.TileType.getBaseProduction(TileType.java:350)
		assertEquals(0, result);
	}

	/**
	 * Run the int getBasicMoveCost() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetBasicMoveCost_1()
		throws Exception {
		TileType fixture = new TileType("", new Specification());

		int result = fixture.getBasicMoveCost();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getBasicWorkTurns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetBasicWorkTurns_1()
		throws Exception {
		TileType fixture = new TileType("", new Specification());

		int result = fixture.getBasicWorkTurns();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the List<RandomChoice<Disaster>> getDisasters() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetDisasters_1()
		throws Exception {
		TileType fixture = new TileType("", new Specification());

		List<RandomChoice<Disaster>> result = fixture.getDisasters();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<RandomChoice<Disaster>> getDisasters() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetDisasters_2()
		throws Exception {
		TileType fixture = new TileType("", new Specification());

		List<RandomChoice<Disaster>> result = fixture.getDisasters();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the int getIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetIndex_1()
		throws Exception {
		TileType fixture = new TileType("", new Specification());

		int result = fixture.getIndex();

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the List<AbstractGoods> getPossibleProduction(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetPossibleProduction_1()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		boolean unattended = true;

		List<AbstractGoods> result = fixture.getPossibleProduction(unattended);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Missing AbstractOption: model.option.tileProduction
		//       at net.sf.freecol.common.model.Specification.getOption(Specification.java:986)
		//       at net.sf.freecol.common.model.Specification.getStringOption(Specification.java:1080)
		//       at net.sf.freecol.common.model.Specification.getString(Specification.java:1131)
		//       at net.sf.freecol.common.model.TileType.getAvailableProductionTypes(TileType.java:290)
		//       at net.sf.freecol.common.model.TileType.getPossibleProduction(TileType.java:387)
		assertNotNull(result);
	}

	/**
	 * Run the List<AbstractGoods> getPossibleProduction(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetPossibleProduction_2()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		boolean unattended = true;

		List<AbstractGoods> result = fixture.getPossibleProduction(unattended);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Missing AbstractOption: model.option.tileProduction
		//       at net.sf.freecol.common.model.Specification.getOption(Specification.java:986)
		//       at net.sf.freecol.common.model.Specification.getStringOption(Specification.java:1080)
		//       at net.sf.freecol.common.model.Specification.getString(Specification.java:1131)
		//       at net.sf.freecol.common.model.TileType.getAvailableProductionTypes(TileType.java:290)
		//       at net.sf.freecol.common.model.TileType.getPossibleProduction(TileType.java:387)
		assertNotNull(result);
	}

	/**
	 * Run the List<AbstractGoods> getPossibleProduction(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetPossibleProduction_3()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		boolean unattended = true;

		List<AbstractGoods> result = fixture.getPossibleProduction(unattended);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Missing AbstractOption: model.option.tileProduction
		//       at net.sf.freecol.common.model.Specification.getOption(Specification.java:986)
		//       at net.sf.freecol.common.model.Specification.getStringOption(Specification.java:1080)
		//       at net.sf.freecol.common.model.Specification.getString(Specification.java:1131)
		//       at net.sf.freecol.common.model.TileType.getAvailableProductionTypes(TileType.java:290)
		//       at net.sf.freecol.common.model.TileType.getPossibleProduction(TileType.java:387)
		assertNotNull(result);
	}

	/**
	 * Run the int getPotentialProduction(GoodsType,UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetPotentialProduction_1()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		GoodsType goodsType = null;
		UnitType unitType = new UnitType("", new Specification());

		int result = fixture.getPotentialProduction(goodsType, unitType);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPotentialProduction(GoodsType,UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetPotentialProduction_2()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = new UnitType("", new Specification());

		int result = fixture.getPotentialProduction(goodsType, unitType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Missing AbstractOption: model.option.tileProduction
		//       at net.sf.freecol.common.model.Specification.getOption(Specification.java:986)
		//       at net.sf.freecol.common.model.Specification.getStringOption(Specification.java:1080)
		//       at net.sf.freecol.common.model.Specification.getString(Specification.java:1131)
		//       at net.sf.freecol.common.model.TileType.getAvailableProductionTypes(TileType.java:290)
		//       at net.sf.freecol.common.model.TileType.getBaseProduction(TileType.java:350)
		//       at net.sf.freecol.common.model.TileType.getPotentialProduction(TileType.java:369)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPotentialProduction(GoodsType,UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetPotentialProduction_3()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = new UnitType("", new Specification());

		int result = fixture.getPotentialProduction(goodsType, unitType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Missing AbstractOption: model.option.tileProduction
		//       at net.sf.freecol.common.model.Specification.getOption(Specification.java:986)
		//       at net.sf.freecol.common.model.Specification.getStringOption(Specification.java:1080)
		//       at net.sf.freecol.common.model.Specification.getString(Specification.java:1131)
		//       at net.sf.freecol.common.model.TileType.getAvailableProductionTypes(TileType.java:290)
		//       at net.sf.freecol.common.model.TileType.getBaseProduction(TileType.java:350)
		//       at net.sf.freecol.common.model.TileType.getPotentialProduction(TileType.java:369)
		assertEquals(0, result);
	}

	/**
	 * Run the List<ResourceType> getResourceTypes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetResourceTypes_1()
		throws Exception {
		TileType fixture = new TileType("", new Specification());

		List<ResourceType> result = fixture.getResourceTypes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<ResourceType> getResourceTypes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetResourceTypes_2()
		throws Exception {
		TileType fixture = new TileType("", new Specification());

		List<ResourceType> result = fixture.getResourceTypes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<ResourceType> getResourceTypes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetResourceTypes_3()
		throws Exception {
		TileType fixture = new TileType("", new Specification());

		List<ResourceType> result = fixture.getResourceTypes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<RandomChoice<ResourceType>> getWeightedResources() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetWeightedResources_1()
		throws Exception {
		TileType fixture = new TileType("", new Specification());

		List<RandomChoice<ResourceType>> result = fixture.getWeightedResources();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<RandomChoice<ResourceType>> getWeightedResources() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetWeightedResources_2()
		throws Exception {
		TileType fixture = new TileType("", new Specification());

		List<RandomChoice<ResourceType>> result = fixture.getWeightedResources();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = TileType.getXMLElementTagName();

		// add additional test code here
		assertEquals("tile-type", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		TileType fixture = new TileType("", new Specification());

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("tile-type", result);
	}

	/**
	 * Run the boolean isDirectlyHighSeasConnected() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testIsDirectlyHighSeasConnected_1()
		throws Exception {
		TileType fixture = new TileType("", new Specification());

		boolean result = fixture.isDirectlyHighSeasConnected();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isDirectlyHighSeasConnected() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testIsDirectlyHighSeasConnected_2()
		throws Exception {
		TileType fixture = new TileType("", new Specification());

		boolean result = fixture.isDirectlyHighSeasConnected();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isElevation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testIsElevation_1()
		throws Exception {
		TileType fixture = new TileType("", new Specification());

		boolean result = fixture.isElevation();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isElevation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testIsElevation_2()
		throws Exception {
		TileType fixture = new TileType("", new Specification());

		boolean result = fixture.isElevation();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isForested() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testIsForested_1()
		throws Exception {
		TileType fixture = new TileType("", new Specification());

		boolean result = fixture.isForested();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isForested() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testIsForested_2()
		throws Exception {
		TileType fixture = new TileType("", new Specification());

		boolean result = fixture.isForested();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isHighSeasConnected() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testIsHighSeasConnected_1()
		throws Exception {
		TileType fixture = new TileType("", new Specification());

		boolean result = fixture.isHighSeasConnected();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isHighSeasConnected() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testIsHighSeasConnected_2()
		throws Exception {
		TileType fixture = new TileType("", new Specification());

		boolean result = fixture.isHighSeasConnected();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isWater() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testIsWater_1()
		throws Exception {
		TileType fixture = new TileType("", new Specification());

		boolean result = fixture.isWater();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isWater() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testIsWater_2()
		throws Exception {
		TileType fixture = new TileType("", new Specification());

		boolean result = fixture.isWater();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.FreeColObject.readAttributes(FreeColObject.java:1257)
		//       at net.sf.freecol.common.model.FreeColGameObjectType.readAttributes(FreeColGameObjectType.java:207)
		//       at net.sf.freecol.common.model.TileType.readAttributes(TileType.java:517)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.FreeColObject.readAttributes(FreeColObject.java:1257)
		//       at net.sf.freecol.common.model.FreeColGameObjectType.readAttributes(FreeColGameObjectType.java:207)
		//       at net.sf.freecol.common.model.TileType.readAttributes(TileType.java:517)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testReadChild_1()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.TileType.readChild(TileType.java:556)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testReadChild_2()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.TileType.readChild(TileType.java:556)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testReadChild_3()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.TileType.readChild(TileType.java:556)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testReadChild_4()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.TileType.readChild(TileType.java:556)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testReadChild_5()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.TileType.readChild(TileType.java:556)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testReadChild_6()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.TileType.readChild(TileType.java:556)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testReadChild_7()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.TileType.readChild(TileType.java:556)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testReadChild_8()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.TileType.readChild(TileType.java:556)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testReadChild_9()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.TileType.readChild(TileType.java:556)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testReadChild_10()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.TileType.readChild(TileType.java:556)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testReadChild_11()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.TileType.readChild(TileType.java:556)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testReadChild_12()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.TileType.readChild(TileType.java:556)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testReadChild_13()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.TileType.readChild(TileType.java:556)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testReadChild_14()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.TileType.readChild(TileType.java:556)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testReadChild_15()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.TileType.readChild(TileType.java:556)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testReadChild_16()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.TileType.readChild(TileType.java:556)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testReadChildren_1()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:801)
		//       at net.sf.freecol.common.model.TileType.readChildren(TileType.java:541)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testReadChildren_2()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:801)
		//       at net.sf.freecol.common.model.TileType.readChildren(TileType.java:541)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testReadChildren_3()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:801)
		//       at net.sf.freecol.common.model.TileType.readChildren(TileType.java:541)
	}

	/**
	 * Run the boolean withinRange(RangeType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testWithinRange_1()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		TileType.RangeType rangeType = TileType.RangeType.ALTITUDE;
		int value = 1;

		boolean result = fixture.withinRange(rangeType, value);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean withinRange(RangeType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testWithinRange_2()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		TileType.RangeType rangeType = TileType.RangeType.ALTITUDE;
		int value = 1;

		boolean result = fixture.withinRange(rangeType, value);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean withinRange(RangeType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testWithinRange_3()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		TileType.RangeType rangeType = TileType.RangeType.ALTITUDE;
		int value = 1;

		boolean result = fixture.withinRange(rangeType, value);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean withinRange(RangeType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testWithinRange_4()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		TileType.RangeType rangeType = TileType.RangeType.ALTITUDE;
		int value = 1;

		boolean result = fixture.withinRange(rangeType, value);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean withinRange(RangeType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testWithinRange_5()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		TileType.RangeType rangeType = TileType.RangeType.ALTITUDE;
		int value = 1;

		boolean result = fixture.withinRange(rangeType, value);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean withinRange(RangeType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testWithinRange_6()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		TileType.RangeType rangeType = TileType.RangeType.ALTITUDE;
		int value = 1;

		boolean result = fixture.withinRange(rangeType, value);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean withinRange(RangeType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testWithinRange_7()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		TileType.RangeType rangeType = TileType.RangeType.ALTITUDE;
		int value = 1;

		boolean result = fixture.withinRange(rangeType, value);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean withinRange(RangeType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testWithinRange_8()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		TileType.RangeType rangeType = TileType.RangeType.ALTITUDE;
		int value = 1;

		boolean result = fixture.withinRange(rangeType, value);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean withinRange(RangeType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testWithinRange_9()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		TileType.RangeType rangeType = TileType.RangeType.ALTITUDE;
		int value = 1;

		boolean result = fixture.withinRange(rangeType, value);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean withinRange(RangeType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testWithinRange_10()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		TileType.RangeType rangeType = TileType.RangeType.ALTITUDE;
		int value = 1;

		boolean result = fixture.withinRange(rangeType, value);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_1()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_2()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_3()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_4()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_5()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_6()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_7()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_8()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_9()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testWriteChildren_1()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testWriteChildren_2()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testWriteChildren_3()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testWriteChildren_4()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testWriteChildren_5()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testWriteChildren_6()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testWriteChildren_7()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testWriteChildren_8()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testWriteChildren_9()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testWriteChildren_10()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testWriteChildren_11()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testWriteChildren_12()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testWriteChildren_13()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testWriteChildren_14()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testWriteChildren_15()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	@Test
	public void testWriteChildren_16()
		throws Exception {
		TileType fixture = new TileType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/18 4:30 PM
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
	 * @generatedBy CodePro at 5/14/18 4:30 PM
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
	 * @generatedBy CodePro at 5/14/18 4:30 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TileTypeTest.class);
	}
}