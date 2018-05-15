package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import java.util.List;
import java.util.Set;
import javax.xml.stream.XMLStreamException;
import net.sf.freecol.common.io.FreeColXMLReader;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>GoodsTypeTest</code> contains tests for the class <code>{@link GoodsType}</code>.
 *
 * @generatedBy CodePro at 5/14/18 3:28 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class GoodsTypeTest {
	/**
	 * Run the GoodsType(String,Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testGoodsType_1()
		throws Exception {
		String id = "";
		Specification specification = new Specification();

		GoodsType result = new GoodsType(id, specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isStoredAs());
		assertEquals(1.0f, result.getZeroProductionFactor(), 1.0f);
		assertEquals(0.0f, result.getLowProductionThreshold(), 1.0f);
		assertEquals(1.0f, result.getProductionWeight(), 1.0f);
		assertEquals(false, result.isNewWorldLuxuryType());
		assertEquals(false, result.isImmigrationType());
		assertEquals(false, result.isRawBuildingMaterial());
		assertEquals(false, result.isNewWorldGoodsType());
		assertEquals(Integer.MAX_VALUE, result.getBreedingNumber());
		assertEquals(false, result.isBuildingMaterial());
		assertEquals(0, result.getInitialAmount());
		assertEquals(Integer.MAX_VALUE, result.getPrice());
		assertEquals(false, result.isFoodType());
		assertEquals(false, result.isFarmed());
		assertEquals(false, result.isLibertyType());
		assertEquals(false, result.isStorable());
		assertEquals(null, result.getInputType());
		assertEquals(false, result.isBreedable());
		assertEquals(false, result.limitIgnored());
		assertEquals(false, result.isRawMaterial());
		assertEquals(null, result.getOutputType());
		assertEquals(false, result.isMilitaryGoods());
		assertEquals(false, result.isRefined());
		assertEquals(false, result.isTradeGoods());
		assertEquals(".workingAs", result.getWorkingAsKey());
		assertEquals("goods-type", result.getXMLTagName());
		assertEquals("", result.toString());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(".name", result.getNameKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<goods-type id=\"\" is-farmed=\"false\" is-food=\"false\" is-military=\"false\" ignore-limit=\"false\" new-world-goods=\"false\" trade-goods=\"false\" storable=\"false\" production-weight=\"1.0\"></goods-type>", result.serialize());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the int getBreedingNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testGetBreedingNumber_1()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		int result = fixture.getBreedingNumber();

		// add additional test code here
		assertEquals(Integer.MAX_VALUE, result);
	}

	/**
	 * Run the Set<GoodsType> getEquivalentTypes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testGetEquivalentTypes_1()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		Set<GoodsType> result = fixture.getEquivalentTypes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Set<GoodsType> getEquivalentTypes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testGetEquivalentTypes_2()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		Set<GoodsType> result = fixture.getEquivalentTypes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Set<GoodsType> getEquivalentTypes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testGetEquivalentTypes_3()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());

		Set<GoodsType> result = fixture.getEquivalentTypes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Set<GoodsType> getEquivalentTypes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testGetEquivalentTypes_4()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		Set<GoodsType> result = fixture.getEquivalentTypes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the int getInitialAmount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testGetInitialAmount_1()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		int result = fixture.getInitialAmount();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getInitialBuyPrice() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testGetInitialBuyPrice_1()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		int result = fixture.getInitialBuyPrice();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getInitialSellPrice() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testGetInitialSellPrice_1()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		int result = fixture.getInitialSellPrice();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the GoodsType getInputType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testGetInputType_1()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		GoodsType result = fixture.getInputType();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the StringTemplate getLabel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testGetLabel_1()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		StringTemplate result = fixture.getLabel();

		// add additional test code here
		assertNotNull(result);
		assertEquals("KEY: .name", result.toString());
		assertEquals("stringTemplate", result.getXMLTagName());
		assertEquals(null, result.getDefaultId());
		assertEquals(".name", result.getId());
		assertEquals(".name", result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("<stringTemplate id=\".name\" templateType=\"key\"></stringTemplate>", result.serialize());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(".name", result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the float getLowProductionThreshold() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testGetLowProductionThreshold_1()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		float result = fixture.getLowProductionThreshold();

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the GoodsType getOutputType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testGetOutputType_1()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		GoodsType result = fixture.getOutputType();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the int getPrice() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testGetPrice_1()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		int result = fixture.getPrice();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getPriceDifference() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testGetPriceDifference_1()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		int result = fixture.getPriceDifference();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the float getProductionWeight() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testGetProductionWeight_1()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		float result = fixture.getProductionWeight();

		// add additional test code here
		assertEquals(1.0f, result, 0.1f);
	}

	/**
	 * Run the GoodsType getStoredAs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testGetStoredAs_1()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		GoodsType result = fixture.getStoredAs();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isStoredAs());
		assertEquals(1.0f, result.getZeroProductionFactor(), 1.0f);
		assertEquals(0.0f, result.getLowProductionThreshold(), 1.0f);
		assertEquals(1.0f, result.getProductionWeight(), 1.0f);
		assertEquals(false, result.isNewWorldLuxuryType());
		assertEquals(false, result.isImmigrationType());
		assertEquals(false, result.isRawBuildingMaterial());
		assertEquals(false, result.isNewWorldGoodsType());
		assertEquals(Integer.MAX_VALUE, result.getBreedingNumber());
		assertEquals(false, result.isBuildingMaterial());
		assertEquals(0, result.getInitialAmount());
		assertEquals(1, result.getPrice());
		assertEquals(false, result.isFoodType());
		assertEquals(false, result.isFarmed());
		assertEquals(false, result.isLibertyType());
		assertEquals(false, result.isStorable());
		assertEquals(null, result.getInputType());
		assertEquals(false, result.isBreedable());
		assertEquals(false, result.limitIgnored());
		assertEquals(false, result.isRawMaterial());
		assertEquals(null, result.getOutputType());
		assertEquals(false, result.isMilitaryGoods());
		assertEquals(false, result.isRefined());
		assertEquals(false, result.isTradeGoods());
		assertEquals(".workingAs", result.getWorkingAsKey());
		assertEquals("goods-type", result.getXMLTagName());
		assertEquals("", result.toString());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(".name", result.getNameKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<goods-type id=\"\" is-farmed=\"false\" is-food=\"false\" is-military=\"false\" ignore-limit=\"false\" new-world-goods=\"false\" trade-goods=\"false\" storable=\"false\" price=\"1\" production-weight=\"1.0\"></goods-type>", result.serialize());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the GoodsType getStoredAs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testGetStoredAs_2()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		GoodsType result = fixture.getStoredAs();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isStoredAs());
		assertEquals(1.0f, result.getZeroProductionFactor(), 1.0f);
		assertEquals(0.0f, result.getLowProductionThreshold(), 1.0f);
		assertEquals(1.0f, result.getProductionWeight(), 1.0f);
		assertEquals(false, result.isNewWorldLuxuryType());
		assertEquals(false, result.isImmigrationType());
		assertEquals(false, result.isRawBuildingMaterial());
		assertEquals(false, result.isNewWorldGoodsType());
		assertEquals(Integer.MAX_VALUE, result.getBreedingNumber());
		assertEquals(false, result.isBuildingMaterial());
		assertEquals(0, result.getInitialAmount());
		assertEquals(1, result.getPrice());
		assertEquals(false, result.isFoodType());
		assertEquals(false, result.isFarmed());
		assertEquals(false, result.isLibertyType());
		assertEquals(false, result.isStorable());
		assertEquals(null, result.getInputType());
		assertEquals(false, result.isBreedable());
		assertEquals(false, result.limitIgnored());
		assertEquals(false, result.isRawMaterial());
		assertEquals(null, result.getOutputType());
		assertEquals(false, result.isMilitaryGoods());
		assertEquals(false, result.isRefined());
		assertEquals(false, result.isTradeGoods());
		assertEquals(".workingAs", result.getWorkingAsKey());
		assertEquals("goods-type", result.getXMLTagName());
		assertEquals("", result.toString());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(".name", result.getNameKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<goods-type id=\"\" is-farmed=\"false\" is-food=\"false\" is-military=\"false\" ignore-limit=\"false\" new-world-goods=\"false\" trade-goods=\"false\" storable=\"false\" price=\"1\" production-weight=\"1.0\"></goods-type>", result.serialize());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the String getWorkingAsKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testGetWorkingAsKey_1()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		String result = fixture.getWorkingAsKey();

		// add additional test code here
		assertEquals(".workingAs", result);
	}

	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = GoodsType.getXMLElementTagName();

		// add additional test code here
		assertEquals("goods-type", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("goods-type", result);
	}

	/**
	 * Run the float getZeroProductionFactor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testGetZeroProductionFactor_1()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		float result = fixture.getZeroProductionFactor();

		// add additional test code here
		assertEquals(1.0f, result, 0.1f);
	}

	/**
	 * Run the boolean isBreedable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testIsBreedable_1()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		boolean result = fixture.isBreedable();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isBreedable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testIsBreedable_2()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		boolean result = fixture.isBreedable();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isBuildingMaterial() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testIsBuildingMaterial_1()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		boolean result = fixture.isBuildingMaterial();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isBuildingMaterial() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testIsBuildingMaterial_2()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		boolean result = fixture.isBuildingMaterial();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isFarmed() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testIsFarmed_1()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		boolean result = fixture.isFarmed();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isFarmed() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testIsFarmed_2()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		boolean result = fixture.isFarmed();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isFoodType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testIsFoodType_1()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		boolean result = fixture.isFoodType();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isFoodType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testIsFoodType_2()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		boolean result = fixture.isFoodType();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImmigrationType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testIsImmigrationType_1()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		boolean result = fixture.isImmigrationType();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImmigrationType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testIsImmigrationType_2()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		boolean result = fixture.isImmigrationType();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isLibertyType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testIsLibertyType_1()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		boolean result = fixture.isLibertyType();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isLibertyType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testIsLibertyType_2()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		boolean result = fixture.isLibertyType();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isMilitaryGoods() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testIsMilitaryGoods_1()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		boolean result = fixture.isMilitaryGoods();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isMilitaryGoods() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testIsMilitaryGoods_2()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		boolean result = fixture.isMilitaryGoods();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isNewWorldGoodsType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testIsNewWorldGoodsType_1()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		boolean result = fixture.isNewWorldGoodsType();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isNewWorldGoodsType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testIsNewWorldGoodsType_2()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		boolean result = fixture.isNewWorldGoodsType();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isNewWorldLuxuryType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testIsNewWorldLuxuryType_1()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		boolean result = fixture.isNewWorldLuxuryType();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isNewWorldLuxuryType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testIsNewWorldLuxuryType_2()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		boolean result = fixture.isNewWorldLuxuryType();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isNewWorldLuxuryType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testIsNewWorldLuxuryType_3()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		boolean result = fixture.isNewWorldLuxuryType();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isRawBuildingMaterial() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testIsRawBuildingMaterial_1()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		boolean result = fixture.isRawBuildingMaterial();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isRawBuildingMaterial() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testIsRawBuildingMaterial_2()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		boolean result = fixture.isRawBuildingMaterial();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isRawBuildingMaterial() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testIsRawBuildingMaterial_3()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		boolean result = fixture.isRawBuildingMaterial();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isRawMaterial() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testIsRawMaterial_1()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		boolean result = fixture.isRawMaterial();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isRawMaterial() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testIsRawMaterial_2()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		boolean result = fixture.isRawMaterial();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isRefined() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testIsRefined_1()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		boolean result = fixture.isRefined();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isRefined() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testIsRefined_2()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		boolean result = fixture.isRefined();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isStorable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testIsStorable_1()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		boolean result = fixture.isStorable();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isStorable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testIsStorable_2()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		boolean result = fixture.isStorable();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isStoredAs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testIsStoredAs_1()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		boolean result = fixture.isStoredAs();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isStoredAs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testIsStoredAs_2()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		boolean result = fixture.isStoredAs();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isTradeGoods() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testIsTradeGoods_1()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		boolean result = fixture.isTradeGoods();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isTradeGoods() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testIsTradeGoods_2()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		boolean result = fixture.isTradeGoods();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean limitIgnored() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testLimitIgnored_1()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		boolean result = fixture.limitIgnored();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean limitIgnored() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testLimitIgnored_2()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		boolean result = fixture.limitIgnored();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);
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
		//       at net.sf.freecol.common.model.GoodsType.readAttributes(GoodsType.java:632)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);
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
		//       at net.sf.freecol.common.model.GoodsType.readAttributes(GoodsType.java:632)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testReadAttributes_3()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);
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
		//       at net.sf.freecol.common.model.GoodsType.readAttributes(GoodsType.java:632)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testReadAttributes_4()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);
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
		//       at net.sf.freecol.common.model.GoodsType.readAttributes(GoodsType.java:632)
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
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.GoodsType.readChild(GoodsType.java:681)
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
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.GoodsType.readChild(GoodsType.java:681)
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
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.GoodsType.readChild(GoodsType.java:681)
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
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.GoodsType.readChild(GoodsType.java:681)
	}

	/**
	 * Run the void setDerivedAttributes(Specification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testSetDerivedAttributes_1()
		throws Exception {
		Specification spec = new Specification();

		GoodsType.setDerivedAttributes(spec);

		// add additional test code here
	}

	/**
	 * Run the void setDerivedAttributes(Specification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testSetDerivedAttributes_2()
		throws Exception {
		Specification spec = new Specification();

		GoodsType.setDerivedAttributes(spec);

		// add additional test code here
	}

	/**
	 * Run the void setDerivedAttributes(Specification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testSetDerivedAttributes_3()
		throws Exception {
		Specification spec = new Specification();

		GoodsType.setDerivedAttributes(spec);

		// add additional test code here
	}

	/**
	 * Run the void setDerivedAttributes(Specification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testSetDerivedAttributes_4()
		throws Exception {
		Specification spec = new Specification();

		GoodsType.setDerivedAttributes(spec);

		// add additional test code here
	}

	/**
	 * Run the void setDerivedAttributes(Specification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testSetDerivedAttributes_5()
		throws Exception {
		Specification spec = new Specification();

		GoodsType.setDerivedAttributes(spec);

		// add additional test code here
	}

	/**
	 * Run the void setDerivedAttributes(Specification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testSetDerivedAttributes_6()
		throws Exception {
		Specification spec = new Specification();

		GoodsType.setDerivedAttributes(spec);

		// add additional test code here
	}

	/**
	 * Run the void setDerivedAttributes(Specification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testSetDerivedAttributes_7()
		throws Exception {
		Specification spec = new Specification();

		GoodsType.setDerivedAttributes(spec);

		// add additional test code here
	}

	/**
	 * Run the void setDerivedAttributes(Specification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testSetDerivedAttributes_8()
		throws Exception {
		Specification spec = new Specification();

		GoodsType.setDerivedAttributes(spec);

		// add additional test code here
	}

	/**
	 * Run the void setDerivedAttributes(Specification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testSetDerivedAttributes_9()
		throws Exception {
		Specification spec = new Specification();

		GoodsType.setDerivedAttributes(spec);

		// add additional test code here
	}

	/**
	 * Run the void setDerivedAttributes(Specification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testSetDerivedAttributes_10()
		throws Exception {
		Specification spec = new Specification();

		GoodsType.setDerivedAttributes(spec);

		// add additional test code here
	}

	/**
	 * Run the void setDerivedAttributes(Specification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testSetDerivedAttributes_11()
		throws Exception {
		Specification spec = new Specification();

		GoodsType.setDerivedAttributes(spec);

		// add additional test code here
	}

	/**
	 * Run the void setDerivedAttributes(Specification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testSetDerivedAttributes_12()
		throws Exception {
		Specification spec = new Specification();

		GoodsType.setDerivedAttributes(spec);

		// add additional test code here
	}

	/**
	 * Run the void setDerivedAttributes(Specification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testSetDerivedAttributes_13()
		throws Exception {
		Specification spec = new Specification();

		GoodsType.setDerivedAttributes(spec);

		// add additional test code here
	}

	/**
	 * Run the void setDerivedAttributes(Specification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testSetDerivedAttributes_14()
		throws Exception {
		Specification spec = new Specification();

		GoodsType.setDerivedAttributes(spec);

		// add additional test code here
	}

	/**
	 * Run the void setDerivedAttributes(Specification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testSetDerivedAttributes_15()
		throws Exception {
		Specification spec = new Specification();

		GoodsType.setDerivedAttributes(spec);

		// add additional test code here
	}

	/**
	 * Run the void setDerivedAttributes(Specification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testSetDerivedAttributes_16()
		throws Exception {
		Specification spec = new Specification();

		GoodsType.setDerivedAttributes(spec);

		// add additional test code here
	}

	/**
	 * Run the void setMilitary() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testSetMilitary_1()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);

		fixture.setMilitary();

		// add additional test code here
	}

	/**
	 * Run the void setPrice(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testSetPrice_1()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);
		int newPrice = 1;

		fixture.setPrice(newPrice);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_1()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(Integer.MAX_VALUE);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_2()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(Integer.MAX_VALUE);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_3()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_4()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_5()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(Integer.MAX_VALUE);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_6()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_7()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_8()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(Integer.MAX_VALUE);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_9()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_10()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_11()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(Integer.MAX_VALUE);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_12()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_13()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(Integer.MAX_VALUE);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_14()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_15()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(Integer.MAX_VALUE);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_16()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(Integer.MAX_VALUE);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
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
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
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
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
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
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
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
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testWriteChildren_5()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testWriteChildren_6()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testWriteChildren_7()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:28 PM
	 */
	@Test
	public void testWriteChildren_8()
		throws Exception {
		GoodsType fixture = new GoodsType("", new Specification());
		fixture.setPrice(1);
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
		new org.junit.runner.JUnitCore().run(GoodsTypeTest.class);
	}
}