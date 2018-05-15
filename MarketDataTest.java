package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import javax.imageio.metadata.IIOMetadataNode;
import net.sf.freecol.common.io.FreeColXMLReader;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>MarketDataTest</code> contains tests for the class <code>{@link MarketData}</code>.
 *
 * @generatedBy CodePro at 5/14/18 3:51 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class MarketDataTest {
	/**
	 * Run the MarketData(Game,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testMarketData_1()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		String id = "";

		MarketData result = new MarketData(game, id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the MarketData(Game,GoodsType) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testMarketData_2()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		GoodsType goodsType = new GoodsType("", new Specification());

		MarketData result = new MarketData(game, goodsType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getAmountInMarket() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testGetAmountInMarket_1()
		throws Exception {
		MarketData fixture = new MarketData(new Game(new IIOMetadataNode(), ""), new GoodsType("", new Specification()));
		fixture.setAmountInMarket(1);
		fixture.setArrears(1);
		fixture.setIncomeAfterTaxes(1);
		fixture.setTraded(true);
		fixture.setIncomeBeforeTaxes(1);
		fixture.setPaidForSale(1);
		fixture.setInitialPrice(1);
		fixture.setOldPrice(1);
		fixture.setCostToBuy(1);
		fixture.setSales(1);

		int result = fixture.getAmountInMarket();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getArrears() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testGetArrears_1()
		throws Exception {
		MarketData fixture = new MarketData(new Game(new IIOMetadataNode(), ""), new GoodsType("", new Specification()));
		fixture.setAmountInMarket(1);
		fixture.setArrears(1);
		fixture.setIncomeAfterTaxes(1);
		fixture.setTraded(true);
		fixture.setIncomeBeforeTaxes(1);
		fixture.setPaidForSale(1);
		fixture.setInitialPrice(1);
		fixture.setOldPrice(1);
		fixture.setCostToBuy(1);
		fixture.setSales(1);

		int result = fixture.getArrears();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getCostToBuy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testGetCostToBuy_1()
		throws Exception {
		MarketData fixture = new MarketData(new Game(new IIOMetadataNode(), ""), new GoodsType("", new Specification()));
		fixture.setAmountInMarket(1);
		fixture.setArrears(1);
		fixture.setIncomeAfterTaxes(1);
		fixture.setTraded(true);
		fixture.setIncomeBeforeTaxes(1);
		fixture.setPaidForSale(1);
		fixture.setInitialPrice(1);
		fixture.setOldPrice(1);
		fixture.setCostToBuy(1);
		fixture.setSales(1);

		int result = fixture.getCostToBuy();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the GoodsType getGoodsType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testGetGoodsType_1()
		throws Exception {
		MarketData fixture = new MarketData(new Game(new IIOMetadataNode(), ""), new GoodsType("", new Specification()));
		fixture.setAmountInMarket(1);
		fixture.setArrears(1);
		fixture.setIncomeAfterTaxes(1);
		fixture.setTraded(true);
		fixture.setIncomeBeforeTaxes(1);
		fixture.setPaidForSale(1);
		fixture.setInitialPrice(1);
		fixture.setOldPrice(1);
		fixture.setCostToBuy(1);
		fixture.setSales(1);

		GoodsType result = fixture.getGoodsType();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getIncomeAfterTaxes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testGetIncomeAfterTaxes_1()
		throws Exception {
		MarketData fixture = new MarketData(new Game(new IIOMetadataNode(), ""), new GoodsType("", new Specification()));
		fixture.setAmountInMarket(1);
		fixture.setArrears(1);
		fixture.setIncomeAfterTaxes(1);
		fixture.setTraded(true);
		fixture.setIncomeBeforeTaxes(1);
		fixture.setPaidForSale(1);
		fixture.setInitialPrice(1);
		fixture.setOldPrice(1);
		fixture.setCostToBuy(1);
		fixture.setSales(1);

		int result = fixture.getIncomeAfterTaxes();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getIncomeBeforeTaxes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testGetIncomeBeforeTaxes_1()
		throws Exception {
		MarketData fixture = new MarketData(new Game(new IIOMetadataNode(), ""), new GoodsType("", new Specification()));
		fixture.setAmountInMarket(1);
		fixture.setArrears(1);
		fixture.setIncomeAfterTaxes(1);
		fixture.setTraded(true);
		fixture.setIncomeBeforeTaxes(1);
		fixture.setPaidForSale(1);
		fixture.setInitialPrice(1);
		fixture.setOldPrice(1);
		fixture.setCostToBuy(1);
		fixture.setSales(1);

		int result = fixture.getIncomeBeforeTaxes();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getInitialPrice() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testGetInitialPrice_1()
		throws Exception {
		MarketData fixture = new MarketData(new Game(new IIOMetadataNode(), ""), new GoodsType("", new Specification()));
		fixture.setAmountInMarket(1);
		fixture.setArrears(1);
		fixture.setIncomeAfterTaxes(1);
		fixture.setTraded(true);
		fixture.setIncomeBeforeTaxes(1);
		fixture.setPaidForSale(1);
		fixture.setInitialPrice(1);
		fixture.setOldPrice(1);
		fixture.setCostToBuy(1);
		fixture.setSales(1);

		int result = fixture.getInitialPrice();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getOldPrice() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testGetOldPrice_1()
		throws Exception {
		MarketData fixture = new MarketData(new Game(new IIOMetadataNode(), ""), new GoodsType("", new Specification()));
		fixture.setAmountInMarket(1);
		fixture.setArrears(1);
		fixture.setIncomeAfterTaxes(1);
		fixture.setTraded(true);
		fixture.setIncomeBeforeTaxes(1);
		fixture.setPaidForSale(1);
		fixture.setInitialPrice(1);
		fixture.setOldPrice(1);
		fixture.setCostToBuy(1);
		fixture.setSales(1);

		int result = fixture.getOldPrice();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPaidForSale() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testGetPaidForSale_1()
		throws Exception {
		MarketData fixture = new MarketData(new Game(new IIOMetadataNode(), ""), new GoodsType("", new Specification()));
		fixture.setAmountInMarket(1);
		fixture.setArrears(1);
		fixture.setIncomeAfterTaxes(1);
		fixture.setTraded(true);
		fixture.setIncomeBeforeTaxes(1);
		fixture.setPaidForSale(1);
		fixture.setInitialPrice(1);
		fixture.setOldPrice(1);
		fixture.setCostToBuy(1);
		fixture.setSales(1);

		int result = fixture.getPaidForSale();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getSales() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testGetSales_1()
		throws Exception {
		MarketData fixture = new MarketData(new Game(new IIOMetadataNode(), ""), new GoodsType("", new Specification()));
		fixture.setAmountInMarket(1);
		fixture.setArrears(1);
		fixture.setIncomeAfterTaxes(1);
		fixture.setTraded(true);
		fixture.setIncomeBeforeTaxes(1);
		fixture.setPaidForSale(1);
		fixture.setInitialPrice(1);
		fixture.setOldPrice(1);
		fixture.setCostToBuy(1);
		fixture.setSales(1);

		int result = fixture.getSales();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the boolean getTraded() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testGetTraded_1()
		throws Exception {
		MarketData fixture = new MarketData(new Game(new IIOMetadataNode(), ""), new GoodsType("", new Specification()));
		fixture.setAmountInMarket(1);
		fixture.setArrears(1);
		fixture.setIncomeAfterTaxes(1);
		fixture.setTraded(true);
		fixture.setIncomeBeforeTaxes(1);
		fixture.setPaidForSale(1);
		fixture.setInitialPrice(1);
		fixture.setOldPrice(1);
		fixture.setCostToBuy(1);
		fixture.setSales(1);

		boolean result = fixture.getTraded();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean getTraded() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testGetTraded_2()
		throws Exception {
		MarketData fixture = new MarketData(new Game(new IIOMetadataNode(), ""), new GoodsType("", new Specification()));
		fixture.setAmountInMarket(1);
		fixture.setArrears(1);
		fixture.setIncomeAfterTaxes(1);
		fixture.setTraded(false);
		fixture.setIncomeBeforeTaxes(1);
		fixture.setPaidForSale(1);
		fixture.setInitialPrice(1);
		fixture.setOldPrice(1);
		fixture.setCostToBuy(1);
		fixture.setSales(1);

		boolean result = fixture.getTraded();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = MarketData.getXMLElementTagName();

		// add additional test code here
		assertEquals("marketData", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		MarketData fixture = new MarketData(new Game(new IIOMetadataNode(), ""), new GoodsType("", new Specification()));
		fixture.setAmountInMarket(1);
		fixture.setArrears(1);
		fixture.setIncomeAfterTaxes(1);
		fixture.setTraded(true);
		fixture.setIncomeBeforeTaxes(1);
		fixture.setPaidForSale(1);
		fixture.setInitialPrice(1);
		fixture.setOldPrice(1);
		fixture.setCostToBuy(1);
		fixture.setSales(1);

		String result = fixture.getXMLTagName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the boolean price() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testPrice_1()
		throws Exception {
		MarketData fixture = new MarketData(new Game(new IIOMetadataNode(), ""), new GoodsType("", new Specification()));
		fixture.setAmountInMarket(1);
		fixture.setArrears(1);
		fixture.setIncomeAfterTaxes(1);
		fixture.setTraded(true);
		fixture.setIncomeBeforeTaxes(1);
		fixture.setPaidForSale(1);
		fixture.setInitialPrice(1);
		fixture.setOldPrice(1);
		fixture.setCostToBuy(1);
		fixture.setSales(1);

		boolean result = fixture.price();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean price() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testPrice_2()
		throws Exception {
		MarketData fixture = new MarketData(new Game(new IIOMetadataNode(), ""), new GoodsType("", new Specification()));
		fixture.setAmountInMarket(1);
		fixture.setArrears(1);
		fixture.setIncomeAfterTaxes(1);
		fixture.setTraded(true);
		fixture.setIncomeBeforeTaxes(1);
		fixture.setPaidForSale(1);
		fixture.setInitialPrice(1);
		fixture.setOldPrice(1);
		fixture.setCostToBuy(1);
		fixture.setSales(1);

		boolean result = fixture.price();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean price() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testPrice_3()
		throws Exception {
		MarketData fixture = new MarketData(new Game(new IIOMetadataNode(), ""), new GoodsType("", new Specification()));
		fixture.setAmountInMarket(1);
		fixture.setArrears(1);
		fixture.setIncomeAfterTaxes(1);
		fixture.setTraded(true);
		fixture.setIncomeBeforeTaxes(1);
		fixture.setPaidForSale(2);
		fixture.setInitialPrice(1);
		fixture.setOldPrice(1);
		fixture.setCostToBuy(1);
		fixture.setSales(1);

		boolean result = fixture.price();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		MarketData fixture = new MarketData(new Game(new IIOMetadataNode(), ""), new GoodsType("", new Specification()));
		fixture.setAmountInMarket(1);
		fixture.setArrears(1);
		fixture.setIncomeAfterTaxes(1);
		fixture.setTraded(true);
		fixture.setIncomeBeforeTaxes(1);
		fixture.setPaidForSale(1);
		fixture.setInitialPrice(1);
		fixture.setOldPrice(1);
		fixture.setCostToBuy(1);
		fixture.setSales(1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		MarketData fixture = new MarketData(new Game(new IIOMetadataNode(), ""), new GoodsType("", new Specification()));
		fixture.setAmountInMarket(1);
		fixture.setArrears(1);
		fixture.setIncomeAfterTaxes(1);
		fixture.setTraded(true);
		fixture.setIncomeBeforeTaxes(1);
		fixture.setPaidForSale(1);
		fixture.setInitialPrice(1);
		fixture.setOldPrice(1);
		fixture.setCostToBuy(1);
		fixture.setSales(1);
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setAmountInMarket(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testSetAmountInMarket_1()
		throws Exception {
		MarketData fixture = new MarketData(new Game(new IIOMetadataNode(), ""), new GoodsType("", new Specification()));
		fixture.setAmountInMarket(1);
		fixture.setArrears(1);
		fixture.setIncomeAfterTaxes(1);
		fixture.setTraded(true);
		fixture.setIncomeBeforeTaxes(1);
		fixture.setPaidForSale(1);
		fixture.setInitialPrice(1);
		fixture.setOldPrice(1);
		fixture.setCostToBuy(1);
		fixture.setSales(1);
		int newAmountInMarket = 1;

		fixture.setAmountInMarket(newAmountInMarket);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setArrears(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testSetArrears_1()
		throws Exception {
		MarketData fixture = new MarketData(new Game(new IIOMetadataNode(), ""), new GoodsType("", new Specification()));
		fixture.setAmountInMarket(1);
		fixture.setArrears(1);
		fixture.setIncomeAfterTaxes(1);
		fixture.setTraded(true);
		fixture.setIncomeBeforeTaxes(1);
		fixture.setPaidForSale(1);
		fixture.setInitialPrice(1);
		fixture.setOldPrice(1);
		fixture.setCostToBuy(1);
		fixture.setSales(1);
		int newArrears = 1;

		fixture.setArrears(newArrears);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setCostToBuy(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testSetCostToBuy_1()
		throws Exception {
		MarketData fixture = new MarketData(new Game(new IIOMetadataNode(), ""), new GoodsType("", new Specification()));
		fixture.setAmountInMarket(1);
		fixture.setArrears(1);
		fixture.setIncomeAfterTaxes(1);
		fixture.setTraded(true);
		fixture.setIncomeBeforeTaxes(1);
		fixture.setPaidForSale(1);
		fixture.setInitialPrice(1);
		fixture.setOldPrice(1);
		fixture.setCostToBuy(1);
		fixture.setSales(1);
		int newCostToBuy = 1;

		fixture.setCostToBuy(newCostToBuy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setIncomeAfterTaxes(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testSetIncomeAfterTaxes_1()
		throws Exception {
		MarketData fixture = new MarketData(new Game(new IIOMetadataNode(), ""), new GoodsType("", new Specification()));
		fixture.setAmountInMarket(1);
		fixture.setArrears(1);
		fixture.setIncomeAfterTaxes(1);
		fixture.setTraded(true);
		fixture.setIncomeBeforeTaxes(1);
		fixture.setPaidForSale(1);
		fixture.setInitialPrice(1);
		fixture.setOldPrice(1);
		fixture.setCostToBuy(1);
		fixture.setSales(1);
		int newIncomeAfterTaxes = 1;

		fixture.setIncomeAfterTaxes(newIncomeAfterTaxes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setIncomeBeforeTaxes(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testSetIncomeBeforeTaxes_1()
		throws Exception {
		MarketData fixture = new MarketData(new Game(new IIOMetadataNode(), ""), new GoodsType("", new Specification()));
		fixture.setAmountInMarket(1);
		fixture.setArrears(1);
		fixture.setIncomeAfterTaxes(1);
		fixture.setTraded(true);
		fixture.setIncomeBeforeTaxes(1);
		fixture.setPaidForSale(1);
		fixture.setInitialPrice(1);
		fixture.setOldPrice(1);
		fixture.setCostToBuy(1);
		fixture.setSales(1);
		int newIncomeBeforeTaxes = 1;

		fixture.setIncomeBeforeTaxes(newIncomeBeforeTaxes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setInitialPrice(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testSetInitialPrice_1()
		throws Exception {
		MarketData fixture = new MarketData(new Game(new IIOMetadataNode(), ""), new GoodsType("", new Specification()));
		fixture.setAmountInMarket(1);
		fixture.setArrears(1);
		fixture.setIncomeAfterTaxes(1);
		fixture.setTraded(true);
		fixture.setIncomeBeforeTaxes(1);
		fixture.setPaidForSale(1);
		fixture.setInitialPrice(1);
		fixture.setOldPrice(1);
		fixture.setCostToBuy(1);
		fixture.setSales(1);
		int newInitialPrice = 1;

		fixture.setInitialPrice(newInitialPrice);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setOldPrice(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testSetOldPrice_1()
		throws Exception {
		MarketData fixture = new MarketData(new Game(new IIOMetadataNode(), ""), new GoodsType("", new Specification()));
		fixture.setAmountInMarket(1);
		fixture.setArrears(1);
		fixture.setIncomeAfterTaxes(1);
		fixture.setTraded(true);
		fixture.setIncomeBeforeTaxes(1);
		fixture.setPaidForSale(1);
		fixture.setInitialPrice(1);
		fixture.setOldPrice(1);
		fixture.setCostToBuy(1);
		fixture.setSales(1);
		int oldPrice = 1;

		fixture.setOldPrice(oldPrice);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setPaidForSale(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testSetPaidForSale_1()
		throws Exception {
		MarketData fixture = new MarketData(new Game(new IIOMetadataNode(), ""), new GoodsType("", new Specification()));
		fixture.setAmountInMarket(1);
		fixture.setArrears(1);
		fixture.setIncomeAfterTaxes(1);
		fixture.setTraded(true);
		fixture.setIncomeBeforeTaxes(1);
		fixture.setPaidForSale(1);
		fixture.setInitialPrice(1);
		fixture.setOldPrice(1);
		fixture.setCostToBuy(1);
		fixture.setSales(1);
		int newPaidForSale = 1;

		fixture.setPaidForSale(newPaidForSale);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setSales(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testSetSales_1()
		throws Exception {
		MarketData fixture = new MarketData(new Game(new IIOMetadataNode(), ""), new GoodsType("", new Specification()));
		fixture.setAmountInMarket(1);
		fixture.setArrears(1);
		fixture.setIncomeAfterTaxes(1);
		fixture.setTraded(true);
		fixture.setIncomeBeforeTaxes(1);
		fixture.setPaidForSale(1);
		fixture.setInitialPrice(1);
		fixture.setOldPrice(1);
		fixture.setCostToBuy(1);
		fixture.setSales(1);
		int newSales = 1;

		fixture.setSales(newSales);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setTraded(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testSetTraded_1()
		throws Exception {
		MarketData fixture = new MarketData(new Game(new IIOMetadataNode(), ""), new GoodsType("", new Specification()));
		fixture.setAmountInMarket(1);
		fixture.setArrears(1);
		fixture.setIncomeAfterTaxes(1);
		fixture.setTraded(true);
		fixture.setIncomeBeforeTaxes(1);
		fixture.setPaidForSale(1);
		fixture.setInitialPrice(1);
		fixture.setOldPrice(1);
		fixture.setCostToBuy(1);
		fixture.setSales(1);
		boolean traded = true;

		fixture.setTraded(traded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		MarketData fixture = new MarketData(new Game(new IIOMetadataNode(), ""), new GoodsType("", new Specification()));
		fixture.setAmountInMarket(1);
		fixture.setArrears(1);
		fixture.setIncomeAfterTaxes(1);
		fixture.setTraded(true);
		fixture.setIncomeBeforeTaxes(1);
		fixture.setPaidForSale(1);
		fixture.setInitialPrice(1);
		fixture.setOldPrice(1);
		fixture.setCostToBuy(1);
		fixture.setSales(1);

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testUpdate_1()
		throws Exception {
		MarketData fixture = new MarketData(new Game(new IIOMetadataNode(), ""), new GoodsType("", new Specification()));
		fixture.setAmountInMarket(1);
		fixture.setArrears(1);
		fixture.setIncomeAfterTaxes(1);
		fixture.setTraded(true);
		fixture.setIncomeBeforeTaxes(1);
		fixture.setPaidForSale(1);
		fixture.setInitialPrice(1);
		fixture.setOldPrice(1);
		fixture.setCostToBuy(1);
		fixture.setSales(1);

		fixture.update();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testWriteAttributes_1()
		throws Exception {
		MarketData fixture = new MarketData(new Game(new IIOMetadataNode(), ""), new GoodsType("", new Specification()));
		fixture.setAmountInMarket(1);
		fixture.setArrears(1);
		fixture.setIncomeAfterTaxes(1);
		fixture.setTraded(true);
		fixture.setIncomeBeforeTaxes(1);
		fixture.setPaidForSale(1);
		fixture.setInitialPrice(1);
		fixture.setOldPrice(1);
		fixture.setCostToBuy(1);
		fixture.setSales(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testWriteAttributes_2()
		throws Exception {
		MarketData fixture = new MarketData(new Game(new IIOMetadataNode(), ""), new GoodsType("", new Specification()));
		fixture.setAmountInMarket(1);
		fixture.setArrears(1);
		fixture.setIncomeAfterTaxes(1);
		fixture.setTraded(true);
		fixture.setIncomeBeforeTaxes(1);
		fixture.setPaidForSale(1);
		fixture.setInitialPrice(1);
		fixture.setOldPrice(1);
		fixture.setCostToBuy(1);
		fixture.setSales(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testWriteAttributes_3()
		throws Exception {
		MarketData fixture = new MarketData(new Game(new IIOMetadataNode(), ""), new GoodsType("", new Specification()));
		fixture.setAmountInMarket(1);
		fixture.setArrears(1);
		fixture.setIncomeAfterTaxes(1);
		fixture.setTraded(true);
		fixture.setIncomeBeforeTaxes(1);
		fixture.setPaidForSale(1);
		fixture.setInitialPrice(1);
		fixture.setOldPrice(1);
		fixture.setCostToBuy(1);
		fixture.setSales(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testWriteAttributes_4()
		throws Exception {
		MarketData fixture = new MarketData(new Game(new IIOMetadataNode(), ""), new GoodsType("", new Specification()));
		fixture.setAmountInMarket(1);
		fixture.setArrears(1);
		fixture.setIncomeAfterTaxes(1);
		fixture.setTraded(true);
		fixture.setIncomeBeforeTaxes(1);
		fixture.setPaidForSale(1);
		fixture.setInitialPrice(1);
		fixture.setOldPrice(1);
		fixture.setCostToBuy(1);
		fixture.setSales(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testWriteAttributes_5()
		throws Exception {
		MarketData fixture = new MarketData(new Game(new IIOMetadataNode(), ""), new GoodsType("", new Specification()));
		fixture.setAmountInMarket(1);
		fixture.setArrears(1);
		fixture.setIncomeAfterTaxes(1);
		fixture.setTraded(true);
		fixture.setIncomeBeforeTaxes(1);
		fixture.setPaidForSale(1);
		fixture.setInitialPrice(1);
		fixture.setOldPrice(1);
		fixture.setCostToBuy(1);
		fixture.setSales(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testWriteAttributes_6()
		throws Exception {
		MarketData fixture = new MarketData(new Game(new IIOMetadataNode(), ""), new GoodsType("", new Specification()));
		fixture.setAmountInMarket(1);
		fixture.setArrears(1);
		fixture.setIncomeAfterTaxes(1);
		fixture.setTraded(true);
		fixture.setIncomeBeforeTaxes(1);
		fixture.setPaidForSale(1);
		fixture.setInitialPrice(1);
		fixture.setOldPrice(1);
		fixture.setCostToBuy(1);
		fixture.setSales(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testWriteAttributes_7()
		throws Exception {
		MarketData fixture = new MarketData(new Game(new IIOMetadataNode(), ""), new GoodsType("", new Specification()));
		fixture.setAmountInMarket(1);
		fixture.setArrears(1);
		fixture.setIncomeAfterTaxes(1);
		fixture.setTraded(true);
		fixture.setIncomeBeforeTaxes(1);
		fixture.setPaidForSale(1);
		fixture.setInitialPrice(1);
		fixture.setOldPrice(1);
		fixture.setCostToBuy(1);
		fixture.setSales(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testWriteAttributes_8()
		throws Exception {
		MarketData fixture = new MarketData(new Game(new IIOMetadataNode(), ""), new GoodsType("", new Specification()));
		fixture.setAmountInMarket(1);
		fixture.setArrears(1);
		fixture.setIncomeAfterTaxes(1);
		fixture.setTraded(true);
		fixture.setIncomeBeforeTaxes(1);
		fixture.setPaidForSale(1);
		fixture.setInitialPrice(1);
		fixture.setOldPrice(1);
		fixture.setCostToBuy(1);
		fixture.setSales(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testWriteAttributes_9()
		throws Exception {
		MarketData fixture = new MarketData(new Game(new IIOMetadataNode(), ""), new GoodsType("", new Specification()));
		fixture.setAmountInMarket(1);
		fixture.setArrears(1);
		fixture.setIncomeAfterTaxes(1);
		fixture.setTraded(true);
		fixture.setIncomeBeforeTaxes(1);
		fixture.setPaidForSale(1);
		fixture.setInitialPrice(1);
		fixture.setOldPrice(1);
		fixture.setCostToBuy(1);
		fixture.setSales(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	@Test
	public void testWriteAttributes_10()
		throws Exception {
		MarketData fixture = new MarketData(new Game(new IIOMetadataNode(), ""), new GoodsType("", new Specification()));
		fixture.setAmountInMarket(1);
		fixture.setArrears(1);
		fixture.setIncomeAfterTaxes(1);
		fixture.setTraded(true);
		fixture.setIncomeBeforeTaxes(1);
		fixture.setPaidForSale(1);
		fixture.setInitialPrice(1);
		fixture.setOldPrice(1);
		fixture.setCostToBuy(1);
		fixture.setSales(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

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
	 * @generatedBy CodePro at 5/14/18 3:51 PM
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
	 * @generatedBy CodePro at 5/14/18 3:51 PM
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
	 * @generatedBy CodePro at 5/14/18 3:51 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MarketDataTest.class);
	}
}