package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import java.util.ArrayList;
import net.sf.freecol.common.io.FreeColXMLReader;
import java.util.Collection;
import java.util.List;
import javax.xml.stream.XMLStreamException;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ProductionTypeTest</code> contains tests for the class <code>{@link ProductionType}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:17 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class ProductionTypeTest {
	/**
	 * Run the ProductionType(List<AbstractGoods>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testProductionType_1()
		throws Exception {
		List<AbstractGoods> outputs = new ArrayList<AbstractGoods>();

		ProductionType result = new ProductionType(outputs);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[null:]", result.toString());
		assertEquals(false, result.getUnattended());
		assertEquals(null, result.getBestOutputType());
		assertEquals("production", result.getXMLTagName());
		assertEquals(null, result.getProductionLevel());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("<production></production>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getIdType());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the ProductionType(Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testProductionType_2()
		throws Exception {
		Specification specification = new Specification();

		ProductionType result = new ProductionType(specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[null:]", result.toString());
		assertEquals(false, result.getUnattended());
		assertEquals(null, result.getBestOutputType());
		assertEquals("production", result.getXMLTagName());
		assertEquals(null, result.getProductionLevel());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals("<production></production>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getIdType());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the ProductionType(List<AbstractGoods>,List<AbstractGoods>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testProductionType_3()
		throws Exception {
		List<AbstractGoods> inputs = new ArrayList<AbstractGoods>();
		List<AbstractGoods> outputs = new ArrayList<AbstractGoods>();

		ProductionType result = new ProductionType(inputs, outputs);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[null:]", result.toString());
		assertEquals(false, result.getUnattended());
		assertEquals(null, result.getBestOutputType());
		assertEquals("production", result.getXMLTagName());
		assertEquals(null, result.getProductionLevel());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("<production></production>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getIdType());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the ProductionType(FreeColXMLReader,Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testProductionType_4()
		throws Exception {
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		Specification specification = new Specification();

		ProductionType result = new ProductionType(xr, specification);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.ProductionType.<init>(ProductionType.java:131)
		assertNotNull(result);
	}

	/**
	 * Run the ProductionType(FreeColXMLReader,Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testProductionType_5()
		throws Exception {
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));
		Specification specification = new Specification();

		ProductionType result = new ProductionType(xr, specification);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.ProductionType.<init>(ProductionType.java:131)
		assertNotNull(result);
	}

	/**
	 * Run the ProductionType(AbstractGoods,boolean,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testProductionType_6()
		throws Exception {
		AbstractGoods output = new AbstractGoods();
		boolean unattended = true;
		String level = "";

		ProductionType result = new ProductionType(output, unattended, level);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[null:  unattended [outputs: 0 (null)]]", result.toString());
		assertEquals(true, result.getUnattended());
		assertEquals(null, result.getBestOutputType());
		assertEquals("production", result.getXMLTagName());
		assertEquals("", result.getProductionLevel());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("<production unattended=\"true\" production-level=\"\"><output value=\"0\"></output></production>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getIdType());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the ProductionType(GoodsType,GoodsType,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testProductionType_7()
		throws Exception {
		GoodsType input = new GoodsType("", new Specification());
		GoodsType output = new GoodsType("", new Specification());
		int amount = 1;

		ProductionType result = new ProductionType(input, output, amount);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[null: [inputs: 1 ] [outputs: 1 ]]", result.toString());
		assertEquals(false, result.getUnattended());
		assertEquals("production", result.getXMLTagName());
		assertEquals(null, result.getProductionLevel());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("<production><input goods-type=\"\" value=\"1\"></input><output goods-type=\"\" value=\"1\"></output></production>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getIdType());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the ProductionType(GoodsType,GoodsType,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testProductionType_8()
		throws Exception {
		GoodsType input = null;
		GoodsType output = new GoodsType("", new Specification());
		int amount = 1;

		ProductionType result = new ProductionType(input, output, amount);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[null: [outputs: 1 ]]", result.toString());
		assertEquals(false, result.getUnattended());
		assertEquals("production", result.getXMLTagName());
		assertEquals(null, result.getProductionLevel());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("<production><output goods-type=\"\" value=\"1\"></output></production>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getIdType());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the ProductionType(GoodsType,GoodsType,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testProductionType_9()
		throws Exception {
		GoodsType input = new GoodsType("", new Specification());
		GoodsType output = null;
		int amount = 1;

		ProductionType result = new ProductionType(input, output, amount);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[null: [inputs: 1 ]]", result.toString());
		assertEquals(false, result.getUnattended());
		assertEquals(null, result.getBestOutputType());
		assertEquals("production", result.getXMLTagName());
		assertEquals(null, result.getProductionLevel());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("<production><input goods-type=\"\" value=\"1\"></input></production>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getIdType());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the ProductionType(GoodsType,GoodsType,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testProductionType_10()
		throws Exception {
		GoodsType input = null;
		GoodsType output = null;
		int amount = 1;

		ProductionType result = new ProductionType(input, output, amount);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[null:]", result.toString());
		assertEquals(false, result.getUnattended());
		assertEquals(null, result.getBestOutputType());
		assertEquals("production", result.getXMLTagName());
		assertEquals(null, result.getProductionLevel());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals("<production></production>", result.serialize());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getIdType());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the boolean appliesExactly(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testAppliesExactly_1()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		String level = "";

		boolean result = fixture.appliesExactly(level);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean appliesExactly(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testAppliesExactly_2()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		String level = null;

		boolean result = fixture.appliesExactly(level);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean appliesExactly(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testAppliesExactly_3()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		String level = "";

		boolean result = fixture.appliesExactly(level);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean appliesTo(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testAppliesTo_1()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		String level = null;

		boolean result = fixture.appliesTo(level);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean appliesTo(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testAppliesTo_2()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, (String) null);
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		String level = "";

		boolean result = fixture.appliesTo(level);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean appliesTo(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testAppliesTo_3()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		String level = "";

		boolean result = fixture.appliesTo(level);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean appliesTo(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testAppliesTo_4()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		String level = "";

		boolean result = fixture.appliesTo(level);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean canProduce(GoodsType,Collection<ProductionType>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testCanProduce_1()
		throws Exception {
		GoodsType goodsType = new GoodsType("", new Specification());
		Collection<ProductionType> types = new ArrayList<ProductionType>();

		boolean result = ProductionType.canProduce(goodsType, types);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean canProduce(GoodsType,Collection<ProductionType>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testCanProduce_2()
		throws Exception {
		GoodsType goodsType = new GoodsType("", new Specification());
		Collection<ProductionType> types = new ArrayList<ProductionType>();

		boolean result = ProductionType.canProduce(goodsType, types);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		ProductionType o = new ProductionType(new AbstractGoods(), true, "");
		o.setInputs(new ArrayList<AbstractGoods>());
		o.setOutputs(new ArrayList<AbstractGoods>());

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		ProductionType o = new ProductionType(new AbstractGoods(), true, "");
		o.setInputs(new ArrayList<AbstractGoods>());
		o.setOutputs(new ArrayList<AbstractGoods>());

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		Object o = new ProductionType(new Specification());

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		Object o = new ProductionType(new AbstractGoods(), true, "");

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		Object o = new ProductionType(new AbstractGoods(), true, "");

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testEquals_6()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		ProductionType o = new ProductionType(new AbstractGoods(), true, "");
		o.setOutputs(new ArrayList<AbstractGoods>());

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testEquals_7()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		ProductionType o = new ProductionType(new AbstractGoods(), true, "");
		o.setInputs(new ArrayList<AbstractGoods>());
		o.setOutputs(new ArrayList<AbstractGoods>());

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testEquals_8()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		Object o = new Object();

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the AbstractGoods getBestOutputFor(GoodsType,Collection<ProductionType>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGetBestOutputFor_1()
		throws Exception {
		GoodsType goodsType = new GoodsType("", new Specification());
		Collection<ProductionType> types = new ArrayList<ProductionType>();

		AbstractGoods result = ProductionType.getBestOutputFor(goodsType, types);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the AbstractGoods getBestOutputFor(GoodsType,Collection<ProductionType>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGetBestOutputFor_2()
		throws Exception {
		GoodsType goodsType = new GoodsType("", new Specification());
		Collection<ProductionType> types = new ArrayList<ProductionType>();

		AbstractGoods result = ProductionType.getBestOutputFor(goodsType, types);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the AbstractGoods getBestOutputFor(GoodsType,Collection<ProductionType>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGetBestOutputFor_3()
		throws Exception {
		GoodsType goodsType = new GoodsType("", new Specification());
		Collection<ProductionType> types = new ArrayList<ProductionType>();

		AbstractGoods result = ProductionType.getBestOutputFor(goodsType, types);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the AbstractGoods getBestOutputFor(GoodsType,Collection<ProductionType>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGetBestOutputFor_4()
		throws Exception {
		GoodsType goodsType = new GoodsType("", new Specification());
		Collection<ProductionType> types = new ArrayList<ProductionType>();

		AbstractGoods result = ProductionType.getBestOutputFor(goodsType, types);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the AbstractGoods getBestOutputFor(GoodsType,Collection<ProductionType>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGetBestOutputFor_5()
		throws Exception {
		GoodsType goodsType = new GoodsType("", new Specification());
		Collection<ProductionType> types = new ArrayList<ProductionType>();

		AbstractGoods result = ProductionType.getBestOutputFor(goodsType, types);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the AbstractGoods getBestOutputFor(GoodsType,Collection<ProductionType>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGetBestOutputFor_6()
		throws Exception {
		GoodsType goodsType = new GoodsType("", new Specification());
		Collection<ProductionType> types = new ArrayList<ProductionType>();

		AbstractGoods result = ProductionType.getBestOutputFor(goodsType, types);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the GoodsType getBestOutputType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGetBestOutputType_1()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());

		GoodsType result = fixture.getBestOutputType();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the GoodsType getBestOutputType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGetBestOutputType_2()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());

		GoodsType result = fixture.getBestOutputType();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the GoodsType getBestOutputType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGetBestOutputType_3()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());

		GoodsType result = fixture.getBestOutputType();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the GoodsType getBestOutputType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGetBestOutputType_4()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(null);

		GoodsType result = fixture.getBestOutputType();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the ProductionType getBestProductionType(GoodsType,Collection<ProductionType>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGetBestProductionType_1()
		throws Exception {
		GoodsType goodsType = new GoodsType("", new Specification());
		Collection<ProductionType> types = new ArrayList<ProductionType>();

		ProductionType result = ProductionType.getBestProductionType(goodsType, types);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the ProductionType getBestProductionType(GoodsType,Collection<ProductionType>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGetBestProductionType_2()
		throws Exception {
		GoodsType goodsType = new GoodsType("", new Specification());
		Collection<ProductionType> types = new ArrayList<ProductionType>();

		ProductionType result = ProductionType.getBestProductionType(goodsType, types);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the ProductionType getBestProductionType(GoodsType,Collection<ProductionType>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGetBestProductionType_3()
		throws Exception {
		GoodsType goodsType = new GoodsType("", new Specification());
		Collection<ProductionType> types = new ArrayList<ProductionType>();

		ProductionType result = ProductionType.getBestProductionType(goodsType, types);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<AbstractGoods> getInputs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGetInputs_1()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());

		List<AbstractGoods> result = fixture.getInputs();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<AbstractGoods> getInputs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGetInputs_2()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(null);
		fixture.setOutputs(new ArrayList<AbstractGoods>());

		List<AbstractGoods> result = fixture.getInputs();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the AbstractGoods getOutput(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGetOutput_1()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		GoodsType goodsType = new GoodsType("", new Specification());

		AbstractGoods result = fixture.getOutput(goodsType);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the AbstractGoods getOutput(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGetOutput_2()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		GoodsType goodsType = new GoodsType("", new Specification());

		AbstractGoods result = fixture.getOutput(goodsType);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the AbstractGoods getOutput(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGetOutput_3()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(null);
		GoodsType goodsType = new GoodsType("", new Specification());

		AbstractGoods result = fixture.getOutput(goodsType);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<AbstractGoods> getOutputs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGetOutputs_1()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());

		List<AbstractGoods> result = fixture.getOutputs();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<AbstractGoods> getOutputs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGetOutputs_2()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(null);

		List<AbstractGoods> result = fixture.getOutputs();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getProductionLevel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGetProductionLevel_1()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());

		String result = fixture.getProductionLevel();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the boolean getUnattended() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGetUnattended_1()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());

		boolean result = fixture.getUnattended();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean getUnattended() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGetUnattended_2()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), false, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());

		boolean result = fixture.getUnattended();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = ProductionType.getXMLElementTagName();

		// add additional test code here
		assertEquals("production", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("production", result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(29822, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), false, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(29791, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testHashCode_3()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(null);
		fixture.setOutputs(null);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(29822, result);
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:286)
		//       at net.sf.freecol.common.model.ProductionType.readAttributes(ProductionType.java:458)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:286)
		//       at net.sf.freecol.common.model.ProductionType.readAttributes(ProductionType.java:458)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testReadChild_1()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.ProductionType.readChild(ProductionType.java:486)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testReadChild_2()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.ProductionType.readChild(ProductionType.java:486)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testReadChild_3()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.ProductionType.readChild(ProductionType.java:486)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testReadChild_4()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.ProductionType.readChild(ProductionType.java:486)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testReadChild_5()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.ProductionType.readChild(ProductionType.java:486)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testReadChild_6()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.ProductionType.readChild(ProductionType.java:486)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testReadChildren_1()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(null);
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.readChildren(FreeColObject.java:1274)
		//       at net.sf.freecol.common.model.ProductionType.readChildren(ProductionType.java:477)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testReadChildren_2()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.readChildren(FreeColObject.java:1274)
		//       at net.sf.freecol.common.model.ProductionType.readChildren(ProductionType.java:477)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testReadChildren_3()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(null);
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.readChildren(FreeColObject.java:1274)
		//       at net.sf.freecol.common.model.ProductionType.readChildren(ProductionType.java:477)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testReadChildren_4()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(null);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.readChildren(FreeColObject.java:1274)
		//       at net.sf.freecol.common.model.ProductionType.readChildren(ProductionType.java:477)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testReadChildren_5()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(null);
		fixture.setOutputs(null);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.readChildren(FreeColObject.java:1274)
		//       at net.sf.freecol.common.model.ProductionType.readChildren(ProductionType.java:477)
	}

	/**
	 * Run the void setInputs(List<AbstractGoods>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testSetInputs_1()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		List<AbstractGoods> newInputs = new ArrayList<AbstractGoods>();

		fixture.setInputs(newInputs);

		// add additional test code here
	}

	/**
	 * Run the void setOutputs(List<AbstractGoods>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testSetOutputs_1()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		List<AbstractGoods> newOutputs = new ArrayList<AbstractGoods>();

		fixture.setOutputs(newOutputs);

		// add additional test code here
	}

	/**
	 * Run the void setUnattended(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testSetUnattended_1()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		boolean unattended = true;

		fixture.setUnattended(unattended);

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
		ProductionType fixture = new ProductionType(new AbstractGoods(), false, (String) null);
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[null:]", result);
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testWriteAttributes_1()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), false, (String) null);
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_2()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_3()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), false, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_4()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_5()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), false, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_6()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, (String) null);
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testWriteChildren_1()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testWriteChildren_2()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testWriteChildren_3()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testWriteChildren_4()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(null);
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testWriteChildren_5()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(null);
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testWriteChildren_6()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(null);
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testWriteChildren_7()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(null);
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testWriteChildren_8()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testWriteChildren_9()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testWriteChildren_10()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(null);
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testWriteChildren_11()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testWriteChildren_12()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testWriteChildren_13()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(null);
		fixture.setOutputs(new ArrayList<AbstractGoods>());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testWriteChildren_14()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(new ArrayList<AbstractGoods>());
		fixture.setOutputs(null);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:17 PM
	 */
	@Test
	public void testWriteChildren_15()
		throws Exception {
		ProductionType fixture = new ProductionType(new AbstractGoods(), true, "");
		fixture.setInputs(null);
		fixture.setOutputs(null);
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
		new org.junit.runner.JUnitCore().run(ProductionTypeTest.class);
	}
}