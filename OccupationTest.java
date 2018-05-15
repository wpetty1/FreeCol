package net.sf.freecol.common.model;

import java.util.ArrayList;
import java.util.Collection;
import javax.imageio.metadata.IIOMetadataNode;
import org.junit.*;
import net.sf.freecol.common.util.LogBuilder;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>OccupationTest</code> contains tests for the class <code>{@link Occupation}</code>.
 *
 * @generatedBy CodePro at 5/14/18 3:54 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class OccupationTest {
	/**
	 * Run the Occupation(WorkLocation,ProductionType,GoodsType) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:54 PM
	 */
	@Test
	public void testOccupation_1()
		throws Exception {
		WorkLocation workLocation = new Building(new Game(new IIOMetadataNode(), ""), "");
		ProductionType productionType = new ProductionType(new Specification());
		GoodsType workType = new GoodsType("", new Specification());

		Occupation result = new Occupation(workLocation, productionType, workType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int improve(Unit,WorkLocation,int,Collection<GoodsType>,LogBuilder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:54 PM
	 */
	@Test
	public void testImprove_1()
		throws Exception {
		Occupation fixture = new Occupation(new Building(new Game(new IIOMetadataNode(), ""), ""), new ProductionType(new Specification()), new GoodsType("", new Specification()));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setLocationNoUpdate(new HighSeas(new Game(new IIOMetadataNode(), "")));
		WorkLocation wl = new Building(new Game(new IIOMetadataNode(), ""), "");
		int bestAmount = 1;
		Collection<GoodsType> workTypes = new ArrayList<GoodsType>();
		LogBuilder lb = new LogBuilder(1);

		int result = fixture.improve(unit, wl, bestAmount, workTypes, lb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int improve(Unit,WorkLocation,int,Collection<GoodsType>,LogBuilder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:54 PM
	 */
	@Test
	public void testImprove_2()
		throws Exception {
		Occupation fixture = new Occupation(new Building(new Game(new IIOMetadataNode(), ""), ""), new ProductionType(new Specification()), new GoodsType("", new Specification()));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setType(new UnitType("", new Specification()));
		unit.setLocationNoUpdate(new HighSeas(new Game(new IIOMetadataNode(), "")));
		WorkLocation wl = new Building(new Game(new IIOMetadataNode(), ""), "");
		int bestAmount = 1;
		Collection<GoodsType> workTypes = new ArrayList<GoodsType>();
		LogBuilder lb = new LogBuilder(1);

		int result = fixture.improve(unit, wl, bestAmount, workTypes, lb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int improve(UnitType,WorkLocation,int,Collection<GoodsType>,LogBuilder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:54 PM
	 */
	@Test
	public void testImprove_3()
		throws Exception {
		Occupation fixture = new Occupation(new Building(new Game(new IIOMetadataNode(), ""), ""), new ProductionType(new Specification()), new GoodsType("", new Specification()));
		UnitType unitType = new UnitType("", new Specification());
		WorkLocation wl = new Building(new Game(new IIOMetadataNode(), ""), "");
		int bestAmount = 1;
		Collection<GoodsType> workTypes = new ArrayList<GoodsType>();
		LogBuilder lb = new LogBuilder(1);

		int result = fixture.improve(unitType, wl, bestAmount, workTypes, lb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the boolean install(Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:54 PM
	 */
	@Test
	public void testInstall_1()
		throws Exception {
		Occupation fixture = new Occupation(new Building(new Game(new IIOMetadataNode(), ""), ""), new ProductionType(new Specification()), new GoodsType("", new Specification()));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		boolean result = fixture.install(unit);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean install(Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:54 PM
	 */
	@Test
	public void testInstall_2()
		throws Exception {
		Occupation fixture = new Occupation(new Building(new Game(new IIOMetadataNode(), ""), ""), new ProductionType(new Specification()), new GoodsType("", new Specification()));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setWorkType(new GoodsType("", new Specification()));

		boolean result = fixture.install(unit);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean install(Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:54 PM
	 */
	@Test
	public void testInstall_3()
		throws Exception {
		Occupation fixture = new Occupation(new Building(new Game(new IIOMetadataNode(), ""), ""), new ProductionType(new Specification()), new GoodsType("", new Specification()));
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setWorkType(new GoodsType("", new Specification()));

		boolean result = fixture.install(unit);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:54 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Occupation fixture = new Occupation(new Building(new Game(new IIOMetadataNode(), ""), ""), new ProductionType(new Specification()), new GoodsType("", new Specification()));

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/18 3:54 PM
	 */
	@Test
	public void testToString_2()
		throws Exception {
		Occupation fixture = new Occupation(new Building(new Game(new IIOMetadataNode(), ""), ""), new ProductionType(new Specification()), (GoodsType) null);

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/18 3:54 PM
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
	 * @generatedBy CodePro at 5/14/18 3:54 PM
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
	 * @generatedBy CodePro at 5/14/18 3:54 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(OccupationTest.class);
	}
}