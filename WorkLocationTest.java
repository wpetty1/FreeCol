package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;
import net.sf.freecol.common.io.FreeColXMLWriter;
import javax.imageio.metadata.IIOMetadataNode;
import net.sf.freecol.common.io.FreeColXMLReader;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>WorkLocationTest</code> contains tests for the class <code>{@link WorkLocation}</code>.
 *
 * @generatedBy CodePro at 5/14/18 4:39 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class WorkLocationTest {
	/**
	 * Run the boolean add(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testAdd_1()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		Locatable locatable = new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		boolean result = fixture.add(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean add(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testAdd_2()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		Locatable locatable = new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		boolean result = fixture.add(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean add(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testAdd_3()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		Locatable locatable = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		boolean result = fixture.add(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean add(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testAdd_4()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		Locatable locatable = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		boolean result = fixture.add(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean canBeWorked() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testCanBeWorked_1()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));

		boolean result = fixture.canBeWorked();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean canBeWorked() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testCanBeWorked_2()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));

		boolean result = fixture.canBeWorked();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean canTeach() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testCanTeach_1()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));

		boolean result = fixture.canTeach();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean canTeach() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testCanTeach_2()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));

		boolean result = fixture.canTeach();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the int evaluateFor(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testEvaluateFor_1()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		int result = fixture.evaluateFor(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the ProductionType getBestProductionType(boolean,GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetBestProductionType_1()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		boolean unattended = true;
		GoodsType workType = new GoodsType("", new Specification());

		ProductionType result = fixture.getBestProductionType(unattended, workType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the ProductionType getBestProductionType(boolean,GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetBestProductionType_2()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		boolean unattended = true;
		GoodsType workType = new GoodsType("", new Specification());

		ProductionType result = fixture.getBestProductionType(unattended, workType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the ProductionType getBestProductionType(boolean,GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetBestProductionType_3()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		boolean unattended = true;
		GoodsType workType = new GoodsType("", new Specification());

		ProductionType result = fixture.getBestProductionType(unattended, workType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the ProductionType getBestProductionType(boolean,GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetBestProductionType_4()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		boolean unattended = true;
		GoodsType workType = new GoodsType("", new Specification());

		ProductionType result = fixture.getBestProductionType(unattended, workType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the ProductionType getBestProductionType(boolean,GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetBestProductionType_5()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		boolean unattended = true;
		GoodsType workType = new GoodsType("", new Specification());

		ProductionType result = fixture.getBestProductionType(unattended, workType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate getClaimTemplate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetClaimTemplate_1()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));

		StringTemplate result = fixture.getClaimTemplate();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the GoodsType getCurrentWorkType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetCurrentWorkType_1()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));

		GoodsType result = fixture.getCurrentWorkType();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the GoodsType getCurrentWorkType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetCurrentWorkType_2()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));

		GoodsType result = fixture.getCurrentWorkType();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the GoodsType getCurrentWorkType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetCurrentWorkType_3()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));

		GoodsType result = fixture.getCurrentWorkType();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the UnitType getExpertUnitType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetExpertUnitType_1()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));

		UnitType result = fixture.getExpertUnitType();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the UnitType getExpertUnitType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetExpertUnitType_2()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));

		UnitType result = fixture.getExpertUnitType();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getGenericPotential(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetGenericPotential_1()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		GoodsType goodsType = new GoodsType("", new Specification());

		int result = fixture.getGenericPotential(goodsType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the List<AbstractGoods> getInputs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetInputs_1()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));

		List<AbstractGoods> result = fixture.getInputs();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<AbstractGoods> getInputs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetInputs_2()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));

		List<AbstractGoods> result = fixture.getInputs();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate getLocationLabelFor(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetLocationLabelFor_1()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		StringTemplate result = fixture.getLocationLabelFor(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate getLocationLabelFor(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetLocationLabelFor_2()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		Player player = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		StringTemplate result = fixture.getLocationLabelFor(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getMaximumProductionOf(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetMaximumProductionOf_1()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		GoodsType goodsType = new GoodsType("", new Specification());

		int result = fixture.getMaximumProductionOf(goodsType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getMaximumProductionOf(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetMaximumProductionOf_2()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		GoodsType goodsType = new GoodsType("", new Specification());

		int result = fixture.getMaximumProductionOf(goodsType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getMaximumProductionOf(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetMaximumProductionOf_3()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		GoodsType goodsType = new GoodsType("", new Specification());

		int result = fixture.getMaximumProductionOf(goodsType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getMaximumProductionOf(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetMaximumProductionOf_4()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		GoodsType goodsType = new GoodsType("", new Specification());

		int result = fixture.getMaximumProductionOf(goodsType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the UnitLocation.NoAddReason getNoAddReason(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetNoAddReason_1()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		Locatable locatable = new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		UnitLocation.NoAddReason result = fixture.getNoAddReason(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the UnitLocation.NoAddReason getNoAddReason(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetNoAddReason_2()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		Locatable locatable = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		UnitLocation.NoAddReason result = fixture.getNoAddReason(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the UnitLocation.NoAddReason getNoAddReason(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetNoAddReason_3()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		Locatable locatable = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		UnitLocation.NoAddReason result = fixture.getNoAddReason(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Occupation getOccupation(UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetOccupation_1()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		UnitType unitType = null;

		Occupation result = fixture.getOccupation(unitType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Occupation getOccupation(UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetOccupation_2()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		UnitType unitType = new UnitType("", new Specification());

		Occupation result = fixture.getOccupation(unitType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Occupation getOccupation(Unit,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetOccupation_3()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		boolean userMode = true;

		Occupation result = fixture.getOccupation(unit, userMode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Occupation getOccupation(Unit,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetOccupation_4()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		boolean userMode = true;

		Occupation result = fixture.getOccupation(unit, userMode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Occupation getOccupation(Unit,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetOccupation_5()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		boolean userMode = true;

		Occupation result = fixture.getOccupation(unit, userMode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<AbstractGoods> getOutputs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetOutputs_1()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));

		List<AbstractGoods> result = fixture.getOutputs();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<AbstractGoods> getOutputs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetOutputs_2()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));

		List<AbstractGoods> result = fixture.getOutputs();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Player getOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetOwner_1()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));

		Player result = fixture.getOwner();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Settlement getOwningSettlement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetOwningSettlement_1()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));

		Settlement result = fixture.getOwningSettlement();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getPotentialProduction(GoodsType,UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetPotentialProduction_1()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = new UnitType("", new Specification());

		int result = fixture.getPotentialProduction(goodsType, unitType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPotentialProduction(GoodsType,UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetPotentialProduction_2()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = new UnitType("", new Specification());

		int result = fixture.getPotentialProduction(goodsType, unitType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPotentialProduction(GoodsType,UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetPotentialProduction_3()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = new UnitType("", new Specification());

		int result = fixture.getPotentialProduction(goodsType, unitType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPotentialProduction(GoodsType,UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetPotentialProduction_4()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = new UnitType("", new Specification());

		int result = fixture.getPotentialProduction(goodsType, unitType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPotentialProduction(GoodsType,UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetPotentialProduction_5()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = new UnitType("", new Specification());

		int result = fixture.getPotentialProduction(goodsType, unitType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPotentialProduction(GoodsType,UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetPotentialProduction_6()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = new UnitType("", new Specification());

		int result = fixture.getPotentialProduction(goodsType, unitType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPotentialProduction(GoodsType,UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetPotentialProduction_7()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = new UnitType("", new Specification());

		int result = fixture.getPotentialProduction(goodsType, unitType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPotentialProduction(GoodsType,UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetPotentialProduction_8()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = new UnitType("", new Specification());

		int result = fixture.getPotentialProduction(goodsType, unitType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPotentialProduction(GoodsType,UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetPotentialProduction_9()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = new UnitType("", new Specification());

		int result = fixture.getPotentialProduction(goodsType, unitType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPotentialProduction(GoodsType,UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetPotentialProduction_10()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = new UnitType("", new Specification());

		int result = fixture.getPotentialProduction(goodsType, unitType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPotentialProduction(GoodsType,UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetPotentialProduction_11()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = new UnitType("", new Specification());

		int result = fixture.getPotentialProduction(goodsType, unitType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPotentialProduction(GoodsType,UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetPotentialProduction_12()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = new UnitType("", new Specification());

		int result = fixture.getPotentialProduction(goodsType, unitType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPotentialProduction(GoodsType,UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetPotentialProduction_13()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = new UnitType("", new Specification());

		int result = fixture.getPotentialProduction(goodsType, unitType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPotentialProduction(GoodsType,UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetPotentialProduction_14()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = new UnitType("", new Specification());

		int result = fixture.getPotentialProduction(goodsType, unitType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPotentialProduction(GoodsType,UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetPotentialProduction_15()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = new UnitType("", new Specification());

		int result = fixture.getPotentialProduction(goodsType, unitType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPotentialProduction(GoodsType,UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetPotentialProduction_16()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		GoodsType goodsType = new GoodsType("", new Specification());
		UnitType unitType = null;

		int result = fixture.getPotentialProduction(goodsType, unitType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the List<AbstractGoods> getProduction() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetProduction_1()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));

		List<AbstractGoods> result = fixture.getProduction();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<AbstractGoods> getProduction() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetProduction_2()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));

		List<AbstractGoods> result = fixture.getProduction();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the ProductionInfo getProductionInfo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetProductionInfo_1()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));

		ProductionInfo result = fixture.getProductionInfo();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getProductionOf(Unit,GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetProductionOf_1()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		Unit unit = null;
		GoodsType goodsType = new GoodsType("", new Specification());

		int result = fixture.getProductionOf(unit, goodsType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getProductionOf(Unit,GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetProductionOf_2()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setType(new UnitType("", new Specification()));
		GoodsType goodsType = new GoodsType("", new Specification());

		int result = fixture.getProductionOf(unit, goodsType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getProductionOf(Unit,GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetProductionOf_3()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		GoodsType goodsType = new GoodsType("", new Specification());

		int result = fixture.getProductionOf(unit, goodsType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the ProductionType getProductionType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetProductionType_1()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));

		ProductionType result = fixture.getProductionType();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getRank() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetRank_1()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));

		int result = fixture.getRank();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the Settlement getSettlement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetSettlement_1()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));

		Settlement result = fixture.getSettlement();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the java.util.Map<Unit, WorkLocation.Suggestion> getSuggestions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetSuggestions_1()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));

		java.util.Map<Unit, WorkLocation.Suggestion> result = fixture.getSuggestions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the java.util.Map<Unit, WorkLocation.Suggestion> getSuggestions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetSuggestions_2()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));

		java.util.Map<Unit, WorkLocation.Suggestion> result = fixture.getSuggestions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the java.util.Map<Unit, WorkLocation.Suggestion> getSuggestions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetSuggestions_3()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));

		java.util.Map<Unit, WorkLocation.Suggestion> result = fixture.getSuggestions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the java.util.Map<Unit, WorkLocation.Suggestion> getSuggestions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetSuggestions_4()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));

		java.util.Map<Unit, WorkLocation.Suggestion> result = fixture.getSuggestions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the java.util.Map<Unit, WorkLocation.Suggestion> getSuggestions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetSuggestions_5()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));

		java.util.Map<Unit, WorkLocation.Suggestion> result = fixture.getSuggestions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the java.util.Map<Unit, WorkLocation.Suggestion> getSuggestions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetSuggestions_6()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));

		java.util.Map<Unit, WorkLocation.Suggestion> result = fixture.getSuggestions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the java.util.Map<Unit, WorkLocation.Suggestion> getSuggestions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetSuggestions_7()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));

		java.util.Map<Unit, WorkLocation.Suggestion> result = fixture.getSuggestions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Tile getTile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetTile_1()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));

		Tile result = fixture.getTile();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getTotalProductionOf(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetTotalProductionOf_1()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		GoodsType goodsType = null;

		int result = fixture.getTotalProductionOf(goodsType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getTotalProductionOf(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetTotalProductionOf_2()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		GoodsType goodsType = new GoodsType("", new Specification());

		int result = fixture.getTotalProductionOf(goodsType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getUnitProduction(Unit,GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetUnitProduction_1()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		Unit unit = null;
		GoodsType goodsType = new GoodsType("", new Specification());

		int result = fixture.getUnitProduction(unit, goodsType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getUnitProduction(Unit,GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetUnitProduction_2()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setWorkType(new GoodsType("", new Specification()));
		GoodsType goodsType = new GoodsType("", new Specification());

		int result = fixture.getUnitProduction(unit, goodsType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getUnitProduction(Unit,GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetUnitProduction_3()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setWorkType(new GoodsType("", new Specification()));
		unit.setType(new UnitType("", new Specification()));
		GoodsType goodsType = new GoodsType("", new Specification());

		int result = fixture.getUnitProduction(unit, goodsType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getUnitProduction(Unit,GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetUnitProduction_4()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setWorkType(new GoodsType("", new Specification()));
		unit.setType(new UnitType("", new Specification()));
		GoodsType goodsType = new GoodsType("", new Specification());

		int result = fixture.getUnitProduction(unit, goodsType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getUnitProduction(Unit,GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetUnitProduction_5()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setWorkType(new GoodsType("", new Specification()));
		unit.setType(new UnitType("", new Specification()));
		GoodsType goodsType = new GoodsType("", new Specification());

		int result = fixture.getUnitProduction(unit, goodsType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getUnitProduction(Unit,GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetUnitProduction_6()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setWorkType(new GoodsType("", new Specification()));
		unit.setType(new UnitType("", new Specification()));
		GoodsType goodsType = new GoodsType("", new Specification());

		int result = fixture.getUnitProduction(unit, goodsType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the GoodsType getWorkFor(Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetWorkFor_1()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		GoodsType result = fixture.getWorkFor(unit);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the GoodsType getWorkFor(Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testGetWorkFor_2()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		GoodsType result = fixture.getWorkFor(unit);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the boolean hasInputs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testHasInputs_1()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));

		boolean result = fixture.hasInputs();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasInputs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testHasInputs_2()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));

		boolean result = fixture.hasInputs();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasInputs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testHasInputs_3()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));

		boolean result = fixture.hasInputs();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasOutputs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testHasOutputs_1()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));

		boolean result = fixture.hasOutputs();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasOutputs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testHasOutputs_2()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));

		boolean result = fixture.hasOutputs();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasOutputs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testHasOutputs_3()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));

		boolean result = fixture.hasOutputs();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean produces(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testProduces_1()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		GoodsType goodsType = new GoodsType("", new Specification());

		boolean result = fixture.produces(goodsType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean produces(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testProduces_2()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		GoodsType goodsType = new GoodsType("", new Specification());

		boolean result = fixture.produces(goodsType);

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
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
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
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
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
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testReadAttributes_3()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testReadChild_1()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testReadChild_2()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testReadChild_3()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testReadChild_4()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testReadChildren_1()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testReadChildren_2()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		FreeColXMLReader xr = new FreeColXMLReader(new ByteArrayInputStream("".getBytes()));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the boolean remove(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testRemove_1()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		Locatable locatable = new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		boolean result = fixture.remove(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean remove(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testRemove_2()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		Locatable locatable = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		boolean result = fixture.remove(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean remove(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testRemove_3()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		Locatable locatable = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		boolean result = fixture.remove(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean remove(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testRemove_4()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		Locatable locatable = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		boolean result = fixture.remove(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean remove(Locatable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testRemove_5()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		Locatable locatable = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		boolean result = fixture.remove(locatable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the void setOwner(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testSetOwner_1()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		Player p = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		fixture.setOwner(p);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setProductionType(ProductionType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testSetProductionType_1()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		ProductionType newProductionType = new ProductionType(new Specification());

		fixture.setProductionType(newProductionType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setProductionType(ProductionType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testSetProductionType_2()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		ProductionType newProductionType = new ProductionType(new Specification());

		fixture.setProductionType(newProductionType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the boolean setWorkFor(Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testSetWorkFor_1()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		boolean result = fixture.setWorkFor(unit);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean setWorkFor(Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testSetWorkFor_2()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		boolean result = fixture.setWorkFor(unit);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean setWorkFor(Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testSetWorkFor_3()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		boolean result = fixture.setWorkFor(unit);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the void updateProductionType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testUpdateProductionType_1()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));

		fixture.updateProductionType();

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
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testWriteAttributes_1()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
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
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testWriteAttributes_2()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
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
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testWriteAttributes_3()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testWriteChildren_1()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testWriteChildren_2()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testWriteChildren_3()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	@Test
	public void testWriteChildren_4()
		throws Exception {
		WorkLocation fixture = new Building(new Game(new IIOMetadataNode(), ""), new Colony(new Game(new IIOMetadataNode(), ""), ""), new BuildingType("", new Specification()));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

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
	 * @generatedBy CodePro at 5/14/18 4:39 PM
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
	 * @generatedBy CodePro at 5/14/18 4:39 PM
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
	 * @generatedBy CodePro at 5/14/18 4:39 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(WorkLocationTest.class);
	}
}