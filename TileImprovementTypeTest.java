package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;
import javax.imageio.metadata.IIOMetadataNode;
import javax.xml.stream.XMLStreamException;
import net.sf.freecol.common.io.FreeColXMLWriter;
import net.sf.freecol.common.util.RandomChoice;
import net.sf.freecol.common.io.FreeColXMLReader;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>TileImprovementTypeTest</code> contains tests for the class <code>{@link TileImprovementType}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:29 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class TileImprovementTypeTest {
	/**
	 * Run the TileImprovementType(String,Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testTileImprovementType_1()
		throws Exception {
		String id = "";
		Specification specification = new Specification();

		TileImprovementType result = new TileImprovementType(id, specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getZIndex());
		assertEquals(0, result.getMagnitude());
		assertEquals("tile-improvement-type", result.getXMLTagName());
		assertEquals(false, result.isNatural());
		assertEquals(0, result.getAddWorkTurns());
		assertEquals(0, result.getExpendedAmount());
		assertEquals(0, result.getExposeResourcePercent());
		assertEquals(null, result.getRequiredImprovementType());
		assertEquals(null, result.getRequiredRole());
		assertEquals(false, result.isChangeType());
		assertEquals("", result.toString());
		assertEquals(false, result.isAbstractType());
		assertEquals(".name", result.getNameKey());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
		assertEquals("<tile-improvement-type id=\"\" natural=\"false\" magnitude=\"0\" add-work-turns=\"0\" movement-cost=\"-1\" zIndex=\"0\" expose-resource-percent=\"0\"></tile-improvement-type>", result.serialize());
	}

	/**
	 * Run the boolean changeContainsTarget(TileType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testChangeContainsTarget_1()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		TileType tileType = new TileType("", new Specification());

		boolean result = fixture.changeContainsTarget(tileType);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean changeContainsTarget(TileType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testChangeContainsTarget_2()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		TileType tileType = new TileType("", new Specification());

		boolean result = fixture.changeContainsTarget(tileType);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean changeContainsTarget(TileType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testChangeContainsTarget_3()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		TileType tileType = new TileType("", new Specification());

		boolean result = fixture.changeContainsTarget(tileType);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the int getAddWorkTurns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetAddWorkTurns_1()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);

		int result = fixture.getAddWorkTurns();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getBonus(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetBonus_1()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		GoodsType goodsType = new GoodsType("", new Specification());

		int result = fixture.getBonus(goodsType);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getBonus(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetBonus_2()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		GoodsType goodsType = new GoodsType("", new Specification());

		int result = fixture.getBonus(goodsType);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the TileType getChange(TileType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetChange_1()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		TileType tileType = new TileType("", new Specification());

		TileType result = fixture.getChange(tileType);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the TileType getChange(TileType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetChange_2()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		TileType tileType = new TileType("", new Specification());

		TileType result = fixture.getChange(tileType);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the TileType getChange(TileType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetChange_3()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		TileType tileType = new TileType("", new Specification());

		TileType result = fixture.getChange(tileType);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<RandomChoice<Disaster>> getDisasters() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetDisasters_1()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);

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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetDisasters_2()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);

		List<RandomChoice<Disaster>> result = fixture.getDisasters();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the int getExpendedAmount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetExpendedAmount_1()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);

		int result = fixture.getExpendedAmount();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getExposeResourcePercent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetExposeResourcePercent_1()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);

		int result = fixture.getExposeResourcePercent();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getImprovementValue(Tile,GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetImprovementValue_1()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1);
		GoodsType goodsType = new GoodsType("", new Specification());

		int result = fixture.getImprovementValue(tile, goodsType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getImprovementValue(Tile,GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetImprovementValue_2()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1);
		GoodsType goodsType = new GoodsType("", new Specification());

		int result = fixture.getImprovementValue(tile, goodsType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getImprovementValue(Tile,GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetImprovementValue_3()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), new TileType("", new Specification()), 1, 1);
		GoodsType goodsType = new GoodsType("", new Specification());

		int result = fixture.getImprovementValue(tile, goodsType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getImprovementValue(Tile,GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetImprovementValue_4()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");
		GoodsType goodsType = new GoodsType("", new Specification());

		int result = fixture.getImprovementValue(tile, goodsType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getMagnitude() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetMagnitude_1()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);

		int result = fixture.getMagnitude();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getMoveCost(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetMoveCost_1()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		int originalCost = 1;

		int result = fixture.getMoveCost(originalCost);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getMoveCost(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetMoveCost_2()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		int originalCost = 1;

		int result = fixture.getMoveCost(originalCost);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getMoveCost(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetMoveCost_3()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		int originalCost = 2;

		int result = fixture.getMoveCost(originalCost);

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the AbstractGoods getProduction(TileType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetProduction_1()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		TileType from = new TileType("", new Specification());

		AbstractGoods result = fixture.getProduction(from);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the AbstractGoods getProduction(TileType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetProduction_2()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		TileType from = new TileType("", new Specification());

		AbstractGoods result = fixture.getProduction(from);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the AbstractGoods getProduction(TileType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetProduction_3()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		TileType from = new TileType("", new Specification());

		AbstractGoods result = fixture.getProduction(from);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Modifier getProductionModifier(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetProductionModifier_1()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		GoodsType goodsType = new GoodsType("", new Specification());

		Modifier result = fixture.getProductionModifier(goodsType);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Modifier getProductionModifier(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetProductionModifier_2()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		GoodsType goodsType = new GoodsType("", new Specification());

		Modifier result = fixture.getProductionModifier(goodsType);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Modifier getProductionModifier(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetProductionModifier_3()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		GoodsType goodsType = new GoodsType("", new Specification());

		Modifier result = fixture.getProductionModifier(goodsType);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Modifier getProductionModifier(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetProductionModifier_4()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		GoodsType goodsType = new GoodsType("", new Specification());

		Modifier result = fixture.getProductionModifier(goodsType);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the TileImprovementType getRequiredImprovementType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetRequiredImprovementType_1()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);

		TileImprovementType result = fixture.getRequiredImprovementType();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Role getRequiredRole() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetRequiredRole_1()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);

		Role result = fixture.getRequiredRole();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<Scope> getScopes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetScopes_1()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);

		List<Scope> result = fixture.getScopes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Scope> getScopes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetScopes_2()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);

		List<Scope> result = fixture.getScopes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = TileImprovementType.getXMLElementTagName();

		// add additional test code here
		assertEquals("tile-improvement-type", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("tile-improvement-type", result);
	}

	/**
	 * Run the int getZIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testGetZIndex_1()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);

		int result = fixture.getZIndex();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the boolean isChangeType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testIsChangeType_1()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);

		boolean result = fixture.isChangeType();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isChangeType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testIsChangeType_2()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);

		boolean result = fixture.isChangeType();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isChangeType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testIsChangeType_3()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);

		boolean result = fixture.isChangeType();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isNatural() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testIsNatural_1()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);

		boolean result = fixture.isNatural();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isNatural() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testIsNatural_2()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);

		boolean result = fixture.isNatural();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isTileTypeAllowed(TileType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testIsTileTypeAllowed_1()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		TileType tileType = new TileType("", new Specification());

		boolean result = fixture.isTileTypeAllowed(tileType);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isTileTypeAllowed(TileType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testIsTileTypeAllowed_2()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		TileType tileType = new TileType("", new Specification());

		boolean result = fixture.isTileTypeAllowed(tileType);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isWorkerAllowed(Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testIsWorkerAllowed_1()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setType(new UnitType("", new Specification()));

		boolean result = fixture.isWorkerAllowed(unit);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isWorkerAllowed(Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testIsWorkerAllowed_2()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setType(new UnitType("", new Specification()));
		unit.setRole(new Role("", new Specification()));

		boolean result = fixture.isWorkerAllowed(unit);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isWorkerAllowed(Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testIsWorkerAllowed_3()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setType(new UnitType("", new Specification()));

		boolean result = fixture.isWorkerAllowed(unit);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isWorkerAllowed(Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testIsWorkerAllowed_4()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setType(new UnitType("", new Specification()));
		unit.setRole(new Role("", new Specification()));

		boolean result = fixture.isWorkerAllowed(unit);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean isWorkerTypeAllowed(UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testIsWorkerTypeAllowed_1()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		UnitType unitType = new UnitType("", new Specification());

		boolean result = fixture.isWorkerTypeAllowed(unitType);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isWorkerTypeAllowed(UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testIsWorkerTypeAllowed_2()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		UnitType unitType = new UnitType("", new Specification());

		boolean result = fixture.isWorkerTypeAllowed(unitType);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isWorkerTypeAllowed(UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testIsWorkerTypeAllowed_3()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		UnitType unitType = new UnitType("", new Specification());

		boolean result = fixture.isWorkerTypeAllowed(unitType);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isWorkerTypeAllowed(UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testIsWorkerTypeAllowed_4()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		UnitType unitType = new UnitType("", new Specification());

		boolean result = fixture.isWorkerTypeAllowed(unitType);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
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
		//       at net.sf.freecol.common.model.TileImprovementType.readAttributes(TileImprovementType.java:523)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
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
		//       at net.sf.freecol.common.model.TileImprovementType.readAttributes(TileImprovementType.java:523)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testReadAttributes_3()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
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
		//       at net.sf.freecol.common.model.TileImprovementType.readAttributes(TileImprovementType.java:523)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testReadAttributes_4()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
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
		//       at net.sf.freecol.common.model.TileImprovementType.readAttributes(TileImprovementType.java:523)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testReadAttributes_5()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
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
		//       at net.sf.freecol.common.model.TileImprovementType.readAttributes(TileImprovementType.java:523)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testReadChild_1()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.TileImprovementType.readChild(TileImprovementType.java:587)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testReadChild_2()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.TileImprovementType.readChild(TileImprovementType.java:587)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testReadChild_3()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.TileImprovementType.readChild(TileImprovementType.java:587)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testReadChild_4()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.TileImprovementType.readChild(TileImprovementType.java:587)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testReadChild_5()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.TileImprovementType.readChild(TileImprovementType.java:587)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testReadChild_6()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.TileImprovementType.readChild(TileImprovementType.java:587)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testReadChild_7()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.TileImprovementType.readChild(TileImprovementType.java:587)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testReadChild_8()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.TileImprovementType.readChild(TileImprovementType.java:587)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testReadChild_9()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.TileImprovementType.readChild(TileImprovementType.java:587)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testReadChild_10()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.TileImprovementType.readChild(TileImprovementType.java:587)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testReadChild_11()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.TileImprovementType.readChild(TileImprovementType.java:587)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testReadChild_12()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.TileImprovementType.readChild(TileImprovementType.java:587)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testReadChildren_1()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:801)
		//       at net.sf.freecol.common.model.TileImprovementType.readChildren(TileImprovementType.java:571)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testReadChildren_2()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:801)
		//       at net.sf.freecol.common.model.TileImprovementType.readChildren(TileImprovementType.java:571)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testReadChildren_3()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:801)
		//       at net.sf.freecol.common.model.TileImprovementType.readChildren(TileImprovementType.java:571)
	}

	/**
	 * Run the void setZIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testSetZIndex_1()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		int newZIndex = 1;

		fixture.setZIndex(newZIndex);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_1()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_2()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_3()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_4()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_5()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_6()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_7()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_8()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_9()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_10()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_11()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_12()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_13()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_14()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_15()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_16()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testWriteChildren_1()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testWriteChildren_2()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testWriteChildren_3()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testWriteChildren_4()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testWriteChildren_5()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testWriteChildren_6()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testWriteChildren_7()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testWriteChildren_8()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testWriteChildren_9()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	@Test
	public void testWriteChildren_10()
		throws Exception {
		TileImprovementType fixture = new TileImprovementType("", new Specification());
		fixture.setZIndex(1);
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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
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
	 * @generatedBy CodePro at 5/14/18 4:29 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TileImprovementTypeTest.class);
	}
}