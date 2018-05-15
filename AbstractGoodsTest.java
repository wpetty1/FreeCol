package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import java.util.ArrayList;
import net.sf.freecol.common.io.FreeColXMLReader;
import java.util.Collection;
import javax.imageio.metadata.IIOMetadataNode;
import javax.xml.stream.XMLStreamException;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>AbstractGoodsTest</code> contains tests for the class <code>{@link AbstractGoods}</code>.
 *
 * @generatedBy CodePro at 5/14/18 2:23 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class AbstractGoodsTest {
	/**
	 * Run the AbstractGoods() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:23 PM
	 */
	@Test
	public void testAbstractGoods_1()
		throws Exception {

		AbstractGoods result = new AbstractGoods();

		// add additional test code here
		assertNotNull(result);
		assertEquals("0 (null)", result.toString());
		assertEquals(null, result.getType());
		assertEquals(0, result.getAmount());
		assertEquals("abstractGoods", result.getXMLTagName());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(null, result.getSpecification());
		assertEquals("<abstractGoods amount=\"0\"></abstractGoods>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getIdType());
	}

	/**
	 * Run the AbstractGoods(AbstractGoods) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:23 PM
	 */
	@Test
	public void testAbstractGoods_2()
		throws Exception {
		AbstractGoods other = new AbstractGoods(new GoodsType("", new Specification()), 1);

		AbstractGoods result = new AbstractGoods(other);

		// add additional test code here
		assertNotNull(result);
		assertEquals("1 ", result.toString());
		assertEquals(1, result.getAmount());
		assertEquals("abstractGoods", result.getXMLTagName());
		assertEquals(".name", result.getNameKey());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(null, result.getSpecification());
		assertEquals("<abstractGoods id=\"\" type=\"\" amount=\"1\"></abstractGoods>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
	}

	/**
	 * Run the AbstractGoods(GoodsType,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:23 PM
	 */
	@Test
	public void testAbstractGoods_3()
		throws Exception {
		GoodsType type = new GoodsType("", new Specification());
		int amount = 1;

		AbstractGoods result = new AbstractGoods(type, amount);

		// add additional test code here
		assertNotNull(result);
		assertEquals("1 ", result.toString());
		assertEquals(1, result.getAmount());
		assertEquals("abstractGoods", result.getXMLTagName());
		assertEquals(".name", result.getNameKey());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(null, result.getSpecification());
		assertEquals("<abstractGoods id=\"\" type=\"\" amount=\"1\"></abstractGoods>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
	}

	/**
	 * Run the boolean containsType(GoodsType,Collection<? extends AbstractGoods>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:23 PM
	 */
	@Test
	public void testContainsType_1()
		throws Exception {
		GoodsType type = new GoodsType("", new Specification());
		Collection<? extends AbstractGoods> goods = new ArrayList<AbstractGoods>();

		boolean result = AbstractGoods.containsType(type, goods);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean containsType(GoodsType,Collection<? extends AbstractGoods>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:23 PM
	 */
	@Test
	public void testContainsType_2()
		throws Exception {
		GoodsType type = new GoodsType("", new Specification());
		Collection<? extends AbstractGoods> goods = new ArrayList<AbstractGoods>();

		boolean result = AbstractGoods.containsType(type, goods);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:23 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		AbstractGoods fixture = new AbstractGoods(new GoodsType("", new Specification()), 1);
		Object o = new AbstractGoods(new GoodsType("", new Specification()), 1);

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:23 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		AbstractGoods fixture = new AbstractGoods(new GoodsType("", new Specification()), 1);
		Object o = new AbstractGoods(new GoodsType("", new Specification()), 1);

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:23 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		AbstractGoods fixture = new AbstractGoods(new GoodsType("", new Specification()), 1);
		Object o = new AbstractGoods(new GoodsType("", new Specification()), 1);

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:23 PM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		AbstractGoods fixture = new AbstractGoods(new GoodsType("", new Specification()), 1);
		Object o = new AbstractGoods(new GoodsType("", new Specification()), 1);

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:23 PM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		AbstractGoods fixture = new AbstractGoods(new GoodsType("", new Specification()), 1);
		Object o = new Object();

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the int evaluateFor(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:23 PM
	 */
	@Test
	public void testEvaluateFor_1()
		throws Exception {
		AbstractGoods fixture = new AbstractGoods(new GoodsType("", new Specification()), 1);
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		player.market = null;

		int result = fixture.evaluateFor(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the AbstractGoods findByType(GoodsType,Collection<? extends AbstractGoods>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:23 PM
	 */
	@Test
	public void testFindByType_1()
		throws Exception {
		GoodsType type = new GoodsType("", new Specification());
		Collection<? extends AbstractGoods> goods = new ArrayList<AbstractGoods>();

		AbstractGoods result = AbstractGoods.findByType(type, goods);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the AbstractGoods findByType(GoodsType,Collection<? extends AbstractGoods>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:23 PM
	 */
	@Test
	public void testFindByType_2()
		throws Exception {
		GoodsType type = new GoodsType("", new Specification());
		Collection<? extends AbstractGoods> goods = new ArrayList<AbstractGoods>();

		AbstractGoods result = AbstractGoods.findByType(type, goods);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the AbstractGoods findByType(GoodsType,Collection<? extends AbstractGoods>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:23 PM
	 */
	@Test
	public void testFindByType_3()
		throws Exception {
		GoodsType type = new GoodsType("", new Specification());
		Collection<? extends AbstractGoods> goods = new ArrayList<AbstractGoods>();

		AbstractGoods result = AbstractGoods.findByType(type, goods);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the int getAmount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:23 PM
	 */
	@Test
	public void testGetAmount_1()
		throws Exception {
		AbstractGoods fixture = new AbstractGoods(new GoodsType("", new Specification()), 1);

		int result = fixture.getAmount();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getCount(GoodsType,Collection<? extends AbstractGoods>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:23 PM
	 */
	@Test
	public void testGetCount_1()
		throws Exception {
		GoodsType type = new GoodsType("", new Specification());
		Collection<? extends AbstractGoods> goods = new ArrayList<AbstractGoods>();

		int result = AbstractGoods.getCount(type, goods);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getCount(GoodsType,Collection<? extends AbstractGoods>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:23 PM
	 */
	@Test
	public void testGetCount_2()
		throws Exception {
		GoodsType type = new GoodsType("", new Specification());
		Collection<? extends AbstractGoods> goods = new ArrayList<AbstractGoods>();

		int result = AbstractGoods.getCount(type, goods);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the StringTemplate getLabel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:23 PM
	 */
	@Test
	public void testGetLabel_1()
		throws Exception {
		AbstractGoods fixture = new AbstractGoods(new GoodsType("", new Specification()), 1);

		StringTemplate result = fixture.getLabel();

		// add additional test code here
		assertNotNull(result);
		assertEquals("TEMPLATE: model.abstractGoods.label [[%goods%: KEY: .name][%amount%: NAME: 1]]", result.toString());
		assertEquals(null, result.getDefaultId());
		assertEquals("stringTemplate", result.getXMLTagName());
		assertEquals("model.abstractGoods.label", result.getId());
		assertEquals("label", result.getSuffix());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(null, result.getSpecification());
		assertEquals("<stringTemplate id=\"model.abstractGoods.label\" templateType=\"template\"><key value=\"%goods%\"></key><key value=\"%amount%\"></key><stringTemplate id=\".name\" templateType=\"key\"></stringTemplate><stringTemplate id=\"1\" templateType=\"name\"></stringTemplate></stringTemplate>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals("model.abstractGoods.label", result.getIdType());
	}

	/**
	 * Run the StringTemplate getLabel(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:23 PM
	 */
	@Test
	public void testGetLabel_2()
		throws Exception {
		AbstractGoods fixture = new AbstractGoods(new GoodsType("", new Specification()), 1);
		boolean sellable = false;

		StringTemplate result = fixture.getLabel(sellable);

		// add additional test code here
		assertNotNull(result);
		assertEquals("TEMPLATE: model.abstractGoods.boycotted [[%goods%: KEY: .name][%amount%: NAME: 1]]", result.toString());
		assertEquals(null, result.getDefaultId());
		assertEquals("stringTemplate", result.getXMLTagName());
		assertEquals("model.abstractGoods.boycotted", result.getId());
		assertEquals("boycotted", result.getSuffix());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(null, result.getSpecification());
		assertEquals("<stringTemplate id=\"model.abstractGoods.boycotted\" templateType=\"template\"><key value=\"%goods%\"></key><key value=\"%amount%\"></key><stringTemplate id=\".name\" templateType=\"key\"></stringTemplate><stringTemplate id=\"1\" templateType=\"name\"></stringTemplate></stringTemplate>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals("model.abstractGoods.boycotted", result.getIdType());
	}

	/**
	 * Run the StringTemplate getLabel(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:23 PM
	 */
	@Test
	public void testGetLabel_3()
		throws Exception {
		AbstractGoods fixture = new AbstractGoods(new GoodsType("", new Specification()), 1);
		boolean sellable = true;

		StringTemplate result = fixture.getLabel(sellable);

		// add additional test code here
		assertNotNull(result);
		assertEquals("TEMPLATE: model.abstractGoods.label [[%goods%: KEY: .name][%amount%: NAME: 1]]", result.toString());
		assertEquals(null, result.getDefaultId());
		assertEquals("stringTemplate", result.getXMLTagName());
		assertEquals("model.abstractGoods.label", result.getId());
		assertEquals("label", result.getSuffix());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(null, result.getSpecification());
		assertEquals("<stringTemplate id=\"model.abstractGoods.label\" templateType=\"template\"><key value=\"%goods%\"></key><key value=\"%amount%\"></key><stringTemplate id=\".name\" templateType=\"key\"></stringTemplate><stringTemplate id=\"1\" templateType=\"name\"></stringTemplate></stringTemplate>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals("model.abstractGoods.label", result.getIdType());
	}

	/**
	 * Run the StringTemplate getLabel(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:23 PM
	 */
	@Test
	public void testGetLabel_4()
		throws Exception {
		String key = "";
		int amount = 1;

		StringTemplate result = AbstractGoods.getLabel(key, amount);

		// add additional test code here
		assertNotNull(result);
		assertEquals("TEMPLATE: model.abstractGoods.label [[%goods%: KEY: ][%amount%: NAME: 1]]", result.toString());
		assertEquals(null, result.getDefaultId());
		assertEquals("stringTemplate", result.getXMLTagName());
		assertEquals("model.abstractGoods.label", result.getId());
		assertEquals("label", result.getSuffix());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(null, result.getSpecification());
		assertEquals("<stringTemplate id=\"model.abstractGoods.label\" templateType=\"template\"><key value=\"%goods%\"></key><key value=\"%amount%\"></key><stringTemplate id=\"\" templateType=\"key\"></stringTemplate><stringTemplate id=\"1\" templateType=\"name\"></stringTemplate></stringTemplate>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals("model.abstractGoods.label", result.getIdType());
	}

	/**
	 * Run the StringTemplate getLabel(GoodsType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:23 PM
	 */
	@Test
	public void testGetLabel_5()
		throws Exception {
		GoodsType type = new GoodsType("", new Specification());
		int amount = 1;

		StringTemplate result = AbstractGoods.getLabel(type, amount);

		// add additional test code here
		assertNotNull(result);
		assertEquals("TEMPLATE: model.abstractGoods.label [[%goods%: KEY: .name][%amount%: NAME: 1]]", result.toString());
		assertEquals(null, result.getDefaultId());
		assertEquals("stringTemplate", result.getXMLTagName());
		assertEquals("model.abstractGoods.label", result.getId());
		assertEquals("label", result.getSuffix());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(null, result.getSpecification());
		assertEquals("<stringTemplate id=\"model.abstractGoods.label\" templateType=\"template\"><key value=\"%goods%\"></key><key value=\"%amount%\"></key><stringTemplate id=\".name\" templateType=\"key\"></stringTemplate><stringTemplate id=\"1\" templateType=\"name\"></stringTemplate></stringTemplate>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals("model.abstractGoods.label", result.getIdType());
	}

	/**
	 * Run the String getNameKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:23 PM
	 */
	@Test
	public void testGetNameKey_1()
		throws Exception {
		AbstractGoods fixture = new AbstractGoods(new GoodsType("", new Specification()), 1);

		String result = fixture.getNameKey();

		// add additional test code here
		assertEquals(".name", result);
	}

	/**
	 * Run the GoodsType getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:23 PM
	 */
	@Test
	public void testGetType_1()
		throws Exception {
		AbstractGoods fixture = new AbstractGoods(new GoodsType("", new Specification()), 1);

		GoodsType result = fixture.getType();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isNewWorldGoodsType());
		assertEquals(false, result.isImmigrationType());
		assertEquals(false, result.isNewWorldLuxuryType());
		assertEquals(false, result.isRawBuildingMaterial());
		assertEquals(null, result.getInputType());
		assertEquals(false, result.isTradeGoods());
		assertEquals(false, result.isRawMaterial());
		assertEquals(false, result.limitIgnored());
		assertEquals(0, result.getInitialAmount());
		assertEquals(false, result.isStoredAs());
		assertEquals(false, result.isBreedable());
		assertEquals(false, result.isRefined());
		assertEquals(false, result.isMilitaryGoods());
		assertEquals(null, result.getOutputType());
		assertEquals(".workingAs", result.getWorkingAsKey());
		assertEquals("goods-type", result.getXMLTagName());
		assertEquals(false, result.isFarmed());
		assertEquals(false, result.isFoodType());
		assertEquals(false, result.isLibertyType());
		assertEquals(false, result.isStorable());
		assertEquals(Integer.MAX_VALUE, result.getPrice());
		assertEquals(false, result.isBuildingMaterial());
		assertEquals(Integer.MAX_VALUE, result.getBreedingNumber());
		assertEquals(1.0f, result.getZeroProductionFactor(), 1.0f);
		assertEquals(1.0f, result.getProductionWeight(), 1.0f);
		assertEquals(0.0f, result.getLowProductionThreshold(), 1.0f);
		assertEquals("", result.toString());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(".name", result.getNameKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<goods-type id=\"\" is-farmed=\"false\" is-food=\"false\" is-military=\"false\" ignore-limit=\"false\" new-world-goods=\"false\" trade-goods=\"false\" storable=\"false\" production-weight=\"1.0\"></goods-type>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
	}

	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:23 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = AbstractGoods.getXMLElementTagName();

		// add additional test code here
		assertEquals("abstractGoods", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:23 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		AbstractGoods fixture = new AbstractGoods(new GoodsType("", new Specification()), 1);

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("abstractGoods", result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:23 PM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		AbstractGoods fixture = new AbstractGoods(new GoodsType("", new Specification()), 1);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:23 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		AbstractGoods fixture = new AbstractGoods(new GoodsType("", new Specification()), 1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.FreeColObject.readAttributes(FreeColObject.java:1257)
		//       at net.sf.freecol.common.model.AbstractGoods.readAttributes(AbstractGoods.java:293)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:23 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		AbstractGoods fixture = new AbstractGoods(new GoodsType("", new Specification()), 1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.FreeColObject.readAttributes(FreeColObject.java:1257)
		//       at net.sf.freecol.common.model.AbstractGoods.readAttributes(AbstractGoods.java:293)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:23 PM
	 */
	@Test
	public void testReadAttributes_3()
		throws Exception {
		AbstractGoods fixture = new AbstractGoods(new GoodsType("", new Specification()), 1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:363)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:205)
		//       at net.sf.freecol.common.model.FreeColObject.readAttributes(FreeColObject.java:1257)
		//       at net.sf.freecol.common.model.AbstractGoods.readAttributes(AbstractGoods.java:293)
	}

	/**
	 * Run the void setAmount(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:23 PM
	 */
	@Test
	public void testSetAmount_1()
		throws Exception {
		AbstractGoods fixture = new AbstractGoods(new GoodsType("", new Specification()), 1);
		int newAmount = 1;

		fixture.setAmount(newAmount);

		// add additional test code here
	}

	/**
	 * Run the void setType(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:23 PM
	 */
	@Test
	public void testSetType_1()
		throws Exception {
		AbstractGoods fixture = new AbstractGoods(new GoodsType("", new Specification()), 1);
		GoodsType newType = new GoodsType("", new Specification());

		fixture.setType(newType);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:23 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		AbstractGoods fixture = new AbstractGoods(new GoodsType("", new Specification()), 1);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("1 ", result);
	}

	/**
	 * Run the String toString(AbstractGoods) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:23 PM
	 */
	@Test
	public void testToString_2()
		throws Exception {
		AbstractGoods ag = new AbstractGoods(new GoodsType("", new Specification()), 1);

		String result = AbstractGoods.toString(ag);

		// add additional test code here
		assertEquals("1 ", result);
	}

	/**
	 * Run the String toString(GoodsType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:23 PM
	 */
	@Test
	public void testToString_3()
		throws Exception {
		GoodsType goodsType = new GoodsType("", new Specification());
		int amount = 1;

		String result = AbstractGoods.toString(goodsType, amount);

		// add additional test code here
		assertEquals("1 ", result);
	}

	/**
	 * Run the String toString(GoodsType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:23 PM
	 */
	@Test
	public void testToString_4()
		throws Exception {
		GoodsType goodsType = null;
		int amount = 1;

		String result = AbstractGoods.toString(goodsType, amount);

		// add additional test code here
		assertEquals("1 (null)", result);
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:23 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_1()
		throws Exception {
		AbstractGoods fixture = new AbstractGoods(new GoodsType("", new Specification()), 1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:23 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_2()
		throws Exception {
		AbstractGoods fixture = new AbstractGoods(new GoodsType("", new Specification()), 1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:23 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_3()
		throws Exception {
		AbstractGoods fixture = new AbstractGoods(new GoodsType("", new Specification()), 1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 2:23 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_4()
		throws Exception {
		AbstractGoods fixture = new AbstractGoods(new GoodsType("", new Specification()), 1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/18 2:23 PM
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
	 * @generatedBy CodePro at 5/14/18 2:23 PM
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
	 * @generatedBy CodePro at 5/14/18 2:23 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AbstractGoodsTest.class);
	}
}