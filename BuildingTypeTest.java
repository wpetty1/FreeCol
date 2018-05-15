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
import static org.junit.Assert.*;

/**
 * The class <code>BuildingTypeTest</code> contains tests for the class <code>{@link BuildingType}</code>.
 *
 * @generatedBy CodePro at 5/14/18 3:08 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class BuildingTypeTest {
	/**
	 * Run the BuildingType(String,Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testBuildingType_1()
		throws Exception {
		String id = "";
		Specification specification = new Specification();

		BuildingType result = new BuildingType(id, specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals(800, result.getPriority());
		assertEquals(1, result.getLevel());
		assertEquals(true, result.isAutomaticBuild());
		assertEquals(0, result.getUpkeep());
		assertEquals(false, result.isDefenceType());
		assertEquals(null, result.getUpgradesFrom());
		assertEquals("building-type", result.getXMLTagName());
		assertEquals(3, result.getWorkPlaces());
		assertEquals(null, result.getUpgradesTo());
		assertEquals(null, result.getProducedGoodsType());
		assertEquals(false, result.needsGoodsToBuild());
		assertEquals(1, result.getRequiredPopulation());
		assertEquals("", result.toString());
		assertEquals(false, result.isAbstractType());
		assertEquals(".name", result.getNameKey());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<building-type id=\"\" workplaces=\"3\"></building-type>", result.serialize());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the void addProductionType(ProductionType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testAddProductionType_1()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
		ProductionType productionType = new ProductionType(new Specification());

		fixture.addProductionType(productionType);

		// add additional test code here
	}

	/**
	 * Run the void addProductionType(ProductionType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testAddProductionType_2()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
		ProductionType productionType = null;

		fixture.addProductionType(productionType);

		// add additional test code here
	}

	/**
	 * Run the boolean canAdd(UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testCanAdd_1()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
		UnitType unitType = new UnitType("", new Specification());

		boolean result = fixture.canAdd(unitType);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean canAdd(UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testCanAdd_2()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
		UnitType unitType = new UnitType("", new Specification());

		boolean result = fixture.canAdd(unitType);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean canProduce(GoodsType,UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testCanProduce_1()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
		GoodsType goodsType = new GoodsType("", new Specification());
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
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testCanProduce_2()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
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
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testCanProduce_3()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = new UnitType("", new Specification());

		boolean result = fixture.canProduce(goodsType, unitType);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the int compareTo(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testCompareTo_1()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
		FreeColObject other = new AbstractGoods();

		int result = fixture.compareTo(other);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int compareTo(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testCompareTo_2()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
		FreeColObject other = new BuildingType("", new Specification());

		int result = fixture.compareTo(other);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the List<ProductionType> getAvailableProductionTypes(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testGetAvailableProductionTypes_1()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
		boolean unattended = true;

		List<ProductionType> result = fixture.getAvailableProductionTypes(unattended);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<ProductionType> getAvailableProductionTypes(boolean,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testGetAvailableProductionTypes_2()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
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
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testGetBaseProduction_1()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
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
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testGetBaseProduction_2()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
		ProductionType productionType = null;
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
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testGetBaseProduction_3()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
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
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testGetBaseProduction_4()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
		ProductionType productionType = null;
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = new UnitType("", new Specification());

		int result = fixture.getBaseProduction(productionType, goodsType, unitType);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the BuildingType getFirstLevel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testGetFirstLevel_1()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));

		BuildingType result = fixture.getFirstLevel();

		// add additional test code here
		assertNotNull(result);
		assertEquals(800, result.getPriority());
		assertEquals(1, result.getLevel());
		assertEquals(true, result.isAutomaticBuild());
		assertEquals(0, result.getUpkeep());
		assertEquals(false, result.isDefenceType());
		assertEquals(null, result.getUpgradesFrom());
		assertEquals("building-type", result.getXMLTagName());
		assertEquals(3, result.getWorkPlaces());
		assertEquals(null, result.getUpgradesTo());
		assertEquals(null, result.getProducedGoodsType());
		assertEquals(false, result.needsGoodsToBuild());
		assertEquals(1, result.getRequiredPopulation());
		assertEquals("", result.toString());
		assertEquals(false, result.isAbstractType());
		assertEquals(".name", result.getNameKey());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<building-type id=\"\" workplaces=\"3\"><production></production></building-type>", result.serialize());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the int getLevel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testGetLevel_1()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));

		int result = fixture.getLevel();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the UnitLocation.NoAddReason getNoAddReason(UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testGetNoAddReason_1()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
		UnitType unitType = new UnitType("", new Specification());
		unitType.setSkill(1);

		UnitLocation.NoAddReason result = fixture.getNoAddReason(unitType);

		// add additional test code here
		assertNotNull(result);
		assertEquals("model.noAddReason.none.description", result.getDescriptionKey());
		assertEquals("NONE", result.name());
		assertEquals("NONE", result.toString());
		assertEquals(0, result.ordinal());
	}

	/**
	 * Run the UnitLocation.NoAddReason getNoAddReason(UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testGetNoAddReason_2()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
		UnitType unitType = new UnitType("", new Specification());
		unitType.setSkill(1);

		UnitLocation.NoAddReason result = fixture.getNoAddReason(unitType);

		// add additional test code here
		assertNotNull(result);
		assertEquals("model.noAddReason.none.description", result.getDescriptionKey());
		assertEquals("NONE", result.name());
		assertEquals("NONE", result.toString());
		assertEquals(0, result.ordinal());
	}

	/**
	 * Run the UnitLocation.NoAddReason getNoAddReason(UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testGetNoAddReason_3()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
		UnitType unitType = new UnitType("", new Specification());
		unitType.setSkill(1);

		UnitLocation.NoAddReason result = fixture.getNoAddReason(unitType);

		// add additional test code here
		assertNotNull(result);
		assertEquals("model.noAddReason.none.description", result.getDescriptionKey());
		assertEquals("NONE", result.name());
		assertEquals("NONE", result.toString());
		assertEquals(0, result.ordinal());
	}

	/**
	 * Run the UnitLocation.NoAddReason getNoAddReason(UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testGetNoAddReason_4()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
		UnitType unitType = new UnitType("", new Specification());

		UnitLocation.NoAddReason result = fixture.getNoAddReason(unitType);

		// add additional test code here
		assertNotNull(result);
		assertEquals("model.noAddReason.missingSkill.description", result.getDescriptionKey());
		assertEquals("MISSING_SKILL", result.name());
		assertEquals("MISSING_SKILL", result.toString());
		assertEquals(9, result.ordinal());
	}

	/**
	 * Run the UnitLocation.NoAddReason getNoAddReason(UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testGetNoAddReason_5()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
		UnitType unitType = new UnitType("", new Specification());

		UnitLocation.NoAddReason result = fixture.getNoAddReason(unitType);

		// add additional test code here
		assertNotNull(result);
		assertEquals("model.noAddReason.missingSkill.description", result.getDescriptionKey());
		assertEquals("MISSING_SKILL", result.name());
		assertEquals("MISSING_SKILL", result.toString());
		assertEquals(9, result.ordinal());
	}

	/**
	 * Run the int getPotentialProduction(GoodsType,UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testGetPotentialProduction_1()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
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
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testGetPotentialProduction_2()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
		GoodsType goodsType = new GoodsType("", new Specification());
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
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testGetPotentialProduction_3()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = new UnitType("", new Specification());

		int result = fixture.getPotentialProduction(goodsType, unitType);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPriority() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testGetPriority_1()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));

		int result = fixture.getPriority();

		// add additional test code here
		assertEquals(800, result);
	}

	/**
	 * Run the GoodsType getProducedGoodsType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testGetProducedGoodsType_1()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());

		GoodsType result = fixture.getProducedGoodsType();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the GoodsType getProducedGoodsType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testGetProducedGoodsType_2()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));

		GoodsType result = fixture.getProducedGoodsType();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the GoodsType getProducedGoodsType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testGetProducedGoodsType_3()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));

		GoodsType result = fixture.getProducedGoodsType();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the FreeColGameObjectType getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testGetType_1()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));

		FreeColGameObjectType result = fixture.getType();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals(false, result.isAbstractType());
		assertEquals(".name", result.getNameKey());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<building-type id=\"\" workplaces=\"3\"><production></production></building-type>", result.serialize());
		assertEquals("building-type", result.getXMLTagName());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the BuildingType getUpgradesFrom() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testGetUpgradesFrom_1()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));

		BuildingType result = fixture.getUpgradesFrom();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the BuildingType getUpgradesTo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testGetUpgradesTo_1()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));

		BuildingType result = fixture.getUpgradesTo();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the int getUpkeep() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testGetUpkeep_1()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));

		int result = fixture.getUpkeep();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getWorkPlaces() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testGetWorkPlaces_1()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));

		int result = fixture.getWorkPlaces();

		// add additional test code here
		assertEquals(3, result);
	}

	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = BuildingType.getXMLElementTagName();

		// add additional test code here
		assertEquals("building-type", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("building-type", result);
	}

	/**
	 * Run the boolean isAutomaticBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testIsAutomaticBuild_1()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));

		boolean result = fixture.isAutomaticBuild();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isAutomaticBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testIsAutomaticBuild_2()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));

		boolean result = fixture.isAutomaticBuild();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isAutomaticBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testIsAutomaticBuild_3()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));

		boolean result = fixture.isAutomaticBuild();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isDefenceType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testIsDefenceType_1()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));

		boolean result = fixture.isDefenceType();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isDefenceType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testIsDefenceType_2()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));

		boolean result = fixture.isDefenceType();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
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
		//       at net.sf.freecol.common.model.BuildableType.readAttributes(BuildableType.java:288)
		//       at net.sf.freecol.common.model.BuildingType.readAttributes(BuildingType.java:412)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
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
		//       at net.sf.freecol.common.model.BuildableType.readAttributes(BuildableType.java:288)
		//       at net.sf.freecol.common.model.BuildingType.readAttributes(BuildingType.java:412)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testReadAttributes_3()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
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
		//       at net.sf.freecol.common.model.BuildableType.readAttributes(BuildableType.java:288)
		//       at net.sf.freecol.common.model.BuildingType.readAttributes(BuildingType.java:412)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testReadAttributes_4()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
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
		//       at net.sf.freecol.common.model.BuildableType.readAttributes(BuildableType.java:288)
		//       at net.sf.freecol.common.model.BuildingType.readAttributes(BuildingType.java:412)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testReadAttributes_5()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
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
		//       at net.sf.freecol.common.model.BuildableType.readAttributes(BuildableType.java:288)
		//       at net.sf.freecol.common.model.BuildingType.readAttributes(BuildingType.java:412)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testReadAttributes_6()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
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
		//       at net.sf.freecol.common.model.BuildableType.readAttributes(BuildableType.java:288)
		//       at net.sf.freecol.common.model.BuildingType.readAttributes(BuildingType.java:412)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testReadAttributes_7()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
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
		//       at net.sf.freecol.common.model.BuildableType.readAttributes(BuildableType.java:288)
		//       at net.sf.freecol.common.model.BuildingType.readAttributes(BuildingType.java:412)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testReadAttributes_8()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
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
		//       at net.sf.freecol.common.model.BuildableType.readAttributes(BuildableType.java:288)
		//       at net.sf.freecol.common.model.BuildingType.readAttributes(BuildingType.java:412)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testReadAttributes_9()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
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
		//       at net.sf.freecol.common.model.BuildableType.readAttributes(BuildableType.java:288)
		//       at net.sf.freecol.common.model.BuildingType.readAttributes(BuildingType.java:412)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testReadAttributes_10()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
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
		//       at net.sf.freecol.common.model.BuildableType.readAttributes(BuildableType.java:288)
		//       at net.sf.freecol.common.model.BuildingType.readAttributes(BuildingType.java:412)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testReadAttributes_11()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
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
		//       at net.sf.freecol.common.model.BuildableType.readAttributes(BuildableType.java:288)
		//       at net.sf.freecol.common.model.BuildingType.readAttributes(BuildingType.java:412)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testReadAttributes_12()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
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
		//       at net.sf.freecol.common.model.BuildableType.readAttributes(BuildableType.java:288)
		//       at net.sf.freecol.common.model.BuildingType.readAttributes(BuildingType.java:412)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testReadAttributes_13()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
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
		//       at net.sf.freecol.common.model.BuildableType.readAttributes(BuildableType.java:288)
		//       at net.sf.freecol.common.model.BuildingType.readAttributes(BuildingType.java:412)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testReadAttributes_14()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
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
		//       at net.sf.freecol.common.model.BuildableType.readAttributes(BuildableType.java:288)
		//       at net.sf.freecol.common.model.BuildingType.readAttributes(BuildingType.java:412)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testReadAttributes_15()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
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
		//       at net.sf.freecol.common.model.BuildableType.readAttributes(BuildableType.java:288)
		//       at net.sf.freecol.common.model.BuildingType.readAttributes(BuildingType.java:412)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testReadAttributes_16()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
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
		//       at net.sf.freecol.common.model.BuildableType.readAttributes(BuildableType.java:288)
		//       at net.sf.freecol.common.model.BuildingType.readAttributes(BuildingType.java:412)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testReadChild_1()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.BuildingType.readChild(BuildingType.java:484)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testReadChild_2()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.BuildingType.readChild(BuildingType.java:484)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testReadChild_3()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.BuildingType.readChild(BuildingType.java:484)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testReadChild_4()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.BuildingType.readChild(BuildingType.java:484)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testReadChild_5()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.BuildingType.readChild(BuildingType.java:484)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testReadChild_6()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.BuildingType.readChild(BuildingType.java:484)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_1()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_2()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_3()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_4()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_5()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_6()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_7()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_8()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_9()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_10()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_11()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_12()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_13()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_14()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_15()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_16()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testWriteChildren_1()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testWriteChildren_2()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testWriteChildren_3()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	@Test
	public void testWriteChildren_4()
		throws Exception {
		BuildingType fixture = new BuildingType("", new Specification());
		fixture.addProductionType(new ProductionType(new Specification()));
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
	 * @generatedBy CodePro at 5/14/18 3:08 PM
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
	 * @generatedBy CodePro at 5/14/18 3:08 PM
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
	 * @generatedBy CodePro at 5/14/18 3:08 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(BuildingTypeTest.class);
	}
}